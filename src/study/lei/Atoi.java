package study.lei;

public class Atoi {
	public int myAtoi(String str) {
		if (str.isEmpty())
			return 0;
		long result = 0;
		int sign = 1;
		int i = 0;
		while (str.charAt(i) == ' ')
			i++;

		if (str.charAt(i) == '+' || str.charAt(i) == '-') {
			sign = str.charAt(i++) == '-' ? -1 : 1;
		}

		while (i < str.length() && Character.isDigit(str.charAt(i))) {
			result = result * 10 + str.charAt(i) - '0';
			if (sign * result >= Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign * result <= Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			i++;
		}
		System.out.println((int) result);

		return sign * (int) result;
	}
}
