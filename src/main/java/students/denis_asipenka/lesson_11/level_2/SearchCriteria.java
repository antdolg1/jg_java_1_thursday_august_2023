package students.denis_asipenka.lesson_11.level_2;

public interface SearchCriteria {

   default boolean sort(){
       return false;
   }
    default int page(){
        return 0;    // основной вопрос тут? как мне вернуть значение из PagingSearchCriteria
   }
    boolean match(Book book);
}
