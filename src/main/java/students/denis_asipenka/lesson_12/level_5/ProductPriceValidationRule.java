package students.denis_asipenka.lesson_12.level_5;

public class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "The price must not be empty", "price");
        } else if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price must be greater than zero", "price");
        }
    }
}