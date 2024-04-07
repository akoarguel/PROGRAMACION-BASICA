/*
 * Codifica un programa que pida al usuario un número que represente una cantidad expresada en pesetas.
 * Si tenemos en cuenta que 1 euro = 166,j386 pesetas, muestra por pantalla la conversión a euros de ese
 * número de pesetas
 */

package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double ptas;
		double euros;
		double eurosPorPtas = 166.386;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce una cantidad de pesetas");
		ptas = Double.parseDouble(teclado.readLine());
		
		euros = ptas / eurosPorPtas;
		
		System.out.printf("%.2f pesetas son %.2f euros", ptas, euros);

	}

}
