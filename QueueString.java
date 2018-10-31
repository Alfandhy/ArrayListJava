
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int Alfandhy = -1;

	public void insert(String value) {
		Alfandhy++;
		kelase.add(Alfandhy,value);
	}
	public String get() {
		String value = "KOSONG";
		if(Alfandhy>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			Alfandhy--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+Alfandhy+" > KELAS E: "+kelase.toString());
	}
}
