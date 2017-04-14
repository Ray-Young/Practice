package study.lei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinReader {
	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
