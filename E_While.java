package paqueteAprendizaje;

public class E_While {
	public static void main (String[] args) {
		
		int variable1 = 0;
		boolean condicion1 = true;
		
		while(condicion1){
			System.out.println("El valor de la variable es: " +variable1);
			variable1+=2;
		
			if(variable1 > 8){
				condicion1 = false;
			}
		}
	}
}
