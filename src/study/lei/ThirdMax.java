package study.lei;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMax {
	public int thirdMax(int[] nums) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(4, (i1, i2) -> (i1 - i2));
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (!set.contains(i)) {
				heap.offer(i);
				set.add(i);
				if (heap.size() > 3) {
					heap.poll();
				}
			}
		}
		if (heap.size() < 3) {
			while (heap.size() > 1)
				System.out.println(heap.poll());
		}
		// System.out.println(heap.peek());
		return heap.peek();
	}
}