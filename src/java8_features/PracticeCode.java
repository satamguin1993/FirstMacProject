package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeCode {

    public static void main(String[] args) {
        MyInterface myInterface = (x -> (x+x)/3);

        System.out.println(myInterface.prepare(10));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(25);
        list.add(50);

        list.stream().map(integer -> integer+20).collect(Collectors.toList());

        list.stream().forEach(integer -> System.out.print(integer + " "));
    }

}
