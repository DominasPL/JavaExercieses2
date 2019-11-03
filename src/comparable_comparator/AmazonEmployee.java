package comparable_comparator;

import java.util.Objects;

public class AmazonEmployee extends Employee {

    public String section;

    public AmazonEmployee(String firstName, String lastName, int age, String section) {
        super(firstName, lastName, age);
        this.section = section;
    }

    public AmazonEmployee(Employee employee, String section) {
        super(employee.getFirstName(), employee.getLastName(), employee.getAge());
        this.section = section;
    }
}
