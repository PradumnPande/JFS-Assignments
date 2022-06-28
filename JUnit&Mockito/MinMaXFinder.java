package junit;


import java.util.Arrays;
public class MinMaXFinder {

    public static void main(String[] args) {
        int[] arr={56,34,7,3,54,3,34,34,53};
        System.out.println((Arrays.toString(findMinMax(arr))));
    }
    public static int[] findMinMax( int[] arr ) {
       int[] array=new int[2];
       array[0]=Arrays.stream(arr).min().getAsInt();
       array[1]=Arrays.stream(arr).max().getAsInt();
       return array;
    }
}