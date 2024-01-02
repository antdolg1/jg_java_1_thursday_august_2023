package students.denis_asipenka.lesson_12.level_5;

import java.util.Objects;

public class ValidationException extends Exception {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) && Objects.equals(description, that.description) && Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }

    @Override
    public String toString() {
        return "ValidationException{" +
                "ruleName='" + ruleName + '\'' +
                ", description='" + description + '\'' +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    private String ruleName;

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }

    private String description;

    private String fieldName;

}