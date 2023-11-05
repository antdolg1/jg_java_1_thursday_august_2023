package students.denis_asipenka.lesson_12.level_5;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}