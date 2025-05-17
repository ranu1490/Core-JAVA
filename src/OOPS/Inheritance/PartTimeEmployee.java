package OOPS.Inheritance;

class PartTimeEmployee extends Employee{

    private String department;

    //intially, child will call the super() i.e default constructor if not found
    // and if there is parameterized constructor then we need
    // to write like below else it will give compile error, if we want we can add extra fields as well.
    public PartTimeEmployee(int id, String name, int salary, String depart) {
        super(id, name, salary);
        this.department=depart;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department is: "+department+ " Employee is partTime");
    }
}
