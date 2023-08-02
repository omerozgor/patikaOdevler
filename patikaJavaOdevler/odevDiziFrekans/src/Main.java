import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] flag = new int[arr.length]; flag[0] = 0;
        System.out.println("Tekrar sayıları: ");
        for (int i = 0; i<arr.length; i++){
            int count = 0;
            if (flag[i] != 1) {
                for (int j = 0; j< arr.length;j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        flag[j] = 1;
                    }
                }
                if(count > 1 || count == 1) {
                    System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
                }
            }
        }
    }
}