package Arrays;

// 1. Write a program to reverse the given array elements.

public class arr1 {
    static void printArray( int []arr ) {
        for (int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    // Two pointer approach
    static void reverseArray( int []arr) {
        int start = 0;
        int end = arr.length-1;
        while( start <= end ) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array after reversing: ");
        printArray(arr);
    }
    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5 };
        System.out.println("Array before reversing: ");
        printArray(arr);
        reverseArray(arr);
    }
}
