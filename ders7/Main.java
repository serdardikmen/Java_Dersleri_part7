package javadersleri.ders7;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args ) { 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idman Program�na Ho�geldiniz...");
		
		String idmanlar = "Ge�erli Hareketler...\n"
						+"Burpee\n"
						+"Pushup\n"
						+"Situp\n";
		System.out.println(idmanlar);
		
		System.out.println("Bir idman olu�turun.. ");
		
		System.out.println("Burpee Sayisi ");
		int burpee = scanner.nextInt();
		System.out.println("Pushup Sayisi");
		int pushup = scanner.nextInt();
		System.out.println("Situp Sayisi");
		int situp = scanner.nextInt();
		System.out.println("Squat Sayisi");
		int squat = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.println("�dman�n�z Ba�l�yor ");
 
		while(idman.idmanBittiMi() == false) {
			System.out.println("Hareket T�r� (Burpee,Pushup,Situp,Squat)");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten ka� tane yapacaks�n�z");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur,sayi);
			
			
		}
						
	}
}
