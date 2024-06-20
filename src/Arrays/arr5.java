package Arrays;

// 5. write a program to find the second largest and smallest element in the array.

public class arr5 {
    static int secondMaximum( int []arr ) {
        int max = -1;
        int Smax = -1;
        for( int i = 0; i < arr.length; i++ ) {
            if( max < arr[i] ) {
                Smax = max;
                max = arr[i];
            }
            else if( Smax < arr[i] ) {
                Smax = arr[i];
            }
        }
        return Smax;
    }
    static int secondSmallest( int []arr ) {
        int min = arr[0];
        int Smin = -1;
        for( int i=0; i<arr.length; i++ ) {
            if( min > arr[i] ) {
                Smin = min;
                min = arr[i];
            }
            else if ( Smin > arr[i]) {
                Smin = arr[i];
            }
        }
        return Smin;
    }
    public static void main(String[] args) {
        int []arr = { 6,4,7,8,3,2,1 };
        int secondLargest = secondMaximum(arr);
        int secondSmallest = secondSmallest(arr);
        System.out.println("Second Maximum element is: "+secondLargest);
        System.out.println("Second Minimum element is: "+secondSmallest);
    }
}
