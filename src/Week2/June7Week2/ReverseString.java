/* Given a sentence, write a program to reverse each word in the sentence.
input - "Java J2EE Reverse Me"
output - "avaJ EE2J esreveR eM" */
package Week2.June7Week2;
public class ReverseString {
    public static String reverse(String s){
        String[] w = s.split(" ");
        String rStr = "";
        int i = 0;
        while (i < w.length) {
            String word = w[i];
            String rWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                rWord += word.charAt(j);
            }
            rStr = rStr + rWord + " ";
            i++;
        }
        return rStr;

    }
    public static void main(String[] args){
        String s = "Java J2EE Reverse Me";
        System.out.println("Reverse of " + s + " is: " + reverse(s));
    }
}
