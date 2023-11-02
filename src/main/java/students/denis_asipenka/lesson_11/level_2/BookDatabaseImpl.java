package students.denis_asipenka.lesson_11.level_2;


import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        boolean sort = searchCriteria.sort();
        int page = searchCriteria.page();
        List<Book> temp = new LinkedList<>();
        List<Book> list = new LinkedList<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (searchCriteria.match(linkedListBook.get(i))) {
                temp.add(linkedListBook.get(i));
            }
        }
        if (sort) {
            Collections.sort(temp);
        }
        if (page > 0) {
            int startIndex = (page - 1) * 10;
            int endIndex = 0;
            if ((startIndex + 10) <= temp.size()) {
                endIndex = startIndex + 10;
            } else {
                endIndex = temp.size();
            }
            list = temp.subList(startIndex, endIndex);
        } else {
            list=temp;
        }
        return list;
    }
    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> listAuthor = new LinkedHashSet<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            listAuthor.add(linkedListBook.get(i).getAuthor());
        }
        return listAuthor;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> listTitles = new LinkedHashSet<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            listTitles.add(linkedListBook.get(i).getTitle());
        }
        return listTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> listBook = new LinkedHashSet<>();
        for (int i = 0; i < linkedListBook.size(); i++) {
            listBook.add(new Book(linkedListBook.get(i).getAuthor(), linkedListBook.get(i).getTitle()));
        }
        return listBook;
    }

    @Override
    public boolean contains(Book book) {
        for (int i = 0; i < linkedListBook.size(); i++) {
            if (book.equals(linkedListBook.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Set<String> listAuthor = findUniqueAuthors();
        Map<String, List<Book>> listReturn = new LinkedHashMap<>();
        for (String author : listAuthor) {
            SearchCriteria searchCriteria = new AuthorSearchCriteria(author);
            listReturn.put(author, find(searchCriteria));
        }
        return listReturn;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        int count = 0;
        Set<String> listAuthor = findUniqueAuthors(); // хранятся авторы
        Set<Book> listBook = findUniqueBooks(); // хранятся книги
        Map<String, Integer> listReturn = new LinkedHashMap<>();
        for (String author : listAuthor) {
            for (Book book : listBook) {
                if (author.equalsIgnoreCase(book.getAuthor())) {
                    count++;
                }
            }
            listReturn.put(author, count);
            count = 0;
        }
        return listReturn;
    }

    public void print() {
        System.out.println(linkedListBook);
    }


}
