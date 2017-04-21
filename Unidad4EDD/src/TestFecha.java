import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase con método main para introducir una fecha para validar.
 * @version Kepler Service Release 2, 21/04/2017
 * @author César Villullas
 */

public class TestFecha {
	
	/**
	 * Método main que nos permite introducir una fecha por teclado para saber si es válida o no.
	 * Nos pedirá que introduzcamos por teclado primero un día, luego un mes y luego un año. A continuación aparecerá un mensaje
	 * por pantalla diciendo si la fecha introducida es válida o no.
	 * @throws IOException Si el valor introducido por teclado es null, no es un número, está vacio o contiene sólo espacios.
	 */
	public static void main(String[] args)throws IOException {
		int dia, mes, anyo;
		System.out.println ("Introduce un día: ");
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un año: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1=new Fecha(dia,mes,anyo);
		if (f1.valida())
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es válida");
		else
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" NO es válida");
	}

}
