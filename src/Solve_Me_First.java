import java.util.Scanner;

public class Solve_Me_First {

	static int solveMeFirst(int a, int b) {

		int sonuc;

		sonuc = a + b;
		return sonuc;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;

		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
