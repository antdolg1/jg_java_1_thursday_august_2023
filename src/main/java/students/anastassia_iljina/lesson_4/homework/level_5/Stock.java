package students.anastassia_iljina.lesson_4.homework.level_5;

public class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }

    }

    public String getInformation() {
        return "Company = " + name + ", Curren Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}
