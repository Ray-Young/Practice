package study.lei;

public class IntLongDouble {
	public void test() {

		// Int (-2^31) ~ (2^31 - 1) ,32 bit, first is sign, 0 is positive and 1
		// is negative
		// Clarification: 111……111 is -1, 0……0 is 0, which makes the MIN_VALUE
		// is -2^31, and 1000…000 is -2^31
		//
		// Long (-2^63) ~ (2^63 - 1), 64 bit, first bit is sign, like above
		//
		// Double, 2^-1074 ~ (2 - 2^-52) * 2 ^1023, which makes it all positive.
		// No sign bit
		//
		// What cast do when long to int?
		// The low 32bits of long are taken and put into the int
		// Therefore, 2147483648 will be -2147483648, because in binary,
		// 2147483648 is 2^31, which in binary the low 32bit is 1000…000, which
		// is -2^31 in int.
		//
		// We can also use >> or << to do the cast, it’s same.
		String input = "-2147483648";
		Atoi atoi = new Atoi();
		System.out.println(atoi.myAtoi(input));
		System.out.println(Double.MIN_VALUE);
		System.out.println(Math.pow(2, 31));

		// double num = Integer.MIN_VALUE;
		// System.out.println(num);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}
