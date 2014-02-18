package College;


import java.util.Scanner;

/**
 * Created by aditya on 2/18/14.
 */
public class CollegeService {

    College college = new College();

    public void setInformation(){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter college name");
        college.setName(console.nextLine());

        System.out.println("Enter college address");
        college.setAddress(console.nextLine());

        System.out.println("Enter college email");
        college.setEmail(console.nextLine());

    }

    public void getInformation(){

        System.out.println("College name: "+ college.getName());
        System.out.println("College address: "+ college.getAddress());
        System.out.println("College email: "+ college.getEmail());

    }
}
