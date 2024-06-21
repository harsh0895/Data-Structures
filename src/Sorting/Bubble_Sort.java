package Sorting;

public class Bubble_Sort {
    static void printArray( int []arr ) {
        for (int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static void bubbleSort( int []arr ) {
        for( int i = arr.length - 2; i >= 0; i-- ) {
            for( int j = 0; j <= i; j++ ) {
                if( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: ");
        printArray(arr);
    }
    public static void main(String[] args) {
        int []arr = { 3,2,1,4,5 };
        System.out.println("Array before sorting: ");
        printArray(arr);
        bubbleSort(arr);
    }
}
