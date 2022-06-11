package juegoTablaPeriodica;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


public class Preguntas {
	
	//Atributos
	
	String categoria;
	String pregunta; //Enunciado 
	String respuestCorrecta;
	String respuestaIncorrectaUno;
	String respuestaIncorrectaDos;
	String respuestaIncorrectaTres;

	//Constructor
	

	public Preguntas(String categoria, String pregunta, String respuestCorrecta, String respuestaIncorrectaUno,
			String respuestaIncorrectaDos, String respuestaIncorrectaTres) {
		super();
		this.categoria = categoria;
		this.pregunta = pregunta;
		this.respuestCorrecta = respuestCorrecta;
		this.respuestaIncorrectaUno = respuestaIncorrectaUno;
		this.respuestaIncorrectaDos = respuestaIncorrectaDos;
		this.respuestaIncorrectaTres = respuestaIncorrectaTres;
		
	}

	public Preguntas() {
		super();
	}
	
	
	//Get and Set
	
	

	// Metodos
	
	/*public void mostrarPreguntas() {
		
		System.out.println("Pregunta de categoria 1");
		System.out.println("A que elementeo se refiere el simbolo Al");
		System.out.println();
		
	}*/
	
	public void mostrarRespuestas () {
		
		String [] respuestasTodas = new String [4];
		
		respuestasTodas [0] = "A. ";
		respuestasTodas [1] = "B. ";
		respuestasTodas [2] = "C. ";
		respuestasTodas [3] = "D. ";
		
		for (int i = 0; i < respuestasTodas.length; i++ ) {
			
			System.out.println(respuestasTodas[i] + " ");
		}
		
	}
	
	public static int elegirPregunta () {
		
		int i = (int) (Math.random () * 4);
		
		return i ;
		
	}
	
	
	public void mostrarPregunta() throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("Datos.txt"),"utf-8"));
		
		String linea = "";
		int numLinea= 0;
		int j = 0;
		
		String [] preguntas = new String[5];
		
		while ((linea = buffer.readLine())!=null) {
			
			
			preguntas[j] = linea; 
			j++;
			}
		
		//System.out.println(preguntas [Preguntas.elegirPregunta()]);
		
		
	}; 
	
	
	
	
	
	
	
	
	
	
	
	
}
