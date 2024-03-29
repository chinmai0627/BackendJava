/*Given two strings, write a program to check if the two strings are anagram of each other ?*/
package Week2.June7Week2;
import java.util.Arrays;
public class Anagram {
    public static boolean anagram(String s1, String s2) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] ss1 = s1.toCharArray();
            char[] ss2 = s2.toCharArray();
            Arrays.sort(ss1);
            Arrays.sort(ss2);
            return Arrays.equals(ss1,ss2);
        }
    public static void main(String[] args) {
        String s1 = "Heart";
        String s2 = "Earth";
        if(anagram(s1,s2))
        {
            System.out.println("The two strings, "+ s1 +" and "+ s2+ " are anagram of each other");
        }
        else{
            System.out.println("The two strings, " + s1 +" and "+ s2+ " are not anagram of each other");
        }
    }

}
