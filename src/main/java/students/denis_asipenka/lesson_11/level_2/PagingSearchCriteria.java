package students.denis_asipenka.lesson_11.level_2;

public class PagingSearchCriteria implements SearchCriteria {

    private int page;

    public PagingSearchCriteria(int page) {
        this.page = page;
    }

    @Override
    public int page() {
        return page;
    }

    public boolean match(Book book) {
            return true;
        }
    }
