/*Write a program to illustrate the concept of runtime polymorphism in Java.
 Choose any names for the parent and child classes,
 as well as the overridden method.*/
class authentication{

    void authenticate(){
        System.out.println("Authenticating");
    }
}
class Biometric extends authentication {
    void authenticate() { //override method
        System.out.println("Authenticating Biometric");
    }
}
class RunTimePolymorphismAuthentication{
    public static void main(String[] args){
        authentication a = new Biometric();
        a.authenticate();
        }
}
