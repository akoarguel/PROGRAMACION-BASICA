/*Realiz un pequeño programa que tenga una variable entera a la que se le asignará el valor 10 por defecto
 * La aplicación debe comprobar si este número es par o impar y en funcion de esta condición debe mostrar el
 * mensaje "El número es impar". Aunque aún no la hemos estudiado, usa el método sysout, para mostrar
 * el texto correspondinete en pantalla como en el ejemplo anterior. Usa el operador ?:.
 * */
package Tema_3;

public class Actividad_3_4 {

	public static void main(String[] args) {
		int num = 10;
		
		String mensaje = (num % 2 == 0) ? "El número es par" : "El número es par";
		
		System.out.println(mensaje);
		

	}

}
