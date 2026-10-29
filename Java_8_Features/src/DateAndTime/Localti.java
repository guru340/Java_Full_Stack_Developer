package DateAndTime;

import java.time.LocalTime;

public class Localti {



        public static void main(String[] args) {
            LocalTime now = LocalTime.now();

            System.out.println(now);

            LocalTime time = LocalTime.of(10, 30, 45);
            System.out.println(time);

            System.out.println(time.plusHours(2));
            System.out.println(time.minusMinutes(15));
        }

}
