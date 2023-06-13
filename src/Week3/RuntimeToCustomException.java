/* Create a custom exception class. w
rite a program to catch a runtime exception
and then convert it into the custom exception.*/
package Week3;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class RuntimeToCustomException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new CustomException("Custom Exception: Division by zero");
            } catch (CustomException ce) {
                System.out.println(ce.getMessage());
            }
        }
    }
}