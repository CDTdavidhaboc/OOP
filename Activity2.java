public class Activity2 {

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
