package teacher.lesson_14.lessoncode.lambda;

public class CheckCanFly implements Checker{
    @Override
    public boolean checkCanFlyOrSwim(Animal animal) {
        return animal.isCanFly();
    }
}
