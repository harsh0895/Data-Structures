package Sorting;

public class Selection_Sort {
    static void printArray( int []arr ) {
        for (int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static void Sort( int []arr ) {
        for( int i = 0; i < arr.length-1; i++ ) {
            int min = i;
            for( int j = i+1; j < arr.length; j++ ) {
                if( arr[min] > arr[j] ) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Array after sorting: ");
        printArray(arr);
    }
    public static void main(String[] args) {
        int []arr = { 3,2,1,4,5 };
        System.out.println("Array before sorting: ");
        printArray(arr);
        Sort(arr);
    }
}
