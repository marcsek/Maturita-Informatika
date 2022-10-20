public class Maturita6 {
    public static void main(String[] args) {

        long[] pole = fibonacci();
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + (i == pole.length - 1 ? " " : ", "));
        }
    }

    public static long[] fibonacci() {
        long[] fiboPole = new long[30];
        fiboPole[0] = 1;
        fiboPole[1] = 1;
        for (int i = 2; i < 30; i++) {
            fiboPole[i] = fiboPole[i - 2] + fiboPole[i - 1];
        }

        return fiboPole;
    }
}
