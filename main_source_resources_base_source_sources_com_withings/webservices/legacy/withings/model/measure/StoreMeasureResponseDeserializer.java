package com.withings.webservices.legacy.withings.model.measure;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class StoreMeasureResponseDeserializer implements JsonDeserializer<StoreMeasureResponse> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public StoreMeasureResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        StoreMeasureResponse storeMeasureResponse = new StoreMeasureResponse();
        storeMeasureResponse.grpid = v1.p0(jsonElement, "measuregrps.grpid", -1L);
        return storeMeasureResponse;
    }
}
