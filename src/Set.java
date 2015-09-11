
public class Set {
	public int _set_size;     	/* total number of vertices */
	public int _num_elements; 	/* number of vertices in the set */
	public int _set;         	/* bit-based vector: 1 - in set */
	
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
	
	public boolean in_set(Set s, int u) {
		return IS_SET(s._set, u);
	}
	private boolean IS_SET(int _set2, int u) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
