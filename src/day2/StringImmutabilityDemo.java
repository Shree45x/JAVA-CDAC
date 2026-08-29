package day2;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        // 1. Create an original string
        String str1 = "Hello";

        System.out.println("Original str1 value: " + str1);
        System.out.println("Original str1 hash code: " + System.identityHashCode(str1));

        System.out.println("--------------------------------------------------");

        // 2. Try to "modify" the string using the concat() method
        String str2 = str1.concat(" World");

        // 3. Check what happened to str1
        System.out.println("After concat, str1 value: " + str1);
        // Notice str1 is STILL "Hello"! It did not change.
        System.out.println("str1 hash code (unchanged): " + System.identityHashCode(str1));

        System.out.println("--------------------------------------------------");

        // 4. Check the new string (str2)
        System.out.println("New str2 value: " + str2);
        // str2 holds the combined result: "Hello World"
        System.out.println("str2 hash code (different object): " + System.identityHashCode(str2));
    }
}