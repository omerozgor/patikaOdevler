import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        System.out.println("Matematik notunuz :");
        mat = sc.nextInt();

        System.out.println("Fizik notunuz :");
        fizik = sc.nextInt();

        System.out.println("Kimya notunuz :");
        kimya = sc.nextInt();

        System.out.println("Türkçe notunuz :");
        turkce = sc.nextInt();

        System.out.println("Tarih notunuz :");
        tarih = sc.nextInt();

        System.out.println("Müzik notunuz :");
        muzik = sc.nextInt();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalama : " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta kaldı";

        System.out.println(sonuc);
    }
}