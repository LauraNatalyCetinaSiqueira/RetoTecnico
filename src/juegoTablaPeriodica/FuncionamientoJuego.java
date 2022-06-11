package juegoTablaPeriodica;

import java.io.IOException;
import java.util.Scanner;

import juegoTablaPeriodica.Preguntas;

public class FuncionamientoJuego {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Bienvenido al juego: TABLA PERIÓDICA");
		System.out.println("");
		System.out.println("Este juego se compone de 5 rondas, cada ronda contienene 1 pregunta correspondiente a un nivel, comenzando en el nuvel muy  facil, hasta el nivel muy dificil");
		System.out.println("");
		System.out.println( "Las reglas del juego son:" );
		System.out.println("1. Las preguntas son de selección multiple, donde solo hay una respuesta correcta.");
		System.out.println("2. Existe la posibilidad de retirarse, sin embargo, si se retira sin contestar la sigueinte pregunta, se llevará el acumulado del preio, de lo contrario pierde el acumulado");
		System.out.println("3. Para indicar la repsuesta correcta, es necesario que responda ingresando la letra correspondiente a la pregunta que usted considera correcta. ");
		System.out.println("Para comenzar ingresa tu nombre");
		Scanner teclado = new Scanner (System.in);
		String nombre = teclado.nextLine();
		Participante nuevoParticipante = new Participante ();
		
		nuevoParticipante.setNombre(nombre);
		
		System.out.println("Hola " + nuevoParticipante.getNombre() ); // +  nombre Participante
		
		System.out.println( "A continuación se mostrará la primera pregunta del nivel 1");
		System.out.println("");
		System.out.println("Si respondes correctameente obtines 5 puntos.");
		System.out.println("Pregunta 1");
		NivelMuyFacil otraspreguntas = new NivelMuyFacil();
		otraspreguntas.mostrarPregunta();
		System.out.println("Por favor ingrese una de las opciones (recuerde usar mayúsculas): A, B, C o D");
		String respuesta = teclado.nextLine();
		System.out.println("Su respuesta ha sido la " + respuesta);
		
		if (respuesta.equals(NivelMuyFacil.respuestaCorrecta())) {
			
			System.out.println(" !Muy Bien!,  pasas al siguiente nivel");
			System.out.println("");
			System.out.println("Ganaste 5 puntos");
			System.out.println("Tu puntaje actual es " );
			System.out.println(Participante.aumentarPuntaje());
			System.out.println("");
			System.out.println(" Pasaste al nivel dos, a continuacióin verás la siguiente pregunta");
			
			NivelFacil preguntaNivel2 = new NivelFacil();
			
			preguntaNivel2.mostrarPregunta();
			
			System.out.println("Por favor ingrese una de las opciones: A, B, C o D");
			String respuesta2 = teclado.nextLine();
			
			System.out.println("Su respuesta ha sido la " + respuesta2);
			
			if (respuesta2.equals(NivelFacil.respuestaCorrecta())) {
				
				System.out.println(" !Muy Bien!,  pasas al siguiente nivel");
				System.out.println("Ganaste 5 puntos más");
				System.out.println("Tu puntaje actual es: ");
				System.out.println(Participante.aumentarPuntaje() + 5);
				System.out.println("Pasaste al nivel tres, a continuacióin verás la siguiente pregunta");
		
				NivelMedio preguntaTres = new NivelMedio();
				
				preguntaTres.mostrarPregunta();
				
				System.out.println("Por favor ingrese una de las opciones: A, B, C o D");
				String respuesta3 = teclado.nextLine();
				
				System.out.println("Su respuesta ha sido la " + respuesta3);
				
				if(respuesta3.equals(NivelMedio.respuestaCorrecta())) {
					
					System.out.println(" !Muy Bien!,  pasas al siguiente nivel");
					System.out.println("Ganaste 5 puntos más");
					System.out.println("Tu puntaje actual es: ");
					System.out.println(Participante.aumentarPuntaje() + 10);
					System.out.println(" Pasaste al nivel cuatro, a continuacióin verás la siguiente pregunta");
					
					NivelDificil preguntaCuatro = new NivelDificil();
					
					preguntaCuatro.mostrarPregunta();
					
					System.out.println("Por favor ingrese una de las opciones: A, B, C o D");
					String respuesta4 = teclado.nextLine();
					
					System.out.println("Su respuesta ha sido la " + respuesta4);
					
					if(respuesta4.equals(NivelDificil.respuestaCorrecta())) {
						
						System.out.println(" !Muy Bien!,  pasas al nivel final");
						System.out.println("Ganaste 5 puntos más");
						System.out.println("Tu puntaje actual es: ");
						System.out.println(Participante.aumentarPuntaje() + 15);
						System.out.println(" Pasaste al nivel final, a continuación verás la siguiente pregunta");
						
						NivelMuyDificil preguntaCinco = new NivelMuyDificil();
							
						preguntaCinco.mostrarPregunta();
						
						System.out.println("Por favor ingrese una de las opciones: A, B, C o D");
						String respuesta5 = teclado.nextLine();
						
						System.out.println("Su respuesta ha sido la " + respuesta5);
						
						if(respuesta5.equals(NivelMuyDificil.respuestaCorrecta())) {
							
							System.out.println(" !Muy Bien!");
							System.out.println("Ganaste 15 puntos ");
							System.out.println("Tu puntaje actual es: ");
							System.out.println(Participante.aumentarPuntaje() + 30);
							System.out.println("Llegaste al final del juego, has superado todos los niveles");
				
							
						}else {
							System.out.println("Respuesta Incorrecta,  el juego ha terminado");
						}
						
					}else {
						System.out.println("Respuesta Incorrecta,  el juego ha terminado");
					}
		
					
				}else {
					System.out.println("Respuesta Incorrecta,  el juego ha terminado");
				}
				
			}else {
				System.out.println("Respuesta Incorrecta,  el juego ha terminado");
			}
			
			
		}else {
			System.out.println("Respuesta Incorrecta,  el juego ha terminado");
		}
		
		
		teclado.close();
		
	}
}
