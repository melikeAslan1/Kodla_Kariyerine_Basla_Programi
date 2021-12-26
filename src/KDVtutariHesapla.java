import java.util.Scanner;

public class KDVtutariHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double para;

		Scanner input = new Scanner(System.in);

		System.out.print("para deðerini giriniz: ");

		para = input.nextDouble();

		double kdvTutari;

		kdvTutari = 0.18;

		double KDVliTutar = para + para * kdvTutari;

		System.out.println("KDV'siz Fiyat = " + para);
		System.out.println("KDV'li Fiyat = " + KDVliTutar);
		System.out.print("KDV Tutari = " + para * kdvTutari);

	}

}
