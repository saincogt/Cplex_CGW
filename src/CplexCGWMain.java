import ilog.concert.*;
import ilog.cplex.*;

public class CplexCGWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyCplex();
	}
	
	public static void ApplyCplex() {
		try {
			
			IloCplex cplex = new IloCplex();
			
			// Variables
			IloNumVar Xij = cplex.numVar(0.0, 1.0, "Xij");
			
			// Expressions
			IloLinearNumExpr objective = cplex.linearNumExpr();
			objective.addTerm(0.12, Xij);
			
			// Define objectives
			cplex.addMinimize(objective);
			
			
			// Define constraints
			cplex.addGe(cplex.addGe(Xij, Xij), Xij);
			
			// Solve
			cplex.solve();
						
		}
		catch (IloException exc) {
			exc.getStackTrace();
		}
		


	}
}
