package Arrays;

// 4. Write a program to check given array is sorted or not.
public class arr4 {
    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5,6 };
        boolean isSorted = true;
        for( int i = 1; i < arr.length; i++ ) {
            if( arr[i-1] > arr[i] ) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Array is Sorted" : "Array is not sorted");
    }
}
