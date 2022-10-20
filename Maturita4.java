import java.util.InputMismatchException;
import java.util.Scanner;

public class Maturita4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cislo = 0;
        try {
            System.out.print("Zadajte číslo: > ");
            cislo = sc.nextInt();
            sc.close();
        } catch (InputMismatchException ex) {
            System.out.println("Zadané čislo nie je int");
            return;
        }

        System.out.printf("Počet cifier je: %d", kolkoCisiel(cislo));
    }

    public static int kolkoCisiel(int cislo) {
        return Integer.toString(cislo).length();
    }
}