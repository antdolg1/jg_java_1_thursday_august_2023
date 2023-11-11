package teacher.lesson_12.lessoncode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileApp {

    public static void main(String[] args) throws CustomException{

        String separator = File.separator;

        String pathToFile = separator + "Users" + separator + "antonsdolgopolovs" + separator + "Desktop" + separator+ "Lesson12.txt";

        File file = new File(pathToFile);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            throw new CustomException("Custom exception was thrown!");
        } catch (FileNotFoundException e) {
            System.out.println("File with such a name was not found on your computer!");
            e.printStackTrace();
        }
    }
}
