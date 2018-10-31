import java.util.ArrayList;
public class ArrayListDouble {

		public static void main(Double[] args) {
			ArrayList<Double> alva = new ArrayList<Double>();
			alva.add(0.23D);
			alva.add(0.05D);
			alva.add(0.1D);
			alva.add(0.99D);
			System.out.println(alva.toString());
			System.out.println("INDEX NYA A: "+alva.indexOf(0.23D));
			System.out.println("Size: "+alva.size());
	}

	}

