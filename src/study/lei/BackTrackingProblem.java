package study.lei;

import java.util.ArrayList;

// This problem can be solved with DP or Recursion
//Recursive Version
public class BackTrackingProblem {
	public static ArrayList<ArrayList<Integer>> runDistanceCombination(int distance) {
		ArrayList<ArrayList<Integer>> results = new ArrayList<>();
		ArrayList<Integer> solution = new ArrayList<>();
		helper(results, solution, distance, 0);
		return results;
	}

	public static void helper(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> solution, int distance,
			int eachDistance) {
		if (distance == 0) {
			results.add(new ArrayList<Integer>(solution));
		}

		for (int i = 0; i < 2; i++) {
			if (i == 0 && distance > 0) {
				solution.add(1);
				distance--;
				// Trick. If you use distance - 1, it will make the back track fail, because one set is not removed.
				helper(results, solution, distance, 1);
				distance++;
				solution.remove(solution.size() - 1);
			} else if (i == 1 && distance >= 3) {
				solution.add(3);
				distance = distance - 3;
				helper(results, solution, distance, 3);
				distance = distance + 3;
				solution.remove(solution.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(runDistanceCombination(5));
		// runDistanceCombination(5);
	}

}
