package com.bluecc.bluesrv.common;

import com.google.gson.Gson;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.Date;

import static com.bluecc.bluesrv.common.Helper.GSON;

public class JsonSerializeTest {
    @Data
    static class Stuff{
        Date birthday=new Date();
    }
    @Data
    static class DateStuff{
        LocalDateTime birthday= LocalDateTime.now();
    }

    @Test
    void testDate(){
        System.out.println(GSON.toJson(new Stuff()));
        System.out.println(GSON.toJson(new DateStuff()));
        DateStuff ds=GSON.fromJson("{\"birthday\": \"2021-11-05T13:57:10.862\"}", DateStuff.class);
        System.out.println(ds);

        Gson gson=new Gson(); // with the original one
        String dateJson="{\n" +
                "  \"birthday\": {\n" +
                "    \"date\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 11,\n" +
                "      \"day\": 5\n" +
                "    },\n" +
                "    \"time\": {\n" +
                "      \"hour\": 13,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 52,\n" +
                "      \"nano\": 877000000\n" +
                "    }\n" +
                "  }\n" +
                "}";
        DateStuff ds1=gson.fromJson(dateJson, DateStuff.class);
        System.out.println(ds1);
    }

    /*
    https://stackoverflow.com/questions/39628885/how-convert-localdatetime-to-date-in-java-8
    http://www.world-timedate.com/timezone/timezone_info_by_country.php?country_id=70
     */
    @Test
    void testInstant(){
        ZoneId zNewYork = ZoneId.of("America/New_York");
        ZoneId zShanghai = ZoneId.of("Asia/Shanghai");

        Instant now = Instant.now();
        ZonedDateTime zdtNewYork = now.atZone( zNewYork );
        ZonedDateTime zdtShanghai = now.atZone( zShanghai );

//        Instant instant = zdtNewYork.toInstant();
        System.out.println(now);
        System.out.println(zdtNewYork.toLocalDateTime());
        System.out.println(zdtShanghai.toLocalDateTime());
    }

    @Test
    void testLocalDateTime(){
        LocalDateTime dateTime = LocalDateTime.of(2017, Month.JUNE, 15, 13, 39);
        Instant instant = dateTime.atZone(ZoneId.of("Europe/Paris")).toInstant();
        System.out.println(instant); // 2017-06-15T11:39:00Z
    }
}
