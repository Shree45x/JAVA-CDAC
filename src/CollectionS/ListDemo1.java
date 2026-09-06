package CollectionS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

//Find duplicate element in this list

public class ListDemo1 {

    static Scanner input=new Scanner(System.in);
    static List<Integer> list= new ArrayList<>();

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        List<Integer>duplicate=new ArrayList<>();

        System.out.println("How many Numbers u want to add:");
        int n=input.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter " + (i+1) + " Number");
            int num=input.nextInt();
            list.add(num);
        }

        System.out.println("Orignal list : "+list);
        for(int i=0;i<n;i++){
            if(!duplicate.contains(list.get(i))){
                duplicate.add(list.get(i));
            }else{
                System.out.println(+list.get(i)+ " is the duplicate element in the list");
            }}



        Collections.sort(list);
        System.out.println("\n sorted List:"+list);



    }
}
