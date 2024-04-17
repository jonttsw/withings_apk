package com.withings.ecg.webservices;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/withings/ecg/webservices/StoreEcgReviewResponseDetails;", "", "isPhoneRequired", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreEcgReviewResponseDetails {
    public static final int $stable = 0;
    @SerializedName("is_requiring_phone_number")
    private final boolean isPhoneRequired;

    public StoreEcgReviewResponseDetails(boolean z5) {
        this.isPhoneRequired = z5;
    }

    public static /* synthetic */ StoreEcgReviewResponseDetails copy$default(StoreEcgReviewResponseDetails storeEcgReviewResponseDetails, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = storeEcgReviewResponseDetails.isPhoneRequired;
        }
        return storeEcgReviewResponseDetails.copy(z5);
    }

    public final boolean component1() {
        return this.isPhoneRequired;
    }

    public final StoreEcgReviewResponseDetails copy(boolean z5) {
        return new StoreEcgReviewResponseDetails(z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StoreEcgReviewResponseDetails) && this.isPhoneRequired == ((StoreEcgReviewResponseDetails) obj).isPhoneRequired) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPhoneRequired);
    }

    public final boolean isPhoneRequired() {
        return this.isPhoneRequired;
    }

    public String toString() {
        boolean z5 = this.isPhoneRequired;
        return "StoreEcgReviewResponseDetails(isPhoneRequired=" + z5 + ")";
    }
}
