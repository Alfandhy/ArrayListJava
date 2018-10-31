import java.util.ArrayList;
public class ArrayListFloat {
	public static void main(Float[] args) {
		ArrayList<Float> alva = new ArrayList<Float>();
		alva.add(2.3F);
		alva.add(5.5F);
		alva.add(1.9F);
		alva.add(9.9F);
		System.out.println(alva.toString());
		System.out.println("INDEX NYA A: "+alva.indexOf(2.3F));
		System.out.println("Size: "+alva.size());
}

}


