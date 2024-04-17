package com.withings.measure.android.data.ws;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import my.a;
/* compiled from: JsonConverters.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/measure/android/data/ws/BatchStoreMeasureResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lmy/a;", "Lcom/google/gson/JsonElement;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lmy/a;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BatchStoreMeasureResponseDeserializer implements JsonDeserializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public a deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        long asLong = json.getAsJsonObject().get("updatetime").getAsLong();
        JsonArray asJsonArray = json.getAsJsonObject().getAsJsonArray("measuregrps");
        u.i(asJsonArray, "getAsJsonArray(...)");
        ArrayList arrayList = new ArrayList(x.y(asJsonArray, 10));
        for (JsonElement jsonElement : asJsonArray) {
            arrayList.add(new a.C1329a(jsonElement.getAsJsonObject().get(HiAnalyticsConstant.HaKey.BI_KEY_APPID).getAsLong(), jsonElement.getAsJsonObject().get("grpid").getAsLong()));
        }
        return new a(asLong, arrayList);
    }
}
