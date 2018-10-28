import java.util.ArrayList;
public class QueueString {
	ArrayList<String> container = new ArrayList<String>();
	int ekor = -1 ;
	
	public void insert(String value) {
		ekor++ ;
		container.add(ekor, value);
	}
	public String get() {
		String value = "KOSONG NERT";
		if(ekor>1) {
			value = container.get(0);
			container.remove(0);
			ekor--;
		}
		return value;
	}
	public void cetak() {
		System.out.println("ekor: "+ekor+" # CONTAINER: "+container.toString());
	}
}
