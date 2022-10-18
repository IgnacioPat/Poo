package logica;

import javax.swing.JOptionPane;

public class Colectivo {

	private String patente;
	private int tarifa;
	private Motor motor;
	private int capacidad;
	
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Colectivo(String patente, int tarifa, Motor motor, int capacidad) {
		super();
		this.patente = patente;
		this.tarifa = tarifa;
		this.motor = motor;
		this.capacidad = capacidad;
	}
	
	public void PrenderMotor(int estado) {
		do {
			estado=Integer.parseInt(JOptionPane.showInputDialog(null,"Definir estado del motor\n1 Prendido\n0 Apagado"));				

	switch (estado) {
			case 1:
				JOptionPane.showMessageDialog(null,"Prendiste el motor, ya pueden subir los pasajeros");	
				this.motor.setEstado(1);
				JOptionPane.showMessageDialog(null, "(1 = prendido, 0 = apagado)\nEstado del motor = "+this.motor.getEstado());
				break;
			default:
				JOptionPane.showMessageDialog(null, "No lo prendiste, si queres que los pasajeros suban es necesario prenderlo");
				this.motor.setEstado(0);
				JOptionPane.showMessageDialog(null, "(1 = prendido, 0 = apagado)\nEstado del motor = "+this.motor.getEstado());
				break;
			}
} while (estado!=1);
		
		}
		
	}
	
	

