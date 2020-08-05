package javadersleri.ders7;

public class Idman {
	
	private int burpee_sayisi;
	private int pushup_sayisi;
	private int situp_sayisi;
	private int squat_sayisi;
	public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
		
		this.burpee_sayisi = burpee_sayisi;
		this.pushup_sayisi = pushup_sayisi;
		this.situp_sayisi = situp_sayisi;
		this.squat_sayisi = squat_sayisi;
	}
	public int getBurpee_sayisi() {
		return burpee_sayisi;
	}
	public void setBurpee_sayisi(int burpee_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
	}
	public int getPushup_sayisi() {
		return pushup_sayisi;
	}
	public void setPushup_sayisi(int pushup_sayisi) {
		this.pushup_sayisi = pushup_sayisi;
	}
	public int getSitup_sayisi() {
		return situp_sayisi;
	}
	public void setSitup_sayisi(int situp_sayisi) {
		this.situp_sayisi = situp_sayisi;
	}
	public int getSquat_sayisi() {
		return squat_sayisi;
	}
	public void setSquat_sayisi(int squat_sayisi) {
		this.squat_sayisi = squat_sayisi;
	}
	public void hareketYap(String hareketTuru,int sayi) {
		if (hareketTuru.equals("Burpee")) {
			
			burpeeYap(sayi);
		}
		else if (hareketTuru.equals("Situp")) {
			situpYap(sayi);
		}
			
	
	else if (hareketTuru.equals("Squat")) {
		squatYap(sayi);
	}
		
	
	else if (hareketTuru.equals("Pushup")) {
		pushupYap(sayi);
	}
	else {
		System.out.println("Ge�ersiz Hareket. ");
	}
}		
	public void burpeeYap(int sayi) {
		if (burpee_sayisi == 0) {
			System.out.println("Yapacak burpee kalmad� ");
		}
		if (burpee_sayisi - sayi < 0 ) {
			System.out.println("Hedefledi�in burpee ge�tin Tebrikler ! ");
			burpee_sayisi = 0;
			System.out.println("Kalan burpee : " + burpee_sayisi);
			
		}
		else {
			burpee_sayisi -=sayi;
			System.out.println("Kalan burpee Say�s� : " +burpee_sayisi);
		}
	}
	public void pushupYap(int sayi) {
		if (pushup_sayisi == 0) {
			System.out.println("Yapacak pushup kalmad� ");
		}
		if (pushup_sayisi - sayi < 0 ) {
			System.out.println("Hedefledi�in pushup ge�tin Tebrikler ! ");
			pushup_sayisi = 0;
			System.out.println("Kalan pushup : " + pushup_sayisi);
			
		}
		else {
			pushup_sayisi -=sayi;
			System.out.println("Kalan Pushup Say�s� : " +pushup_sayisi);
		}
	}


public void situpYap(int sayi) {
	if (situp_sayisi == 0) {
		System.out.println("Yapacak situp kalmad� ");
	}
	if (pushup_sayisi - sayi < 0 ) {
		System.out.println("Hedefledi�in situp ge�tin Tebrikler ! ");
		situp_sayisi = 0;
		System.out.println("Kalan situp : " + situp_sayisi);
		
	}
	else {
		situp_sayisi -=sayi;
		System.out.println("Kalan situp Say�s� : " +situp_sayisi);
	}
}

public void squatYap(int sayi) {
	if (squat_sayisi == 0) {
		System.out.println("Yapacak squat kalmad� ");
	}
	if (squat_sayisi - sayi < 0 ) {
		System.out.println("Hedefledi�in squat ge�tin Tebrikler ! ");
		squat_sayisi = 0;
		System.out.println("Kalan squat : " + squat_sayisi);
		
	}
	else {
		squat_sayisi -=sayi;
		System.out.println("Kalan squat Say�s� : " +squat_sayisi);
	}
}
public boolean idmanBittiMi() {
	return(burpee_sayisi == 0 ) && (pushup_sayisi == 0) && (situp_sayisi == 0 ) && (squat_sayisi == 0);
	
	
	}


}

