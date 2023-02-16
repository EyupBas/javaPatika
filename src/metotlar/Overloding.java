package metotlar;
public class Overloding {
    static  void print(){
        System.out.println("parametresiz metot");
    }
    static void print(int a){
        System.out.println("parametreler :"+a);
    }
    public static void main(String[] args) {
        print();

    }

}
