/**** ??? *****/
/* Faktoriál */

public class Maturita9 {
    public static void main(String[] args) {
        int parameter = 7;
        System.out.printf("Faktoriál čísla %d je %d", parameter, calc(parameter));
    }

    public static int calc(int parameter) {
        int faktorial = parameter;

        for (int i = parameter - 1; i > 0; i--) {
            faktorial = faktorial * i;
        }

        return faktorial;
    }
}
