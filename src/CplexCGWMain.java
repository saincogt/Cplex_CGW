import java.util.Stack;
import java.util.Queue;
import java.util.*;


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
		
		Stack<String> s = new Stack<String>();
		s.push("aaa");
		s.push("bbbb");
		System.out.println(s.pop());
		System.out.println(s.pop());
		Set<String> set = new HashSet<String>();
		
		set.add("Hello");
		set.add("Yo");
		System.out.println(set.contains("Yes"));
		set.remove("Yo");
		set.add("Yes");
		System.out.println(set.contains("Yo"));
		System.out.println(set.contains("Yes"));

		
		
		System.out.println((2)&1<<1);
		System.out.println(vector[bit]);
		System.out.println(333 >> RSV);
		System.out.println(vector[(bit) >> RSV]);
		System.out.println("This is my test:");
		System.out.println(vector[(bit) >> RSV] & 1 << ((bit) & XBM));
	}
}
