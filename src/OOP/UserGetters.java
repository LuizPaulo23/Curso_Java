// AULA 23
package OOP;

public class UserGetters {

    private String firstName;
    private String LastName;

    // SETTER

    public void setFisrtName(String firstName){

        this.firstName = firstName.toUpperCase();
    }
    // GETTER
    public String getFisrtName(){
        return firstName;
    }

}
