package cashierBilling;

public class Tambahan {
	
	private String makananTambahan;
	private String minumanTambahan;
	private int hargaTambahanMakanan;
	private int hargaTambahanMinuman;
	private int jumlahMakanan;
	private int jumlahMinuman;
	
	public Tambahan() {
		
	}
	
	public Tambahan(String makananTambahan, String minumanTambahan, int hargaTambahanMakanan, int hargaTambahanMinuman,
			int jumlahMakanan, int jumlahMinuman) {
		super();
		this.makananTambahan = makananTambahan;
		this.minumanTambahan = minumanTambahan;
		this.hargaTambahanMakanan = hargaTambahanMakanan;
		this.hargaTambahanMinuman = hargaTambahanMinuman;
		this.jumlahMakanan = jumlahMakanan;
		this.jumlahMinuman = jumlahMinuman;
	}
	
	public String getMakananTambahan() {
		return makananTambahan;
	}
	public void setMakananTambahan(String makananTambahan) {
		this.makananTambahan = makananTambahan;
	}
	public String getMinumanTambahan() {
		return minumanTambahan;
	}
	public void setMinumanTambahan(String minumanTambahan) {
		this.minumanTambahan = minumanTambahan;
	}
	public int getHargaTambahanMakanan() {
		return hargaTambahanMakanan;
	}
	public void setHargaTambahanMakanan(int hargaTambahanMakanan) {
		this.hargaTambahanMakanan = hargaTambahanMakanan;
	}
	public int getHargaTambahanMinuman() {
		return hargaTambahanMinuman;
	}
	public void setHargaTambahanMinuman(int hargaTambahanMinuman) {
		this.hargaTambahanMinuman = hargaTambahanMinuman;
	}
	public int getJumlahMakanan() {
		return jumlahMakanan;
	}
	public void setJumlahMakanan(int jumlahMakanan) {
		this.jumlahMakanan = jumlahMakanan;
	}
	public int getJumlahMinuman() {
		return jumlahMinuman;
	}
	public void setJumlahMinuman(int jumlahMinuman) {
		this.jumlahMinuman = jumlahMinuman;
	}
}
