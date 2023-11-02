package students.denis_asipenka.lesson_11.level_2;

public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {

        this.authorToSearch = authorToSearch;
    }



    public boolean match(Book book) {
        if (book.getAuthor().equalsIgnoreCase(this.authorToSearch)) {
            return true;
        }
        return false;
    }
}
