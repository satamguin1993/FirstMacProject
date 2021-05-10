package java8_features;

import java.util.Comparator;

public class SortedEmployee implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        int c = e1.getAge() - e2.getAge();

        if (c==0) {
            c = e1.getName().compareTo(e2.getName());
        }

        return c;
    }
}
