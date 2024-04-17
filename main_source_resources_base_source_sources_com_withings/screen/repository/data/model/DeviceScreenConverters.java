package com.withings.screen.repository.data.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: DeviceScreenEntity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J \u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\u0006H\u0007J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u000f"}, d2 = {"Lcom/withings/screen/repository/data/model/DeviceScreenConverters;", "", "()V", "deviceScreenImageToString", "", "images", "", "Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "listOfListOfIntToString", "listOfListOfInt", "", "stringToDeviceScreenImages", "data", "stringToListOfListOfInt", "string", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenConverters {
    public final String deviceScreenImageToString(List<DeviceScreenEntityImage> list) {
        Gson gson = new Gson();
        if (list == null) {
            list = i0.f76187a;
        }
        String json = gson.toJson(list);
        u.i(json, "toJson(...)");
        return json;
    }

    public final String listOfListOfIntToString(List<? extends List<Integer>> list) {
        if (list != null) {
            JsonArray jsonArray = new JsonArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JsonArray jsonArray2 = new JsonArray();
                for (Number number : (List) it.next()) {
                    jsonArray2.add(Integer.valueOf(number.intValue()));
                }
                jsonArray.add(jsonArray2);
            }
            return jsonArray.toString();
        }
        return null;
    }

    public final List<DeviceScreenEntityImage> stringToDeviceScreenImages(String str) {
        if (str != null) {
            Object fromJson = new Gson().fromJson(str, new TypeToken<List<? extends DeviceScreenEntityImage>>() { // from class: com.withings.screen.repository.data.model.DeviceScreenConverters$stringToDeviceScreenImages$1$listType$1
            }.getType());
            u.h(fromJson, "null cannot be cast to non-null type kotlin.collections.List<com.withings.screen.repository.data.model.DeviceScreenEntityImage>");
            return (List) fromJson;
        }
        return i0.f76187a;
    }

    public final List<List<Integer>> stringToListOfListOfInt(String str) {
        if (str != null) {
            JsonArray<JsonElement> asJsonArray = new JsonParser().parse(str).getAsJsonArray();
            u.i(asJsonArray, "getAsJsonArray(...)");
            ArrayList arrayList = new ArrayList(x.y(asJsonArray, 10));
            for (JsonElement jsonElement : asJsonArray) {
                JsonArray<JsonElement> asJsonArray2 = jsonElement.getAsJsonArray();
                u.i(asJsonArray2, "getAsJsonArray(...)");
                ArrayList arrayList2 = new ArrayList(x.y(asJsonArray2, 10));
                for (JsonElement jsonElement2 : asJsonArray2) {
                    arrayList2.add(Integer.valueOf(jsonElement2.getAsInt()));
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        return null;
    }
}
