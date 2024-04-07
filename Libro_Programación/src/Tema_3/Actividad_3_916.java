/*
 * ¿Qué modificaciones ralizarías en el código fuente anterior 
 * si quisieras calcular la media de días con precipitaciones por mes?
 */


package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_916 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int totalDias = 0;
		int precipitacionesMes;
		int mes=1;
		double media = 0;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.printf("Introduce las precipitaciones del mes %d ", mes);
			precipitacionesMes = Integer.parseInt(teclado.readLine());
			totalDias = totalDias+precipitacionesMes;
			mes++;
		} while (mes <= 12);
		
		System.out.printf("Ha llovido este año durante %d días \n", totalDias);
		
		media = totalDias / 12;
		System.out.println("La media de precipitaciones en un mes es de: " + media);
		
		teclado.close();
		
		
	}	

}
