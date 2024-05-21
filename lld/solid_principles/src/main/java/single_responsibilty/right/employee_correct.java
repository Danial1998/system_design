package single_responsibilty.right;

public class employee_correct {
    private String name;
    private int id;

    public employee_correct(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters
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
}

class SalaryCalculator {
    public double calculateSalary(employee_correct employee) {
        // Complex salary calculation logic based on employee details
        if (employee.getId() % 2 == 0) {
            return 5000;
        } else {
            return 6000;
        }
    }
}

