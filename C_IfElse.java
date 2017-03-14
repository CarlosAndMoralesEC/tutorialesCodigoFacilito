package paqueteAprendizaje;

public class C_IfElse {
	public static void main(String[] args) {
		
		int variable1 = 12;
		int variable2 = 4;
		boolean condicion1 = true;
	
		if(variable1==1 || variable2==5){
			condicion1 = true;
			//System.out.println("La variable es 10");
		}
		else{
			condicion1 = false;
			//System.out.println("La variable no es 5");
		}
		
		if(condicion1){
			System.out.println("La condicion es verdadera");
		}
		else{
			System.out.println("La condicion es falsa");
		}
	}
}
