import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir.
 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
         */
        double km,tutar,acılıs;
        acılıs = 10;
        Scanner mesafe = new Scanner(System.in);
        System.out.print("mesafe kac km :");
        km = mesafe.nextDouble();
        tutar = acılıs+(km * 2.20);
        System.out.println(tutar<20 ? "kisa Mesafe Ucreti 20TL" : tutar +"TL");
    }
}
