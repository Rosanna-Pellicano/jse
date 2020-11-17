package m1.s12;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println(5 + 7);
        System.out.println(5 + "7");

        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        System.out.println("Vogons".repeat(3)); // Java 11

        String s = "Hello";
        // both t and s refer to the same object
        String t = s;

        // now s refers to a different object: s = s + 3;
        s += 3;

        System.out.println(s);
        System.out.println(t);
    }
}
