/*
 * Realiza un programa que muestre los número divisibles por 7 entre 1 y 100.
 */

package Tema_3;

public class Actividad_3_918 {

	public static void main(String[] args) {
		
		
		System.out.println("Número divisibles por 7 del 1 al 100:");
		System.out.print("| ");
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " | ");
			}
		}
	}
}
