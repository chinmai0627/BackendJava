/*Create a class "Product.java" with variable "price" of type double.
Price indicates price for single quantity of the product.
Create a getter and setter methods for price variable.
Create an overloaded method for price getter method.
Overloaded method should take quantity as a method parameter and
return the price based on the quantity.*/
public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }
}
class EncapsulationMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(25.0);

        double singlePrice = product.getPrice();
        System.out.println("Single Price: " + singlePrice);

        int quantity = 4;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Total Price for Quantity " + quantity + ": " + totalPrice);
    }
}
