/*
 * Realiza el ejercicio anterior teninedo en cuanta que el número de peseats introducido por el 
 * usuario debe ser mayor que cero. Si se itroduce un número positivo de ptas. se realizará la conversion,
 * en caso contrario no se hara ninguna acción.
 */

package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double euros, ptas, eurosPorPtas=166.386;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce un número de ptsa mayor que 0");
		ptas = Double.parseDouble(teclado.readLine());
		
		if (ptas > 0) {
			euros = ptas / eurosPorPtas;
			System.out.printf("%.2f pesetas son %.2f euros.", ptas, euros);
		} else {
			System.out.println("Introduce un número mayor que 0");
			System.out.println("FIN DEL PROGRAMA");
		}

	}

}
