
public class Manager {
    
int MId;
String Name;
String Shift;
double Salary;


//default constructor
    public Manager() {
    }
    
//parameterized constructor
    public Manager(int MId, String Name, String Shift, double Salary) {
        this.MId = MId;
        this.Name = Name;
        this.Shift = Shift;
        this.Salary = Salary;
    }
    
//Getter and Setter

    public int getMId() {
        return MId;
    }

    public void setMId(int MId) {
        this.MId = MId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
     
    
}//class ends
