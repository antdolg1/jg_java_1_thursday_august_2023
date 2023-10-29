package students.nikolajs_antonovs.lesson_4.level_6;

class Stock {
    String companyName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(double newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company: " + companyName + "\n" +
                "Current price: " + currentPrice + "\n" +
                "Min price: " + minPrice + "\n" +
                "Max price: " + maxPrice;
    }


}

