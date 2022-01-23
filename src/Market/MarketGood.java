package Market;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;

        if (discountRate < 0 || discountRate > 100){
            this.discountRate = 0;
        }
    }
    public MarketGood(String name, int retailPrice){
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getRetailPrice(){
        return this.retailPrice;
    }

    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    public int getDiscountedPrice(){
        return (int) (this.retailPrice * (100 - this.discountRate) / 100);
    }

}
