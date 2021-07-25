package QA;

public class Values {
    private  String color;
    private double price;
    private int quantity;

    public  Values(String color, double price, int quantity){
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public  String toString(){
        return " [color =" + color + ", price =" + price + ", quantity =" + quantity +']';
    }
    public  String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
