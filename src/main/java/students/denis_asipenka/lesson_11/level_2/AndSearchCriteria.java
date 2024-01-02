package students.denis_asipenka.lesson_11.level_2;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean sort() {
        if (rightCondition.getClass().getSimpleName().equals("SortSearchCriteria")) {
            return rightCondition.sort();

        } else {
            return leftCondition.sort();
        }
    }

    @Override
    public int page() {
        if (rightCondition.getClass().getSimpleName().equals("PagingSearchCriteria")) {
            return rightCondition.page();

        } else {
            return leftCondition.page();
        }
    }

    public boolean match(Book book) {
        if (this.leftCondition.match(book) && (this.rightCondition.match(book))) {
            return true;
        }
        return false;
    }
}