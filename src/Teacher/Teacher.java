package Teacher;

/**
 * Created by aditya on 2/18/14.
 */
public class Teacher {

    private String name;
    private String address;
    private String email;
    private String subject;

    protected void setName(String name){
        this.name=name;
    }

    protected void setAddress(String address){
        this.address = address;
    }

    protected void setEmail(String email){
        this.email=email;
    }

    protected void setSubject(String subject){
        this.subject = subject;
    }

    protected String getName(){
        return name;
    }

    protected String getAddress(){
        return address;
    }

    protected String getEmail(){
        return email;
    }

    protected String getSubject(){
        return subject;
    }


}

