import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, turkce, tarih;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        double notOrt = (mat + kimya + fizik + muzik + tarih +turkce)/6;
        System.out.println("Not Ortalamanız : " + notOrt);

        boolean durum;
        durum = (notOrt >= 60) ;
        String vDurum = (durum) ? "Tebrikler Geçtiniz" : "Kaldiniz";
        System.out.println(vDurum);


    }

}
