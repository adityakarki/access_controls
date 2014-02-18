package Teacher;

import Student.Student;

import java.util.Scanner;

/**
 * Created by aditya on 2/18/14.
 */
public class TeacherService {

    Teacher teacher = new Teacher();


    public void setInformation(){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter Teacher name");
        teacher.setName(console.nextLine());

        System.out.println("Enter Teacher address");
        teacher.setAddress(console.nextLine());

        System.out.println("Enter Teacher email");
        teacher.setEmail(console.nextLine());

        System.out.println("Enter Teacher subject");
        teacher.setSubject(console.nextLine());

    }

    public void getInformation(){

        System.out.println("Teacher name: "+ teacher.getName());
        System.out.println("Teacher address: "+ teacher.getAddress());
        System.out.println("Teacher email: "+ teacher.getEmail());
        System.out.println("Teacher subject: "+ teacher.getSubject());

    }
}
