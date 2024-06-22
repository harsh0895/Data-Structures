package Binary_Search;

// 1. Write a program to find the target element in the array by using binary search algorithm and array must be sorted.

import java.util.Scanner;

public class Bs_1 {
    static int binary_Search( int []arr, int target ) {
        int start = 0;
        int end = arr.length-1;
        while ( start <= end ) {
            int mid = start + ( end - start )/2;
            if( arr[mid] == target ) {
                return mid;
            }
            else if( arr[mid] < target ) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        // if target element doesn't exists then return -1.
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
        int []arr = { 1,2,3,4,5,6,7,8 };
        int index = binary_Search(arr, target);
        System.out.println(index != -1 ? "Target element exists at "+index+" index!" : "Target element doesn't exists!");
    }
}
