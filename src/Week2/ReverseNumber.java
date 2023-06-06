package Week2;
/* Given a number , write a program to reverse the digits of the number
input 12345, output 54321 */
public class ReverseNumber {
    public static int reverseDigits(int number) {
        int rNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            rNumber = rNumber * 10 + digit;
            number /= 10;
        }
        return rNumber;
    }
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverseDigits(number));
    }
}
