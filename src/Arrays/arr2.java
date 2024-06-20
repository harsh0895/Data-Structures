package Arrays;

// 2. Write a program to find the target element in the given array.

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        boolean isExists = false;
        int []arr = { 2,3,4,1,5,6 };
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] == target ) {
                System.out.println("target element at "+i+" index");
                isExists = true;
                break;
            }
        }
        System.out.println(isExists ? "Target element exists" : "Target element doesn't exist!");

    }
}
