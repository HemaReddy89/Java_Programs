

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

	public static void main(String[] args) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");  
				 //("dd/MM/yyyy HH:mm:ss"); 
		 
		   LocalDateTime dateTime = LocalDateTime.now();  
		   System.out.println(dtf.format(dateTime));
	}

	

}
