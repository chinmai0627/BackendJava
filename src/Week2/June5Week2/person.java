/*Given person age, Write a function that will print if the person is kid , teen or adult.

teen if age is between 13 and 19 inclusive.
kid if less than 13.
adult if more than 19.*/
package Week2.June5Week2;
public class person {
   static int personAge = 27;
    public static void main(String[] args){
        personCategory(personAge);
    }
    public static void personCategory(int personAge) {
        if(personAge < 13){
            System.out.println("Kid");
        } else if (personAge >= 13 && personAge <= 19) {
            System.out.println("Teen");
        }
        else if(personAge > 19){
            System.out.println("Adult");
        }
    }
}
