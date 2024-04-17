package com.withings.features.platform.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.OwnerDeserializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: FeatureRoomConverter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/withings/features/platform/api/FeatureRoomConverter;", "", "()V", "ownersToString", "", "owners", "", "Lcom/withings/features/platform/model/Owner;", "stringToOwners", "data", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureRoomConverter {
    public final String ownersToString(List<? extends Owner> owners) {
        u.j(owners, "owners");
        String json = new Gson().toJson(owners);
        u.i(json, "toJson(...)");
        return json;
    }

    public final List<Owner> stringToOwners(String data) {
        u.j(data, "data");
        Object fromJson = new GsonBuilder().registerTypeAdapter(Owner.class, new OwnerDeserializer()).create().fromJson(data, new TypeToken<ArrayList<Owner>>() { // from class: com.withings.features.platform.api.FeatureRoomConverter$stringToOwners$listType$1
        }.getType());
        u.i(fromJson, "fromJson(...)");
        return x.Q0((Iterable) fromJson);
    }
}
