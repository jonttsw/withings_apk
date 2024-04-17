package com.withings.measure.android.data.ws;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import my.b;
import nm0.j;
/* compiled from: JsonConverters.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withings/measure/android/data/ws/HFMeasureResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lmy/b;", "Lcom/google/gson/JsonObject;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lmy/b$a;", "deserializeWsHfMeasure", "(Lcom/google/gson/JsonObject;)Lmy/b$a;", "Lcom/google/gson/JsonElement;", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lmy/b;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HFMeasureResponseDeserializer implements JsonDeserializer<b> {
    private final b.a deserializeWsHfMeasure(JsonObject jsonObject) {
        return new b.a(jsonObject.get("date").getAsLong(), jsonObject.get("type").getAsInt(), jsonObject.get("value").getAsDouble());
    }

    @Override // com.google.gson.JsonDeserializer
    public b deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        List list;
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        JsonArray asJsonArray = json.getAsJsonObject().getAsJsonArray("series");
        List list2 = i0.f76187a;
        List list3 = null;
        if (asJsonArray != null) {
            List arrayList = new ArrayList(x.y(asJsonArray, 10));
            for (JsonElement jsonElement : asJsonArray) {
                int asInt = jsonElement.getAsJsonObject().get("type").getAsInt();
                JsonArray<JsonElement> asJsonArray2 = jsonElement.getAsJsonObject().getAsJsonArray("data");
                if (asJsonArray2 != null) {
                    list = new ArrayList(x.y(asJsonArray2, 10));
                    for (JsonElement jsonElement2 : asJsonArray2) {
                        JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                        u.i(asJsonObject, "getAsJsonObject(...)");
                        list.add(deserializeWsHfMeasure(asJsonObject));
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = list2;
                }
                arrayList.add(new j(Integer.valueOf(asInt), list));
            }
            list3 = arrayList;
        }
        if (list3 != null) {
            list2 = list3;
        }
        Map p11 = s0.p(list2);
        Iterator it = p11.entrySet().iterator();
        if (it.hasNext()) {
            Iterator it2 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
            if (it2.hasNext()) {
                long a11 = ((b.a) it2.next()).a();
                while (it2.hasNext()) {
                    long a12 = ((b.a) it2.next()).a();
                    if (a11 < a12) {
                        a11 = a12;
                    }
                }
                while (it.hasNext()) {
                    Iterator it3 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    long a13 = ((b.a) it3.next()).a();
                    while (it3.hasNext()) {
                        long a14 = ((b.a) it3.next()).a();
                        if (a13 < a14) {
                            a13 = a14;
                        }
                    }
                    if (a11 < a13) {
                        a11 = a13;
                    }
                }
                return new b(a11, p11);
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
