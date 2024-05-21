package single_responsibilty.wrong;

public class employee {
    private String name;
    private int id;
    private int salary;

    public employee(String name, int id){
        this.id = id;
        this.name = name;
    }

    // Complex salary calculation logic based on employee details
    public void calculateSalary(){
        if(id%2==0)
            this.salary = 5000;
        else
            this.salary = 10000;
    }

    //Each class should have a single responsibilty.
    // Here employee class should just be containig the
    //information of employees(i.e. name, id). But here we
    // are also calculating the salary logic. So if salary logic changes our main employee
    //class will also change. Hence one class in handling more than one
    // responsibilty which violates single responsibilty principle.
}
