package OOPS.Encapsulation;

class EncapsulationMain {
    public static void main(String[] args) {
        Employee en = new Employee(1,"Ranu");
        System.out.println(en.getName()+" "+ en.getId());
        en.setName("Sweta");
        System.out.println(en.getName()+" "+ en.getId());
    }
}
