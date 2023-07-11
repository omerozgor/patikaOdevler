import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int km;
        double tutar;
        System.out.println("Gidilecek mesafeyi km olarka giriniz : ");

        km = sc.nextInt();

        tutar = 10 + km*2.2;

        if (tutar >= 20) {
            System.out.println("Ücret 20 tl");
        }else {
            System.out.println("Ücret " + tutar + "tl");
        }


    }
}