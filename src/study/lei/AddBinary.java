package study.lei;

public class AddBinary {
	public static String addBinary(String a, String b) {
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		int i = charA.length - 1;
		int j = charB.length - 1;
		int carry = 0;
		StringBuilder strBuilder = new StringBuilder();
		while (i >= 0 || j >= 0 || carry != 0) {
			int digit0 = i >= 0 ? charA[i--] - '0' : 0;
			int digit1 = j >= 0 ? charB[j--] - '0' : 0;
			int sum = digit0 + digit1 + carry;
			// use k replace 2, which can handle any scale
			carry = sum >= 10 ? 1 : 0;
			strBuilder.append(sum % 10);
		}
		return strBuilder.reverse().toString();
	}
}
