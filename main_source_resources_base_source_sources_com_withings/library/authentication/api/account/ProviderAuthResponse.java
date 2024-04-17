package com.withings.library.authentication.api.account;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.l0;
import com.withings.library.authentication.login.LoginMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
/* compiled from: ProviderAuthResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001'B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006("}, d2 = {"Lcom/withings/library/authentication/api/account/ProviderAuthResponse;", "", "token", "", "sessionId", "accountId", "", "authToken", "requireSecureSession", "", "isSecured", "loginMethod", "Lcom/withings/library/authentication/login/LoginMethod;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLcom/withings/library/authentication/login/LoginMethod;)V", "getAccountId", "()J", "getAuthToken", "()Ljava/lang/String;", "setAuthToken", "(Ljava/lang/String;)V", "()Z", "getLoginMethod", "()Lcom/withings/library/authentication/login/LoginMethod;", "getRequireSecureSession", "getSessionId", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable(with = ProviderAuthResponseDeserializer.class)
/* loaded from: classes4.dex */
public final class ProviderAuthResponse {
    public static final Companion Companion = new Companion(null);
    private final long accountId;
    private String authToken;
    private final boolean isSecured;
    private final LoginMethod loginMethod;
    private final boolean requireSecureSession;
    private final String sessionId;
    private final String token;

    /* compiled from: ProviderAuthResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/ProviderAuthResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/ProviderAuthResponse;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<ProviderAuthResponse> serializer() {
            return ProviderAuthResponseDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProviderAuthResponse(String token, String sessionId, long j5, String authToken, boolean z5, boolean z11, LoginMethod loginMethod) {
        u.j(token, "token");
        u.j(sessionId, "sessionId");
        u.j(authToken, "authToken");
        u.j(loginMethod, "loginMethod");
        this.token = token;
        this.sessionId = sessionId;
        this.accountId = j5;
        this.authToken = authToken;
        this.requireSecureSession = z5;
        this.isSecured = z11;
        this.loginMethod = loginMethod;
    }

    public static /* synthetic */ ProviderAuthResponse copy$default(ProviderAuthResponse providerAuthResponse, String str, String str2, long j5, String str3, boolean z5, boolean z11, LoginMethod loginMethod, int i11, Object obj) {
        String str4;
        String str5;
        long j11;
        String str6;
        boolean z12;
        boolean z13;
        LoginMethod loginMethod2;
        if ((i11 & 1) != 0) {
            str4 = providerAuthResponse.token;
        } else {
            str4 = str;
        }
        if ((i11 & 2) != 0) {
            str5 = providerAuthResponse.sessionId;
        } else {
            str5 = str2;
        }
        if ((i11 & 4) != 0) {
            j11 = providerAuthResponse.accountId;
        } else {
            j11 = j5;
        }
        if ((i11 & 8) != 0) {
            str6 = providerAuthResponse.authToken;
        } else {
            str6 = str3;
        }
        if ((i11 & 16) != 0) {
            z12 = providerAuthResponse.requireSecureSession;
        } else {
            z12 = z5;
        }
        if ((i11 & 32) != 0) {
            z13 = providerAuthResponse.isSecured;
        } else {
            z13 = z11;
        }
        if ((i11 & 64) != 0) {
            loginMethod2 = providerAuthResponse.loginMethod;
        } else {
            loginMethod2 = loginMethod;
        }
        return providerAuthResponse.copy(str4, str5, j11, str6, z12, z13, loginMethod2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final long component3() {
        return this.accountId;
    }

    public final String component4() {
        return this.authToken;
    }

    public final boolean component5() {
        return this.requireSecureSession;
    }

    public final boolean component6() {
        return this.isSecured;
    }

    public final LoginMethod component7() {
        return this.loginMethod;
    }

    public final ProviderAuthResponse copy(String token, String sessionId, long j5, String authToken, boolean z5, boolean z11, LoginMethod loginMethod) {
        u.j(token, "token");
        u.j(sessionId, "sessionId");
        u.j(authToken, "authToken");
        u.j(loginMethod, "loginMethod");
        return new ProviderAuthResponse(token, sessionId, j5, authToken, z5, z11, loginMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderAuthResponse)) {
            return false;
        }
        ProviderAuthResponse providerAuthResponse = (ProviderAuthResponse) obj;
        if (u.e(this.token, providerAuthResponse.token) && u.e(this.sessionId, providerAuthResponse.sessionId) && this.accountId == providerAuthResponse.accountId && u.e(this.authToken, providerAuthResponse.authToken) && this.requireSecureSession == providerAuthResponse.requireSecureSession && this.isSecured == providerAuthResponse.isSecured && u.e(this.loginMethod, providerAuthResponse.loginMethod)) {
            return true;
        }
        return false;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final LoginMethod getLoginMethod() {
        return this.loginMethod;
    }

    public final boolean getRequireSecureSession() {
        return this.requireSecureSession;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c11 = d.c(this.authToken, c.a(this.accountId, d.c(this.sessionId, this.token.hashCode() * 31, 31), 31), 31);
        boolean z5 = this.requireSecureSession;
        int i11 = 1;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int i13 = (c11 + i12) * 31;
        boolean z11 = this.isSecured;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return this.loginMethod.hashCode() + ((i13 + i11) * 31);
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    public final void setAuthToken(String str) {
        u.j(str, "<set-?>");
        this.authToken = str;
    }

    public String toString() {
        String str = this.token;
        String str2 = this.sessionId;
        long j5 = this.accountId;
        String str3 = this.authToken;
        boolean z5 = this.requireSecureSession;
        boolean z11 = this.isSecured;
        LoginMethod loginMethod = this.loginMethod;
        StringBuilder b10 = l0.b("ProviderAuthResponse(token=", str, ", sessionId=", str2, ", accountId=");
        b10.append(j5);
        b10.append(", authToken=");
        b10.append(str3);
        b10.append(", requireSecureSession=");
        b10.append(z5);
        b10.append(", isSecured=");
        b10.append(z11);
        b10.append(", loginMethod=");
        b10.append(loginMethod);
        b10.append(")");
        return b10.toString();
    }
}
