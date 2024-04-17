package com.withings.library.authentication.api.account.partnersession;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import androidx.work.impl.g;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.login.SessionKt;
import com.withings.library.authentication.utils.TimeKt;
import ep0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: PartnerSessionResponse.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 C2\u00020\u0001:\u0002DCBK\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b=\u0010>Bo\b\u0017\u0012\u0006\u0010?\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\b\u0001\u0010\u0019\u001a\u00020\n\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b=\u0010BJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ`\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J(\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&HÇ\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0004R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u0004R \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\bR \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010+\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u0004R \u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010\fR\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b;\u0010\u000fR \u0010\u0019\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00106\u0012\u0004\b<\u0010.\u001a\u0004\b\u0019\u0010\f¨\u0006E"}, d2 = {"Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;", "", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/withings/library/authentication/api/account/partnersession/PartnerAccount;", "component3", "()Lcom/withings/library/authentication/api/account/partnersession/PartnerAccount;", "component4", "", "component5", "()Z", "", "component6", "()J", "component7", "component8", "providerToken", "sessionId", "account", "authToken", "requireSecureSession", "timeToLive", "creationTime", "isSecured", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/account/partnersession/PartnerAccount;Ljava/lang/String;ZJJZ)Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getProviderToken", "getProviderToken$annotations", "()V", "getSessionId", "getSessionId$annotations", "Lcom/withings/library/authentication/api/account/partnersession/PartnerAccount;", "getAccount", "getAccount$annotations", "getAuthToken", "getAuthToken$annotations", "Z", "getRequireSecureSession", "getRequireSecureSession$annotations", "J", "getTimeToLive", "getCreationTime", "isSecured$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/account/partnersession/PartnerAccount;Ljava/lang/String;ZJJZ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/account/partnersession/PartnerAccount;Ljava/lang/String;ZJJZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class PartnerSession {
    public static final Companion Companion = new Companion(null);
    private final PartnerAccount account;
    private final String authToken;
    private final long creationTime;
    private final boolean isSecured;
    private final String providerToken;
    private final boolean requireSecureSession;
    private final String sessionId;
    private final long timeToLive;

    /* compiled from: PartnerSessionResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/partnersession/PartnerSession$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<PartnerSession> serializer() {
            return PartnerSession$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PartnerSession(int i11, String str, String str2, PartnerAccount partnerAccount, String str3, boolean z5, long j5, long j11, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        if (159 != (i11 & ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT)) {
            PluginExceptionsKt.throwMissingFieldException(i11, ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT, PartnerSession$$serializer.INSTANCE.getDescriptor());
        }
        this.providerToken = str;
        this.sessionId = str2;
        this.account = partnerAccount;
        this.authToken = str3;
        this.requireSecureSession = z5;
        if ((i11 & 32) == 0) {
            this.timeToLive = a.i(SessionKt.getSESSION_TIME_TO_LIVE());
        } else {
            this.timeToLive = j5;
        }
        if ((i11 & 64) == 0) {
            this.creationTime = TimeKt.getSystemTimeInMillis();
        } else {
            this.creationTime = j11;
        }
        this.isSecured = z11;
    }

    public static /* synthetic */ PartnerSession copy$default(PartnerSession partnerSession, String str, String str2, PartnerAccount partnerAccount, String str3, boolean z5, long j5, long j11, boolean z11, int i11, Object obj) {
        String str4;
        String str5;
        PartnerAccount partnerAccount2;
        String str6;
        boolean z12;
        long j12;
        long j13;
        boolean z13;
        if ((i11 & 1) != 0) {
            str4 = partnerSession.providerToken;
        } else {
            str4 = str;
        }
        if ((i11 & 2) != 0) {
            str5 = partnerSession.sessionId;
        } else {
            str5 = str2;
        }
        if ((i11 & 4) != 0) {
            partnerAccount2 = partnerSession.account;
        } else {
            partnerAccount2 = partnerAccount;
        }
        if ((i11 & 8) != 0) {
            str6 = partnerSession.authToken;
        } else {
            str6 = str3;
        }
        if ((i11 & 16) != 0) {
            z12 = partnerSession.requireSecureSession;
        } else {
            z12 = z5;
        }
        if ((i11 & 32) != 0) {
            j12 = partnerSession.timeToLive;
        } else {
            j12 = j5;
        }
        if ((i11 & 64) != 0) {
            j13 = partnerSession.creationTime;
        } else {
            j13 = j11;
        }
        if ((i11 & 128) != 0) {
            z13 = partnerSession.isSecured;
        } else {
            z13 = z11;
        }
        return partnerSession.copy(str4, str5, partnerAccount2, str6, z12, j12, j13, z13);
    }

    public static final /* synthetic */ void write$Self(PartnerSession partnerSession, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, partnerSession.providerToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, partnerSession.sessionId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PartnerAccount$$serializer.INSTANCE, partnerSession.account);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, partnerSession.authToken);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, partnerSession.requireSecureSession);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || partnerSession.timeToLive != a.i(SessionKt.getSESSION_TIME_TO_LIVE())) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, partnerSession.timeToLive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || partnerSession.creationTime != TimeKt.getSystemTimeInMillis()) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, partnerSession.creationTime);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, partnerSession.isSecured);
    }

    public final String component1() {
        return this.providerToken;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final PartnerAccount component3() {
        return this.account;
    }

    public final String component4() {
        return this.authToken;
    }

    public final boolean component5() {
        return this.requireSecureSession;
    }

    public final long component6() {
        return this.timeToLive;
    }

    public final long component7() {
        return this.creationTime;
    }

    public final boolean component8() {
        return this.isSecured;
    }

    public final PartnerSession copy(String providerToken, String sessionId, PartnerAccount account, String authToken, boolean z5, long j5, long j11, boolean z11) {
        u.j(providerToken, "providerToken");
        u.j(sessionId, "sessionId");
        u.j(account, "account");
        u.j(authToken, "authToken");
        return new PartnerSession(providerToken, sessionId, account, authToken, z5, j5, j11, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartnerSession)) {
            return false;
        }
        PartnerSession partnerSession = (PartnerSession) obj;
        if (u.e(this.providerToken, partnerSession.providerToken) && u.e(this.sessionId, partnerSession.sessionId) && u.e(this.account, partnerSession.account) && u.e(this.authToken, partnerSession.authToken) && this.requireSecureSession == partnerSession.requireSecureSession && this.timeToLive == partnerSession.timeToLive && this.creationTime == partnerSession.creationTime && this.isSecured == partnerSession.isSecured) {
            return true;
        }
        return false;
    }

    public final PartnerAccount getAccount() {
        return this.account;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final boolean getRequireSecureSession() {
        return this.requireSecureSession;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimeToLive() {
        return this.timeToLive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c11 = d.c(this.authToken, (this.account.hashCode() + d.c(this.sessionId, this.providerToken.hashCode() * 31, 31)) * 31, 31);
        boolean z5 = this.requireSecureSession;
        int i11 = 1;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int a11 = c.a(this.creationTime, c.a(this.timeToLive, (c11 + i12) * 31, 31), 31);
        boolean z11 = this.isSecured;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return a11 + i11;
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    public String toString() {
        String str = this.providerToken;
        String str2 = this.sessionId;
        PartnerAccount partnerAccount = this.account;
        String str3 = this.authToken;
        boolean z5 = this.requireSecureSession;
        long j5 = this.timeToLive;
        long j11 = this.creationTime;
        boolean z11 = this.isSecured;
        StringBuilder b10 = l0.b("PartnerSession(providerToken=", str, ", sessionId=", str2, ", account=");
        b10.append(partnerAccount);
        b10.append(", authToken=");
        b10.append(str3);
        b10.append(", requireSecureSession=");
        b10.append(z5);
        b10.append(", timeToLive=");
        b10.append(j5);
        g.d(b10, ", creationTime=", j11, ", isSecured=");
        return h.d(b10, z11, ")");
    }

    public PartnerSession(String providerToken, String sessionId, PartnerAccount account, String authToken, boolean z5, long j5, long j11, boolean z11) {
        u.j(providerToken, "providerToken");
        u.j(sessionId, "sessionId");
        u.j(account, "account");
        u.j(authToken, "authToken");
        this.providerToken = providerToken;
        this.sessionId = sessionId;
        this.account = account;
        this.authToken = authToken;
        this.requireSecureSession = z5;
        this.timeToLive = j5;
        this.creationTime = j11;
        this.isSecured = z11;
    }

    public /* synthetic */ PartnerSession(String str, String str2, PartnerAccount partnerAccount, String str3, boolean z5, long j5, long j11, boolean z11, int i11, m mVar) {
        this(str, str2, partnerAccount, str3, z5, (i11 & 32) != 0 ? a.i(SessionKt.getSESSION_TIME_TO_LIVE()) : j5, (i11 & 64) != 0 ? TimeKt.getSystemTimeInMillis() : j11, z11);
    }

    public static /* synthetic */ void getAccount$annotations() {
    }

    public static /* synthetic */ void getAuthToken$annotations() {
    }

    public static /* synthetic */ void getProviderToken$annotations() {
    }

    public static /* synthetic */ void getRequireSecureSession$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void isSecured$annotations() {
    }
}
