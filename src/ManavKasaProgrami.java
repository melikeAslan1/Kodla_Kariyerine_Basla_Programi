import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Armut Kaç Kilo: ");
		double armutKilo = input.nextDouble();

		System.out.println("Elma Kaç Kilo: ");
		double elmaKilo = input.nextDouble();

		System.out.println("Domates Kaç Kilo: ");
		double domatesKilo = input.nextDouble();

		System.out.println("Muz Kaç Kilo: ");
		double muzKilo = input.nextDouble();

		System.out.println("Patlýcan Kaç Kilo: ");
		double patlicanKilo = input.nextDouble();

		double armutFiyat = 2.14;
		double elmaFiyat = 3.17;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patlicanFiyat = 5.00;

		double Tutar = armutFiyat * armutKilo + elmaFiyat * elmaKilo + domatesFiyat * domatesKilo + muzFiyat * muzKilo
				+ patlicanFiyat * patlicanKilo;

		System.out.println("Toplam Tutar: " + Tutar);

	}

}
