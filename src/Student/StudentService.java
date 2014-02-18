package Student;


import java.util.Scanner;

/**
 * Created by aditya on 2/18/14.
 */
public class StudentService {

    Student student = new Student();


    public void setInformation(){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter student name: ");
        student.setName(console.nextLine());

        System.out.println("Enter student address: ");
        student.setAddress(console.nextLine());

        System.out.println("Enter student email: ");
        student.setEmail(console.nextLine());

        System.out.println("Enter student level: ");
        student.setLevel(console.nextLine());


    }

    public void getInformation(){

        System.out.println("Student name: "+student.getName());
        System.out.println("Student address: "+student.getAddress());
        System.out.println("Student email: "+student.getEmail());
        System.out.println("Student level: "+student.getLevel());

    }
}
