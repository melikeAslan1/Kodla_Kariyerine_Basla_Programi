import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz :");

		double boy = input.nextDouble();

		System.out.println("L�tfen kilonuzu giriniz :");

		double kilo = input.nextDouble();

		double kitleIndeksi = kilo / (boy * boy);

		System.out.println("v�cut kitle indeksiniz :" + kitleIndeksi);

	}

}
