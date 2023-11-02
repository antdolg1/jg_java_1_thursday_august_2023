package students.denis_asipenka.lesson_11.level_2;

public class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equals(this.titleToSearch)) {
            return true;
        }
        return false;
    }

}
