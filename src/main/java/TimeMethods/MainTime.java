package TimeMethods;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class MainTime {
    public static void main(String[] args){
        LocalTime localTime= LocalTime.now();

        System.out.println("Acum este: "+localTime);

        LocalTime now=localTime.plusHours(1);
        System.out.println("peste o ora va fi "+ now);
        LocalTime futureMinute=localTime.plusMinutes( 30);
        System.out.println("peste jumatate de ora va fi "+ futureMinute);
        LocalDate localDate=LocalDate.now();
        System.out.println("Azi suntem in data de : "+localDate);

       LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Duration duration=Duration.between(LocalTime.now(),futureMinute);
        System.out.println(duration);
        Period period=Period.between(LocalDate.now(),LocalDate.now().plusYears(2).plusWeeks(10));

        System.out.println(period);

        localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
    }
}
