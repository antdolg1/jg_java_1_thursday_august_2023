package students.denis_asipenka.lesson_11.level_2;

public class SortSearchCriteria implements SearchCriteria {
    private boolean sort;

    public SortSearchCriteria(boolean sort) {
        this.sort = sort;
    }

    @Override
    public boolean sort() {
        return sort;
    }

    @Override
    public boolean match(Book book) {
        return true;
    }
}