public class EncapsulationSample {

public static void main(String[] args) {

Student student = new Student("Juan", "Batangas PH", "BSIT", 2);


System.out.println("Student Name: " + student.getName()); 
System.out.println("Student Addres: " + student.getAddress());
System.out.println("Student Program: " + student.getProgram());
System.out.println("Student Year: " + student.getYear());


System.out.println();

Staff staff = new Staff("PedroPenduko", "Balayan, Batangas", "BSU Balayan",  20000);
   System.out.println("Staff Name: " + staff.getName()); 
   System.out.println("Staff Addres: " + staff.getAddress());
   System.out.println("Staff School: " + staff.getSchool());
   System.out.println("Staff Salary: " + staff.getSalary() + "php");
    
}
}
class Person{
    protected String Name;
    protected String Address;

    public void setName (String Name) {
        this.Name = Name;

}
    public void setAddress (String Address) {
        this.Address = Address; 
}
    public String getName() {
        return Name;
}
    public String getAddress() {
        return Address;
        
    }
}

class Student extends Person{
    private String Program;
    private int Year;

    public Student (String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
}
    public void setProgram (String Program) {
        this.Program = Program;
}
    public void setYear(int Year)  {
        this.Year = Year;
}

    public String getProgram() {
        return Program;
    }
    public int getYear() {
        return Year;
        
    }
}

class Staff extends Person{
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
}
    public void setSchool (String School) {
        this.School = School;
}
    public void setSalary(double Salary)  {
        this.Salary = Salary;
}

public String getSchool() {
        return School;
    }
    public double getSalary() {
        return Salary;
        
    }
}