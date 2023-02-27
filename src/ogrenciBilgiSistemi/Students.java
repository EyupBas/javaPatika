package ogrenciBilgiSistemi;

public class Students {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Students(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        //calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matSozlu, int fizikSozlu, int kimyaSozlu) {

        if ((mat >= 0 && mat <= 100) && (matSozlu >= 0 && matSozlu <= 100)) {
            this.mat.note = (int) (mat * 0.8 + matSozlu * 0.2);
        }

        if ((fizik >= 0 && fizik <= 100) && (fizikSozlu >= 0 && fizikSozlu <= 100)) {
            this.fizik.note = (int) (fizik * 0.7 + fizikSozlu * 0.3);
        }

        if ((kimya >= 0 && kimya <= 100) && (kimyaSozlu >= 0 && kimyaSozlu <= 100)) {
            this.kimya.note = (int) (kimya * 0.6 + kimyaSozlu * 0.4);
        }
    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
        System.out.println(this.fizik.name+" Dersi not hesabı : %70 sınav notu, %30 sözlü notu olarak hesaplanmıştır");
        System.out.println(this.mat.name+" Dersi not hesabı : %80 sınav notu, %20 sözlü notu olarak hesaplanmıştır");
        System.out.println(this.kimya.name+" Dersi not hesabı : %60 sınav notu, %40 sözlü notu olarak hesaplanmıştır");
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
