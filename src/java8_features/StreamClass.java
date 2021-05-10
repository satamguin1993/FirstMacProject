package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("satam");
        list.add("guin");
        list.add("aaaa");
        list.add("xyz");
        list.add("fff");


        list.stream().forEach(e -> System.out.println(e));

        List<String> newList = list.stream().map(string -> string.concat("_")).collect(Collectors.toList());

        newList.stream().forEach(string -> System.out.println(string));

    }

}
