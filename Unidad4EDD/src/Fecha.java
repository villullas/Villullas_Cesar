
/**
 * Clase para validar una fecha 
 * @version Kepler Service Release 2, 21/04/2017
 * @author C�sar Villullas
 */

public class Fecha {

	int dia; 
	int mes;
	int anio;
	/**
	 * Constructor de los par�metros dia, mes y anio.
	 * @param dia Par�metro de entrada, d�a.
	 * @param mes Par�metro de entrada, mes.
	 * @param anio Par�metro de entrada, a�o.
	 */
	public Fecha (int dia, int mes, int anio) {
		this.dia = dia; this.mes = mes; this.anio = anio;
	}
	/**
	 * M�todo para comprobar si el a�o es bisiesto.
	 * @return Devuelve true si el a�o es bisiesto o false si no lo es.
	 */
	private boolean bisiesto ( ) {
		if ( (anio % 400 == 0) || ( (anio % 4 == 0) && (anio % 100 != 0)) )
			return true;
		else return false;
		}
	/**
	 * M�todo que nos dice los d�as que tienen los diferentes meses del a�o.
	 * @return Devuelve en forma n�merica los d�as que tiene el mes.
	 */
	private int diasMes( ) {
		int diasMes = 0;
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: diasMes = 31;
			break;
			case 4:
			case 6:
			case 9:
			case 11 : diasMes = 30;
			break;
			case 2 : if ( bisiesto() )
							diasMes = 29;
						else
							diasMes = 28;
						break;
		}
		return diasMes;	
	}
	/**
	 * M�todo que nos sirve para validar una determinada fecha.
	 * @return Devuelve true en caso que los par�metros de dia, mes y anio introducidos sean correctos y false en caso contrario.
	 */
	public boolean valida ( ) {
		if (dia < 1 || dia > 31) return false;
		if (mes < 1 || mes > 12) return false;
		if (anio < 0) return false;
		if (dia > diasMes()) return false;
		else return true;
	}
}