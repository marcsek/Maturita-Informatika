public class Maturita14 {
  static int pocetSekund = 86460;

  public static void main(String[] args) {
    Cas cas = konvertuj(pocetSekund);

    System.out.printf("Počet sekúnd určených pre konverziu: %d%n", pocetSekund);
    System.out.println("Táto hodnota predstavuje po konverzii:");
    System.out.printf("%d hodín, %d minút, %d sekúnd", cas.hodiny, cas.minuty, cas.sekundy);
  }

  public static Cas konvertuj(int pocetSekund) {
    Cas cas = new Cas();

    cas.hodiny = pocetSekund / 3600;
    cas.minuty = (pocetSekund % 3600) / 60;
    cas.sekundy = pocetSekund % 60;

    return cas;
  }

  public static class Cas {
    public int hodiny, minuty, sekundy;
  }
}
