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
			IloNumVar Xjk = cplex.numVar(0.1, 2.0, "Xjk");
			
			// Expressions
			IloLinearNumExpr objective = cplex.linearNumExpr();
			objective.addTerm(0.12, Xij);
			objective.addTerm(0.11, Xjk);
			
			
			// Define objectives
			cplex.addMinimize(objective);
			
			
			// Define constraints
			cplex.addGe(cplex.addGe(Xij, Xij), Xjk);
			
			// Solve
			cplex.solve();
						
		}
		catch (IloException exc) {
			exc.getStackTrace();
		}
		


	}
}
