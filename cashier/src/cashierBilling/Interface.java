package cashierBilling;


public interface Interface {
	
	default void pointOfSale(
			String paketA,
			String paketB,
			String paketC,
			String namaMakanan,
			String namaMinuman,
			int hargaTambahan) {
	}
}
