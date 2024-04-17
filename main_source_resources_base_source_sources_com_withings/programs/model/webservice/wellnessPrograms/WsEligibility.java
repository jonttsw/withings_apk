package com.withings.programs.model.webservice.wellnessPrograms;

import com.google.gson.annotations.SerializedName;
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
/* compiled from: WsEligibility.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b \u0010!B-\b\u0011\u0012\u0006\u0010\"\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006("}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Z", "", "component2", "()Ljava/lang/String;", "status", "url", "copy", "(ZLjava/lang/String;)Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getStatus", "Ljava/lang/String;", "getUrl", "<init>", "(ZLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsEligibility {
    public static final Companion Companion = new Companion(null);
    @SerializedName("status")
    private final boolean status;
    @SerializedName("url")
    private final String url;

    /* compiled from: WsEligibility.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsEligibility> serializer() {
            return WsEligibility$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsEligibility(int i11, boolean z5, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, WsEligibility$$serializer.INSTANCE.getDescriptor());
        }
        this.status = z5;
        if ((i11 & 2) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
    }

    public static /* synthetic */ WsEligibility copy$default(WsEligibility wsEligibility, boolean z5, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = wsEligibility.status;
        }
        if ((i11 & 2) != 0) {
            str = wsEligibility.url;
        }
        return wsEligibility.copy(z5, str);
    }

    public static final /* synthetic */ void write$Self$android_release(WsEligibility wsEligibility, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, wsEligibility.status);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || wsEligibility.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, wsEligibility.url);
        }
    }

    public final boolean component1() {
        return this.status;
    }

    public final String component2() {
        return this.url;
    }

    public final WsEligibility copy(boolean z5, String str) {
        return new WsEligibility(z5, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsEligibility)) {
            return false;
        }
        WsEligibility wsEligibility = (WsEligibility) obj;
        if (this.status == wsEligibility.status && u.e(this.url, wsEligibility.url)) {
            return true;
        }
        return false;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.status) * 31;
        String str = this.url;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        boolean z5 = this.status;
        String str = this.url;
        return "WsEligibility(status=" + z5 + ", url=" + str + ")";
    }

    public WsEligibility(boolean z5, String str) {
        this.status = z5;
        this.url = str;
    }

    public /* synthetic */ WsEligibility(boolean z5, String str, int i11, m mVar) {
        this(z5, (i11 & 2) != 0 ? null : str);
    }
}
