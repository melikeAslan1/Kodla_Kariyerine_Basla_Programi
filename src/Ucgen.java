import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("dik kenarlardan birini giriniz");
		double a = input.nextDouble();

		System.out.println("di�er dik kenar� giriniz");
		double b = input.nextDouble();

		double c = Math.sqrt((a * a) + (b * b));

		System.out.println("hipoten�s= " + c);

		double ucgenCevresi = a + b + c;

		double u = ucgenCevresi / 2;

		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println("ucgenin alan�= " + alan);

	}

}
