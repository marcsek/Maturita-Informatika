/**** ??? ****/
/* FizzBuzz */

public class Maturita1 {
    public static void main(String[] args) {
        vratSlovo();
    }

    public static void vratSlovo() {
        for (int i = 1; i <= 1000; i++) {
            String slovo = "";
            if (i % 3 == 0) {
                slovo += "Fizz";
            }
            if (i % 5 == 0) {
                slovo += "Buzz";
            }

            System.out.println(i + ". " + slovo);
        }
    }
}

// Teorietická časť

// Elenka ma fotografiu obrázka uloženú v bitmapovom súbore (bmp) a chce ju
// poslať MMS-kou na Michalov telefon.
// Fotografia má rozmery 2048 x 1536 pixelov a použitá farebná hlbka je 24 bitov
// (16,7 miliona farieb).

// 1 - Popíšte akým sposobom sa vypočíta velkosť obrázku a vypočítajte ju:

// 2048 x 1536 = 3 145 728 p
// 3 145 728 p * 24 b = 75 497 472 b
// 75 497 472 b / 8 = 9 437 184 B
// 9 437 184 B / 1024 = 9 216 kB
// 9 216 kB / 1024 = 9 MB

// 2 - Najmenej kolko MMS musí Elenka poslať, ak chce polsať celú footgrafiu
// rozloženú do viacerých MMS, ak
// MMS-ka može mať maximálne 300 kB ?

// 9 216 / 300 = 30,72 => 31
// Musí polsať 31 MMS-iek

// 3 - Vieme doručiť fotografie aj iným sposobom ? Vyhladajte príklady na
// internete.

// Socialné siete (Facebook,Instagram,Snapchat,Whatsapp), e-mail, AirDrop,
// Bluetooth