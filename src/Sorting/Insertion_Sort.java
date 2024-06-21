package Sorting;

public class Insertion_Sort {
    static void printArray( int []arr ) {
        for (int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void insertionSort( int []arr ) {
        for( int i = 1; i < arr.length; i++ ){
            for( int j = i; j > 0; j-- ) {
                if( arr[j] < arr[j-1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Array After sorting: ");
        printArray(arr);
    }
    public static void main(String[] args) {
        int []arr = { 3,2,1,4,5 };
        System.out.println("Array before sorting: ");
        printArray(arr);
        insertionSort(arr);
    }
}
