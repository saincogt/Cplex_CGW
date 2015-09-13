
/* Data structure of a Set, with each bit representing a vertex */
public class Set extends Utility {
	
	// Set properties
	private int _set_size;     		/* total number of vertices */
	private int _num_elements; 		/* number of vertices in the set */
	private int[] _set;         	/* bit-based vector: 1 - in set */
	
	// Getters and Setters
	/* returns the size of set */
	public int get_set_size() {
		return _set_size;
	}
	
	
	public void set_set_size(int _set_size) {
		this._set_size = _set_size;
	}
	
	/* returns the number of vertices in set */
	public int get_num_elements() {
		return _num_elements;
	}
	
	/* set the number of vertices in set */
	public void set_num_elements(int _num_elements) {
		this._num_elements = _num_elements;
	}
	
	public int[] get_set() {
		return _set;
	}
	public void set_set(int[] _set) {
		this._set = _set;
	}
	
	/* check to see if a vertex in set or not */
	public int in_set(int u) {
		return IS_SET(this._set, u);
	}
	
	/* add a vertex to set */
	public void add_to_set(int u) {
		if (!IS_SET(this._set, u)) {
			SET_BIT(this._set, u); 
			this._num_elements++; 
		}
	}	
}
	

