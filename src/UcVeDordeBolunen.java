import java.util.Scanner;

public class UcVeDordeBolunen {
    public static void main(String[] args) {

        /*
        Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların
  ortalamasını hesaplayan programı yazınız.
         */

        int i, sayi, counter = 0;
        double top = 0, sayac;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();

        for(i=0; i<=sayi; i++)
        {
            if( (i%3==0) && (i%4==0) )
            {
                top+=i;
                counter++;
            }
        }
        sayac=top/counter;
        System.out.println("Ortalama : "+sayac);
    }

    }
