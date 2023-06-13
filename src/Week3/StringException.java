/*write a method that converts given string into an integer.
 Call the method with different inputs and print the return value.
 Print exception if it is thrown.
sample inputs - "23", "45.67" , "test", "123f"*/
package Week3;
public class StringException {
    public static void StrtoInt(String s){
        try{
            int i = Integer.parseInt(s);
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        StrtoInt("23");
        StrtoInt("45.67");
        StrtoInt("test");
        StrtoInt("123f");
    }
}
