package Arrays;

// 6. Write a program to rotate an array by k-steps.

import java.util.Scanner;

public class arr6 {
    static void printArray( int []arr ) {
        for (int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    // reverse array
    static void reverse( int []arr, int start, int end ) {
        while ( start <= end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void RotateArray( int []arr, int k ) {
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        k = k % n;
        reverse(arr, start, k-1);
        reverse(arr, k, end);
        reverse(arr, start, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your steps rotating the array: ");
        int k = sc.nextInt();
        int []arr = { 1,2,3,4,5,6,7,8 };
        System.out.println("Before Rotating The array elements are: ");
        printArray(arr);
        RotateArray(arr, k);
        System.out.println("After Rotating The array elements are: ");
        printArray(arr);
    }
}
