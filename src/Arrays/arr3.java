package Arrays;

// 3. Write a program to find the maximum and smallest number in the array.

public class arr3 {
    public static void main(String[] args) {
        int []arr = { 6,4,7,8,3,2,1 };
        int smallest = arr[0];
        int largest = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            if( largest < arr[i] ) {
                largest = arr[i];
            }
            if( smallest > arr[i] ) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest+" "+largest);
    }
}
