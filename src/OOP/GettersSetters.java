// Aula 23
package OOP;
public class GettersSetters {

    public static void main(String[] args) {

        UserGetters userA = new UserGetters();
        userA.setFisrtName("Luiz");

        UserGetters userB = new UserGetters();
        userB.setFisrtName("Guilherme");

        System.out.println(userA.getFisrtName());
        System.out.println(userB.getFisrtName());
    }

}
