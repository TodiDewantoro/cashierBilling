package cashierBilling;

public class Paket {

	private String paketA, paketB, paketC;
	private int hargaA, hargaB, hargaC;
	
	public Paket() {
	}
	
	public Paket(String paketA, String paketB, String paketC, int hargaA, int hargaB, int hargaC) {
		super();
		this.paketA = paketA;
		this.paketB = paketB;
		this.paketC = paketC;
		this.hargaA = hargaA;
		this.hargaB = hargaB;
		this.hargaC = hargaC;
	}
	
	public String getPaketA() {
		return paketA;
	}
	public void setPaketA(String paketA) {
		this.paketA = paketA;
	}
	public String getPaketB() {
		return paketB;
	}
	public void setPaketB(String paketB) {
		this.paketB = paketB;
	}
	public String getPaketC() {
		return paketC;
	}
	public void setPaketC(String paketC) {
		this.paketC = paketC;
	}
	public int getHargaA() {
		return hargaA;
	}
	public void setHargaA(int hargaA) {
		this.hargaA = hargaA;
	}
	public int getHargaB() {
		return hargaB;
	}
	public void setHargaB(int hargaB) {
		this.hargaB = hargaB;
	}
	public int getHargaC() {
		return hargaC;
	}
	public void setHargaC(int hargaC) {
		this.hargaC = hargaC;
	}
	
	
	
}
