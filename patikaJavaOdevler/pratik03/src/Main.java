import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. kenarı giriniz : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        u = (a+b+c) /2.0;

        alan = Math.sqrt(u* (u-a) * (u-b) *  (u-c));

        System.out.println("Alan = " + alan);

    }
}