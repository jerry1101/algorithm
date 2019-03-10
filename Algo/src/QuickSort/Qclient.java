package QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> unsorted = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 7));
		List<Integer> sorted = QuickSort(unsorted);
		System.out.println(sorted);

	}

	private static List<Integer> QuickSort(List<Integer> list) {

		List<Integer> less = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();
		// base case
		if (list.size() < 2) {
			return list;

		}
		// Pick Pivot
		int pivot = list.get(0);
		// get two lists less and greater
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > pivot) {
				greater.add(list.get(i));
			}
			if (list.get(i) < pivot) { 
				less.add(list.get(i));
			}
		}
        
		List <Integer> mid = new ArrayList<Integer>();
		mid.add(pivot);
		return concatenate(QuickSort(less),mid,QuickSort(greater)) ;
	}
	// Generic function to concatenate multiple lists in Java
	public static<T> List<T> concatenate(List<T>... lists)
	{
		List<T> result = new ArrayList<>();

		for (List<T> l: lists)
			result.addAll(l);

		return result;
	}
}
