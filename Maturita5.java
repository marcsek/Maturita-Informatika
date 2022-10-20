import java.util.Random;

public class Maturita5 {
    public static void main(String[] args) {
        int[][] polePrvkov = generuj(99, 90);

        for (int i = 0; i < polePrvkov.length; i++) {
            for (int j = 0; j < polePrvkov[i].length; j++) {
                System.out.print(polePrvkov[i][j] + (j != polePrvkov[i].length - 1 ? "," : ""));
            }
            System.out.println();
        }
    }

    public static int[][] generuj(int max, int min) {
        int[][] polePrvkov = new int[10][10];
        Random rnd = new Random();

        for (int i = 0; i < polePrvkov.length; i++) {
            for (int j = 0; j < polePrvkov[i].length; j++) {
                polePrvkov[i][j] = rnd.nextInt((max - min + 1)) + min;
            }
        }
        return polePrvkov;
    }
}
