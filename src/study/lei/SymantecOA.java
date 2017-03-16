package study.lei;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Name: Lei Yang
 * School: Boston University
 * Email: lei.yang.cs.art@gmail.com
 * Major: Computer Science, Master Degree
 */

/*
 * Coding Problem "All Combos"
 *	Write a program that produces every possible combination of a set of letters.
 *	For example, given a string "abc":
 *	Every possible combination of the letters in the string would be:
 *	"abc", "acb", "bac", "bca", "cab", "cba"
 */
public class SymantecOA {
	/*
	 * Limits N < 150, where N = number of test inputs
	 * L < 8, where L = length of a test input string
	 */
	private static int maxStringLength = 7;
	private static int maxTextLength = 149;

	/*
	 * Get all combinations using recursive approach
	 * Input: String
	 * Return: List of combinations with non-descending alphabetical order
	 */
	public static List<String> getCombos(String s) {
		List<String> result = new ArrayList<String>();
		if (s == null) {
			return result;
		}
		char[] cArray = s.toCharArray();
		Arrays.sort(cArray);
		s = new String(cArray);
		String solution = "";
		helper(result, solution, s);
		return result;
	}

	/*
	 * Recursively find combinations
	 */
	public static void helper(List<String> result, String solution, String s) {
		if (solution.length() == s.length()) {
			result.add(new String(solution));
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			if (solution.contains(String.valueOf(s.charAt(i)))) {
				continue;
			}
			solution = solution + s.charAt(i);
			helper(result, solution, s);
			solution = solution.substring(0, solution.length() - 1);
		}
	}

	/*
	 * Get input from file, assume the input file is in the first level of project folder
	 * Whitespace will be removed
	 * Input: <String> input file path
	 * Return: <List>  input string list
	 */
	public static List<String> getInputFile(String path) {
		List<String> result = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while (line != null) {
				if (line.contains(" ")) {
					line = new String(line.replaceAll("\\s", ""));
				}
				result.add(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.err.println("IOERROR: Input File erro");
			System.exit(1);
		}
		return result;
	}

	/*
	 * Generate output file
	 * If number of string is over maxTextLength (149), return error
	 * If string length is over maxStringLength(7), skip this case and continue next
	 * Input: <String> input file path
	 * Output: <File> combinations file
	 */
	public static void generateOutputFile(String path) {
		List<String> inputData = new ArrayList<String>();
		inputData = getInputFile(path);
		try {
			PrintWriter writer = new PrintWriter("Output.txt", "UTF-8");
			if (inputData.size() > maxTextLength) {
				System.out.println("ERROR: The maximum text input is 149");
				writer.println("ERROR: The maximum text input is 149");
				writer.close();
				return;
			}
			for (int i = 0; i < inputData.size(); i++) {
				String s = inputData.get(i);
				int index = i + 1;
				writer.println("Case #" + index);
				if (s.length() > maxStringLength) {
					writer.println("The maximum length of input string is 7, " + s + " is " + s.length());
					continue;
				}
				List<String> result = getCombos(s);
				for (int j = 0; j < result.size(); j++) {
					writer.println(result.get(j));
				}
			}
			writer.close();
		} catch (IOException e) {
			System.err.println("IOERROR: File write error");
		}
		System.out.println("Success: Combinations generated successfully in output.txt");
	}
}
