package teacher.lesson_7.lessoncode.another_package;

import teacher.lesson_7.lessoncode.package_one.BaseClass;

public class AnotherClassOne {
    void accessProtectedMembers() {
        BaseClass baseObj = new BaseClass();
        /*
        baseObj.protectedField = 20; //ошбика компиляции, нельзя получить доступ к защищённым членам из другого пакета
        baseObj.protectedMethod(); //ошбика компиляции, нельзя получить доступ к защищённым членам из другого пакета
         */
    }
}
