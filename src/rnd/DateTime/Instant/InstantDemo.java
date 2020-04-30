package rnd.DateTime.Instant;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class InstantDemo {

public static void main(String[] args) {
		  Instant instant1=Instant.now();
		  LocalDate localDate  = LocalDateTime.ofInstant(instant1, ZoneOffset.UTC).toLocalDate();
		  
		  DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		  String text = localDate.format(customFormatter);
			 
		  
		  
}

}
