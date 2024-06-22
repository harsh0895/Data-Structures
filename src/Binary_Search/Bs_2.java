package Binary_Search;

import java.util.Scanner;

// 2. Write a program to find the first and last occurrence of the given element in the sorted array.
public class Bs_2 {
    static int firstOcc( int []arr, int element ) {
        int first = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if( arr[mid] == element ) {
                first = mid;
                end = mid - 1;
            }
            else if( arr[mid] < element ) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return first;
    }
    static int secondOcc( int []arr, int element ) {
        int last = -1;
        int start = 0;
        int end = arr.length-1;
        while( start <= end ) {
            int mid = start + ( end - start )/2;
            if( arr[mid] == element ) {
                last = mid;
                start = mid + 1;
            }
            else if( arr[mid] < element ) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 5, 7, 7, 8, 8, 10};
        System.out.println("Enter your element: ");
        int element = sc.nextInt();
        int firstIndex = firstOcc(arr, element);
        int lastIndex = secondOcc(arr, element);
        if( firstIndex != -1 && lastIndex != -1 ) {
            System.out.println("First occurrence is: "+firstIndex+" and last occurrence is: "+lastIndex);
        }
        else{
            System.out.println("Your element not found!");
        }
    }
}
