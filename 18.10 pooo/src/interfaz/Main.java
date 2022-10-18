package interfaz;
import logica.*;
public class Main {

	public static void main(String[] args) {

		Motor motor = new Motor(null, null, 0);
		Colectivo colectivo = new Colectivo(null, 0, motor, 0);
		
		colectivo.PrenderMotor(0);
		//colectivo.getMotor();
		Pasajero pasa = new Pasajero(null, null, null);
		pasa.EntrarAlColectivo(0, 0, 0);
		
		//System.out.println("Subieron "+colectivo.getCapacidad()+" pasajeros");
	}

}
