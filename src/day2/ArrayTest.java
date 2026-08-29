package day2;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your Array : ");
        int val = sc.nextInt();
        int[] arr1 = new int[val];

        int i = 0;
        while(i < arr1.length) {
            System.out.print("Enter the " + i + " th number : ");
            arr1[i++] = sc.nextInt();
        }

        int j = 0;
        while(j < arr1.length) {
            System.out.print(arr1[j++] + " ");
        }

    }
}
