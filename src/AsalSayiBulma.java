import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1-100 Arasındaki Asal Sayıları Bulan Program

        int n;
        do {
            System.out.print("Pozitif Bir Sayı Giriniz :");
            n = scan.nextInt();
        }while (n <2);
        boolean asal=true;
        for (int i=2; i<n;i++){

            for (int j=2;j<i;j++){
                if (!(i%j==0))asal=true;
                else {
                    asal=false;
                    break;
                }
            }
            if (asal) System.out.print(i+" ");
        }
    }
}
