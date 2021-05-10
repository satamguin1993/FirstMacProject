package preparation;

import java.util.Optional;
import java.util.function.Predicate;

public class StreamPractice {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setId(10);
        e.setName("satam");
        e.setSalary(100);

        Employee employee = null;

        Optional.ofNullable(e)
                .filter(emp -> !checkNameAndId.test(emp))
                .ifPresent(e1 -> System.out.println(e1.getName()));

    }

    private static Predicate<Employee> checkNameAndId = employee ->
            employee.getName().equals("satam") &&
                    employee.getId() == 10;

}
