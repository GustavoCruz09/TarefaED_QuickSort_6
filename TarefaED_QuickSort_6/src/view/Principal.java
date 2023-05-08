package view;

import GustavoCrus.QuickSort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		QuickSort qs = new QuickSort();
		qs.quicksort(vt, vt.length - 1, 0);
		qs.Mostra(vt);
	}

}
