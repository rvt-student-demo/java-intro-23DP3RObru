package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
}
public Product (String initialName, double initialPrice, int initialQuantity){
    initialName = this.name;
    initialPrice = this.price;
    initialQuantity= this.quantity;
}
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", "+this.quantity+ " pcs");
    }
