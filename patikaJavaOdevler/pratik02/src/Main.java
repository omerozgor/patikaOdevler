import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int fiyat,kdvliFiyat;
        int kdv;
        Scanner sc = new Scanner(System.in);

        System.out.println("Fiyat girin : ");
        fiyat = sc.nextInt();

        if (fiyat <= 1000) {
            kdv = 18;
            kdvliFiyat = fiyat + (fiyat* kdv)/100;
            System.out.println("Kdv'siz fiyat = " + fiyat);
            System.out.println("Kdv'li fiyat = " + kdvliFiyat);
            System.out.println("Kdv tutarı = " + (kdvliFiyat-fiyat));
        }else {
            kdv = 8;
            kdvliFiyat = fiyat + (fiyat* kdv)/100;
            System.out.println("Kdv'siz fiyat = " + fiyat);
            System.out.println("Kdv'li fiyat = " + kdvliFiyat);
            System.out.println("Kdv tutarı = " + (kdvliFiyat-fiyat));
        }
    }
}
