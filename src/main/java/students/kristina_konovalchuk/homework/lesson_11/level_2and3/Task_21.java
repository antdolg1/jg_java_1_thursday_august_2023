package students.kristina_konovalchuk.homework.lesson_11.level_2and3;

public class Task_21 {
    public class SearchCriteriaDemo {
        public static void main(String[] args) {
            Task_6_20_29.Book.SearchCriteria authorSearchCriteria = new Task_6_20_29.Book.AuthorSearchCriteria
                    ( "Kuper" );
            Task_6_20_29.Book.SearchCriteria titleSearchCriteria = new Task_6_20_29.Book.TitleSearchCriteria
                    ( "Zveroboi" );
            Task_6_20_29.Book.SearchCriteria yearOfIssueSearchCriteria = new Task_6_20_29.Book.YearOfIssueSearchCriteria
                    ( "1980" );
            Task_6_20_29.Book.SearchCriteria andCriteria = new Task_6_20_29.Book.AndSearchCriteria( authorSearchCriteria,
                    titleSearchCriteria );
            Task_6_20_29.Book.SearchCriteria orCriteria = new Task_6_20_29.Book.OrSearchCriteria( authorSearchCriteria,
                    new Task_6_20_29.Book.OrSearchCriteria( titleSearchCriteria, yearOfIssueSearchCriteria ) );

        }
    }
}
