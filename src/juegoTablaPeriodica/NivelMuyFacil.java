package juegoTablaPeriodica;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class NivelMuyFacil extends Preguntas {
	
	
	static int valorAleatorio = Preguntas.elegirPregunta();
	
	

	public void mostrarPregunta() throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("Datos.txt"),"utf-8"));
		
		String linea = "";
		int j = 0;
		String [] preguntas = new String[5];
		
		while ((linea = buffer.readLine())!=null) {
			
			preguntas[j] = linea; 
			j++;
		}
			
		System.out.println(preguntas [valorAleatorio]);
	}
	
	
	
	public static String respuestaCorrecta () throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("ResCorrectasNivelMuyFacil.txt"),"utf-8"));
		
		String resLinea = "";
		String [] respuestas = new String [5];
		int j = 0;
		while ((resLinea = buffer.readLine())!=null) {
			
			respuestas[j] = resLinea; 
			j++;
		}
		
		System.out.println(respuestas [valorAleatorio]);
		
		return respuestas[valorAleatorio];
		
	}
	
	

	
}
