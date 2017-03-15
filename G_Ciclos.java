package paqueteAprendizaje;

public class G_Ciclos {
	public static void main (String[] args) {
		
		//Serie de Números Impares
		//Del 1 al 100
		int i = 0;
		
		System.out.println("Serie de Números Impares: ");
		for(i=1 ; i<=100; i++){
			if(i%2!=0){
				System.out.print(i +",");
				
				if(i==99)
					System.out.print(i +".");
			}
			
			//Serie de Fibonacci
			//0,1,1,2,3,5,8,13,21,...
			int primero = 0, segundo = 1, suma = 0, j;
			for( j=1; j<=6; j++){
				suma = primero + segundo;
				primero = segundo;
				segundo = suma;	
			}
			System.out.println("La suma en la posición: " +(j+1) +"\nes de: " +suma);			
		}
	}
}
