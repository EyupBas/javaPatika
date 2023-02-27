package BoksOyunu;

public class Main {
    /*
   Boks Maçı
   Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.
   Ödev:
   Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.
    */
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Eyup",10,120,100,50);
        Fighter f2 = new Fighter("Hakan",20,85,85, 50);

        Match match = new Match(f1,f2,80,100);
        match.run();
    }
}
