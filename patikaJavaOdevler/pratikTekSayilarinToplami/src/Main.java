import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i = 1, total = 0, average = 0;
        do {
            System.out.print("Please enter number: ");
            num = scanner.nextInt();
            if (num % 2 == 1) {
                total += num;
            }
        }while (num > 0);
        System.out.print("Total: "+ total);
    }
}