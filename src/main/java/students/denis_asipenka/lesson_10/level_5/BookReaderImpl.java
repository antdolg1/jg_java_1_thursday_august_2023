package students.denis_asipenka.lesson_10.level_5;

import java.util.ArrayList;

public class BookReaderImpl implements BookReader {
    ArrayList<Book> listBook = new ArrayList<>();

    @Override
    public boolean addBook(String author, String title) {
        boolean read = false;
        if (checkingForEmpty(author, title)) {
            if (!listBook.isEmpty()) {
                for (Book book : listBook) {
                    if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                        return false;
                    }
                }
                listBook.add(new Book(title, author, read));
                return true;
            }
            listBook.add(new Book(title, author, read));
            return true;
        }
        return false;
    }

    @Override
    public boolean checkingForEmpty(String author, String title) {
        if (author.trim().equalsIgnoreCase("") || title.trim().equalsIgnoreCase("")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean removeBook(String author, String title) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getAuthor().equalsIgnoreCase(author) && listBook.get(i).getTitle().equalsIgnoreCase(title)) {
                listBook.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void allBookPrint() {
        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i).getTitle() + " [" + listBook.get(i).getAuthor() + "]");
        }
    }

    @Override
    public ArrayList<Book> searchBookAuthor(String author) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getAuthor().equalsIgnoreCase(author)) {
                searchResult.add(listBook.get(i));
            }
        }
        return searchResult;
    }

    @Override
    public ArrayList<Book> searchFirstLetterAuthor(String author) {
        ArrayList<Book> searchResult = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < listBook.size(); i++) {
            index = listBook.get(i).getAuthor().indexOf(" ");
            if (index > -1) {
                String elements = listBook.get(i).getAuthor().substring(0, index);
                if (elements.equalsIgnoreCase(author)) {
                    searchResult.add(listBook.get(i));
                }
            } else {
                if (listBook.get(i).getAuthor().equalsIgnoreCase(author)) {
                    searchResult.add(listBook.get(i));
                }
            }
        }
        return searchResult;
    }

    @Override
    public ArrayList<Book> searchBookTitle(String title) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getTitle().equalsIgnoreCase(title)) {
                searchResult.add(listBook.get(i));
            }
        }
        return searchResult;
    }

    @Override
    public ArrayList<Book> searchFirstLetterTitle(String title) {
        ArrayList<Book> searchResult = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < listBook.size(); i++) {
            index = listBook.get(i).getTitle().indexOf(" ");
            if (index > -1) {
                String elements = listBook.get(i).getTitle().substring(0, index);
                if (elements.equalsIgnoreCase(title)) {
                    searchResult.add(listBook.get(i));
                }
            } else {
                if (listBook.get(i).getTitle().equalsIgnoreCase(title)) {
                    searchResult.add(listBook.get(i));
                }
            }
        }
        return searchResult;
    }

    @Override
    public boolean markAsRead(String author, String title) {
        boolean read = true;
        for (Book book : listBook) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && !book.isRead()) {
                book.setRead(read);
                return true;
            }
        }
        return false;
    }

    public boolean markAsUnread(String author, String title) {
        boolean read = false;
        for (Book book : listBook) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isRead()) {
                book.setRead(read);
                return true;
            }
        }
        return false;
    }

    @Override
    public void printBookIsRead() {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).isRead()) {
                System.out.println(listBook.get(i).getTitle() + " [" + listBook.get(i).getAuthor() + "]");
            }
        }
    }

    public void printBookIsUnread() {
        for (int i = 0; i < listBook.size(); i++) {
            if (!listBook.get(i).isRead()) {
                System.out.println(listBook.get(i).getTitle() + " [" + listBook.get(i).getAuthor() + "]");
            }
        }
    }
}