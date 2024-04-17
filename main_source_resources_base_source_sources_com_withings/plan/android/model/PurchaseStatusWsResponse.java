package com.withings.plan.android.model;

import androidx.appcompat.app.h;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: PurchaseWsResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/plan/android/model/PurchaseStatusWsResponse;", "", "status", "", "waitSeconds", "(II)V", "getStatus", "()I", "getWaitSeconds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseStatusWsResponse {
    private final int status;
    @SerializedName("wait_seconds")
    private final int waitSeconds;

    public PurchaseStatusWsResponse(int i11, int i12) {
        this.status = i11;
        this.waitSeconds = i12;
    }

    public static /* synthetic */ PurchaseStatusWsResponse copy$default(PurchaseStatusWsResponse purchaseStatusWsResponse, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = purchaseStatusWsResponse.status;
        }
        if ((i13 & 2) != 0) {
            i12 = purchaseStatusWsResponse.waitSeconds;
        }
        return purchaseStatusWsResponse.copy(i11, i12);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.waitSeconds;
    }

    public final PurchaseStatusWsResponse copy(int i11, int i12) {
        return new PurchaseStatusWsResponse(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseStatusWsResponse)) {
            return false;
        }
        PurchaseStatusWsResponse purchaseStatusWsResponse = (PurchaseStatusWsResponse) obj;
        if (this.status == purchaseStatusWsResponse.status && this.waitSeconds == purchaseStatusWsResponse.waitSeconds) {
            return true;
        }
        return false;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getWaitSeconds() {
        return this.waitSeconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.waitSeconds) + (Integer.hashCode(this.status) * 31);
    }

    public String toString() {
        return h.c("PurchaseStatusWsResponse(status=", this.status, ", waitSeconds=", this.waitSeconds, ")");
    }
}
