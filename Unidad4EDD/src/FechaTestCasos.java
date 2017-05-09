import static org.junit.Assert.*;
import org.junit.*;

public class FechaTestCasos extends TestFecha {
	
	
		Fecha f1=new Fecha(31, 1,  2010);
		Fecha f2=new Fecha(32, 1,  2010);
		Fecha f3=new Fecha(31, 13,  2010);
		Fecha f4=new Fecha(31, 1,  -12);
		Fecha f5=new Fecha(-1, 1,  2010);
		Fecha f6=new Fecha(31, -1,  2010);
		Fecha f7=new Fecha(29, 2,  2010);
		Fecha f8=new Fecha(29, 2,  2000);
		Fecha f9=new Fecha(31, 2,  2010);
		Fecha f10=new Fecha(31, 4,  2010);
		Fecha f11=new Fecha(31, 6,  2010);
		Fecha f12=new Fecha(31, 9,  2010);
		Fecha f13=new Fecha(31, 11,  2010);
		
		@Test
		public void FechaTestCasos(){
		assertEquals (f1.valida(), true);
		assertEquals (f2.valida(), false);
		assertEquals (f3.valida(), false);
		assertEquals (f4.valida(), false);
		assertEquals (f5.valida(), false);
		assertEquals (f6.valida(), false);
		assertEquals (f7.valida(), false);
		assertEquals (f8.valida(), true);
		assertEquals (f9.valida(), false);
		assertEquals (f10.valida(), false);
		assertEquals (f11.valida(), false);
		assertEquals (f12.valida(), false);
		assertEquals (f13.valida(), false);
		}
}
	