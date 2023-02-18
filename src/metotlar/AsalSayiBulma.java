package metotlar;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        final int bol = 2;
        if (Asal(sayi, bol)) {
            System.out.println(sayi + " ASALDIR !");
        } else {
            System.out.println(sayi + " ASAL değildir !");
        }
    }
    static boolean Asal(int sayi, int bol) {
        if (sayi < 2) {
            return false;
        }
        if (sayi == 2) {
            return true;
        }
        if (sayi % bol != 0 && bol >= sayi - 1) {
            return true;
        } else {
            if (sayi % bol == 00) {
                return false;
            } else {
                return Asal(sayi, bol + 1);
            }
        }
    }
}
