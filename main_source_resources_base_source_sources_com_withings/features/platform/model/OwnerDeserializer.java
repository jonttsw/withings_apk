package com.withings.features.platform.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: OwnerDeserializer.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/withings/features/platform/model/OwnerDeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/withings/features/platform/model/Owner;", "Lcom/google/gson/JsonDeserializer;", "Lcom/google/gson/JsonObject;", "ownerJsonObject", "deserializeOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/features/platform/model/Owner;", "Lcom/withings/features/platform/model/AccountOwner;", "getAccountOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/features/platform/model/AccountOwner;", "Lcom/withings/features/platform/model/DeviceOwner;", "getDeviceOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/features/platform/model/DeviceOwner;", "Lcom/withings/features/platform/model/UserOwner;", "getUserOwner", "(Lcom/google/gson/JsonObject;)Lcom/withings/features/platform/model/UserOwner;", "Lnm0/y;", "updateFromJson", "(Lcom/withings/features/platform/model/Owner;Lcom/google/gson/JsonObject;)V", "Lcom/google/gson/JsonElement;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/withings/features/platform/model/Owner;", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "serialize", "(Lcom/withings/features/platform/model/Owner;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OwnerDeserializer implements JsonSerializer<Owner>, JsonDeserializer<Owner> {
    private final Owner deserializeOwner(JsonObject jsonObject) {
        if (jsonObject.get("accountid") != null) {
            return getAccountOwner(jsonObject);
        }
        if (jsonObject.get("userid") != null) {
            return getUserOwner(jsonObject);
        }
        return getDeviceOwner(jsonObject);
    }

    private final AccountOwner getAccountOwner(JsonObject jsonObject) {
        AccountOwner accountOwner = new AccountOwner(null, false, false, false, 0L, null, null, null, false, 511, null);
        accountOwner.setAccountId(Long.valueOf(jsonObject.get("accountid").getAsLong()));
        updateFromJson(accountOwner, jsonObject);
        return accountOwner;
    }

    private final DeviceOwner getDeviceOwner(JsonObject jsonObject) {
        DeviceOwner deviceOwner = new DeviceOwner(null, false, false, false, 0L, null, null, null, false, 511, null);
        deviceOwner.setDeviceId(Long.valueOf(jsonObject.get("deviceid").getAsLong()));
        updateFromJson(deviceOwner, jsonObject);
        return deviceOwner;
    }

    private final UserOwner getUserOwner(JsonObject jsonObject) {
        Long l5;
        UserOwner userOwner = new UserOwner(null, null, false, false, false, 0L, null, null, null, false, 1023, null);
        userOwner.setUserId(Long.valueOf(jsonObject.get("userid").getAsLong()));
        JsonElement jsonElement = jsonObject.get("deviceid");
        if (jsonElement != null) {
            l5 = Long.valueOf(jsonElement.getAsLong());
        } else {
            l5 = null;
        }
        userOwner.setDeviceId(l5);
        updateFromJson(userOwner, jsonObject);
        return userOwner;
    }

    private final void updateFromJson(Owner owner, JsonObject jsonObject) {
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
        owner.setActive(z5);
        JsonElement jsonElement2 = jsonObject.get("write");
        if (jsonElement2 != null) {
            z11 = jsonElement2.getAsBoolean();
        } else {
            z11 = false;
        }
        owner.setWrite(z11);
        JsonElement jsonElement3 = jsonObject.get("activable");
        if (jsonElement3 != null) {
            z12 = jsonElement3.getAsBoolean();
        } else {
            z12 = false;
        }
        owner.setActivable(z12);
        JsonElement jsonElement4 = jsonObject.get("startdate");
        Long l6 = null;
        if (jsonElement4 != null) {
            l5 = Long.valueOf(jsonElement4.getAsLong());
        } else {
            l5 = null;
        }
        owner.setStartDate(l5);
        JsonElement jsonElement5 = jsonObject.get("enddate");
        if (jsonElement5 != null) {
            l6 = Long.valueOf(jsonElement5.getAsLong());
        }
        owner.setEndDate(l6);
        JsonElement jsonElement6 = jsonObject.get("modified");
        if (jsonElement6 != null) {
            j5 = jsonElement6.getAsLong();
        } else {
            j5 = 0;
        }
        owner.setModified(j5);
        JsonElement jsonElement7 = jsonObject.get("frequency");
        if (jsonElement7 != null) {
            i11 = Integer.valueOf(jsonElement7.getAsInt());
        } else {
            i11 = 0;
        }
        owner.setFrequency(i11);
        JsonElement jsonElement8 = jsonObject.get("tutorial");
        if (jsonElement8 != null) {
            z13 = jsonElement8.getAsBoolean();
        }
        owner.setTutorialSeen(z13);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Owner deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        u.i(asJsonObject, "getAsJsonObject(...)");
        return deserializeOwner(asJsonObject);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Owner owner, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (owner != null) {
            jsonObject.addProperty("active", Boolean.valueOf(owner.getActive()));
            jsonObject.addProperty("write", Boolean.valueOf(owner.getWrite()));
            jsonObject.addProperty("activable", Boolean.valueOf(owner.getActive()));
            jsonObject.addProperty("startdate", owner.getStartDate());
            jsonObject.addProperty("enddate", owner.getEndDate());
            jsonObject.addProperty("modified", Long.valueOf(owner.getModified()));
            jsonObject.addProperty("frequency", owner.getFrequency());
            jsonObject.addProperty("tutorial", Boolean.valueOf(owner.isTutorialSeen()));
            if (owner instanceof UserOwner) {
                UserOwner userOwner = (UserOwner) owner;
                jsonObject.addProperty("userid", userOwner.getUserId());
                jsonObject.addProperty("deviceid", userOwner.getDeviceId());
            } else if (owner instanceof AccountOwner) {
                jsonObject.addProperty("accountid", ((AccountOwner) owner).getAccountId());
            } else if (owner instanceof DeviceOwner) {
                jsonObject.addProperty("deviceid", ((DeviceOwner) owner).getDeviceId());
            }
        }
        return jsonObject;
    }
}
