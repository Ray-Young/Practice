package study.lei;

import java.util.ArrayList;
import java.util.List;

public class GenerateSquares {
	public int[] generateSquares(int[] data) {
		int[] result = new int[data.length];
		List<Integer> negativesSquare = new ArrayList<>();
		List<Integer> positivesSquare = new ArrayList<>();
		int i = 0;

		while (data[i] < 0) {
			i++;
		}
		while (i >= 0) {
			negativesSquare.add(data[--i] * data[--i]);
		}

		while (i < data.length) {
			positivesSquare.add(data[i] * data[i]);
		}

		i = 0;
		int j = 0;
		int index = 0;

		while (i < negativesSquare.size() && j < positivesSquare.size()) {
			if (negativesSquare.get(i) < positivesSquare.get(j)) {
				result[index++] = negativesSquare.get(i++);
			} else {
				result[index++] = positivesSquare.get(j++);
			}
		}

		while (i < negativesSquare.size()) {
			result[index++] = negativesSquare.get(i++);
		}

		while (j < positivesSquare.size()) {
			result[index++] = positivesSquare.get(j++);
		}

		return result;

	}
}
