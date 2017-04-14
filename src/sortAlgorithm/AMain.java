package sortAlgorithm;

import java.util.Arrays;

public class AMain {
	public static void main(String[] args) {
		int[] nums = { 7, 6, 5, 4, 3, 2, 1 };
		QuickSort qs = new QuickSort();
		qs.run(nums);
		System.out.println(Arrays.toString(nums));
	}
}
