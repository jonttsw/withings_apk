package com.withings.webservices.legacy.withings.model.measure;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.webservices.legacy.withings.model.measure.MeasureGroupResponse;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class MeasureGroupResponseDeserializer implements JsonDeserializer<MeasureGroupResponse> {
    private MeasureGroupResponse.WsMeasure getMeasure(JsonObject jsonObject) {
        return new MeasureGroupResponse.WsMeasure(jsonObject.getAsJsonPrimitive("type").getAsInt(), jsonObject.getAsJsonPrimitive(HealthConstants.FoodIntake.UNIT).getAsInt(), jsonObject.getAsJsonPrimitive("value").getAsDouble());
    }

    private MeasureGroupResponse.WsMeasureGroup getMeasureGroup(JsonObject jsonObject) {
        boolean z5;
        JsonArray asJsonArray = jsonObject.getAsJsonArray("measures");
        long asLong = jsonObject.getAsJsonPrimitive("grpid").getAsLong();
        int asInt = jsonObject.getAsJsonPrimitive("attrib").getAsInt();
        long asLong2 = 1000 * jsonObject.getAsJsonPrimitive("date").getAsLong();
        long asLong3 = jsonObject.getAsJsonPrimitive("modified").getAsLong();
        int asInt2 = jsonObject.getAsJsonPrimitive("category").getAsInt();
        String r02 = v1.r0(jsonObject, "comment", null);
        if (v1.o0(0, "deleted", jsonObject) > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        int size = asJsonArray.size();
        MeasureGroupResponse.WsMeasure[] wsMeasureArr = new MeasureGroupResponse.WsMeasure[size];
        for (int i11 = 0; i11 < size; i11++) {
            wsMeasureArr[i11] = getMeasure(asJsonArray.get(i11).getAsJsonObject());
        }
        return new MeasureGroupResponse.WsMeasureGroup(asLong, asInt, asLong2, asLong3, asInt2, r02, z5, wsMeasureArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public MeasureGroupResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (v1.o0(1, "deleted", jsonElement) == 0) {
            return new MeasureGroupResponse();
        }
        long asLong = jsonElement.getAsJsonObject().getAsJsonPrimitive("updatetime").getAsLong() * 1000;
        int o02 = v1.o0(0, GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, jsonElement);
        JsonArray asJsonArray = jsonElement.getAsJsonObject().get("measuregrps").getAsJsonArray();
        int size = asJsonArray.size();
        MeasureGroupResponse.WsMeasureGroup[] wsMeasureGroupArr = new MeasureGroupResponse.WsMeasureGroup[size];
        for (int i11 = 0; i11 < size; i11++) {
            wsMeasureGroupArr[i11] = getMeasureGroup(asJsonArray.get(i11).getAsJsonObject());
        }
        return new MeasureGroupResponse(asLong, o02 == 1, wsMeasureGroupArr);
    }
}
