import java.util.ArrayList;
public class ArrayListString {
	public static void main(String[] args) {
			ArrayList<String> alva = new ArrayList<String>();
			alva.add("alfandhy");
			alva.add("TEKNIK");
			alva.add("Informatika");
			System.out.println(alva.toString());
			System.out.println("INDEX NYA A: "+alva.indexOf("A"));
			System.out.println("Size: "+alva.size());
	}

}
