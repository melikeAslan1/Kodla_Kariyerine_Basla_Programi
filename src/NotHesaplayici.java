import java.util.Scanner;

public class NotHesaplayici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat,fiz,kim,turkce,tarih,muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("matematin notunuzu giriniz: ");
		mat=input.nextInt();
		
		System.out.print("fizik notunuzu giriniz: ");
		fiz=input.nextInt();
		
		System.out.print("kimya notunuzu giriniz: ");
		kim=input.nextInt();
		
		System.out.print("t�rk�e  notunuzu giriniz: ");
		turkce=input.nextInt();
		
		System.out.print("tarih notunuzu giriniz: ");
		tarih=input.nextInt();
		
		System.out.print("m�zik notunuzu giriniz: ");
		muzik=input.nextInt();
		
		int toplam=mat+fiz+kim+turkce+tarih+muzik;
		
		double ortalama= toplam/6.0;
		
		System.out.println("ortalaman�z: " + ortalama);
		
		if(ortalama>=60) {
			
			System.out.print("Dersten ge�tiniz.");
		}
		
		else {
			System.out.print("Dersten kald�n�z.");
			
		}
		
		
		
		
		

	}

}
