package students.denis_asipenka.lesson_13.level_7;

import java.util.Objects;

public class File extends Resource {
    private String name;
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && Objects.equals(name, file.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public int getSize() {
        return size;
    }

}