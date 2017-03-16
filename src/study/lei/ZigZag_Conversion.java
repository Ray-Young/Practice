package study.lei;

import java.util.HashMap;
import java.util.Map;

public class ZigZag_Conversion {
	public String convert(String s, int numRows) {
		if (s.isEmpty())
			return s;
		if (numRows == 1)
			return s;
		if (numRows == 2) {
			StringBuilder odd = new StringBuilder();
			StringBuilder even = new StringBuilder();
			int i = 0;
			for (char c : s.toCharArray()) {
				if ((i & 1) == 0)
					odd.append(c);
				else
					even.append(c);
			}
			return odd.toString() + even.toString();
		}
		Map<Integer, StringBuilder> map = new HashMap<>();
		int i = 0;
		int downCount = 0;
		int upCount = 0;
		int count = 0;
		int index = 0;
		boolean isDown = true;
		for (char c : s.toCharArray()) {
			if (isDown) {
				index = (i - count * (numRows - 2)) % numRows;
				if (!map.containsKey(index)) {
					map.put(index, new StringBuilder());
				}
				map.get(index).append(c);
				i++;
				downCount++;
				if (downCount == numRows) {
					isDown = false;
					downCount = 0;
				}
			} else {
				index = i - count * (2 * numRows - 2) - (upCount + 1) * 2;
				System.out.println(index);
				map.get(index).append(c);
				i++;
				upCount++;
				if (upCount == (numRows - 2)) {
					isDown = true;
					upCount = 0;
					count++;
				}
			}
		}
		String result = new String();
		int length = Math.min(numRows, map.keySet().size());
		for (int j = 0; j < length; j++) {
			System.out.println(map.get(j));
			result += map.get(j).toString();
		}
		return result;
	}
}
