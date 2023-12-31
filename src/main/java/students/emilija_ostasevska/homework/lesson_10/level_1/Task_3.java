package students.emilija_ostasevska.homework.lesson_10.level_1;

interface MyList {

    void add(Object element);

    void insert(int index, Object element);

    Object get(int index);

    void remove(int index);

    int size();

    boolean contains(Object element);

    void clear();

    int indexOf(Object element);
}

