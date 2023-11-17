package students.denis_asipenka.lesson_13.level_7;

public abstract class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public abstract int getSize();
}