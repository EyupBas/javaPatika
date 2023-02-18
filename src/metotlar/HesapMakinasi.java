package metotlar;

import java.util.Scanner;

public class HesapMakinasi {
    static void plus() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int n;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayı: ");
            n = input.nextInt();
            result += n;

        }
        System.out.print("toplam " + result);
    }


    static void ext() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int n;
        System.out.print("kaç adet sayı gireceksiniz: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayı: ");
            n = input.nextInt();
            if (i == 1) {
                result += n;
                continue;
            }
            result -= n;
        }
        System.out.print("sanuc: " + result);


    }

    static void multip() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        int n;
        System.out.print("kaç adet sayı gireceksiniz: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + "sayı: ");
            n = input.nextInt();
            result *= n;


        }
        System.out.print("Sonuc: " + result);
    }

    static void division() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int n;
        System.out.print("kaç adet sayı gireceksiniz: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayı: ");
            n = input.nextInt();
            if (i != 1 & n == 0) {
                System.out.print("bir sayı 0 a bölünemez");
            }
            if (i == 1) {
                result += n;
                continue;

            }
            result /= n;
        }
        System.out.print("sonuc: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        int n;
        System.out.print("taban sayısını giriniz: ");
        int taban = input.nextInt();
        System.out.print("üs sayısını giriniz: ");
        int üs = input.nextInt();
        for (int i = 1; i <= üs; i++) {
            result *= taban;
        }
        System.out.print("sonuc: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        int n;
        System.out.print("sayıyı giriniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.print("Sonuc: " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.print("sonuc: " + a % b);
    }

    static void rectangleperimeterarea() {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("kısa kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("uzun kenar uzunluğunu giriniz: ");
        b = input.nextInt();
        System.out.println("Alan: " + a * b);
        System.out.print("Çevre: " + 2 * (a + b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {

            System.out.print(

                    "\n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\n5-üslü sayı " +
                            "hesapma\n6-faktoriyel hesaplama\n7-mod alma\n8-dikdörtgen alan ve çevre hesabı" +
                            "\nyapmak istediğiniz işlemi seçiniz: ");
            n = input.nextInt();

            switch (n) {
                case 1:
                    plus();
                    break;
                case 2:
                    ext();
                    break;
                case 3:
                    multip();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleperimeterarea();
                    break;
                default:
                    System.out.print("Yanlış bir değer girdiniz.");


            }
        } while (n != 0);


    }
}
