/*
 * Crea un programa que pida dos números x e y y realice la multiplicacion solo mediante sumas
 */
package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_913 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x = 0;
		int y = 0;
		int resultado = 0;
		int contador = 0;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce x. ");
		x = Integer.parseInt(teclado.readLine());
		System.out.println("Introduce y. ");
		y = Integer.parseInt(teclado.readLine());
		
		while (contador < y) {
			resultado += x		;
			contador++;
		}
		System.out.println(resultado);
	}

}
