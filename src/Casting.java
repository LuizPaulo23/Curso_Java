import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
    // converter tipos primitivos
        double dd = 10.10;
        short ss = 32;

        //float x = (float) dd/ss;
        //System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();

        System.out.println(z);


    }


}
