package es.studium.Conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion
{
	//Declaración de variables



	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		//Pedir por al usuario una cadena
		System.out.println("Escribe una cadena: ");
		String cadena = lectura.readLine();

		/*try y catch consigue que mientras se esta ejecutando el programa y falle pueda seguir
		ejecutandose y no pare.
		Dentro de lo que ocurre en try si falla se ejecuta el catch.
		Lo utilizamos basicamente porque es propenso a fallar*/
		try
		{
			/* Imprime por pantalla gracias al metodo parseInt, que se usa para obtener el tipo de datos primitivo
			 * de una determinada cadena
			 Se lanza para indicar que la aplicación ha intentado convertir 
			una cadena a uno de los tipos numéricos, pero que la cadena no tiene el formato adecuado*/
			System.out.println(Integer.parseInt(cadena));

		}
		catch(NumberFormatException exepcion)
		{
			//Leer una cadena
			System.out.println("Error en la cadena, corrija el formato introducido.");	
		}

	}
}