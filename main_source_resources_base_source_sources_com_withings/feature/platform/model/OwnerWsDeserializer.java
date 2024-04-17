package com.withings.feature.platform.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.withings.feature.platform.model.OwnerWS;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: OwnerWsDeserializer.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWsDeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/withings/feature/platform/model/OwnerWS;", "Lcom/google/gson/JsonDeserializer;", "Lcom/google/gson/JsonObject;", "ownerJsonObject", "deserializeOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/feature/platform/model/OwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS$AccountOwnerWS;", "getAccountOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/feature/platform/model/OwnerWS$AccountOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS$DeviceOwnerWS;", "getDeviceOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/feature/platform/model/OwnerWS$DeviceOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS$UserOwnerWS;", "getUserOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/feature/platform/model/OwnerWS$UserOwnerWS;", "Lnm0/y;", "updateFromJson", "(Lcom/withings/feature/platform/model/OwnerWS;Lcom/google/gson/JsonObject;)V", "Lcom/google/gson/JsonElement;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/withings/feature/platform/model/OwnerWS;", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "serialize", "(Lcom/withings/feature/platform/model/OwnerWS;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OwnerWsDeserializer implements JsonSerializer<OwnerWS>, JsonDeserializer<OwnerWS> {
    public static final OwnerWsDeserializer INSTANCE = new OwnerWsDeserializer();

    private OwnerWsDeserializer() {
    }

    private final OwnerWS deserializeOwner(JsonObject jsonObject) {
        if (jsonObject.get("accountid") != null) {
            return getAccountOwner(jsonObject);
        }
        if (jsonObject.get("userid") != null) {
            return getUserOwner(jsonObject);
        }
        return getDeviceOwner(jsonObject);
    }

    private final OwnerWS.AccountOwnerWS getAccountOwner(JsonObject jsonObject) {
        OwnerWS.AccountOwnerWS accountOwnerWS = new OwnerWS.AccountOwnerWS(null, false, false, false, 0L, null, null, null, false, 511, null);
        accountOwnerWS.setAccountId(Long.valueOf(jsonObject.get("accountid").getAsLong()));
        INSTANCE.updateFromJson(accountOwnerWS, jsonObject);
        return accountOwnerWS;
    }

    private final OwnerWS.DeviceOwnerWS getDeviceOwner(JsonObject jsonObject) {
        OwnerWS.DeviceOwnerWS deviceOwnerWS = new OwnerWS.DeviceOwnerWS(null, false, false, false, 0L, null, null, null, false, 511, null);
        deviceOwnerWS.setDeviceId(Long.valueOf(jsonObject.get("deviceid").getAsLong()));
        INSTANCE.updateFromJson(deviceOwnerWS, jsonObject);
        return deviceOwnerWS;
    }

    private final OwnerWS.UserOwnerWS getUserOwner(JsonObject jsonObject) {
        Long l5;
        OwnerWS.UserOwnerWS userOwnerWS = new OwnerWS.UserOwnerWS(null, null, false, false, false, 0L, null, null, null, false, 1023, null);
        userOwnerWS.setUserId(Long.valueOf(jsonObject.get("userid").getAsLong()));
        JsonElement jsonElement = jsonObject.get("deviceid");
        if (jsonElement != null) {
            l5 = Long.valueOf(jsonElement.getAsLong());
        } else {
            l5 = null;
        }
        userOwnerWS.setDeviceId(l5);
        INSTANCE.updateFromJson(userOwnerWS, jsonObject);
        return userOwnerWS;
    }

    private final void updateFromJson(OwnerWS ownerWS, JsonObject jsonObject) {
        boolean z5;
        boolean z11;
        boolean z12;
        Long l5;
        long j5;
        int i11;
        JsonElement jsonElement = jsonObject.get("active");
        boolean z13 = false;
        if (jsonElement != null) {
            z5 = jsonElement.getAsBoolean();
        } else {
            z5 = false;
        }
        ownerWS.setActive(z5);
        JsonElement jsonElement2 = jsonObject.get("write");
        if (jsonElement2 != null) {
            z11 = jsonElement2.getAsBoolean();
        } else {
            z11 = false;
        }
        ownerWS.setWrite(z11);
        JsonElement jsonElement3 = jsonObject.get("activable");
        if (jsonElement3 != null) {
            z12 = jsonElement3.getAsBoolean();
        } else {
            z12 = false;
        }
        ownerWS.setActivable(z12);
        JsonElement jsonElement4 = jsonObject.get("startdate");
        Long l6 = null;
        if (jsonElement4 != null) {
            l5 = Long.valueOf(jsonElement4.getAsLong());
        } else {
            l5 = null;
        }
        ownerWS.setStartDate(l5);
        JsonElement jsonElement5 = jsonObject.get("enddate");
        if (jsonElement5 != null) {
            l6 = Long.valueOf(jsonElement5.getAsLong());
        }
        ownerWS.setEndDate(l6);
        JsonElement jsonElement6 = jsonObject.get("modified");
        if (jsonElement6 != null) {
            j5 = jsonElement6.getAsLong();
        } else {
            j5 = 0;
        }
        ownerWS.setModified(j5);
        JsonElement jsonElement7 = jsonObject.get("frequency");
        if (jsonElement7 != null) {
            i11 = Integer.valueOf(jsonElement7.getAsInt());
        } else {
            i11 = 0;
        }
        ownerWS.setFrequency(i11);
        JsonElement jsonElement8 = jsonObject.get("tutorial");
        if (jsonElement8 != null) {
            z13 = jsonElement8.getAsBoolean();
        }
        ownerWS.setTutorialSeen(z13);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public OwnerWS deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        u.i(asJsonObject, "getAsJsonObject(...)");
        return deserializeOwner(asJsonObject);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(OwnerWS ownerWS, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (ownerWS != null) {
            jsonObject.addProperty("active", Boolean.valueOf(ownerWS.getActive()));
            jsonObject.addProperty("write", Boolean.valueOf(ownerWS.getWrite()));
            jsonObject.addProperty("activable", Boolean.valueOf(ownerWS.getActive()));
            jsonObject.addProperty("startdate", ownerWS.getStartDate());
            jsonObject.addProperty("enddate", ownerWS.getEndDate());
            jsonObject.addProperty("modified", Long.valueOf(ownerWS.getModified()));
            jsonObject.addProperty("frequency", ownerWS.getFrequency());
            jsonObject.addProperty("tutorial", Boolean.valueOf(ownerWS.isTutorialSeen()));
            if (ownerWS instanceof OwnerWS.UserOwnerWS) {
                OwnerWS.UserOwnerWS userOwnerWS = (OwnerWS.UserOwnerWS) ownerWS;
                jsonObject.addProperty("userid", userOwnerWS.getUserId());
                jsonObject.addProperty("deviceid", userOwnerWS.getDeviceId());
            } else if (ownerWS instanceof OwnerWS.AccountOwnerWS) {
                jsonObject.addProperty("accountid", ((OwnerWS.AccountOwnerWS) ownerWS).getAccountId());
            } else if (ownerWS instanceof OwnerWS.DeviceOwnerWS) {
                jsonObject.addProperty("deviceid", ((OwnerWS.DeviceOwnerWS) ownerWS).getDeviceId());
            }
        }
        return jsonObject;
    }
}
