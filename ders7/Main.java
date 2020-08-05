package javadersleri.ders7;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args ) { 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idman Programýna Hoþgeldiniz...");
		
		String idmanlar = "Geçerli Hareketler...\n"
						+"Burpee\n"
						+"Pushup\n"
						+"Situp\n";
		System.out.println(idmanlar);
		
		System.out.println("Bir idman oluþturun.. ");
		
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
		
		System.out.println("Ýdmanýnýz Baþlýyor ");
 
		while(idman.idmanBittiMi() == false) {
			System.out.println("Hareket Türü (Burpee,Pushup,Situp,Squat)");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten kaç tane yapacaksýnýz");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur,sayi);
			
			
		}
						
	}
}
