package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_3 {

	public static void main(String[] args) throws IOException {
		String nombre, apellido1, apellido2;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.readLine();
		System.out.println("Introduce tu primer apellido: ");
		apellido1 = teclado.readLine();
		System.out.println("Introduce tu segundo apellido: ");
		apellido2 = teclado.readLine();
		
		System.out.println(nombre + "		" + apellido1 + "		" + apellido2);

	}

}
