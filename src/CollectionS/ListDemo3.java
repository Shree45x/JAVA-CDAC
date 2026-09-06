package CollectionS;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3 {
    static  int[] arr={10,64,70,10,30,10,20,60,45,80,60};

    public static void main(String[] args) {
        Arrays.sort(arr);
        int count=0;

        for(int num:arr) System.out.print(num + " ");
        int left=0;

        for(int right=1;right<arr.length;right++){
            if (arr[left]==arr[right]){
                System.out.println("\nDuplicate Element Find : "+arr[left]);
                count++;
            }
            left = right;
        }
        System.out.println("total duplicate element :"+count);
    }

}
