package students.aleksandrs_kunicins.homework.lesson_4.level_6;

class Stock  {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;
    public Stock(String companyName, int price){
        this.companyName = companyName;
        this.currentPrice = price;
        this.minPrice = price;
        this.maxPrice = price;
    }
    public int updatePrice(int price){
        currentPrice = price;
        if (price>maxPrice){
        maxPrice = price;
        }
        if (minPrice>price){
        minPrice = price;
        }
        return currentPrice;
    }
    public String getPriceInformation(){
        return "Company = "+ "'"+ companyName + "',"+" Current Price = "+ currentPrice+ ", Min Price = " + minPrice + ", Max Price = "+ maxPrice;
    }
}

class  StockTest{
    public static void main(String[] args) {
        Stock st = new Stock("GOOG",10);
        String priceUInformation = st.getPriceInformation();
        System.out.println(priceUInformation);
        st.updatePrice(15);
        st.updatePrice(7);
        st.updatePrice(14);
        priceUInformation = st.getPriceInformation();
        System.out.println(priceUInformation);
    }
}
