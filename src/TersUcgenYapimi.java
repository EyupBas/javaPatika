import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.print("Basamak Sayısı Giriniz :");
        int n = scan.nextInt();

        for (int k=0; k<= n-1; k++){

            for (int l =0; l<=(k-1); l++){
                System.out.print(" ");
            }
            for (int m=1; m<=(2*(n-k)-1); m++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
