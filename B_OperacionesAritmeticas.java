package paqueteAprendizaje;

public class B_OperacionesAritmeticas {
	public static void main (String[] args){
		
		int variable1 = 5;
		int multiplicacion1 = variable1 * 2;
		int division1 = variable1/2;
		int residuo1 = variable1%2; 
		
		float variable2 = 9;
		double division2 = variable2%2;
		
		
		System.out.println(variable1);
		System.out.println("El resultado es: " +multiplicacion1);
		System.out.println("El resultado de la division es: " +division1);
		System.out.println("El residuo de la división es: " +residuo1);
		System.out.println("El resultado de la division es: " +division2);
	}
}
