package ex_6_2;

public class MergeSort implements SelectionSort {
	@SuppressWarnings("unused")
	private double[] list;

	public void sort(double[] a) {
		mergeSort(a);
	}

	private double[] mergeSort(double[] whole) {
		if (whole.length == 1) {
			return whole;
		}
		else {
			double[] left = new double[whole.length / 2];
			System.arraycopy(whole, 0, left, 0, left.length);

			double[] right = new double[whole.length - left.length];
			System.arraycopy(whole, left.length, right, 0, right.length);

			left = mergeSort(left);
			right = mergeSort(right);

			merge(left, right, whole);

			return whole;
		}
	}

	private void merge(double[] left, double[] right, double[] whole) {
		int leftIndex = 0;
		int rightIndex = 0;
		int wholeIndex = 0;

		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] < right[rightIndex]) {
				whole[wholeIndex] = left[leftIndex];
				leftIndex++;
			}
			else {
				whole[wholeIndex] = right[rightIndex];
				rightIndex++;
			}
			wholeIndex++;
		}

		double[] rest;
		int restIndex;
		if (leftIndex >= left.length) {
			rest = right;
			restIndex = rightIndex;
		}
		else {
			rest = left;
			restIndex = leftIndex;
		}

		for (int i = restIndex; i < rest.length; i++) {
			whole[wholeIndex] = rest[i];
			wholeIndex++;
		}
	}
}