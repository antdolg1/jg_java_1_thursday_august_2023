package students.denis_asipenka.lesson_11.level_2;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
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
        if (rightCondition.getClass().getSimpleName().equals("PagingSearchCriteria") || rightCondition.getClass().getSimpleName().equals("SortSearchCriteria")) {
            if (this.leftCondition.match(book)) {
                return true;
            } else {
                return false;
            }
        } else if (leftCondition.getClass().getSimpleName().equals("PagingSearchCriteria") || leftCondition.getClass().getSimpleName().equals("SortSearchCriteria")) {
            if (this.rightCondition.match(book)) {
                return true;
            } else {
                return false;
            }
        } else if (this.leftCondition.match(book) || (this.rightCondition.match(book))) {
            return true;
        }
        return false;
    }
}