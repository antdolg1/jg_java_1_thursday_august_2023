package teacher.lesson_7.lessoncode.access_modifiers;

//этот класс находится в том же package, что и DefaultAccessClass
//поэтому он может использовать его члены с модификатором доступа по умолчанию
public class AnotherClass {
    void accessDefaultMembers() {
        DefaultAccessClass defaultAccessClass = new DefaultAccessClass();
        int value = defaultAccessClass.defaultField; //доступ к полю с модификатором доступа по умолчанию
        defaultAccessClass.defaultMethod(); //доступ к методу с модификатором доступа по умолчанию
    }
}
