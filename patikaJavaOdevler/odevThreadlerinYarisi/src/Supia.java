import java.util.ArrayList;
import java.util.List;

public class Supia extends Thread {

	public static ArrayList<Integer> integers = new ArrayList<>();
	private List<Integer> sub;
	public static List<Integer> c = new ArrayList<>();
	public static List<Integer> t = new ArrayList<>();

	public Supia(List<Integer> sub) {
		this.sub = sub;
	}

	public Supia() {
	}

	@Override
	public void run() {
		process(this.sub);
	}

	public synchronized void process(List<Integer> l) {

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) % 2 == 0) {
				c.add(l.get(i));
			} else {
				t.add(l.get(i));
			}
		}
	}

	public static ArrayList<Integer> getIntegers() {

		for (int i = 1; i <= 10000; i++) {
			integers.add(i);
		}
		return integers;
	}

	public void printC() {
		c.forEach(c -> System.out.println(c));

	}

	public void printT() {
		c.forEach(c -> System.out.println(c));

	}

}
