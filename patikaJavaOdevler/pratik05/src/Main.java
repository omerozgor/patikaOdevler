import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double alan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Yarıçap giriniz : ");
        r = sc.nextInt();
        System.out.println("Merkez açı ölçüsü giriniz : ");
        a = sc.nextInt();

        alan = (3.14 * (r*r) *a)/360;
        System.out.println("Alan = " + alan);
    }
}