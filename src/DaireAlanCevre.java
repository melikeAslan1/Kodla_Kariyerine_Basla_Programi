import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("dairenin yarýcapýný giriniz");

		double r = input.nextDouble();
		double pi = 3.14;

		System.out.println("dairenin alani=" + (pi * r * r));
		System.out.println("dairenin cevresi=" + (2 * pi * r));

	}

}
