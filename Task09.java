package GroupProject1;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {

        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest= largest;
                largest= arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
