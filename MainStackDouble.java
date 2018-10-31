
public class MainStackDouble {

	public static void main(double[] args) {
		StackDouble st = new StackDouble();
		st.cetak();
		
		st.push(0.9); st.cetak();
		st.push(1.6);st.cetak();
		st.push(7.9); st.cetak();
		st.push(7.9);st.cetak();
		
		double d0 = st.pop();
		System.out.println(d0);
		st.cetak();
		
		double d1 = st.pop();
		System.out.println(d1);
		st.cetak();
		
		double d2 = st.pop();
		System.out.println(d2);
		st.cetak();
		
		double d3 = st.pop();
		System.out.println(d3);
		st.cetak();
		
		double d9 = st.pop();
		System.out.println(d9);
		st.cetak();
		
		double d100 = st.pop();
		System.out.println(d100);
		st.cetak();

	}

}
