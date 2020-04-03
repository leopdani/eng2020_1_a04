package ex_6_2;

public class QuickSort implements SelectionSort {
	public void sort(double[] a) {
		quicksort(a);
	}

	public void shuffle(double[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int r = (int) (Math.random() * (i + 1));
			double swap = a[r];
			a[r] = a[i];
			a[i] = swap;
		}
	}

	public void quicksort(double[] a) {
		shuffle(a);
		quicksort(a, 0, a.length - 1);
	}

	public void quicksort(double[] a, int left, int right) {
		if (right <= left)
			return;
		int i = partition(a, left, right);
		quicksort(a, left, i - 1);
		quicksort(a, i + 1, right);
	}

	public int partition(double[] a, int left, int right) {
		int i = left - 1;
		int j = right;
		while (true) {
			while (a[++i] < a[right]);
			while (a[right] < a[--j])
				
				if (j == left)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, i, right);
		return i;
	}

	private void exch(double[] a, int i, int j) {
		double swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}