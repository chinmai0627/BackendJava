/*Given two strings, write a program to check if the two strings are anagram of each other ?*/
package Week2.June7Week2;
import java.util.Arrays;
public class Anagram {
    public static boolean anagram(String s1, String s2) {
        if(s1.length() != s2.length() )
        {
            return false;
        }
        else {
            char[] ss1 = s1.toCharArray();
            char[] ss2 = s2.toCharArray();
            Arrays.sort(ss1);
            Arrays.sort(ss2);
            return Arrays.equals(ss1,ss2);
        }
    }
    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "earth";
        boolean isanagram = anagram(s1,s2);
        if(isanagram)
        {
            System.out.println("The two strings are anagram of each other");
        }
        else{
            System.out.println("The two strings are not anagram of each other");
        }
    }

}
