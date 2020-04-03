package ex_6_2;

public class BubbleSort implements SelectionSort {

	public void sort(double[] a) {
		bubbleSort(a, a.length);
	}

	public void bubbleSort(double[] a, int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1]) {
					double temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}
	}
}