package OOPS.Inheritance;

class FullTimeEmployee extends Employee{

    final private String department="Sales";
    public FullTimeEmployee(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department is: "+department+ " Employee is FullTime");
    }
}
