
public class MainStackString {

	public static void main(String[] args) {
		StackString st = new StackString();
		st.cetak();
		
		st.push("Alfandhy"); st.cetak();
		st.push("Fandhy");st.cetak();
		st.push("Andhy"); st.cetak();
		st.push("Alva");st.cetak();
		
		String d0 = st.pop();
		System.out.println(d0);
		st.cetak();
		
		String d1 = st.pop();
		System.out.println(d1);
		st.cetak();
		
		String d2 = st.pop();
		System.out.println(d2);
		st.cetak();
		
		String d3 = st.pop();
		System.out.println(d3);
		st.cetak();
		
		String d9 = st.pop();
		System.out.println(d9);
		st.cetak();
		
		String d100 = st.pop();
		System.out.println(d100);
		st.cetak();

	}

}
