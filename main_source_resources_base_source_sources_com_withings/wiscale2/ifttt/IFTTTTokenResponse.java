package com.withings.wiscale2.ifttt;

import androidx.fragment.app.o;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: IFTTTTokenResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/ifttt/IFTTTTokenResponse;", "", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IFTTTTokenResponse {
    public static final int $stable = 0;
    private final String token;

    public IFTTTTokenResponse(String token) {
        u.j(token, "token");
        this.token = token;
    }

    public static /* synthetic */ IFTTTTokenResponse copy$default(IFTTTTokenResponse iFTTTTokenResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = iFTTTTokenResponse.token;
        }
        return iFTTTTokenResponse.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final IFTTTTokenResponse copy(String token) {
        u.j(token, "token");
        return new IFTTTTokenResponse(token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IFTTTTokenResponse) && u.e(this.token, ((IFTTTTokenResponse) obj).token)) {
            return true;
        }
        return false;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return o.d("IFTTTTokenResponse(token=", this.token, ")");
    }
}
