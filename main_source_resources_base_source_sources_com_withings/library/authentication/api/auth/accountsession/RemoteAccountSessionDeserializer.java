package com.withings.library.authentication.api.auth.accountsession;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.login.LoginMethod;
import com.withings.library.authentication.utils.TimeKt;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
/* compiled from: RemoteAccountSessionDeserializer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSessionDeserializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/library/authentication/api/auth/accountsession/RemoteAccountSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteAccountSessionDeserializer implements KSerializer<RemoteAccountSession> {
    public static final RemoteAccountSessionDeserializer INSTANCE = new RemoteAccountSessionDeserializer();

    private RemoteAccountSessionDeserializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return SerialDescriptorsKt.buildClassSerialDescriptor$default("AccountSession", new SerialDescriptor[0], null, 4, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public RemoteAccountSession deserialize(Decoder decoder) {
        u.j(decoder, "decoder");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            JsonObject jsonObject = JsonElementKt.getJsonObject(jsonDecoder.decodeJsonElement());
            String content = JsonElementKt.getJsonPrimitive((JsonElement) s0.e(jsonObject, ConstantsWs.JSON_SESSION_KEY_SESSIONID)).getContent();
            Object obj = JsonElementKt.getJsonObject((JsonElement) x.I(JsonElementKt.getJsonArray((JsonElement) s0.e(jsonObject, "account")))).get((Object) "id");
            u.g(obj);
            long j5 = JsonElementKt.getLong(JsonElementKt.getJsonPrimitive((JsonElement) obj));
            LoginMethod fromValue = LoginMethod.Companion.fromValue(JsonElementKt.getJsonPrimitive((JsonElement) s0.e(jsonObject, "login_method")).getContent());
            boolean z5 = JsonElementKt.getBoolean(JsonElementKt.getJsonPrimitive((JsonElement) s0.e(jsonObject, "require_secure_session")));
            boolean z11 = JsonElementKt.getBoolean(JsonElementKt.getJsonPrimitive((JsonElement) s0.e(jsonObject, "is_secure")));
            return new RemoteAccountSession(content, 0L, TimeKt.getSystemTimeInMillis(), j5, null, z5, JsonElementKt.getJsonPrimitive((JsonElement) s0.e(jsonObject, "providertoken")).getContent(), jsonObject.containsKey((Object) "auth_token") ? JsonElementKt.getJsonPrimitive((JsonElement) s0.e(jsonObject, "auth_token")).getContent() : null, z11, fromValue, 18, null);
        }
        throw new IllegalStateException("Can be deserialized only by JSON".toString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, RemoteAccountSession value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        throw new IllegalStateException("Serialization is not supported".toString());
    }
}
