package cashierBilling;

public class Main {

	public static void main(String[] args) {
		System.out.println("============= Warung Pojok =============");
		System.out.println();
		Billing billing = new Billing();
		billing.pointOfSale("test", "test", "test", "Test", "Test", 0);
	}

}
