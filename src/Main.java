import files.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Path inputPath = Paths.get("src/files/employee");
        List<String> stringList = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {

            if (stringList.get(i).equals("EmployeeData")) {
                Employee employee = new Employee();
                employee.setFirstName(stringList.get(i+1));
                employee.setLastName(stringList.get(i+2));
                employee.setAge(Integer.parseInt(stringList.get(i+3)));
                employees.add(employee);
            }
        }

        Path outputFile = Paths.get("src/files/EmployeeData.json");
        Files.write(outputFile, toJson(employees).getBytes(Charset.forName("UTF-8")));
    }

    private static String toJson(List<Employee> employees) {

        String collect = employees.stream()
                .map(employee -> employee.toJson())
                .collect(Collectors.joining(","));

        return "{\"employees\": ["+collect+"]}";
    }
}


