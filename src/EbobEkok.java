import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayi: ");
        int a=scan.nextInt();
        System.out.println("İkinci sayi: ");
        int b=scan.nextInt();
        int ebob =1;// en kucuk ebob
        int i=2;
        while(a%i==0 && b%i==0)
        {
            if(a<b)
            {
                ebob=a;
            }else
            {ebob=b;

            }

            i++;
            break;
        }
        System.out.println("ekok :" +(a*b)+" ebob : " +ebob);
    }

}
