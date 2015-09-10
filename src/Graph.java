

// Graph Structure

public class Graph {
	public int _num_vertices; 			//total number of vertices in graph
	public int _num_active_vertices;	//number of active vertices
	public int _num_edges;				//number of active edges
	public int _k;						//expected size
	public int _matrix;					//bit-based adjacency matrix
	public int _active;					//bit-based vector: 1-active
	public short _degree;				//number of edges each vertex have (<65536)
	
	// Getters and Setters
	public int get_num_vertices() {
		return _num_vertices;
	}
	public void set_num_vertices(int _num_vertices) {
		this._num_vertices = _num_vertices;
	}
	public int get_num_active_vertices() {
		return _num_active_vertices;
	}
	public void set_num_active_vertices(int _num_active_vertices) {
		this._num_active_vertices = _num_active_vertices;
	}
	public int get_num_edges() {
		return _num_edges;
	}
	public void set_num_edges(int _num_edges) {
		this._num_edges = _num_edges;
	}
	public int get_k() {
		return _k;
	}
	public void set_k(int _k) {
		this._k = _k;
	}
	public int get_matrix() {
		return _matrix;
	}
	public void set_matrix(int _matrix) {
		this._matrix = _matrix;
	}
	public int get_active() {
		return _active;
	}
	public void set_active(int _active) {
		this._active = _active;
	}
	public short get_degree() {
		return _degree;
	}
	public void set_degree(short _degree) {
		this._degree = _degree;
	}
	
	public void inc_k() {
		this._k += 1;
	}
	
	public void dec_k() {
		this._k -= 1;
	}

	public boolean edge_exist(int g, int v) {
		return IS_SET(this.get_matrix(), v);
	}
	
	private boolean IS_SET(int get_matrix, int v) {
		// TODO Auto-generated method stub
		return vector[(bit) >> RSV] & 1 << ((bit) & XBM);
	}
}
