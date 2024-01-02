package students.denis_asipenka.lesson_12.level_2;

public class BankClient {
    private String uid;

    @Override
    public String toString() {
        return "\nCLIENT: " +
                "uID= " + uid +
                ", FullName= " + fullName;
    }

    private String fullName;

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }
}