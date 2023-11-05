package students.denis_asipenka.lesson_12.level_5;

public class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() >= 2000) {
            throw new ValidationException("RULE-7", "Description must be no more than 2000 characters", "description");
        } else if (isAlpha(product.getDescription())) {
            throw new ValidationException("RULE-8", "The description can only contain English letters and numbers, other characters are not allowed", "description");
        }
    }

    public static boolean isAlpha(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')) {
                return true;
            }
        }
        return false;
    }
}