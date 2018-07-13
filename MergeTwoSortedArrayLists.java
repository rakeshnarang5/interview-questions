import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedALs {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		a.add(-4);
		a.add(-3);
		a.add(0);
		// a.add(5);
		// a.add(7);

		b.add(2);
		// b.add(4);
		// b.add(6);

		mergeBIntoA(a, b);

		System.out.println(a);
	}

	private static void mergeBIntoA(List<Integer> a, List<Integer> b) {
		int i = 0;
		int j = 0;

		while (j < b.size()) {

			if (i == a.size()) {
				a.add(b.get(j));
				break;
			}

			if (b.get(j) <= a.get(i)) {
				a.add(i, b.get(j));
				j++;
			} else {
				i++;
			}

		}
	}

}
