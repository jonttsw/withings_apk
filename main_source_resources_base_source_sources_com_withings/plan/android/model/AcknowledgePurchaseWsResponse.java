package com.withings.plan.android.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PurchaseWsResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/withings/plan/android/model/AcknowledgePurchaseWsResponse;", "", "key", "", "waitSeconds", "", "(Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getWaitSeconds", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AcknowledgePurchaseWsResponse {
    private final String key;
    @SerializedName("wait_seconds")
    private final int waitSeconds;

    public AcknowledgePurchaseWsResponse(String key, int i11) {
        u.j(key, "key");
        this.key = key;
        this.waitSeconds = i11;
    }

    public static /* synthetic */ AcknowledgePurchaseWsResponse copy$default(AcknowledgePurchaseWsResponse acknowledgePurchaseWsResponse, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = acknowledgePurchaseWsResponse.key;
        }
        if ((i12 & 2) != 0) {
            i11 = acknowledgePurchaseWsResponse.waitSeconds;
        }
        return acknowledgePurchaseWsResponse.copy(str, i11);
    }

    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.waitSeconds;
    }

    public final AcknowledgePurchaseWsResponse copy(String key, int i11) {
        u.j(key, "key");
        return new AcknowledgePurchaseWsResponse(key, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcknowledgePurchaseWsResponse)) {
            return false;
        }
        AcknowledgePurchaseWsResponse acknowledgePurchaseWsResponse = (AcknowledgePurchaseWsResponse) obj;
        if (u.e(this.key, acknowledgePurchaseWsResponse.key) && this.waitSeconds == acknowledgePurchaseWsResponse.waitSeconds) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getWaitSeconds() {
        return this.waitSeconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.waitSeconds) + (this.key.hashCode() * 31);
    }

    public String toString() {
        String str = this.key;
        int i11 = this.waitSeconds;
        return "AcknowledgePurchaseWsResponse(key=" + str + ", waitSeconds=" + i11 + ")";
    }
}
