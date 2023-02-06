import java.util.Scanner;

public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve
 hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        double ku, ku1, ku2,u,cevre,alan,alanalan;

        Scanner input = new Scanner(System.in);

        System.out.print("Kenar Uzunluğunu Giriniz: ");
        ku = input.nextDouble();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        ku1 = input.nextDouble();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        ku2 = input.nextDouble();

        u = (ku + ku1 + ku2)/2 ;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-ku)*(u-ku1)*(u-ku2));
        alanalan = alan *alan;


        System.out.println("Birinci Kenar Uzunluğu: " + ku);
        System.out.println("İkinci Kenar Uzunluğu: " + ku1);
        System.out.println("Üçüncü Kenar Uzunluğu: " + ku2);
        System.out.println("Dik Üçgenin Alanı: " + alan);
        System.out.println("Dik Üçgenin Çevresi: " + cevre);
        System.out.println("Dik Üçgenin Hiponenüsü: " + alanalan);
    }
}
