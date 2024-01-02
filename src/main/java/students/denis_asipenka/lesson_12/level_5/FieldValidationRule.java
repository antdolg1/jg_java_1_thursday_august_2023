package students.denis_asipenka.lesson_12.level_5;

public interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}