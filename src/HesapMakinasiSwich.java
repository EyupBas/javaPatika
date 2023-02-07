import java.util.Scanner;

public class HesapMakinasiSwich {
    public static void main(String[] args) {
        int cozum;
        double n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        cozum = input.nextInt();

        switch (cozum) {
            case 1:
                System.out.println("Sonuc :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc :" + (n1 * n2));
                break;
            case 4:
                System.out.println("Sonuc :" + ((n2 != 0) ? (n1 / n2) : ("Tanımsızdır")));
                break;
            default:
                System.out.println("Gecersiz Giris");
        }
    }
}
