package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.BubbleSortSorter;

public class EnteroTester {
	public static void main(String aargs[]){
		DataGenerator generator = new DataGenerator(13);
		Integer[] initial = generator.generateData();
		Entero[] test = new Entero[13];
		for (int i=0; i<13; i++){
			test[i]=new Entero(initial[i]);
		}
		showArray("Original array of size "+initial.length+": ", initial);
		BubbleSortSorter<Entero> sorter = new BubbleSortSorter<>();
		sorter.sort(test, null);
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