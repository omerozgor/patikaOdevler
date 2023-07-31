import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı giriniz: ");
        int heat = input.nextInt();
        input.close();

        if(heat < 5)
            System.out.println("Kayak yapabilirsiniz.");

        if(heat >= 5 && heat <= 15 )
            System.out.println("Sinemaya gidebilirsiniz.");

        if(heat >= 10 && heat <= 25)
            System.out.println("Pikniğe gidebilirsiniz.");

        if(heat > 25)
            System.out.println("Yüzmeye gidebilirsiniz.");
    }
}