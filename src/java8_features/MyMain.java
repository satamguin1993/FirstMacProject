package java8_features;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("aaa", 1, 100d, 20));
        list.add(new Employee("bbb", 1, 100d, 20));
        list.add(new Employee("ccc", 1, 100d, 30));
        list.add(new Employee("ddd", 1, 100d, 40));
        list.add(new Employee("eee", 1, 100d, 20));
        list.add(new Employee("fff", 1, 100d, 10));

        list.sort(new SortedEmployee());

        list.forEach(employee -> System.out.println(employee.getName() + " : " + employee.getAge()));

    }

}
