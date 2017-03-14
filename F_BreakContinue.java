package paqueteAprendizaje;

public class F_BreakContinue {
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++){
			System.out.println("Estas en el ciclo: " +i);
			
			if(i==4){
				continue;
			}
			System.out.println(+i);
			//break.- salirse de un ciclo
			//continue.-  termina el ciclo pero no realiza las operaciones luego del continue
		}
		System.out.println("Has salido del ciclo");
	}
}
