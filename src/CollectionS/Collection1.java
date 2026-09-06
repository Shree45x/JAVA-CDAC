package CollectionS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("shreejeet");
        list.add("aryan");
        list.add("Shreya");
        list.add("Siddhi");
        System.out.println(list);
        list.set(2,"Sarthak");
        System.out.println(list);
        list.set(3,"Keshav");
        System.out.println(list);
        System.out.println(list.contains("shreejeet"));

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
