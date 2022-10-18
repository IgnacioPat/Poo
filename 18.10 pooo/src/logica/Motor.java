package logica;

import javax.swing.JOptionPane;

public class Motor {

	private String numPatente;
	private String modelo;
	private int estado;

	
	public String getNumPatente() {
		return numPatente;
	}
	public void setNumPatente(String numPatente) {
		this.numPatente = numPatente;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Motor(String numPatente, String modelo, int estado) {
		super();
		this.numPatente = numPatente;
		this.modelo = modelo;
		this.estado = estado;
	}
	
		
}
