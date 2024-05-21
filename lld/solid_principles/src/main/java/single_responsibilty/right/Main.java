package single_responsibilty.right;

import single_responsibilty.right.SalaryCalculator;
import single_responsibilty.right.employee_correct;

public class Main {
    public static void main(String[] args) {
        // Create an employee
        employee_correct employee = new employee_correct("John", 101);

        // Create a salary calculator
        SalaryCalculator calculator = new SalaryCalculator();

        // Calculate salary
        double salary = calculator.calculateSalary(employee);

        // Print employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + salary);
    }
}
