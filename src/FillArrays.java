import java.util.Arrays;

public class FillArrays {
    public static void main(String[] args) {
        String[] names = new String[10];
        Arrays.fill(names, "Desconhecido");
        System.out.println(Arrays.toString(names));
    }

}
