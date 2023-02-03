import java.util.Scanner;

public class ComparandoStrings {

    public static void main(String[] args) {
        String passaword = "123456";
        System.out.println("Digite sua senha:");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(passaword.equals(pass));



    }

}
