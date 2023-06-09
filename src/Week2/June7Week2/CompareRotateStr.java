/* Given two strings, write a program to check if one string is rotation of another string
input - "JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"
output - true */
package Week2.June7Week2;

public class CompareRotateStr {
    public static boolean isRotate(String s1, String s2){
        String s = s1+s1;
        if(s.contains(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        boolean isRotate = isRotate(s1,s2);
        System.out.println("String "+ s2 +" is rotation of string "+ s1 + ":" + isRotate);
    }
}
