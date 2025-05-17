package OOPS.Inheritance;

import java.util.ArrayList;
import java.util.List;

class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new PartTimeEmployee(101,"Ranu",100000,"IT");
        list.add(e1);

        Employee e2 = new FullTimeEmployee(102,"Sweta",1000000);
        list.add(e2);

        for(Employee emp : list){
            emp.displayDetails();
        }
    }
}
