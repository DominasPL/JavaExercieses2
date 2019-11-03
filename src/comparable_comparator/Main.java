package comparable_comparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Dominik", "Stepuch", 22);
        Employee employee10 = new Employee("Dominik", "Stepuch", 22);
        Employee employee11 = new Employee("Dominik", "Stepuch", 22);
        Employee employee2 = new Employee("Garan", "Stepuch", 22);
        Employee employee3 = new Employee("Adam", "Króiliowski", 15);
        Employee employee4 = new Employee("Ernest", "Gąbka", 67);


        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4));
//
////        employees.sort(new EmployeeFirstNameComparator());
//        employees.sort((e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName()));
//        employees.forEach(employee -> System.out.println(employee));
//
//        System.out.println("Reflexive: " + employee1.equals(employee1));
//        System.out.println("Symetric: " + employee1.equals(employee10) + " " + employee10.equals(employee1));
//        System.out.println("Equals with null: " + employee1.equals(null));
//        System.out.println("Transitive: " + employee1.equals(employee10) + " " + employee1.equals(employee11) + " " + employee10.equals(employee11));
//        System.out.println("Consistent: " + employee1.equals(employee10) + " " + employee1.equals(employee10) + " " + employee1.equals(employee10));

        Set<Employee> employeeSet = new HashSet<>();
        AmazonEmployee amazonEmployee1 = new AmazonEmployee(employee1, "Section1");
        AmazonEmployee amazonEmployee2 = new AmazonEmployee(employee1, "Section2");
//        System.out.println(employee1.equals(amazonEmployee1));
//        System.out.println(employee1.equals(amazonEmployee2));
//        System.out.println(amazonEmployee1.equals(amazonEmployee2));

        System.out.println(employee1.hashCode());
        System.out.println(employee10.hashCode());
        System.out.println(employee2.hashCode());




    }

}
