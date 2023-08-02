import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);
        while (right < 5) {
            System.out.print("L�tfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("L�tfen 0-100 aras�nda bir de�er giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("�ok fazla hatal� giri� yapt�n�z. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatal� giri�inizde hakk�n�zdan d���lecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, do�ru tahmin ! Tahmin etti�iniz say� : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatal� bir say� girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " say�s�, gizli say�dan b�y�kt�r.");
                } else {
                    System.out.println(selected + " say�s�, gizli say�dan k���kt�r.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakk� : " + (5 - right));
            }
        }
        input.close();

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                System.out.println("Gizli say� : " + number);
            }
        }

    }
}