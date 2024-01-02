package students.kristina_konovalchuk.homework.lesson_11.level_2and3;

import java.util.*;

public class Task_6_20_29 {
    public class Book {
        private Long id;
        private String title;
        private String author;

        Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass( ) != o.getClass( )) return false;
            Book book = ( Book ) o;
            return id.equals( book.id ) && title.equals( book.title ) && author.equals( book.author );
        }

        @Override
        public int hashCode() {
            return Objects.hash( id, title, author );
        }

        private void add(Book book) {
        }

        public interface BookDatabase {
            Long save(Book book);

            boolean delete(Long bookId);

            boolean delete(Book book);

            Optional<Book> findById(Long bookId);

            List<Book> findByAuthor(String author);

            List<Book> findByTitle(String title);

            int countAllBook();

            void deleteByAuthor(String Author);

            void deleteByTitle(String Title);
        }

        public class BookDatabaseImpl implements BookDatabase {
            private List<Book> books = new ArrayList<>( );
            private Long id = 0L;

            public List<Book> find(SearchCriteria searchCriteria) {
                List<Book> result = new ArrayList<>( );
                for (Book book : books) {
                    if (searchCriteria.match( book )) {
                        result.add( book );
                    }
                }
                return result;
            }

            public Set<String> findUniqueAuthors() {
                Set<String> uniqueAuthor = new HashSet<>( );
                for (Book book : books) {
                    uniqueAuthor.add( book.getAuthor( ) );
                }
                return uniqueAuthor;
            }

            public Set<String> findUniqueTitle() {
                Set<String> uniqueTitle = new HashSet<>( );
                for (Book book : books) {
                    uniqueTitle.add( book.getTitle( ) );
                }
                return uniqueTitle;
            }

            public Set<Book> findUniqueBooks() {
                return new HashSet<>( books );
            }

            public boolean contains(Book book) {
                return books.contains( book );
            }

            public Map<String, List<Book>> getAuthorToBooksMap() {
                Map<String, List<Book>> authorToBooksMap = new HashMap<>( );
                for (Book book : books) {
                    String author = book.getAuthor( );
                    if (!authorToBooksMap.containsKey( author )) {
                        authorToBooksMap.put( author, new ArrayList<>( ) );
                    }
                    authorToBooksMap.get( author ).add( book );
                }
                return authorToBooksMap;
            }

            public Map<String, Integer> getEachAuthorBookCount() {
                Map<String, Integer> authorToBookCountMap = new HashMap<>( );
                for (Book book : books) {
                    String author = book.getAuthor( );
                    if (!authorToBookCountMap.containsKey( author )) {
                        authorToBookCountMap.put( author, 0 );
                    }
                    authorToBookCountMap.put( author, authorToBookCountMap.get( author ) + 1 );
                }
                return authorToBookCountMap;
            }

            @Override
            public Long save(Book book) {
                book.setId( ++id );
                book.add( book );
                return id;
            }

            @Override
            public boolean delete(Long bookId) {
                for (Book book : books) {
                    if (book.getId( ).equals( bookId )) {
                        books.remove( book );
                        return true;
                    }
                }
                return false;
            }

            @Override
            public boolean delete(Book book) {
                return books.remove( book );
            }

            @Override
            public Optional<Book> findById(Long bookId) {
                for (Book book : books) {
                    if (book.getId( ).equals( bookId )) {
                        return Optional.of( book );
                    }
                }
                return Optional.empty( );
            }

            @Override
            public List<Book> findByAuthor(String author) {
                List<Book> booksByAuthor = new ArrayList<>( );
                for (Book book : books) {
                    if (book.getAuthor( ).equals( author )) {
                        booksByAuthor.add( book );
                    }
                }
                return booksByAuthor;
            }

            @Override
            public List<Book> findByTitle(String title) {
                List<Book> booksByTitle = new ArrayList<>( );
                for (Book book : books) {
                    if (book.getAuthor( ).equals( title )) {
                        booksByTitle.add( book );
                    }
                }
                return booksByTitle;
            }

            @Override
            public int countAllBook() {
                return books.size( );
            }

            @Override
            public void deleteByAuthor(String Author) {
                Iterator<Book> iterator = books.iterator( );
                while (iterator.hasNext( )) {
                    Book book = iterator.next( );
                    if (book.getAuthor( ).equals( author )) {
                        iterator.remove( );
                    }
                }
            }

            @Override
            public void deleteByTitle(String Title) {
                Iterator<Book> iterator = books.iterator( );
                while (iterator.hasNext( )) {
                    Book book = iterator.next( );
                    if (book.getTitle( ).equals( title )) {
                        iterator.remove( );
                    }
                }
            }

            public Set<Book> getBooks() {
                return ( Set<Book> ) books;
            }

            public void setBooks(Set<Book> books) {
                this.books = ( List<Book> ) books;
            }
        }

        public interface SearchCriteria {
            boolean match(Book book);
        }

        static class AuthorSearchCriteria implements SearchCriteria {
            private String authorToSearch;

            public AuthorSearchCriteria(String authorToSearch) {
                this.authorToSearch = authorToSearch;
            }

            public boolean match(Book book) {
                return book.getAuthor( ).equals( authorToSearch );
            }
        }

        static class TitleSearchCriteria implements SearchCriteria {
            private String titleToSearch;

            public TitleSearchCriteria(String titleToSearch) {
                this.titleToSearch = titleToSearch;
            }

            public boolean match(Book book) {
                return book.getTitle( ).equals( titleToSearch );
            }
        }

        static class YearOfIssueSearchCriteria implements SearchCriteria {
            private String yearOfIssueToSearch;

            public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
                this.yearOfIssueToSearch = yearOfIssueToSearch;
            }

            public boolean match(Book book) {
                return book.getYearOfIssue( ).equals( yearOfIssueToSearch );
            }
        }

        private Object getYearOfIssue() {
            return getYearOfIssue( );
        }

        static class AndSearchCriteria implements SearchCriteria {
            private SearchCriteria leftCondition;
            private SearchCriteria rightCondition;

            public AndSearchCriteria(SearchCriteria leftCondition,
                                     SearchCriteria rightCondition) {
                this.leftCondition = leftCondition;
                this.rightCondition = rightCondition;
            }

            public boolean match(Book book) {
                return leftCondition.match( book ) && rightCondition.match( book );
            }
        }

        static class OrSearchCriteria implements SearchCriteria {
            private SearchCriteria leftCondition;
            private SearchCriteria rightCondition;

            public OrSearchCriteria(SearchCriteria leftCondition,
                                    SearchCriteria rightCondition) {
                this.leftCondition = leftCondition;
                this.rightCondition = rightCondition;
            }

            public boolean match(Book book) {
                return leftCondition.match( book ) || rightCondition.match( book );
            }
        }
    }
}
