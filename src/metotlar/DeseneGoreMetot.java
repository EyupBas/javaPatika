package metotlar;

import java.util.Scanner;

public class DeseneGoreMetot {
    final int sayi = 0;

    public static void main(String[] args) {
        System.out.println("Sayı giriniz");
        Scanner tara = new Scanner(System.in);
        int sayi = tara.nextInt();
        final int sayac = 0;
        final int temp = sayi;
        desen(sayi, temp,sayac);
    }
    static int desen(int sayi, int temp,int sayac) {
        if (sayi > 0 && sayi <= temp && sayac == 0) {
            System.out.println(sayi - 5);
            return desen(sayi - 5, temp,sayac);
        } else if ((sayi > 0 || sayi <= 0) && sayi <= temp) {
            if (sayi == temp) {
                sayac++;
                return desen(sayi + 5, temp,sayac);
            } else {
                sayac++;
                System.out.println(sayi + 5);
                return desen(sayi + 5, temp,sayac);
            }
        }
        return 1;
    }
}
