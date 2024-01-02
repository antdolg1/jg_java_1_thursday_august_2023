package teacher.lesson_14.lessoncode.lambda;

public class CheckCanSwim implements Checker{
    @Override
    public boolean checkCanFlyOrSwim(Animal animal) {
        return animal.isCanSwim();
    }
}
