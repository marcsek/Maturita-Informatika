/*************** ??? ***************/
/* 2 rozmerné pole veľkych písmen */

import java.util.Random;

public class Maturita7 {
    public static void main(String[] args) {

        char[][] vygenerovanePole = generuj();

        for (int i = 0; i < vygenerovanePole.length; i++) {
            for (int j = 0; j < vygenerovanePole[i].length; j++) {
                System.out.print(vygenerovanePole[i][j] + (j != vygenerovanePole[i].length - 1 ? "," : ""));
            }
            System.out.println();
        }
    }

    public static char[][] generuj() {
        char[][] pole = new char[20][20];
        Random rnd = new Random();

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = (char) (rnd.nextInt(26) + 65);
            }
        }
        return pole;
    }
}
