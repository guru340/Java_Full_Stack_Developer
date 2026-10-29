package DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateandTime {



        public static void main(String[] args) {
            ZonedDateTime now =
                    ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

            System.out.println(now);

            ZonedDateTime london =
                    ZonedDateTime.now(ZoneId.of("Europe/London"));

            System.out.println(london);
        }

}
