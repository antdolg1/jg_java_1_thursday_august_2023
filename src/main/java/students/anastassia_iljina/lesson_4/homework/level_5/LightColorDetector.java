package students.anastassia_iljina.lesson_4.homework.level_5;

public class LightColorDetector {
    public String detect(int wavelenght) {
        if (380 <= wavelenght && wavelenght <= 449) {
            return "Violet";
        } else if (450 <= wavelenght && wavelenght <= 494) {
            return "Blue";
        } else if (495 <= wavelenght && wavelenght <= 569) {
            return "Green";
        } else if (570 <= wavelenght && wavelenght <= 589) {
            return "Yellow";
        } else if (590 <= wavelenght && wavelenght <= 619) {
            return "Orange";
        } else if (620 <= wavelenght && wavelenght <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}
