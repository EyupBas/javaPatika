package metotlar;

import java.util.Arrays;

public class ArraySinifMetotlar {
    public static void main(String[] args) {
        //Arrays.toString()
        //Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));

        System.out.println("-----------------------------------------------");

//////////////////////////////////-----------------

        //Arrays.fill()
        //dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));
    }
    }

