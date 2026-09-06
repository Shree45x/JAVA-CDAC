package CollectionS;

import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo {
    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20));
    public static void main(String[] args) {
        //create a array list to store Interger value

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20));
        System.out.println(list);

        list.add(30);
        list.add(40);
        list.add(3,60); //insert element at  3rd index
        list.size();
        System.out.println(list);

//        list.remove(1);
//        list.remove(2);
//        System.out.println(list);

        //Accesing and modiflying the element

        System.out.println(list.get(0)); // get the element at index 0

        //u can check element is vailable at this index using contain

        System.out.println(list.contains(25));  //output -->False


        //Set->u cant set elemnt at specific index and it remove previoulsy available elemet at that index

        list.set(0,45);
        System.out.println(list);


        System.out.println("________________________");

        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    void printlist(ArrayList<Integer>list){
        for ( int T:list){
            System.out.println(T);
        }

    }
}
