/*Create a parent class with one instance variable and
a child class with second instance variable.
Create a constructor in child class to initialize both the instance variables.
Create an overloaded constructor that takes only one parameter and
initializes child class instance variable.*/
package Week1;
class Vehicle {
    protected String name;
    public Vehicle(String name) {
        this.name = name;
    }
}
    class Car extends Vehicle {
        private String color;
        public Car(String name, String color) {
            super(name);
            this.color = color;
        }
        public Car(String name) {
            super(name);
            this.color = "Black";
        }
        public void about() {
            System.out.println("Car Name: " + name);
            System.out.println("Car Color: " + color);
        }
    }
    public class ConstructorExample {
        public static void main(String[] args) {
            Car c = new Car("BMW", "Red");
            c.about();

            Car c1 = new Car("Audi");
            c1.about();
        }
    }
