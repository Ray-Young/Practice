package study.lei;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> rets = new ArrayList<>();
		for (int i = 1, fizz = 1, buzz = 1; i <= n; i++, fizz++, buzz++) {
			System.out.println(fizz + " " + buzz);
			if (fizz == 3 && buzz == 5)
				rets.add("FizzBuzz");
			else if (fizz == 3) {
				rets.add("Fizz");
				fizz = 1;
			} else if (buzz == 5) {
				rets.add("Buzz");
				buzz = 1;
			} else
				rets.add(String.valueOf(i));
		}
		return rets;
	}

}
