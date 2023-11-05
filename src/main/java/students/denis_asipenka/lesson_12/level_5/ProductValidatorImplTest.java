package students.denis_asipenka.lesson_12.level_5;

import java.util.List;

public class ProductValidatorImplTest {

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule4_v2();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
        test.rule8_v2();
        test.rule8_v3();
        test.rule2AndRule6AndRule8();
        test.rule1AndRule6AndRule7();
        test.rule3AndRule6();
    }

    void rule1_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("Cu", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("The name cannot be less than 3 characters"), "rule2");
    }

    public void rule3_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("jhjhjhjhjhjhjhjhjhjhjhjhjhjjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjh", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("The title cannot be longer than 100 characters"), "rule3");
    }

    public void rule4_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("Огурец", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("The name can only contain English letters and numbers, other characters are not allowed"), "rule4");
    }

    public void rule4_v2() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("№№№№№№№", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("The name can only contain English letters and numbers, other characters are not allowed"), "rule4");
    }

    public void rule5_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("The price must not be empty"), "rule5");
    }

    public void rule6_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be greater than zero"), "rule6");
    }

    public void rule7_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("title", 1, "descriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiona");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description must be no more than 2000 characters"), "rule7");
    }

    public void rule8_v1() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("title", 1, "AAAAAAаAAAA");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("The description can only contain English letters and numbers, other characters are not allowed"), "rule8");
    }

    public void rule8_v2() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("title", 1, "AAAAAA.AAAA");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("The description can only contain English letters and numbers, other characters are not allowed"), "rule8");
    }

    public void rule8_v3() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("title", 1, "AAAAAA-AAAA");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("The description can only contain English letters and numbers, other characters are not allowed"), "rule8");
    }

    public void rule2AndRule6AndRule8() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("t", 0, "descri.ption");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.contains(new ValidationException("RULE-2", "The name cannot be less than 3 characters", "title")), "rule2");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be greater than zero", "price")), "rule6");
        checkResult(exceptions.contains(new ValidationException("RULE-8", "The description can only contain English letters and numbers, other characters are not allowed", "description")), "rule8");
    }

    public void rule1AndRule6AndRule7() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("", -43152413, "descriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptionadescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiona");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")), "rule1");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be greater than zero", "price")), "rule6");
        checkResult(exceptions.contains(new ValidationException("RULE-7", "Description must be no more than 2000 characters", "description")), "rule7");
    }

    public void rule3AndRule6() {
        ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        Product product = new Product("jhjhjhjhjhjhjhjhjhjhjhjhjhjjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjhjh", -5454, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.contains(new ValidationException("RULE-3", "The title cannot be longer than 100 characters", "title")), "rule3");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be greater than zero", "price")), "rule6");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}