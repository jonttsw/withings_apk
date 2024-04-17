package com.withings.account.models;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: TwoFactorAuthentication.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/withings/account/models/TotpResponse;", "", "email", "", ConstantsWs.CONFIDENTIAL_IE_FIELDS_SECRET, "issuer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getIssuer", "getSecret", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TotpResponse {
    public static final int $stable = 0;
    private final String email;
    private final String issuer;
    private final String secret;

    public TotpResponse(String email, String secret, String issuer) {
        u.j(email, "email");
        u.j(secret, "secret");
        u.j(issuer, "issuer");
        this.email = email;
        this.secret = secret;
        this.issuer = issuer;
    }

    public static /* synthetic */ TotpResponse copy$default(TotpResponse totpResponse, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = totpResponse.email;
        }
        if ((i11 & 2) != 0) {
            str2 = totpResponse.secret;
        }
        if ((i11 & 4) != 0) {
            str3 = totpResponse.issuer;
        }
        return totpResponse.copy(str, str2, str3);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.secret;
    }

    public final String component3() {
        return this.issuer;
    }

    public final TotpResponse copy(String email, String secret, String issuer) {
        u.j(email, "email");
        u.j(secret, "secret");
        u.j(issuer, "issuer");
        return new TotpResponse(email, secret, issuer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotpResponse)) {
            return false;
        }
        TotpResponse totpResponse = (TotpResponse) obj;
        if (u.e(this.email, totpResponse.email) && u.e(this.secret, totpResponse.secret) && u.e(this.issuer, totpResponse.issuer)) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        return this.issuer.hashCode() + d.c(this.secret, this.email.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.secret;
        return y1.e(l0.b("TotpResponse(email=", str, ", secret=", str2, ", issuer="), this.issuer, ")");
    }
}
