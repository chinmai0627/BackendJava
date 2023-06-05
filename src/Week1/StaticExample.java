/*Create a class with a static variable of type int and
a static method that returns an int.
write a static block to initialize the static variable by
calling the static method. */
package Week1;
class Static1 {
    static int a;

    static {
        a = m1();
    }

    public static int m1() {
        return 10;
    }
}
public class StaticExample{
    public static void main(String[] args){

    }
}
