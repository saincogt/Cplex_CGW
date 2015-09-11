
public class Utility {
	// Constants
	// private static final int CHAR_BITS = 8;
	private static final int XBM = 31;
	private static final int RSV = 5;
	
	public int _set_size;     	// total number of vertices
	public int _num_elements; 	// number of vertices in the set
	public int _set;         	// bit-based vector: 1 - in set
	
	public int get_set_size() {
		return _set_size;
	}
	public void set_set_size(int _set_size) {
		this._set_size = _set_size;
	}
	public int get_num_elements() {
		return _num_elements;
	}
	public void set_num_elements(int _num_elements) {
		this._num_elements = _num_elements;
	}
	public int get_set() {
		return _set;
	}
	public void set_set(int _set) {
		this._set = _set;
	}
	
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

