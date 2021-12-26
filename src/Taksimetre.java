import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("gidilen km miktarýný giriniz");

		double km = input.nextDouble();
		int taksiMetreAcilis = 10;
		double perKm = 2.20;

		double tutar = km * perKm + taksiMetreAcilis;

		tutar = (tutar < 20) ? 20 : tutar;

		System.out.print("tutar" + tutar);

	}

}
