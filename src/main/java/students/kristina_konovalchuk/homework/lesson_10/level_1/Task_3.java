package students.kristina_konovalchuk.homework.lesson_10.level_1;

public class Task_3 {
    public interface MyList<E> {
        void add(E element);

        void add(int index, E element);

        void remove(int index);

        E get(int index);

        int size();
    }

    public class MyArrayList<E> implements MyList<E> {
        private E[] array;
        private int size;

        public MyArrayList() {
            array = ( E[] ) new Object[10];
            size = 0;
        }

        public void add(E element) {
            if (size == array.length) {
                E[] newArray = ( E[] ) new Object[array.length * 2];
                System.arraycopy( array, 0, newArray, 0, array.length );
                array = newArray;
            }
            array[size] = element;
            size++;
        }

        public void add(int index, E element) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException( );
            }
            if (size == array.length) {
                E[] newArray = ( E[] ) new Object[array.length * 2];
                System.arraycopy( array, 0, newArray, 0, array.length );
                array = newArray;
            }
            System.arraycopy( array, index, array, index + 1, size - index );
            array[index] = element;
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException( );
            }
            System.arraycopy( array, index + 1, array, index, size - index - 1 );
            size--;
        }

        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException( );
            }
            return array[index];
        }

        public int size() {
            return size;
        }
    }
}
