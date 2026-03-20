import java.util.*;

public class EmployeeComperableComperatorExample implements Comparable<EmployeeComperableComperatorExample>{

    private int empId;
    private String name;

    EmployeeComperableComperatorExample(int id, String name){
        this.empId=id;
        this.name=name;
    }

    @Override
    public int compareTo(EmployeeComperableComperatorExample o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return name + " ("+empId+")";
    }

    public static void main(String[] args) {
        List<EmployeeComperableComperatorExample> list = new ArrayList<>();
        list.add(new EmployeeComperableComperatorExample(101,"Ranu"));
        list.add(new EmployeeComperableComperatorExample(102,"Sweta"));
        list.add(new EmployeeComperableComperatorExample(103,"Tanku"));
        list.add(new EmployeeComperableComperatorExample(104,"Hutu"));

        //Sort using comperable
        Collections.sort(list);
        System.out.println("Sort using comperable: ");
        list.forEach(System.out::println);

        //sort using comperator
        Comparator<EmployeeComperableComperatorExample> byId = (s1, s2)-> Integer.compare(s1.empId,s2.empId);
        Collections.sort(list,byId);
        System.out.println("Sort using comperator: ");
        list.forEach(System.out::println);

    }
}
