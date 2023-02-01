import java.util.Scanner;

public class ScannerInterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String name = scanner.nextLine();
        System.out.println("Ola, " + name);
    }

}
