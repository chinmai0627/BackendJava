/*Create two interfaces with one abstract 
method in each and implement those two interfaces 
        using a single class */
        
package Week1;
interface Automatic{
    void automaticproperties();
}
interface Manual{
    void manualproperties();
}
class properties implements Automatic,Manual {
    public void automaticproperties() {
        System.out.println("This car has automatic system");
    }

    public void manualproperties() {
        System.out.println("This car has manual system");
    }

    public static void main(String[] args) {
        properties obj = new properties();
        obj.automaticproperties();
        obj.manualproperties();
    }
}
