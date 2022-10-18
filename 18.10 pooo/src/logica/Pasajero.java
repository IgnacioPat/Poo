package logica;

import javax.swing.JOptionPane;

public class Pasajero {

	private String dni;
	private String nombre;
	private Sube sube;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sube getSube() {
		return sube;
	}
	public void setSube(Sube sube) {
		this.sube = sube;
	}
	public Pasajero(String dni, String nombre, Sube sube) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sube = sube;
	}
//	public void SubirAColectivo() {
//		JOptionPane.showMessageDialog(null, "Subio un pasajero al colectivo");
//	}
	
	public void EntrarAlColectivo(int credito, int destino , int capacidad) {
		do {
			capacidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cuantos pasajeros ingresaron (maximo 10 pasajeros)"));
		} while (capacidad>=11);
		do {
			JOptionPane.showMessageDialog(null, "Cant de pasajeros : "+ capacidad);
			credito= (int) (Math.random()*101);
		credito=credito;	
		JOptionPane.showMessageDialog(null,"Subio un nuevo pasajero");	
	//	credito=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanta plata tiene en la sube?"));	
		JOptionPane.showMessageDialog(null, "saldo actual : " + credito);
		JOptionPane.showMessageDialog(null, "Subio un pasajero al colectivo");
	
	
		destino=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Hasta donde va?\n Opcion 1 $25\n Opcion 2 $28 \n Opcion 3 $30"));
		capacidad=capacidad-1;
		switch (destino) {
		case 1:
			credito=credito-25;
			JOptionPane.showMessageDialog(null, "saldo actual : " + credito);
			JOptionPane.showMessageDialog(null, "Viaja en el colectivo");

			break;
case 2:
	credito=credito-28;
	JOptionPane.showMessageDialog(null, "Saldo actual : " + credito);
	JOptionPane.showMessageDialog(null, "Viaja en el colectivo");
	
	break;
case 3:
	credito=credito-30;
	JOptionPane.showMessageDialog(null, "Saldo actual : " + credito);
	JOptionPane.showMessageDialog(null, "Viaja en el colectivo");

	break;
	default:
		JOptionPane.showMessageDialog(null, "No llega hasta ahi el colectivo");
		JOptionPane.showMessageDialog(null, "Poner de nuevo el destino");

		break;

	}
		if (destino==1||destino==2||destino==3) {
			JOptionPane.showMessageDialog(null, "Bajó del colectivo");
		}
		
		
	} while (capacidad>0);
		

	}
	//public void VerPasajeros(int capacidad){
		//JOptionPane.showMessageDialog(null, "Cant de pasajeros : "+ capacidad);
//	}
}
