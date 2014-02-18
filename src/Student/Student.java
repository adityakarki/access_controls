package Student;

/**
 * Created by aditya on 2/18/14.
 */
public class Student {

    private String name;
    private String address;
    private String email;
    private String level;

    protected void setName (String name){
        this.name = name;
    }

    protected void setAddress (String address){
        this.address = address;
    }

    protected void setEmail (String email){
        this.email = email;
    }

    protected  void setLevel (String level){
        this.level = level;
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

    protected  String getLevel(){
        return level;
    }

}
