package students.denis_asipenka.lesson_9.level_7.task_31;

public class BookReader {
    private int memberId;

    public BookReader() {
    }

    public BookReader(int memberId, String firstName, String surName, String email) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
    }

    private String firstName;
    private String surName;
    private String email;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}