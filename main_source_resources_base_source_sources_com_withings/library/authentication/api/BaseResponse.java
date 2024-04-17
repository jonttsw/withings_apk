package com.withings.library.authentication.api;

import androidx.compose.material3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jivesoftware.smack.packet.Message;
/* compiled from: BaseResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b$\u0010%B7\b\u0017\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010\u0012¨\u0006,"}, d2 = {"Lcom/withings/library/authentication/api/BaseResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/BaseResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "component3", "()Lkotlinx/serialization/json/JsonElement;", "status", "error", Message.BODY, "copy", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/withings/library/authentication/api/BaseResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatus", "Ljava/lang/String;", "getError", "Lkotlinx/serialization/json/JsonElement;", "getBody", "<init>", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class BaseResponse {
    public static final Companion Companion = new Companion(null);
    private final JsonElement body;
    private final String error;
    private final int status;

    /* compiled from: BaseResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/BaseResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/BaseResponse;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<BaseResponse> serializer() {
            return BaseResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BaseResponse(int i11, int i12, String str, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, BaseResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = i12;
        this.error = str;
        this.body = jsonElement;
    }

    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, int i11, String str, JsonElement jsonElement, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = baseResponse.status;
        }
        if ((i12 & 2) != 0) {
            str = baseResponse.error;
        }
        if ((i12 & 4) != 0) {
            jsonElement = baseResponse.body;
        }
        return baseResponse.copy(i11, str, jsonElement);
    }

    public static final /* synthetic */ void write$Self(BaseResponse baseResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, baseResponse.status);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, baseResponse.error);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, baseResponse.body);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.error;
    }

    public final JsonElement component3() {
        return this.body;
    }

    public final BaseResponse copy(int i11, String str, JsonElement jsonElement) {
        return new BaseResponse(i11, str, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (this.status == baseResponse.status && u.e(this.error, baseResponse.error) && u.e(this.body, baseResponse.body)) {
            return true;
        }
        return false;
    }

    public final JsonElement getBody() {
        return this.body;
    }

    public final String getError() {
        return this.error;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.status) * 31;
        String str = this.error;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        JsonElement jsonElement = this.body;
        if (jsonElement != null) {
            i11 = jsonElement.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        int i11 = this.status;
        String str = this.error;
        JsonElement jsonElement = this.body;
        StringBuilder a11 = d.a("BaseResponse(status=", i11, ", error=", str, ", body=");
        a11.append(jsonElement);
        a11.append(")");
        return a11.toString();
    }

    public BaseResponse(int i11, String str, JsonElement jsonElement) {
        this.status = i11;
        this.error = str;
        this.body = jsonElement;
    }
}
