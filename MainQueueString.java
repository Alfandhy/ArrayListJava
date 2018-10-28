public class MainQueueString {

	public static void main(String[] args) {
			QueueString alva = new QueueString();
			alva.cetak();
			
			alva.insert("Asus");alva.cetak();
			alva.insert("Acer");alva.cetak();
			alva.insert("TOSHIBA");alva.cetak();
			
			String d0 = alva.get();
			System.out.println(d0);
			alva.cetak();
			
			String d1 = alva.get();
			System.out.println(d1);
			alva.cetak();
			
			String d2 = alva.get();
			System.out.println(d2);
			alva.cetak();
			
			String d3 = alva.get();
			System.out.println(d3);
			alva.cetak();
			
			String d800 = alva.get();
			System.out.println(d800);
			alva.cetak();
	}

}
