package students.denis_asipenka.lesson_3.level_7_task_29;

import java.util.Scanner;

public class Sofa {
    String color;
    double sofaLength;
    double sofaWidth;
    String unfold;

    Sofa(String color, double sofaLength, double sofaWidth, String unfold) {
        this.color = color;
        this.sofaLength = sofaLength;
        this.sofaWidth = sofaWidth;
        this.unfold = unfold;
    }

     public String getColor() {
        return color;
    }

    public double getSofaLength() {
        return sofaLength;
    }

    public double getSofaWidth() {
        return sofaWidth;
    }

    public String getUnfold() {
        return unfold;
    }
}
class Table {
    String tableColor;
    double tableHight;
    int numberOfSeat;

    Table(String tableColor, double tableHight, int numberOfSeat) {
        this.tableColor = tableColor;
        this.tableHight = tableHight;
        this.numberOfSeat = numberOfSeat;

    }

    public String getTableColor() {
        return tableColor;
    }

    public double getTableHight() {
        return tableHight;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }
}
    class SofaDemo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите цвет:");
            String colorTemp = scanner.nextLine();
            System.out.println("Введите длину:");
            double sofaLengthTemp = scanner.nextDouble();
            System.out.println("Введите ширину:");
            double sofaWidthTemp = scanner.nextDouble();
            Sofa sofa = new Sofa(colorTemp, sofaLengthTemp, sofaWidthTemp, "Да");
            String color = sofa.getColor();
            double sofaLength = sofa.getSofaLength();
            double sofaWidth = sofa.getSofaWidth();
            String unfold = sofa.getUnfold();
            System.out.println("Диван:"+"\n"+"Цвет: " + color +"\n"+ "Длина: " + sofaLength +"\n"+ "Ширина: " + sofaWidth +"\n"+ "Раскладывается диван: " + unfold);


        }

    }


     class TableDemo {
        public static void main(String[] args) {
            Table table = new Table("Розовый",1200, 5);
            String tableColor = table.getTableColor();
            double tableHight = table.getTableHight();
            int numberOfSeat = table.getNumberOfSeat();
            System.out.println("Стол:"+"\n"+"Цвет: "+ tableColor+"\n"+"Высота: "+ table.getTableHight()+"\n"+"Число посадочных мест: " + numberOfSeat);

        }
    }



