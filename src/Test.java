import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat, fiz, kim, tur, tar, muz;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al

        System.out.print("Matematik Notunu girin: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunu girin: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunu girin: ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunu girin: ");
        tur = inp.nextInt();

        System.out.print("Tarih Notunu girin: ");
        tar = inp.nextInt();

        System.out.print("Müzik Notunu girin: ");
        muz = inp.nextInt();


        int toplam = (mat + fiz + kim + tur + tar + muz);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız: " + sonuc);

        String ortalama = toplam > 50 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(ortalama);







    }
}
