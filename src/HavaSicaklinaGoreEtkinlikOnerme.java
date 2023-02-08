import java.util.Scanner;

public class HavaSicaklinaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        /*
        Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi
 farklı çözüm yolları bulunuz.
         */

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("sicaklik girin");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsin");
        }else if(heat<=25){
            if(heat<=15){
                System.out.println("sinamaya gidebilirsin");
            }
            if(heat>=10){
                System.out.println("pikniğe gidebilirsin");
            }

        }else{
            System.out.println("yüzmeye gidebilirsin");
        }




    }
}
