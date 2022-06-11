package juegoTablaPeriodica;

import java.util.Scanner;

public class Participante {
	
	
	//Atributos 
	
	String nombre;
	Integer puntaje;
	
	
	
	// Constructor
	
	public Participante() {
		super();
	}

	public Participante(String nombre, Integer puntaje) {
		super();
		this.nombre = nombre;
		this.puntaje = puntaje;
	}
	
	
	
	
	//Get and Set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	

	//Metodos
	
	void jugar () {		
		System.out.println("Introducir una resouesta");
		Scanner teclado = new Scanner (System.in);
	}
	
	public static int aumentarPuntaje () {
		
		int puntaje = 0;
		int puntajePorRonda = puntaje + 5;
		return puntajePorRonda; 
	}

}
