/*Given an integer array of size N, write a program to rotate
the array left by "x" positions.
Example: input - arr[] = {1, 2, 3, 4, 5, 6, 7}, x = 2
Output: 3 4 5 6 7 1 2*/
package Week2;
class RotateArray {
        static void leftRotate(int[] arr, int x) {
            int n = arr.length;
            int[] rotatedArr = new int[n];

            for (int i = 0; i < n; i++) {
                int newIndex = (i + x) % n;
                rotatedArr[i] = arr[newIndex];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = rotatedArr[i];
            }
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int x = 2;

            leftRotate(arr, x);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}