package java8_features;

public class Employee {

    private String name;
    private int id;
    private double salary;
    private Address address;
    private int age;

    public Employee(String name, int id, double salary, int age) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    private Employee() {
        this.id = 10;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
