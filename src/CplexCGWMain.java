
public class CplexCGWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myTest();
	}
	
	public static void myTest() {
		int[] vector = {1, 233333, 333, 43333, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, };
		int bit = 2;
		int RSV = 5;
		int XBM = 31;
		
		System.out.println((2)&1<<1);
		System.out.println(vector[bit]);
		System.out.println(333 >> RSV);
		System.out.println(vector[(bit) >> RSV]);
		System.out.println("This is my test:");
		System.out.println(vector[(bit) >> RSV] & 1 << ((bit) & XBM));
	}
}
