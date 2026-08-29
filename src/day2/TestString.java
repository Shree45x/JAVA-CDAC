package day2;

public class TestString {
    public static void main(String[] args){
        String s1 = "Aashish";
        String s2 = "Aashish";
        String s3 = new String("Aashish");
        String s4 = new String("Aashish");

        if(s1==s2) System.out.println("s1 == s2 -> True");
        else System.out.println("s1 == s2 -> False");

        if(s3==s4) System.out.println("s3 == s4 -> True");
        else System.out.println("s3 == s4 -> False");

        if(s3.equals(s4)) System.out.println("s3 == s4 -> True");
        else System.out.println("s3 == s4 -> False");


        if(s1 == s4) System.out.println("s1 == s4 -> True");
        else System.out.println("s1 == s4 -> False");

        if(s1.equals(s4)) System.out.println("s1 == s4 -> True");
        else System.out.println("s1 == s4 -> False");

        String s5 = new String("Aashish");
        System.out.println(s5==s1);

        s5 = s1;
        System.out.println(s1 == s5);

        String s6 = "Aashish";
        System.out.println(s6==s3);

        s6 = s3;
        System.out.println(s6 == s3);
    }

}
