/*Given a string, write a program to find number of vowels in that string.*/
package Week2.June7Week2;
public class VowelsString {
    public static int vowelc(String s){
       int c = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a =='a' || a=='e'|| a=='i'|| a=='o'|| a=='u'|| a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U') {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        String s = "Chinmai";
        System.out.println("Number of Vowels in String "+ s + " are: " + vowelc(s));

    }
}
