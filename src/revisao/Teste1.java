package revisao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Teste1 {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E dd-MMMM-yy hh:mm:ss a");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
