package exercicios;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;

public class ex011 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		// data atual
		Date data = new Date();
		
		// data atual pelo sistema (em milissegundos)
		Date data1 = new Date(System.currentTimeMillis());
		
		// dia 01/01/1970
		Date data2 = new Date(0L);
		
		// 5h depois do dia 01/01/1970
		Date data3 = new Date(1000L * 60L * 60L * 5L);
		
		/*------------------------------------------*/
		
		Date data4 = sdf1.parse("22/06/1999");
		Date data5 = sdf2.parse("22/06/1999 15:36:07");
		Date data6 = Date.from(Instant.parse("1999-06-22T15:36:07Z"));
		
		/*------------------------------------------*/
		
		System.out.println("Data 00: " + data);
		System.out.println("Data 01: " + data1);
		System.out.println("Data 02: " + data2);
		System.out.println("Data 03: " + data3);
		System.out.println("Data 04: " + data4);
		System.out.println("Data 05: " + data5);
		System.out.println("Data 06: " + data6);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.println("Data 00: " + sdf1.format(data));
		System.out.println("Data 01: " + sdf1.format(data1));
		System.out.println("Data 02: " + sdf1.format(data2));
		System.out.println("Data 03: " + sdf1.format(data3));
		System.out.println("Data 04: " + sdf1.format(data4));
		System.out.println("Data 05: " + sdf1.format(data5));
		System.out.println("Data 06: " + sdf1.format(data6));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.println("Data 00: " + sdf2.format(data));
		System.out.println("Data 01: " + sdf2.format(data1));
		System.out.println("Data 02: " + sdf2.format(data2));
		System.out.println("Data 03: " + sdf2.format(data3));
		System.out.println("Data 04: " + sdf2.format(data4));
		System.out.println("Data 05: " + sdf2.format(data5));
		System.out.println("Data 06: " + sdf2.format(data6));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.println("Data 00: " + sdf3.format(data));
		System.out.println("Data 01: " + sdf3.format(data1));
		System.out.println("Data 02: " + sdf3.format(data2));
		System.out.println("Data 03: " + sdf3.format(data3));
		System.out.println("Data 04: " + sdf3.format(data4));
		System.out.println("Data 05: " + sdf3.format(data5));
		System.out.println("Data 06: " + sdf3.format(data6));
		
	}

}
