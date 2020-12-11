package cashierBilling;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Billing implements Interface {
	
	// Local date created at
	LocalDate dateTime = LocalDate.now();
	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	
	
	@Override
	public void pointOfSale(String paketA, String paketB, String paketC, String namaMakanan, String namaMinuman, int hargaTambahan) {
		// TODO Auto-generated method stub
		
		//Method from interface
		Interface.super.pointOfSale(paketA, paketB, paketC, namaMakanan, namaMinuman, 0);
		
		//Storing menu paket to set (unique) - iterable
		Set<String> paket = new HashSet<String>();
		paket.add("Ayam Sambal Matah + Es Teh");
		paket.add("Ayam Goreng + Es Teh");
		paket.add("Ayam Bakar + Es Teh");
		
		//Storing menu paket to set (unique) - iterable
		Set<Integer> paketPrice = new HashSet<Integer>();
		paketPrice.add(20000);
		paketPrice.add(15000);
		paketPrice.add(17000);
		
		//Storing Paket Price set to array
	    Integer[] paketArrPrice = new Integer[paketPrice.size()];
	    paketPrice.toArray(paketArrPrice);

		//Storing Paket set to array
	    String[] paketArr = new String[paket.size()];
	    paket.toArray(paketArr);
	    

	    //Loop array
	      for(int i=0, j=0; i<paketArr.length && j<paketArrPrice.length; i++,j++){
	         System.out.println("Paket Ayam "+(i+1)+": "+paketArr[i]);
		         System.out.println("Harga "+": "+paketArrPrice[j]);
	         System.out.println();
	      }
	      
	    //Setpaket from array index
	    Paket pakets = new Paket();
	    pakets.setPaketA(paketArr[0]);
	    pakets.setPaketB(paketArr[1]);
	    pakets.setPaketC(paketArr[2]);
	    pakets.setHargaA(paketArrPrice[0]);
	    pakets.setHargaB(paketArrPrice[1]);
	    pakets.setHargaC(paketArrPrice[2]);
	      
	    //Admin information input
	      Scanner input = new Scanner(System.in);
	        int jumlah_barang, jumlah_tambahan,jumlah_barang_fixed, harga,totalharga,hargatambahan,totalhargafixed;
	        double  ppn = 0.10 ;
	        double  totalbayar;
	        System.out.println("_________________________________________");
	        System.out.println();
	        System.out.println("Silahkan pilih paket nomor 1-3");
	        System.out.print("Paket nomor : ");
	        int paketNomor = input.nextInt();
	        System.out.print("Jumlah : ");
	        jumlah_barang = input.nextInt();
	        
	    //Show input invalid if jumlah < 0
	        if(jumlah_barang <=0) {
	            System.out.println("Mohon masukan jumlah yang benar dan ulangi program");
	            System.exit(0);
	        }
	        
	    //Set harga sesuai paket yang dipilih   
	        if (paketNomor == 1) {
	        	pakets.setHargaA(paketArrPrice[0]);
	        	harga = pakets.getHargaA();
	        } else if (paketNomor == 2) {
	        	pakets.setHargaB(paketArrPrice[1]);
	        	harga = pakets.getHargaB();
	        } else {
	        	pakets.setHargaC(paketArrPrice[2]);
	        	harga = pakets.getHargaC();
	        } 
	        
	        totalharga = jumlah_barang * harga;
	        System.out.println("Total harga = Rp. " +totalharga);
	        
	    //Offer any additional addons
	        System.out.println("Ada tambahan makanan & minuman? (Y/N)");
		    String yaynay = input.next();
		    
		//Show no input if no, Show input if yes
	        if (yaynay.equals("N") || yaynay.equals("n")){
	        	
	    //Not showing addons input
	        	ppn = totalharga*ppn;
		        totalbayar = totalharga+ppn;
		        System.out.println("PPN 10% = Rp. " +ppn);
		        System.out.println("_________________________________________");
		        System.out.println();
		        System.out.println("============= Nota Belanja =============");
		        if (paketNomor == 1) {
		        	System.out.println("Paket Nomor : " +paketNomor+". "+pakets.getPaketA());
		        } else if (paketNomor == 2) {
		        	System.out.println("Paket Nomor : " +paketNomor+". "+pakets.getPaketB());
		        } else {
		        	System.out.println("Paket Nomor : " +paketNomor+". "+pakets.getPaketC());
		        } 
		        System.out.println("Jumlah : " +jumlah_barang);
		        System.out.println("Harga : Rp. " +totalharga);
		        System.out.println("_________________________________________");
		        System.out.println();
		        System.out.println("Total Harga (Termasuk PPN) : Rp. " +totalbayar);
		        System.out.println("created at: "+dateTime);
		        input.close();
	        	} else {
	        	
	     //Showing addons input
	        	Tambahan tambahan = new Tambahan();
	        	
	     // Eat the new line
		        input.nextLine();
	        	System.out.println("Masukkan tambahan makanan: ");
			    String tambahanMakanan = input.nextLine();
			    System.out.println("Masukkan harga makanan: ");
			    int hargaTambahanMakanan = input.nextInt();
			    
	     //Show input invalid if harga < 100
		        if(hargaTambahanMakanan <100)
		        {
		            System.out.println("Mohon masukan harga yang valid dan ulangi");
		            System.exit(0);
		        }
			    System.out.println("Masukkan jumlah makanan: ");
			    int jumlahTambahanMakanan = input.nextInt();
			    
	     //Show input invalid if jumlah <= 0
			    if(jumlahTambahanMakanan <= 0)
		        {
		            System.out.println("Mohon masukan harga yang valid dan ulangi");
		            System.exit(0);
		        }
			    
	     // Eat the new line
		        input.nextLine();
			    System.out.println("Masukkan tambahan minuman: ");
			    String tambahanMinuman= input.nextLine();
			    System.out.println("Masukkan harga minuman: ");
			    int hargaTambahanMinuman = input.nextInt();
			    
	     //Show input invalid if harga < 100
		        if(hargaTambahanMinuman <100)
		        {
		            System.out.println("Mohon masukan harga yang valid dan ulangi");
		            System.exit(0);
		        }
			    System.out.println("Masukkan jumlah minuman: ");
			    int jumlahTambahanMinuman = input.nextInt();
			    
		 //Show input invalid if jumlah <= 0
			    if(jumlahTambahanMinuman <= 0)
		        {
		            System.out.println("Mohon masukan harga yang valid dan ulangi");
		            System.exit(0);
		        }
			    
		 //Set addons input to tambahan
			    tambahan.setMakananTambahan(tambahanMakanan);
			    tambahan.setJumlahMakanan(jumlahTambahanMakanan);
			    tambahan.setMinumanTambahan(tambahanMinuman);
			    tambahan.setJumlahMinuman(jumlahTambahanMinuman);
			    tambahan.setHargaTambahanMakanan(hargaTambahanMakanan);
			    tambahan.setHargaTambahanMinuman(hargaTambahanMinuman);
		      
		 //Calculate addons price
			    hargatambahan = (tambahan.getHargaTambahanMakanan()*tambahan.getJumlahMakanan())+(tambahan.getHargaTambahanMinuman()*tambahan.getJumlahMinuman());
			
		 //Showing addons information
			    System.out.println();
			    System.out.println("_________________________________________");
			    System.out.println();
			    System.out.println("====== Tambahan Makanan & Minuman ======");
			    System.out.println("Makanan : " + tambahan.getMakananTambahan());
			    System.out.println("Jumlah makanan tambahan : " + jumlahTambahanMakanan);
			    System.out.println("Minuman : "+ tambahan.getMinumanTambahan());
			    System.out.println("Jumlah minuman tambahan : " + jumlahTambahanMinuman);
			    System.out.println("Harga tambahan : "+hargatambahan);
			    System.out.println("");
			    
		 //Calculate addons quantities
			    jumlah_tambahan = tambahan.getJumlahMakanan()+tambahan.getJumlahMinuman();
			    jumlah_barang_fixed = jumlah_barang+jumlah_tambahan;
			    
		 //Calculate fixed price
			    totalhargafixed = totalharga+hargatambahan;
			    
		 //Calculate fixed tax
		        ppn = totalhargafixed*ppn;
		        
		 //Calculate fixed price + tax
		        totalbayar = totalhargafixed+ppn;
		        
		 //Showing paket & addons information
		        System.out.println();
		        System.out.println("============= Nota Belanja =============");
		        if (paketNomor == 1) {
		        	System.out.println("Paket Nomor : " +paketNomor+". "+pakets.getPaketA());
		        } else if (paketNomor == 2) {
		        	System.out.println("Paket Nomor : " +paketNomor+". "+pakets.getPaketB());
		        } else {
		        	System.out.println("Paket Nomor : " +paketNomor+". "+pakets.getPaketC());
		        }  
		        System.out.println("Tambahan : " +tambahan.getMinumanTambahan()+" & "+tambahan.getMakananTambahan());
		        System.out.println("Jumlah item : " +jumlah_barang_fixed);
		        System.out.println("Harga : Rp. " +totalhargafixed);
		        System.out.println("PPN 10% = Rp. " +ppn);
		        System.out.println("_________________________________________");
		        System.out.println();
		        System.out.println("Total Harga (Termasuk PPN) : Rp. " +totalbayar);
		        System.out.println("created at: "+dateTime);
		        input.close();
	        }
	}
}
