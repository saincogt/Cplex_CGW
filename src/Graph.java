// Graph Structure

public class Graph extends Utility{
	// Constants
	private static final int RSV = 5;
	private static final int XBM = 31;
	
	// Graph properties
	private int _num_vertices; 			//total number of vertices in graph
	private int _num_active_vertices;	//number of active vertices
	private int _num_edges;				//number of active edges
	private int _k;						//expected size
	private int[] _matrix;				//bit-based adjacency matrix
	private int[] _active;				//bit-based vector: 1-active
	private short[] _degree;			//number of edges each vertex have (<65536)
	
	// Getters and Setters
	/* returns the total number of vertices in graph */
	public int get_num_vertices() {
		return this._num_vertices;
	}
	
	/* returns the number of active vertices in graph */
	public int get_num_active_vertices() {
		return this._num_active_vertices;
	}
	
	/* returns the number of active edges in graph */
	public int get_num_edges() {
		return this._num_edges;
	}
	
	/* returns the expected size k */
	public int get_k() {
		return this._k;
	}
	
	/* set the expected size to k */
	public void set_k(int _k) {
		this._k = _k;
	}
	
	/* increase k by one */
	public void inc_k() {
		this._k += 1;
	}
	
	/* decrease k by one */
	public void dec_k() {
		this._k -= 1;
	}
	
	/* check to see if an edge exists or not */
	public int edge_exists(int u, int v) {
		return IS_SET(this._matrix[u], v);
	}
	
	/* check to see if a vertex is active or not */
	public boolean vertex_exists(int u){
		return IS_SET(this._active[], u);
	}
	
	/* return the degree of a vertex */
	public short get_degree(int u) {
		return this._degree[u];
	}
	
	/* return the pointer to the bit-based neighbors of vertex u */
	public int neighbors(int g, int u) {
		return 1;
	}
	
	/* add an edge to graph */
	public void add_edge(int u, int v) {
		if (!IS_SET(this._matrix[u], v)) {
			SET_BIT(this._matrix[u], v);
			SET_BIT(this._matrix[v], u);
			this._num_edges++;
			this._degree[u]++;
			this._degree[v]++;
		}
	}

	/* delete an edge from graph */
	public void delete_edge(int u, int v) {
		if (IS_SET(this._matrix[u], v)) {
			DEL_BIT(this._matrix[u], v);
			DEL_BIT(this._matrix[v], u);
			this._degree[u]--;
			this._degree[v]--;
			this._num_edges--;
		}

	}

	/* delete a vertex, making it inactive */
	public void delete_vertex(int u) {
		int my_i;
		if (IS_SET(this._active, u)) {
			this._num_active_vertices--;
			for (my_i = 0; my_i < this.get_num_vertices(); my_i++) {
				if (IS_SET(this._matrix[u], my_i)) {
					delete_edge(u, my_i);
				}
			}
			DEL_BIT(this._active, u);
		}
	}

	/* iteratively deletes all vertices with degree < k */
	public void delete_lower_degree_vertices(Graph g, int k) {
		int my_j, my_deleted = 1;
		while (my_deleted == 1) {
			my_deleted = 0;
			for (my_j = 0; my_j < this.get_num_vertices(); my_j++) {
				if (this.vertex_exists(my_j)) {
					if (this.get_degree(my_j) < k) {
						this.delete_vertex(my_j);
						my_deleted++;
					}
				}
			}
		}
	}
	
	
	
	/* check to see if an edge exists or not */
	
	
	public int IS_SET(int[] vector , int bit) {
		return vector[(bit) >> RSV] & 1 << ((bit) & XBM);
	}
	
	
}
