/*Given two strings, write a program to check if the two strings are anagram of each other ?*/
package Week2.June7Week2;

public class Anagram {
    public static boolean anagram(String s1, String s2) {
        Arrays.sort(s1);
        Arrays.sort(s2);
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
