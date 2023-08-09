import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list = Supia.getIntegers();

        List<Integer> list1 = list.subList(0, 2500);
        Supia supia1 = new Supia(list1);
        supia1.start();
        supia1.join();

        List<Integer> list2 = list.subList(2500, 5000);
        Supia supia2 = new Supia(list2);
        supia2.start();
        supia2.join();

        List<Integer> list3 = list.subList(5000, 7500);
        Supia supia3 = new Supia(list3);
        supia3.start();
        supia3.join();

        List<Integer> list4 = list.subList(7500, 10000);
        Supia supi4 = new Supia(list4);
        supi4.start();
        supi4.join();

        Supia.c.forEach(z -> System.out.println(z));
        System.out.println("-----------------------------");
        Supia.t.forEach(t -> System.out.println(t));

    }
}