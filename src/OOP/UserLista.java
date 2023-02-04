package OOP;

public class UserLista {

    private String firstName;
    private String lastName;
    public UserLista(String firstName, String lastName){
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
