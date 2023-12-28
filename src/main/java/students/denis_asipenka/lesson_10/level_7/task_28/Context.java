package students.denis_asipenka.lesson_10.level_7.task_28;

public class Context {
    private ConverterTo converterTo;

    public void setStrategy(ConverterTo converterTo) {
        this.converterTo = converterTo;
    }

    public double executeStrategy(double a) {

        return converterTo.convert(a);
    }
}