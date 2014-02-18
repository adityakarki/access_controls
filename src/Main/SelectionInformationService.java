package Main;

import College.CollegeService;
import Student.StudentService;
import Teacher.TeacherService;

import java.util.Scanner;

/**
 * Created by aditya on 2/18/14.
 */
public class SelectionInformationService {

    public void selectInformation() {

        Scanner console = new Scanner(System.in);
        System.out.println("Select S for Student, T for teacher and C for College");

        String choice = console.nextLine();

        switch (choice) {

            case "S":
                StudentService service = new StudentService();
                service.setInformation();
                service.getInformation();
                break;
            case "T":
                TeacherService service1 = new TeacherService();
                service1.setInformation();
                service1.getInformation();
                break;
            case "C":
                CollegeService service2 = new CollegeService();
                service2.setInformation();
                service2.getInformation();
                break;
            default:
                System.out.println("Invalid entry, Please enter again");
                selectInformation();


        }

    }
}
