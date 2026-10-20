import java.lang.*;
import java.util.*;

class employee{
    String employeeName;
    int employeeID;

    employee(int employeeID , String employeeName){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        System.out.println("employee constructor called");
    }
    void displayDetails(){
        System.out.println("employee name: " + employeeName);
        System.out.println("employee id: " + employeeID);
    }
}
class manager extends employee{
    String department;

    manager(String employeeName, String department ,int employeeID){
        super(employeeID ,employeeName);
        this.department = department;
        System.out.println("manager constructor called");
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("department: " + department);
    }

}
class projectManager extends manager{
    String projectName;

    projectManager(String employeeName, String department , int employeeID, String projectName){
        super(employeeName , department , employeeID);
        this.projectName = projectName;
        System.out.println("project manager constructor called");
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("project name: " + projectName);
    }

}
public class task4{
    public static void main(String[] args){
        projectManager PM = new projectManager("kishan", "CSE", 54 , "CASE-STUDY");

        System.out.println();

        PM.displayDetails();

        System.out.println();

        employee e = PM;
        e.displayDetails();
    }
}
                                                                                                                                                                                                  

