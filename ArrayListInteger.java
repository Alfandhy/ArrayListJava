import java.util.ArrayList;
public class ArrayListInteger {
	public static void main(int[] args) {
		ArrayList<Integer> alva = new ArrayList<Integer>();
		alva.add(1);
		alva.add(2);
		alva.add(3);
		
		System.out.println(alva.toString());
		System.out.println("INDEX NYA A: "+alva.indexOf(1));
		System.out.println("Size: "+alva.size());
}

}
