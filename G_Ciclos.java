package paqueteAprendizaje;

public class G_Ciclos {
	public static void main (String[] args) {
		
		//Serie de Números Impares
		//Del 1 al 100
		int i = 0;
		
		System.out.println("Serie de Números Impares: ");
		for(i=1 ; i<=100; i+=2){
			System.out.print(i +", ");
			if(i==99){
				System.out.println(i +".");
			}
		}
	}
}
