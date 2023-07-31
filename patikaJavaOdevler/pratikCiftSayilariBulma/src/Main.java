import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, num, count = 0;
        System.out.print("Please enter the number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 12 == 0) {
                total += i;
                count++;
            }
        }
        int result = total / count;
        System.out.println(result);
    }
}