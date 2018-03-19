package sortersTesterClasses;

import sorterClasses.BubbleSortSorter;

public class Excercise2 {
	public static void main(String aargs[]){
		IntegerComparator1 comp1 = new IntegerComparator1();
		IntegerComparator2 comp2 = new IntegerComparator2();
		Integer[] initial = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		showArray("Original array of size "+initial.length+": ", initial);
		BubbleSortSorter<Integer> sorter = new BubbleSortSorter<>();
		sorter.sort(initial, comp1);
		showArray("Original array sorted with Comparator 1: ", initial);
		sorter.sort(initial, comp2);
		showArray("Original array sorted with Comparator 2: ", initial);
	}
	
	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg+"{"); 
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if (i!=a.length-1) 
				System.out.print(", ");
		}
		System.out.println("}");
	}
}