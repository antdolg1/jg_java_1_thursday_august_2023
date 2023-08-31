package teacher.lessoncode;

import java.util.Scanner;

public class NestedSwitchStatement {

    public static void main(String[] args) {

        System.out.println("Please choose your option. Available options: Chicken, Beef or Vegetarian");

        Scanner scanner = new Scanner(System.in);
        String userMealOption = scanner.nextLine();
        userMealOption = userMealOption.toUpperCase();

        switch (userMealOption) {
            case "CHICKEN":
                System.out.println("Please choose your combo meal. 1 - Fries combo, 2 - Nuggets combo, 3 - Stripes combo");
                int userChickenComboOption = scanner.nextInt();
                switch (userChickenComboOption) {
                    case 1:
                        System.out.println("You chose Fries combo!");
                        break;
                    case 2:
                        System.out.println("You chose Nuggets combo!");
                        break;
                    case 3:
                        System.out.println("You chose Stripes combo!");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please ask cashier for help!");
                        break;
                }
                break;
            case "BEEF":
                System.out.println("Please choose your combo meal. 1 - Fries combo, 2 - Salad combo, 3 - Cheese balls combo");
                int userBeefComboOption = scanner.nextInt();
                switch (userBeefComboOption) {
                    case 1:
                        System.out.println("You chose Fries combo!");
                        break;
                    case 2:
                        System.out.println("You chose Salad combo!");
                        break;
                    case 3:
                        System.out.println("You chose Cheese balls combo!");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please ask cashier for help!");
                        break;
                }
                break;
            case "VEGETARIAN":
                System.out.println("Please choose your combo meal. 1 - Salad combo, 2 - Falafel balls combo, 3 - Feta cheese combo");
                int userVegetarianComboOption = scanner.nextInt();
                switch (userVegetarianComboOption) {
                    case 1:
                        System.out.println("You chose Salad combo!");
                        break;
                    case 2:
                        System.out.println("You chose Falafel balls combo!");
                        break;
                    case 3:
                        System.out.println("You chose Feta cheese combo!");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please ask cashier for help!");
                        break;
                }
                break;
            default:
                System.out.println("Sorry we don't have such an option, please ask info for additional details on this.");
                break;
        }


    }
}
