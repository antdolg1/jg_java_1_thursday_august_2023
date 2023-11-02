package students.denis_asipenka.lesson_11.level_2;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueToSearch = new YearOfIssueSearchCriteria("1980");
        SearchCriteria pagingSearchCriteria = new PagingSearchCriteria(1);
        SearchCriteria sortSearchCriteria = new SortSearchCriteria(true);
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueToSearch);
        SearchCriteria searchCriteria2 = new OrSearchCriteria(searchCriteria,searchCriteria1);
    }





}
