/*
 * Realiza un pequeño programa que pida al usuario una letra y muestre por pantalla el carácter siguiente
 * al especificado
 */
package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_7 {

	public static void main(String[] args) throws IOException {
		char letra;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Estribe una letra: ");
		letra = (char) teclado.read();
		letra++;
		
		System.out.println(letra);
		
	}

}
