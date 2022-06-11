package juegoTablaPeriodica;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import juegoTablaPeriodica.Preguntas;


public class Db {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("Datos.txt"),"utf-8"));
		
		
		String linea = "";
		int numLinea= 0;
		int j = 0;
		
		String [] preguntas = new String[5];
		
		while ((linea = buffer.readLine())!=null) {
			
			
			String [] partes = linea.split(",");
			preguntas[j] = linea; 
			numLinea++;
			j++;
			System.out.println(numLinea + ".-" + linea);
			
			for (int i = 0; i< partes.length; i++ ) {
			
				System.out.println(partes[i]);
				
				
			}
			
			System.out.println(" ----------------- ");
			
			}
	
		
		System.out.println(preguntas [Preguntas.elegirPregunta()]);
		
		
		}	
		

}
