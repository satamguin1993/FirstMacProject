package java8_features;

import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {
        int input = 5;

        MyInterface square = (int x) -> x * x;
        MyInterface addition = (int x) -> x + x;

        int s = square.prepare(input);
        int a = addition.prepare(input);

        System.out.println("For input=" + input + " square=" + s);
        System.out.println("For input=" + input + " addition=" + a);

        Predicate<Integer> p = (i -> i%2==0);

        if (p.test(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

}
