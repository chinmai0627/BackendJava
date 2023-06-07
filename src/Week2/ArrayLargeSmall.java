/*Given an integer array,
 write a program to find the largest and
 smallest number in the array. */
package Week2;

public class ArrayLargeSmall {
    public static void main(String[] args){
        int[] arrayNumb = {10,4,27,8,16,43,78};

        int sNumb = arrayNumb[0];
        int lNumb = arrayNumb[0];

        for (int i = 1; i < arrayNumb.length; i++) {
            if (arrayNumb[i] < sNumb) {
                sNumb = arrayNumb[i];
            }
            if (arrayNumb[i] > lNumb) {
                lNumb = arrayNumb[i];
            }
        }

        System.out.println("Smallest number in the array is: " + sNumb);
        System.out.println("Largest number in the array is: " + lNumb);
    }
}
