package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {

        int[] number = new int[]{10,30,25,1,3,5,9,51,89};
        Arrays.sort(number);

        System.out.println(number);// <- hascode int[] (indentificador)
        System.out.println(Arrays.toString(number));
    }

}
