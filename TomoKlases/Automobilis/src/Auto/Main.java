package Auto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {


        LocalDate data = LocalDate.now();
        LocalTime laikas = LocalTime.now();

        System.out.println("sios dienos data: " + data + "\n" + "dabartinis laikas yra:" + laikas);


    }

}
