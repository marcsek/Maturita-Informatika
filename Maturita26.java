import java.util.Scanner;

public class Maturita26 {

  public static void urciDelitele(int cislo) {
    System.out.print("Delitele čísla " + cislo + " sú: ");
    for (int i = 1; i <= cislo; i++) {
      if (cislo % i == 0) {
        System.out.print(i);

        if (i != cislo) {
          System.out.print(", ");
        }
      }
    }
  }

  public static int delitele() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Zadajte celé číslo: ");
    int cislo = scanner.nextInt();
    return cislo;
  }

  public static void main(String[] args) {
    int cislo = delitele();
    urciDelitele(cislo);
  }
}