package com.withings.account.network.ws;

import kotlin.Metadata;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/account/network/ws/RenewResponse;", "", "promoted", "", "(Z)V", "getPromoted", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RenewResponse {
    public static final int $stable = 0;
    private final boolean promoted;

    public RenewResponse(boolean z5) {
        this.promoted = z5;
    }

    public static /* synthetic */ RenewResponse copy$default(RenewResponse renewResponse, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = renewResponse.promoted;
        }
        return renewResponse.copy(z5);
    }

    public final boolean component1() {
        return this.promoted;
    }

    public final RenewResponse copy(boolean z5) {
        return new RenewResponse(z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RenewResponse) && this.promoted == ((RenewResponse) obj).promoted) {
            return true;
        }
        return false;
    }

    public final boolean getPromoted() {
        return this.promoted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.promoted);
    }

    public String toString() {
        boolean z5 = this.promoted;
        return "RenewResponse(promoted=" + z5 + ")";
    }
}
