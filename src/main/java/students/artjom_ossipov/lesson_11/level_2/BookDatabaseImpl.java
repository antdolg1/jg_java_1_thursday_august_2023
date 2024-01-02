package students.artjom_ossipov.lesson_11.level_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase{
    Long idBook = 1l;
    List<Book> linkedListBook = new LinkedList<>();

    @Override
    public Long save(Book book) {
        book.setId(idBook);
        linkedListBook.add(book);
        idBook += 1l;
        return book.getId();
    }
    @Override
    public boolean delete(Long bookId) {
        if (bookId > linkedListBook.size()) {
            return false;
        }
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (linkedListBook.get(i).getId() == bookId) {
                linkedListBook.remove(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (linkedListBook.get(i).equals(book)) {
                linkedListBook.remove(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public Optional<Book> findById(Long bookId) {
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (linkedListBook.get(i).getId() == bookId) {
                Book book = linkedListBook.get(i);
                return Optional.ofNullable(book);
            }
        }
        return Optional.empty();
    }
    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> listReturn = new LinkedList<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (linkedListBook.get(i).getAuthor().equalsIgnoreCase(author)) {
                listReturn.add(linkedListBook.get(i));
            }
        }
        return listReturn;
    }
    @Override
    public List<Book> findByTitle(String title) {
        List<Book> listReturn = new LinkedList<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (linkedListBook.get(i).getTitle().equalsIgnoreCase(title)) {
                listReturn.add(linkedListBook.get(i));
            }
        }
        return listReturn;
    }

    @Override
    public int countAllBooks() {
        return linkedListBook.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> listRemove = new LinkedList<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (!linkedListBook.get(i).getAuthor().equalsIgnoreCase(author)) {
                listRemove.add(linkedListBook.get(i));
            }
        }
        linkedListBook = listRemove;
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> listRemove = new LinkedList<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (!linkedListBook.get(i).getTitle().equalsIgnoreCase(title)) {
                listRemove.add(linkedListBook.get(i));
            }
        }
        linkedListBook = listRemove;
    }
}
