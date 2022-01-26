package Market_2;

public class MarketGood {
    // private -> public final
    public final String name;
    public final int retailPrice;
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
