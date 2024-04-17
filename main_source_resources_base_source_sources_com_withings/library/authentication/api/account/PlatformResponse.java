package com.withings.library.authentication.api.account;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: CloudResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b!\u0010\"B1\b\u0017\u0012\u0006\u0010#\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\fR \u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u000f¨\u0006)"}, d2 = {"Lcom/withings/library/authentication/api/account/PlatformResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/PlatformResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "platformId", "platformUrl", "copy", "(ILjava/lang/String;)Lcom/withings/library/authentication/api/account/PlatformResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPlatformId", "getPlatformId$annotations", "()V", "Ljava/lang/String;", "getPlatformUrl", "getPlatformUrl$annotations", "<init>", "(ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class PlatformResponse {
    public static final Companion Companion = new Companion(null);
    private final int platformId;
    private final String platformUrl;

    /* compiled from: CloudResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/PlatformResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/PlatformResponse;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<PlatformResponse> serializer() {
            return PlatformResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlatformResponse(int i11, int i12, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, PlatformResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.platformId = i12;
        this.platformUrl = str;
    }

    public static /* synthetic */ PlatformResponse copy$default(PlatformResponse platformResponse, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = platformResponse.platformId;
        }
        if ((i12 & 2) != 0) {
            str = platformResponse.platformUrl;
        }
        return platformResponse.copy(i11, str);
    }

    public static final /* synthetic */ void write$Self(PlatformResponse platformResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, platformResponse.platformId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, platformResponse.platformUrl);
    }

    public final int component1() {
        return this.platformId;
    }

    public final String component2() {
        return this.platformUrl;
    }

    public final PlatformResponse copy(int i11, String platformUrl) {
        u.j(platformUrl, "platformUrl");
        return new PlatformResponse(i11, platformUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformResponse)) {
            return false;
        }
        PlatformResponse platformResponse = (PlatformResponse) obj;
        if (this.platformId == platformResponse.platformId && u.e(this.platformUrl, platformResponse.platformUrl)) {
            return true;
        }
        return false;
    }

    public final int getPlatformId() {
        return this.platformId;
    }

    public final String getPlatformUrl() {
        return this.platformUrl;
    }

    public int hashCode() {
        return this.platformUrl.hashCode() + (Integer.hashCode(this.platformId) * 31);
    }

    public String toString() {
        int i11 = this.platformId;
        String str = this.platformUrl;
        return "PlatformResponse(platformId=" + i11 + ", platformUrl=" + str + ")";
    }

    public PlatformResponse(int i11, String platformUrl) {
        u.j(platformUrl, "platformUrl");
        this.platformId = i11;
        this.platformUrl = platformUrl;
    }

    public static /* synthetic */ void getPlatformId$annotations() {
    }

    public static /* synthetic */ void getPlatformUrl$annotations() {
    }
}
