/******* ??? *******/
/* Výpočet Obsahu */

import java.util.Scanner;

public class Maturita3 {
    public static void main(String[] args) {
        vypocitajObsah();
    }

    public static void vypocitajObsah() {
        Scanner sc = new Scanner(System.in);

        int hodnotaZoScanneru = 0;
        System.out.print("Zadajte polomer kruhu: > ");
        hodnotaZoScanneru = sc.nextInt();

        System.out.println("Vysledok obsahu kruhu: " + vypocitajObsahKruhu(hodnotaZoScanneru));
        System.out.println("Vysledok polomeru kruhu: " + vypocitajObvodKruhu(hodnotaZoScanneru));

        System.out.print("\nZadajte polomer gule: > ");
        hodnotaZoScanneru = sc.nextInt();

        System.out.println("Vysledok objemu gule: " + vypocitajObjemGule(hodnotaZoScanneru));
        sc.close();
    }

    public static double vypocitajObsahKruhu(int polomer) {
        return Math.PI * Math.pow(polomer, 2);
    }

    public static double vypocitajObvodKruhu(int polomer) {
        return Math.PI * 2 * polomer;
    }

    public static double vypocitajObjemGule(int polomer) {
        return (4.0 / 3.0) * Math.PI * Math.pow(polomer, 3); // pozor tu musi byt 3.0 a nie 3
    }
}