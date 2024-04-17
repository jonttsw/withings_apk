package com.withings.webservices.legacy.common;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.DateTimeZone;
/* loaded from: classes4.dex */
public class DateTimeZoneSerializer implements JsonDeserializer<DateTimeZone>, JsonSerializer<DateTimeZone> {
    @Override // com.google.gson.JsonDeserializer
    public DateTimeZone deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            return DateTimeZone.forID(jsonElement.getAsString());
        } catch (IllegalArgumentException unused) {
            return DateTimeZone.getDefault();
        }
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(DateTimeZone dateTimeZone, Type type, JsonSerializationContext jsonSerializationContext) {
        if (dateTimeZone != null) {
            return new JsonPrimitive(dateTimeZone.getID());
        }
        return null;
    }
}
