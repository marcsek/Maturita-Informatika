import java.util.Scanner;

public class Maturita27 {

  static String[] slovnik = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
      "October", "November", "December" };

  public static String nacitajVstup() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Zadaj vstup: ");
    return scanner.nextLine();
  }

  public static void main(String[] args) {
    String mesiac = nacitajVstup();

    for (int i = 0; i < slovnik.length; i++) {
      if (mesiac.equals(slovnik[i])) {
        System.out.println(mesiac + " je v slovniku.");
        return;
      }
    }
    System.out.println(mesiac + " nie je v slovniku");
  }
}