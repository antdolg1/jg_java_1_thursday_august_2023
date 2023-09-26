package teacher.lesson_7.lessoncode.equality;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) { //Проверка, являются ли объекты одним и тем же объектом
//            return true;
//        }
//
//        if (obj == null || getClass() != obj.getClass()) { //Проверка, являются ли объекты разных классов или obj равен null
//            return false;
//        }
//
//        Person person = (Person) obj; //Приведение (cast) obj к типу Person
//
//        return age == person.age && Objects.equals(name, person.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override
//    public String toString() {
//        return "Person{age=" + age + ", name='" + name + "'}";
//    }


    @Override
    public String toString() {
        return "Person[" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ']';
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 24);
        Person person2 = new Person("John", 24);

        boolean areEqual = person1.equals(person2);
        System.out.println("Are the objects equal? " + areEqual);
        System.out.println(person1);
    }

    //по умолчанию toString() возвращает имя класса и хэш-код, например "ClassName@hashcode"
}
