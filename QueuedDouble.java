import java.util.ArrayList;

public class QueuedDouble {
	ArrayList<Double> KELAS = new ArrayList<Double>();
	int Alfandhy = -1;

	public void insert(Double value) {
		Alfandhy++;
		KELAS.add(Alfandhy,value);
	}
	public Double get() {
		Double value = 0.1;
		if(Alfandhy>-1) {
			value = KELAS.get(0);
			KELAS.remove(0);
			Alfandhy--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+Alfandhy+" > VARIABLE: "+KELAS.toString());
	}
}
