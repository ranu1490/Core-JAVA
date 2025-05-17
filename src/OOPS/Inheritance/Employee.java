package OOPS.Inheritance;

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Id: "+id+" Employee Name: "+name+" Salary is: "+salary);
    }
}
