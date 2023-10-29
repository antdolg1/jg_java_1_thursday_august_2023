package students.emilija_ostasevska.homework.lesson_3.level_7;

class Subject {
    String name;
    String lang;
    int testCount;
    int labCount;
    boolean exam;

    void printSubjectName() {
        System.out.println("Subject name is: " + name);
    }

    void printProgLang() {
        System.out.println("In this subject, you will learn a programming language called " + lang);
    }

    void printtestsCount() {
        System.out.println("During the course, you have to pass " + testCount + " tests and " + labCount + " labs");
    }

    void ifExamRequired() {
        if(exam == true){
            System.out.println("Exam required");
        } else {
            System.out.println("The exam is optional");
        }
        
    }

    Subject(String name, String lang, int testCount, int labCount, boolean exam){
        this.name = name;
        this.lang = lang;
        this.testCount = testCount;
        this.labCount = labCount;
        this.exam = exam;
    }
}

class SubjectDemo {
    public static void main(String[] args) {
        Subject subject = new Subject("Risinājumu algoritmizēšana un programmēšana",
        "Java", 8, 15, true);

        subject.printSubjectName();
        subject.printProgLang();
        subject.printtestsCount();
        subject.ifExamRequired();
    }
}