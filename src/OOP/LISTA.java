package OOP;
import java.util.ArrayList;
import java.util.List;

public class LISTA {

    public static void main(String[] args) {
        List<UserLista> users = new ArrayList<>();

        int i = 0;
     while(i < 10){
        UserLista actual = new UserLista("Nome" + i, "Sobrenome");
        users.add(actual);
        i++;
     }
     System.out.println(users.get(0).getFirstName());

    }

}
