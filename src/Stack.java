import java.util.Iterator;

public class Stack {
	// void _v;
	int _top;
	int _size;
	
	/* return the total size of a stack */
	public int stack_size() {
		return this._size;
	}

	// return the number of elements in a stack
	
	public int stack_length() {
		return this._top;
	}

	/* return whether a stack is empty or not */
	public boolean stack_empty() {
		if (this._top == 1) {
			return false;
		}
		else {
			return true;
		}
	}

	/* return the element on the top of a stack */
	public int stack_top() {
		return this._v[this._top-1];
	}

	
	/* delete the first k elements from the top of a stack */
	#define stack_pop_k(s, k) {\
	  void *my_v; int my_i; \
	  for (my_i = 0; my_i < k; my_i++) {\
	    my_v = stack_pop(s);\
	    free(my_v); }\
	
}
