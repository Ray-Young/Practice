package sortAlgorithm;

public class QuickSort {
	public void run(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
	}

	public void quickSort(int[] nums, int start, int end) {
		if (start < end) {
			int index = partition(nums, start, end);
			// pivot mustn't counted in the next recursion, otherwise it's dead
			// recursion in finding partition index
			// e.g. 2, 1, 3, 4, 8, 5, 7, 6, if not index - 1, it will always run
			// quickSort(nums, 0, 3), the partition index is always 3, which
			// leads to dead recursion
			quickSort(nums, start, index - 1);
			quickSort(nums, index + 1, end);
		}
	}

	public int partition(int[] nums, int start, int end) {
		int pivot = nums[end];
		int index = start;
		// start = 0, end = 5, there are 5 loop, but 6 elements in it. The last
		// element is pivot, which must be swap in the end
		for (int i = start; i < end; i++) {
			if (nums[i] <= pivot) {
				swap(nums, index++, i);
			}
		}
		swap(nums, index, end);
		return index;
	}

	public void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

}
