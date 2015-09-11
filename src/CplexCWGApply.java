
public class CplexCWGApply {

	private static int column_number_get(int m, int n, int num)
	{ 
	  int i, j, w = 0;
	  for(i = 0; i < m; i++) {
	    for(j = i + 1; j < num; j++) w++;
	  }
	  w = w + n - m;
	  return w;
	}
	
	public static void CplexCWGApply() {
		Graph G = new Graph();
		int NUM = G.get_num_vertices();
		int Ncol = NUM * (NUM-1) / 2;
		int[] colno = null;
		int i, j, k, a;
		int columnNumber;
		double[] row = null;
		double X;
		double utime;
		
		System.out.println("Building Cplex Model:");
		
		utime = System.currentTimeMillis();
		
		// Fix it start
		for(i = 0; i < NUM; i++) {
			
		    for(j = i + 1; j < NUM; j++) {
		    	
		    	columnNumber[i][j] = column_number_get(i, j, NUM);
		    	columnNumber[j][i] = columnNumber[i][j];
		    	}
		    }
		//Fix it end
		
	}	
	
	
}
