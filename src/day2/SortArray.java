package day2;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 23 , 4 , 14 , 79 , 120 , 105 };
        for(int num : arr) System.out.print(num + " ");
        System.out.println("");

        Arrays.sort(arr);
        for(int num2 : arr) System.out.print(num2 + " ");
        System.out.println("");

        Integer[] arr2 = { 23 , 4 , 14 , 79 , 120 , 105 };
        Arrays.sort(arr2 , Collections.reverseOrder());
        for(int num2 : arr2) System.out.print(num2 + " ");
        System.out.println("");

        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println("");

        int[] copy = Arrays.copyOf(arr , 8);
        for(int num : copy) System.out.print(num + " ");

        String[] str = {"W" , "A" , "AB" , "PQ"};
        Arrays.sort(str);
    }
}
