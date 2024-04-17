package com.withings.webservices.legacy.withings.model.measure;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.withings.webservices.legacy.withings.model.measure.HFMeasureResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
/* loaded from: classes4.dex */
public class HFMeasureResponseDeserializer implements JsonDeserializer<HFMeasureResponse> {
    private void addSerieTo(JsonObject jsonObject, HFMeasureResponse hFMeasureResponse) {
        int asInt = jsonObject.getAsJsonPrimitive("type").getAsInt();
        JsonArray asJsonArray = jsonObject.getAsJsonArray("data");
        if (asJsonArray != null && asJsonArray.size() > 0) {
            int size = asJsonArray.size();
            ArrayList arrayList = new ArrayList(size);
            long j5 = -1;
            for (int i11 = 0; i11 < size; i11++) {
                HFMeasureResponse.WsHfMeasure measureFrom = measureFrom(asInt, asJsonArray.get(i11).getAsJsonObject());
                j5 = Math.max(j5, measureFrom.date);
                arrayList.add(measureFrom);
            }
            hFMeasureResponse.groupsByType.put(Integer.valueOf(asInt), Collections.unmodifiableList(arrayList));
            hFMeasureResponse.latestDate = j5;
        }
    }

    private HFMeasureResponse.WsHfMeasure measureFrom(int i11, JsonObject jsonObject) {
        return new HFMeasureResponse.WsHfMeasure(jsonObject.getAsJsonPrimitive("date").getAsLong(), i11, 0, jsonObject.getAsJsonPrimitive("value").getAsDouble());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public HFMeasureResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        HFMeasureResponse hFMeasureResponse = new HFMeasureResponse();
        JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("series");
        if (asJsonArray != null && asJsonArray.size() > 0) {
            int size = asJsonArray.size();
            hFMeasureResponse.groupsByType = new TreeMap();
            for (int i11 = 0; i11 < size; i11++) {
                addSerieTo(asJsonArray.get(i11).getAsJsonObject(), hFMeasureResponse);
            }
            return hFMeasureResponse;
        }
        hFMeasureResponse.groupsByType = Collections.emptyMap();
        return hFMeasureResponse;
    }
}
