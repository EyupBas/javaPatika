import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /*
        Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
 toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
         */

        Scanner scan=new Scanner(System.in);
        double armut,elma,domates,patlıcan,muz,toplam;

        System.out.println("kaç kg armut aldınız");
        armut=scan.nextDouble();

        System.out.println("kaç kg elma aldınız");
        elma=scan.nextDouble();

        System.out.println("kaç kg domates aldınız");
        domates=scan.nextDouble();

        System.out.println("kaç kg patlıcan aldınız");
        patlıcan=scan.nextDouble();

        System.out.println("kaç kg muz aldınız");
        muz=scan.nextDouble();


        toplam= (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5);

        System.out.println("Toplam tutarınız :"+toplam+" TL.");

    }
}
