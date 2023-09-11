package students.denis_asipenka.lesson_4.level_6_task_17;

public class Stock {

    String company;
    int currentCrice;
    int minPrice;
    int maxPrice;

    public Stock(String a, int i) {
        this.company = a;
        this.currentCrice = i;
        this.minPrice = i;
        this.maxPrice = i;
    }

    public int updatePrice(int i) {
        currentCrice = i;
        if (minPrice > i) {
            minPrice = i;
        }
        if (maxPrice < i) {
            maxPrice = i;
        }
        return maxPrice;
    }

    public void getPriceInformation() {
        System.out.println("Company = \"" + this.company + "\", Current Price = " + this.currentCrice + ", Min Price = "
                + this.minPrice + ", Max Price = " + this.maxPrice);
    }
}
