
// Aula 24 - OOP & ARRAYS
package OOP;
public class ARRAYS {
    public static void main(String[] args) {
        UserGetters[] users = new UserGetters[10];
        // caixa com 10 espaços, por exemplo
        for (int i = 0; i < users.length; i++){

            UserGetters actual = new UserGetters();
            actual.setFisrtName("Nome " + i);

            users[i] = actual;
        }

        System.out.println(users[2].getFisrtName());
    }

}


