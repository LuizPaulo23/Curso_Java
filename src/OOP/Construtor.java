// AULA 25

package OOP;
public class Construtor {

    public static void main(String[] args) {
      // Construtor
        UserConstrutor[] users = new UserConstrutor[]{

                new UserConstrutor("Luiz", "Paulo"),
                new UserConstrutor("João", "Paulo")
        };

        System.out.println(users[0].getFirstName());
        System.out.println(users[0].getLastName());
    }

}
