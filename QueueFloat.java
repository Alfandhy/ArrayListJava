import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> KELAS = new ArrayList<Float>();
	int Alfandhy = -1;

	public void insert(Float value) {
		Alfandhy++;
		KELAS.add(Alfandhy,value);
	}
	public Float get() {
		Float value = 0.1f;
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
