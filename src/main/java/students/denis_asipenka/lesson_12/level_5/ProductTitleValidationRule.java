package students.denis_asipenka.lesson_12.level_5;

public class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().isEmpty()) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "The name cannot be less than 3 characters", "title");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "The title cannot be longer than 100 characters", "title");
        } else if (isAlpha(product.getTitle())) {
            throw new ValidationException("RULE-4", "The name can only contain English letters and numbers, other characters are not allowed", "title");
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