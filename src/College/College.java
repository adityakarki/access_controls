package College;

/**
 * Created by aditya on 2/18/14.
 */
public class College {
    private String name;
    private String address;
    private String email;

    protected void setName(String name){
        this.name = name;
    }

    protected void setAddress(String address){
        this.address = address;
    }

    protected void setEmail(String email){
        this.email = email;
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

}
