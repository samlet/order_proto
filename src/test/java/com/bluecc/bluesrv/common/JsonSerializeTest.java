package com.bluecc.bluesrv.common;

import com.bluecc.bluesrv.ecomm.order.OrderElements;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.time.*;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static com.bluecc.bluesrv.common.Helper.pretty;

public class JsonSerializeTest {
    @Data
    static class Stuff {
        Date birthday = new Date();
    }

    @Data
    static class DateStuff {
        LocalDateTime birthday = LocalDateTime.now();
    }

    @Test
    void testDate() {
        System.out.println(GSON.toJson(new Stuff()));
        System.out.println(GSON.toJson(new DateStuff()));
        DateStuff ds = GSON.fromJson("{\"birthday\": \"2021-11-05T13:57:10.862\"}", DateStuff.class);
        System.out.println(ds);

        Gson gson = new Gson(); // with the original one
        String dateJson = "{\n" +
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
        DateStuff ds1 = gson.fromJson(dateJson, DateStuff.class);
        System.out.println(ds1);
    }

    /*
    https://stackoverflow.com/questions/39628885/how-convert-localdatetime-to-date-in-java-8
    http://www.world-timedate.com/timezone/timezone_info_by_country.php?country_id=70
     */
    @Test
    void testInstant() {
        ZoneId zNewYork = ZoneId.of("America/New_York");
        ZoneId zShanghai = ZoneId.of("Asia/Shanghai");

        Instant now = Instant.now();
        ZonedDateTime zdtNewYork = now.atZone(zNewYork);
        ZonedDateTime zdtShanghai = now.atZone(zShanghai);

//        Instant instant = zdtNewYork.toInstant();
        System.out.println(now);
        System.out.println(zdtNewYork.toLocalDateTime());
        System.out.println(zdtShanghai.toLocalDateTime());
    }

    @Test
    void testLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(2017, Month.JUNE, 15, 13, 39);
        Instant instant = dateTime.atZone(ZoneId.of("Europe/Paris")).toInstant();
        System.out.println(instant); // 2017-06-15T11:39:00Z
    }

    @Test
    void testJsonObject() {
        JsonObject jo = new JsonObject();
        jo.addProperty("name", "samlet");
        jo.addProperty("age", 18);
        System.out.println(GSON.toJson(jo));
    }

    @Test
    void testMultimap() {
        Multimap<String, JsonObject> dataList = ArrayListMultimap.create();
        JsonObject o = new JsonObject();
        o.addProperty("name", "samlet");
        dataList.put("first", o);
        System.out.println(dataList);
        pretty(dataList.asMap());

        String orderId = "just test";
        OrderElements ds = new OrderElements(orderId, dataList.asMap());
        pretty(ds);
        Gson gson = new Gson();
        ds = gson.fromJson(gson.toJson(ds), OrderElements.class);
        pretty(ds);
    }

    @Test
    void testGenerics() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Box<User> type2 = new Box<>();
        User user = new User();
        user.setId(100);
        user.setFirstName("Ramesh");
        user.setLastName("Fadatare");
        user.setGender("Male");
        user.setAge(28);
        type2.set(user);

        // Serialization of generic User type to json
        Type fooType2 = new TypeToken<Box<User>>() {}.getType();
        String userJson = gson.toJson(type2, fooType2);
        System.out.println(userJson);

        //  De-serialization of generic User type to json
        Box<User> box = gson.fromJson(userJson, fooType2);
        System.out.println(box.get().toString());
    }
}

class User {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" +
                gender + "]";
    }
}

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}