package students.kristina_konovalchuk.homework.lesson_12.level5;

public class Task_31 {
    public class ValidationException extends Exception {
        private String ruleName;
        private String description;
        private String fieldName;

        public ValidationException(String ruleName, String description, String fieldName) {
            this.ruleName = ruleName;
            this.description = description;
            this.fieldName = fieldName;
        }

        public String getRuleName() {
            return ruleName;
        }

        public String getDescription() {
            return description;
        }

        public String getFieldName() {
            return fieldName;
        }
    }
}
