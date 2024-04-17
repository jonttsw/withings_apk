package com.withings.webservices.legacy.common;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.Duration;
/* loaded from: classes4.dex */
public class DurationSerializer implements JsonDeserializer<Duration>, JsonSerializer<Duration> {
    @Override // com.google.gson.JsonDeserializer
    public Duration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Duration(jsonElement.getAsLong() * 1000);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Duration duration, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(Long.valueOf(duration.getMillis() / 1000));
    }
}
