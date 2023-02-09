import java.util.Scanner;

public class WhileDogruSifreGirme {
    public static void main(String[] args) {
        int pasword;
        boolean isPaswordSucces=false;

        Scanner input=new Scanner(System.in);

        while (!isPaswordSucces){
            System.out.println("şifre gir");
            pasword = input.nextInt();
            if(pasword==123){
                System.out.println("doğru");
                isPaswordSucces=true;
            }else{
                System.out.println("yanlış");
            }


        }

    }
}
