package DateAndTime;
import java.time.LocalDate;
import java.time.Period;
public class PeriodVsDuration {


            LocalDate start = LocalDate.of(2024, 1, 1);
            LocalDate end = LocalDate.of(2026, 4, 10);

            Period p = Period.between(start, end);

        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
}
