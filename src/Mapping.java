/* Data structure of a Mapping, with each Short representing a vertex */
public class Mapping extends Utility {
	private int _size;       	/* total number of vertices */
	private short _mapping;   	/* vector, allow number of vertices up to 32768 */
	
	
	
	/* returns the size of mapping */
	public int mapping_size() {
		return _size;
	}

	/* set the mapped value of vertex u */
	public void mapping_set(int u, int value){
		SET_VALUE(this._mapping, u, value);
	}

	/* get the mapped value of vertex u */
	public int mapping_get(int u) {
		GET_VALUE(this._mapping, u);
	}

}
