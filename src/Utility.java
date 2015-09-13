
public class Utility {
	// Constants
	// private static final int CHAR_BITS = 8;
	private static final int XBM = 31;
	private static final int RSV = 5;
	
	// I cannot understant this function. Need to verify.
	public int IS_SET(int[] vector , int bit) {
		return vector[(bit) >> RSV] & 1 << ((bit) & XBM);
	}
	
	public void SET_BIT(int[] vector, int bit){
		vector[(bit) >> RSV] |= 1 << ((bit) & XBM);
	}
	
	public void DEL_BIT(int[] vector, int bit){
		vector[(bit) >> RSV] &= ~(1 << ((bit) & XBM));
	}
	public void SET_VALUE(int[] vector, int index, int value) {
		vector[index] = value;
	}
	
	public int GET_VALUE(int[] vector, int index) {
		return vector[index];
	}
}

