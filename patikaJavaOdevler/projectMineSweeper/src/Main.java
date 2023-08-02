
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("May�n Tarlas� Oyununa Ho�geldiniz !");
        System.out.println("Ne kadar b�y�k bir haritada oynamak istiyorsunuz?");

        System.out.print("Sat�r say�s� giriniz : ");
        int row = scan.nextInt();
        System.out.print("S�tun say�s� giriniz : ");
        int column = scan.nextInt();
        System.out.println("===================================");


        MineSweeper ms = new MineSweeper(row,column);
//		ms.printMap();

        while(true) {
            System.out.print("Sat�r giriniz : ");
            row = scan.nextInt();
            System.out.print("S�tun giriniz : ");
            column = scan.nextInt();
            if(!ms.openCell(row, column))
                break;
        }

        scan.close();
    }

}