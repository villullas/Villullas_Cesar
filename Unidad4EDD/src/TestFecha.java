import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase con m�todo main para introducir una fecha para validar.
 * @version Kepler Service Release 2, 21/04/2017
 * @author C�sar Villullas
 */

public class TestFecha {
	
	/**
	 * M�todo main que nos permite introducir una fecha por teclado para saber si es v�lida o no.
	 * Nos pedir� que introduzcamos por teclado primero un d�a, luego un mes y luego un a�o. A continuaci�n aparecer� un mensaje
	 * por pantalla diciendo si la fecha introducida es v�lida o no.
	 * @throws IOException Si el valor introducido por teclado es null, no es un n�mero, est� vacio o contiene s�lo espacios.
	 */
	public static void main(String[] args)throws IOException {
		int dia, mes, anyo;
		System.out.println ("Introduce un d�a: ");
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println ("Introduce un a�o: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1=new Fecha(dia,mes,anyo);
		if (f1.valida())
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es v�lida");
		else
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" NO es v�lida");
	}

}
