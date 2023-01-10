import java.util.Random;

public class Maturita25 {
  static int[] pole = new int[100];

  public static void generuj() {

    Random rnd = new Random();
    for (int i = 0; i < pole.length; i++) {
      int cislo = rnd.nextInt(100);

      if (cislo < 10) {
        pole[i] = cislo;
      }
      if (cislo > 10) {
        pole[i] = cislo;
      }
    }
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.printf("%02d%s", pole[i * 10 + j], j == 9 ? "" : ",");
      }
      System.out.println();
    }
  }

  public static void vyhodnot() {
    int pocitadlo = 0, neo = 0, trinity = 0;

    for (int i = 0; i < pole.length; i++) {

      if (pole[i] > 50) {
        pocitadlo++;
      }
      if (pole[i] == 69) {
        neo++;
      }
      if (pole[i] == 3) {
        trinity++;
      }
    }
    System.out.println("\nNad 50: " + pocitadlo);
    System.out.println("NEO: " + neo);
    System.out.println("TRINITY: " + trinity);
  }

  public static void main(String[] args) {
    generuj();
    vyhodnot();
  }
}