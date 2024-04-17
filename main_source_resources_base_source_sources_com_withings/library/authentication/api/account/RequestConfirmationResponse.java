package com.withings.library.authentication.api.account;

import androidx.fragment.app.o;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: RequestConfirmationResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dB'\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\f¨\u0006$"}, d2 = {"Lcom/withings/library/authentication/api/account/RequestConfirmationResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/RequestConfirmationResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "phoneNumber", "copy", "(Ljava/lang/String;)Lcom/withings/library/authentication/api/account/RequestConfirmationResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhoneNumber", "getPhoneNumber$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class RequestConfirmationResponse {
    public static final Companion Companion = new Companion(null);
    private final String phoneNumber;

    /* compiled from: RequestConfirmationResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/RequestConfirmationResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/RequestConfirmationResponse;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<RequestConfirmationResponse> serializer() {
            return RequestConfirmationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RequestConfirmationResponse(int i11, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, RequestConfirmationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.phoneNumber = str;
    }

    public static /* synthetic */ RequestConfirmationResponse copy$default(RequestConfirmationResponse requestConfirmationResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = requestConfirmationResponse.phoneNumber;
        }
        return requestConfirmationResponse.copy(str);
    }

    public final String component1() {
        return this.phoneNumber;
    }

    public final RequestConfirmationResponse copy(String phoneNumber) {
        u.j(phoneNumber, "phoneNumber");
        return new RequestConfirmationResponse(phoneNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RequestConfirmationResponse) && u.e(this.phoneNumber, ((RequestConfirmationResponse) obj).phoneNumber)) {
            return true;
        }
        return false;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return this.phoneNumber.hashCode();
    }

    public String toString() {
        return o.d("RequestConfirmationResponse(phoneNumber=", this.phoneNumber, ")");
    }

    public RequestConfirmationResponse(String phoneNumber) {
        u.j(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
    }

    public static /* synthetic */ void getPhoneNumber$annotations() {
    }
}
