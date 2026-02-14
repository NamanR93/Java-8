import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

class FileX7 {

  public static void main(String[] args) {

    LocalDate today = LocalDate.now();
    LocalDate customDate = LocalDate.of(1990, 2, 7);
    System.out.println(customDate);

    int dayOfMonth = today.getDayOfMonth();
    Month month = today.getMonth();
    int year = today.getYear();

    System.out.print(dayOfMonth + " ");
    System.out.print(month + " ");
    System.out.println(year + " ");

    // now we want past

    System.out.println(today);
    LocalDate yesterday = today.minusDays(1);
    System.out.println(yesterday);
    LocalDate pastDate = today.minusMonths(100);
    System.out.println(pastDate);

    if (today.isAfter(yesterday)) {
      System.out.println("hi there");
    }

    System.out.println("--------------------LocalTime-----------------------");

    LocalTime now = LocalTime.now();
    System.out.println(now);

    LocalTime customTime = LocalTime.of(14, 30, 30);
    System.out.println(customTime);

    LocalTime parsedTime = LocalTime.parse("15:30:45");
    LocalTime BeforeOneHour = now.minusHours(1);

    if (now.isAfter(BeforeOneHour)) {
      System.out.println("kem cho");
    }

    System.out.println("----------------------LocalDateTime-----------------------------");

    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime myDate = LocalDateTime.parse("2023-01-26T13:48");
    System.out.println(myDate);

    System.out.println("------------------ZonedDateTime-----------------");

    ZonedDateTime now2 = ZonedDateTime.now();
    System.out.println(now2);

    Set<String> availableZonesIds = ZoneId.getAvailableZoneIds();
    System.out.println(availableZonesIds.size());

    availableZonesIds.forEach(System.out::println);

    System.out.println("-----------Duration---------------------");

    Instant start = Instant.now();

    int sum = 0;
    for (int i = 0; i < 10000; i++) {
      sum += i + 1;
    }
    Instant end = Instant.now();

    Duration d1 = Duration.between(start, end);
    Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
    System.out.println(d1);
    System.out.println(d2);

    int i = d1.compareTo(d2);
    System.out.println(i);

    System.out.println("-----------------period----------------------");

    LocalDate now1 = LocalDate.now();
    LocalDate then = LocalDate.of(1990, 2, 2);
    Period period = Period.between(now1, then);
    System.out.println(period);

    System.out.println("--------------------Date time formatter-----------------");

  }

}