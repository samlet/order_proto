package com.bluecc.bluesrv.common;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;

import static com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;

public class Helper {
//    static class LocalDateAdapter implements JsonSerializer<LocalDate> {
//        public JsonElement serialize(LocalDate date, Type typeOfSrc, JsonSerializationContext context) {
//            return new JsonPrimitive(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // "yyyy-mm-dd"
//        }
//    }
//
//    static class LocalDateTimeAdapter implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {
//        public JsonElement serialize(LocalDateTime date, Type typeOfSrc, JsonSerializationContext context) {
//            return new JsonPrimitive(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // "yyyy-mm-ddTxxxxxx"
//        }
//        @Override
//        public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//            return null;
//        }
//    }

    /**
     * A simpler implementation. Add null support to by registering the nullSafe() wrapped version
     * ref: https://stackoverflow.com/questions/39192945/serialize-java-8-localdate-as-yyyy-mm-dd-with-gson
     */
    public static final class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {
        @Override
        public void write(final JsonWriter jsonWriter, final LocalDateTime localDate ) throws IOException {
            jsonWriter.value(localDate.toString());
        }

        @Override
        public LocalDateTime read( final JsonReader jsonReader ) throws IOException {
            return LocalDateTime.parse(jsonReader.nextString());
        }
    }

    public static final class LocalDateTimeAdapterWithFormat extends TypeAdapter<LocalDateTime> {
        @Override
        public void write(final JsonWriter jsonWriter, final LocalDateTime localDate ) throws IOException {
            jsonWriter.value(localDate.toString());
        }

        static final DateTimeFormatter LOCAL_DATE_TIME = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(ISO_LOCAL_DATE)
                .appendLiteral(' ')
                .append(ISO_LOCAL_TIME).toFormatter();
        @Override
        public LocalDateTime read( final JsonReader jsonReader ) throws IOException {
            // DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis();
            // return LocalDateTime.parse(jsonReader.nextString(),
            //         DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
            // return parser.parseDateTime(jsonReader.nextString()).toInstant();
            return LocalDateTime.parse(jsonReader.nextString(), LOCAL_DATE_TIME);
        }
    }

    public static final Gson GSON = new GsonBuilder()
            .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
//            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter().nullSafe())
            .setPrettyPrinting()
            .create();

    public static void pretty(Object o){
        System.out.println(GSON.toJson(o));
    }
}

