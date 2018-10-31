
public class MainStackFloat {
	public static void main(Float[] args) {
		StackFloat st = new StackFloat();
		st.cetak();
		
		st.push(2.5F); st.cetak();
		st.push(2.3F);st.cetak();
		st.push(8.9F); st.cetak();
		st.push(1.5F);st.cetak();
		
		float d0 = (float) st.pop();
		System.out.println(d0);
		st.cetak();
		
		float d1 = (float) st.pop();
		System.out.println(d1);
		st.cetak();
		
		float d2 = (float) st.pop();
		System.out.println(d2);
		st.cetak();
		
		float d3 = (float) st.pop();
		System.out.println(d3);
		st.cetak();
		
		float d9 = (float) st.pop();
		System.out.println(d9);
		st.cetak();
		
		float d100 = (float) st.pop();
		System.out.println(d100);
		st.cetak();

	}

}
