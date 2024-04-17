package com.withings.measure.android.data.ws;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import my.c;
import my.e;
/* compiled from: JsonConverters.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/measure/android/data/ws/MeasureGroupResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lmy/c;", "Lcom/google/gson/JsonElement;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lmy/c;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasureGroupResponseDeserializer implements JsonDeserializer<c> {
    @Override // com.google.gson.JsonDeserializer
    public c deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        long asLong = asJsonObject.get("updatetime").getAsLong();
        JsonElement jsonElement = asJsonObject.get(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME);
        boolean z5 = false;
        if (jsonElement != null) {
            if (jsonElement.isJsonNull()) {
                jsonElement = null;
            }
            if (jsonElement != null && jsonElement.getAsInt() == 1) {
                z5 = true;
            }
        }
        JsonArray<JsonElement> asJsonArray = asJsonObject.getAsJsonArray("measuregrps");
        u.i(asJsonArray, "getAsJsonArray(...)");
        ArrayList arrayList = new ArrayList(x.y(asJsonArray, 10));
        for (JsonElement jsonElement2 : asJsonArray) {
            arrayList.add((e) context.deserialize(jsonElement2, e.class));
        }
        return new c(z5, arrayList, asLong);
    }
}
