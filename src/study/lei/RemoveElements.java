package study.lei;

public class RemoveElements {
	public int removeElement(int[] nums, int val) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			while (left < right && nums[left] != val)
				left++;
			while (left < right && nums[right] == val)
				right--;
			if (left >= right)
				break;

			nums[left++] = nums[right--];
		}
		// for (int i : nums)
		// System.out.println(i);
		// System.out.println(left);
		return left;
	}
}
