package students.denis_asipenka.lesson_11.level_2;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }




    public boolean match(Book book) {
        if (this.leftCondition.match(book) && (this.rightCondition.match(book))){
            return true;
        }
        return false;
    }

}
