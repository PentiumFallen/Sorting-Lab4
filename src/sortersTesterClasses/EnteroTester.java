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
		System.out.println(initial.toString());
		BubbleSortSorter<Entero> sorter = new BubbleSortSorter<>();
		sorter.sort(test, null);
	}
}