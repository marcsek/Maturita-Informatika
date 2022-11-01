/***************** ??? *****************/
/* Zistiť či je znak písmenom abecedy */

import java.util.Scanner;

public class Maturita8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Zadajte symbol > ");
            char pismeno = sc.next().charAt(0);

            if (pismeno == '0')
                break;
            System.out.printf("Číselná hodnota znaku v ACSII Table = %d%n", (int) pismeno);
            System.out.printf("%s %sje písmeno abecedy%n%n", pismeno, vyhodnotVystup(pismeno) ? "" : "nie ");
        }
        sc.close();
    }

    public static boolean vyhodnotVystup(char pismeno) {
        return pismeno >= 65 && pismeno <= 90 || pismeno >= 97 && pismeno <= 122;
    }
}
