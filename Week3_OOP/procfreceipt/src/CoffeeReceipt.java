public class CoffeeReceipt {
    private String kind;
    private double price;
    private double weight;

    public CoffeeReceipt (String kind, double price, double weight){
        this.kind = kind;
        this.price = price;
        this.weight = weight;
    }
    // tinh tong tien cua 1 loai cf phai tra
    public double sellingCost (){
        return this.price * this.weight;
    }
    // tinh luong cf mua co > 1 weight nao khong
    public boolean weighsMore (double amount ){
        return this.weight > amount;
    }

    public boolean isCheaperThan (CoffeeReceipt that){
        return this.price < that.price;
    }

    public boolean costLessThan (CoffeeReceipt that){
        return this.sellingCost() < that.sellingCost();
    }
}
