package OOP;

public class UserConstrutor {

    private String firstName;
    private String lastName;
    public UserConstrutor(String firstName, String lastName){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();

    }

    public String getFirstName(){

        return firstName;
    }

    public String getLastName(){
        return lastName;

    }


}
