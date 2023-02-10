import java.util.Scanner;

public class forGirilensayiyakadarCiftsayilariAlma {
    public static void main(String[] args) {

        int k;
        Scanner input=new Scanner(System.in);
        System.out.println("sayi gir");
        k=input.nextInt();

        for (int i = 1; i <k ; i++) {
            if(i%2==0) {
                System.out.println(i);

            }

        }

    }
}
