package Day1;

import java.util.Scanner;

public class Octal2Binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a, 8);
		String bin = Integer.toBinaryString(b);
		System.out.println(bin);
	}
}
