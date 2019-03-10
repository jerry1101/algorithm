package SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sclass {

	public static void main(String[] args) {
		List<Integer> unsorted = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 9, 100, 7));


		int index;
		List<Integer> sorted = new ArrayList<Integer>();
		while (unsorted.size() > 0) {
			
			index = getSmallest(unsorted);
			sorted.add(unsorted.get(index));
			unsorted.remove(index);
		}

		System.out.println(sorted);

	}

	private static int getSmallest(List<Integer> unsorted2) {

		int smallest = unsorted2.get(0);
		int index = 0;
		if (unsorted2.size() == 1) {
			return 0;
		}

		for (int i = 0; i < unsorted2.size() - 1; i++) {

			if (smallest > unsorted2.get(i + 1)) {
				smallest = unsorted2.get(i + 1);
				index = i + 1;
			}

		}
		return index;
	}

}
