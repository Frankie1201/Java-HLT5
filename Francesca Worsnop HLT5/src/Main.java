
//Test

public class Main {
    
    public static void main(String[] args) {
        Manager m1 = new Manager();
        
        
        System.out.println("Manager 1");
        System.out.println("ID : "+m1.getMId());
        System.out.println("Name : "+m1.getName());
        System.out.println("Shift : "+m1.getShift());
        System.out.println("Salary : "+m1.getSalary());
        
        System.out.println("=========================");
        
        Manager m2 = new Manager(1001, "Max", "weekends", 1800.0);
        
        System.out.println("Manager 2");
        System.out.println("ID : "+m2.getMId());
        System.out.println("Name : "+m2.getName());
        System.out.println("Shift : "+m2.getShift());
        System.out.println("Salary : "+m2.getSalary());
    }
    
}
