import java.lang.*;
import java.util.*;

class task2{
    public static void main(String[] args){
        String studentName = "kishan";
        String rollNo = "54";
        String department = "CSE";
        String address = "vizag";
        String hello = "hello";
        System.out.println("lenght of studentName: " + studentName.length());
        System.out.println("length of rollNo: " + rollNo.length());
        System.out.println("length of department: " + department.length());
        System.out.println("length of address: " + address.length());
        System.out.println();

        String concat = "\nname:" + " " + studentName + " " + "\nrollNo: " + rollNo + " " + "\ndepartment: " + department + " " + "\nadress: " + address;
        String concati = studentName.concat(" " + rollNo)
                                    .concat(" ")
                                    .concat(department)
                                    .concat(" ")
                                    .concat(address);
        System.out.println(concati);                            
        System.out.println();
        System.out.println("Student information: " + concat.toString());
        System.out.println();
        System.out.println("student name to upper case: " + studentName.toUpperCase());
        System.out.println("student name to lower case: " + studentName.toLowerCase());
        System.out.println();

        for(int i=0;i<studentName.length();i++){
            System.out.println("charecter at index "+ i + ": " + studentName.charAt(i));    
        }
        System.out.println();

        System.out.println("conatins 'an' : " + studentName.contains("an"));
        System.out.println();

        String studentName2 = "vamsi";
        System.out.println("studentname equals to studentname2 : " + studentName.equals(studentName2));
        System.out.println("studentname comapres to studentname2 : " + studentName.compareTo(studentName2));
        System.out.println();

        String[] words = address.split(" ");

        System.out.println("Address words:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println();
        String profile = String.join(" | ", studentName, rollNo, department, address);

        System.out.println("student profile: " + profile);

    }
}

