/*************** ??? ***************/
/* 2 rozmerné pole veľkych písmen */

import java.util.Random;

public class Maturita7 {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            int[] vygenerovanePole = generuj();
            for (int j = 0; j < vygenerovanePole.length; j++) {
                boolean jePosledneVRiadku = (j == vygenerovanePole.length - 1);
                System.out.print((char) vygenerovanePole[j] + (jePosledneVRiadku ? "," : ""));
            }
            System.out.println();
        }
    }

    public static int[] generuj() {
        int[] pole = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < pole.length; i++) {
            pole[i] = (rnd.nextInt(26) + 65);
        }
        return pole;
    }
}
