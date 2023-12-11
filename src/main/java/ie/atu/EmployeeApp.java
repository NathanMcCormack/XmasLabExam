package ie.atu;
import java.io.IOException;


public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nathan", 111, "ggg", "llll", 10);
        Employee emp2 = new Employee("Nathan", 123, "Contract", "Man", 20);

        emp1.setGender(emp1.getGender());
        emp1.setAge(emp1.getAge());
        emp1.setEmploymentType(emp1.getEmploymentType());

        emp2.setGender(emp2.getGender());
        emp2.setAge(emp2.getAge());
        emp2.setEmploymentType(emp2.getEmploymentType());

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}
