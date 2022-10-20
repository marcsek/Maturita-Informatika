/************* ??? ***************/
/* Výpočet kvadratickej rovnice */

public class Maturita2 {
    public static void main(String[] args) {
        int a, b, c;

        a = 1;
        b = -16;
        c = 48;

        riesKvadrantickuRovnicu(a, b, c);
    }

    public static void riesKvadrantickuRovnicu(int a, int b, int c) {
        double diskriminant = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
        System.out.printf("Diskriminant = %.1f%n", diskriminant);

        double x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);

        if (a == 0 || diskriminant < 0) {
            System.out.println("Rovnica nemá riešenie..");
        } else if (diskriminant == 0) {
            System.out.println("Rovnica má 1 koren..");
            System.out.printf("Koreň 1: %.1f", x1);
        } else if (diskriminant > 0) {
            System.out.println("Rovnica má 2 korene..");
            System.out.printf("Koreň 1: %.1f%n", x1);
            System.out.printf("Koreň 2: %.1f", x2);
        }
    }
}