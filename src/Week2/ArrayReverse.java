/* Write a program to reverse an Arrays */
package Week2;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arrayNumb = {10, 8, 27, 8, 16, 43, 78};
        int start = 0;
        int end = arrayNumb.length - 1;

        while (start < end) {
            int temp = arrayNumb[start];
            arrayNumb[start] = arrayNumb[end];
            arrayNumb[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arrayNumb.length; i++) {
            System.out.print(arrayNumb[i] + " ");
        }
        System.out.println();
    }
}

