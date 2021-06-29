
public class Hesap {

	private String HesapNo;
	private String isim;
	private String TelefonNo;
	private double bakiye;
	
	public void ParaYat�r(double tutar) {
		bakiye = bakiye + tutar;
		System.out.println("Ekledi�iniz tutar:" + tutar);
		System.out.println("Yeni bakiyeniz" + bakiye);
		
	}
	
	public void ParaCekme(double tutar) {
		
		if(tutar>1500) {
			System.out.println("Tek seferde 1500 TL den fazla �ekemezsiniz.");
		}else if(bakiye-tutar<0) {
			System.out.println("Yetersiz Bakiye. L�tfen Tekrar Deneyiniz.");
		}else {
			bakiye = bakiye - tutar;
			System.out.println("Toplam bakiyenizden" + tutar + "TL �ekilmi�tir.");
			System.out.println("Yeni bakiyeniz : " + bakiye);
		}
		
	}
//getter and setter
	public String getHesapNo() {
		return HesapNo;
	}

	public void setHesapNo(String hesapNo) {
		HesapNo = hesapNo;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getTelefonNo() {
		return TelefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		TelefonNo = telefonNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
//CONSTRUCTOR yapt�k source fields
	public Hesap(String hesapNo, String isim, String telefonNo, double bakiye) {
		super();
		HesapNo = hesapNo;
		this.isim = isim;
		TelefonNo = telefonNo;
		this.bakiye = bakiye;
	}

	public void BilgileriG�ster() {
		System.out.println("Bakiyeniz : " + bakiye);
		System.out.println("Hesap Numaran�z : " + HesapNo);
		System.out.println("Telefon Numaran�z : " + TelefonNo);
		System.out.println("�sminiz : " + isim);
		 
	}
	
}
