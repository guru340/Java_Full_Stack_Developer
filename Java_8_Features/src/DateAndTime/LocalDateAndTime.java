package DateAndTime;

import java.time.LocalDateTime;

public class LocalDateAndTime {



        public static void main(String[] args) {
            LocalDateTime now = LocalDateTime.now();

            System.out.println(now);

            LocalDateTime meeting =
                    LocalDateTime.of(2026, 11, 15, 14, 30);

            System.out.println(meeting);
            System.out.println(meeting.plusDays(2));
        }

}
