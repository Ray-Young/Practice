package study.lei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		read();
		System.out.println("aa");
		read();
	}

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
