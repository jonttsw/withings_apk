package com.withings.account.network.ws;

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
/* compiled from: AccountUserDeserializer.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J&\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/withings/account/network/ws/AccountUserDeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/withings/account/network/ws/AccountUser;", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/google/gson/JsonDeserializationContext;", "deserializeAccountUser", "accountUser", "Lcom/google/gson/JsonObject;", "getExistingUser", "Lcom/withings/account/network/ws/ExistingUser;", "ownerJsonObject", "getNewUser", "Lcom/withings/account/network/ws/NewUser;", "serialize", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountUserDeserializer implements JsonSerializer<AccountUser>, JsonDeserializer<AccountUser> {
    public static final int $stable = 0;

    private final AccountUser deserializeAccountUser(JsonObject jsonObject) {
        if (jsonObject.get("account_creation_token") != null) {
            return getNewUser(jsonObject);
        }
        return getExistingUser(jsonObject);
    }

    private final ExistingUser getExistingUser(JsonObject jsonObject) {
        String str;
        String str2;
        String asString = jsonObject.get(ConstantsWs.JSON_SESSION_KEY_SESSIONID).getAsString();
        long asLong = jsonObject.get("accountid").getAsLong();
        JsonElement jsonElement = jsonObject.get("login_method");
        if (jsonElement != null) {
            str = jsonElement.getAsString();
        } else {
            str = null;
        }
        String asString2 = jsonObject.get("auth_token").getAsString();
        JsonElement jsonElement2 = jsonObject.get("token");
        if (jsonElement2 != null) {
            str2 = jsonElement2.getAsString();
        } else {
            str2 = null;
        }
        boolean asBoolean = jsonObject.get("require_secure_session").getAsBoolean();
        boolean asBoolean2 = jsonObject.get("is_secure").getAsBoolean();
        u.g(asString);
        u.g(asString2);
        return new ExistingUser(str2, asString, asLong, str, asString2, asBoolean, asBoolean2);
    }

    private final NewUser getNewUser(JsonObject jsonObject) {
        return new NewUser(jsonObject.get("account_creation_token").getAsString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public AccountUser deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        u.i(asJsonObject, "getAsJsonObject(...)");
        return deserializeAccountUser(asJsonObject);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(AccountUser accountUser, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (accountUser instanceof NewUser) {
            jsonObject.addProperty("account_creation_token", ((NewUser) accountUser).getAccountCreationToken());
        } else if (accountUser instanceof ExistingUser) {
            ExistingUser existingUser = (ExistingUser) accountUser;
            jsonObject.addProperty(ConstantsWs.JSON_SESSION_KEY_SESSIONID, existingUser.getSessionId());
            jsonObject.addProperty("accountid", Long.valueOf(existingUser.getAccountId()));
            jsonObject.addProperty("login_method", existingUser.getLoginMethod());
            jsonObject.addProperty("auth_token", existingUser.getAuthToken());
            jsonObject.addProperty("token", existingUser.getProviderToken());
            jsonObject.addProperty("require_secure_session", Boolean.valueOf(existingUser.getRequireSecureSession()));
            jsonObject.addProperty("is_secure", Boolean.valueOf(existingUser.isSecure()));
        }
        return jsonObject;
    }
}
