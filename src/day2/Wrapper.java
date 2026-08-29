package day2;

public class Wrapper {
    public static void main(String[] args) {
        Integer i = 5;
        Integer j = new Integer("5");
        Integer k = Integer.valueOf("9");
        Integer s = Integer.parseInt("7");

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(s);
        System.out.println(i == j);
        System.out.println(i.equals(j));
    }
}
