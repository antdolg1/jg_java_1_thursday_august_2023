package teacher.lesson_7.lessoncode.package_one;

import teacher.lesson_7.lessoncode.package_one.BaseClass;

public class SubClass extends BaseClass {
    void accessProtectedMembers() {
        protectedField = 10; //доступ к защищённому полю из подкласса
        protectedMethod(); //доступ к защищённому методу из подкласса
    }
}
