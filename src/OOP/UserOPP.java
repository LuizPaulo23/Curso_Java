package OOP;

public class UserOPP {
    public static void main(String[] args) {
        User userA = new User();
        userA.firstName = "Luiz Paulo";
        userA.lastName = "Tavares Goncalves";
        String fullname = userA.getFullname();

        System.out.println(fullname);
    }

}
