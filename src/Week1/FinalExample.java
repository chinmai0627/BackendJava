/* Create a final class with a final variable and
a final method that can only be accessed by
classes within the same package.*/
package Week1;

final class finalcar {
    final int totalprice = 27000;
    void carvalue(){
        System.out.println("Final Car Value");
    }
}

class FinalExample {
    public static void main(String[] args){
        finalcar obj = new finalcar();
        obj.carvalue();
        System.out.println(obj.totalprice);
    }
}
