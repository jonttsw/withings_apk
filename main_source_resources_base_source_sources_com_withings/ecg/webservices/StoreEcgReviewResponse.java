package com.withings.ecg.webservices;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/ecg/webservices/StoreEcgReviewResponse;", "", "ecgReviewResponse", "Lcom/withings/ecg/webservices/StoreEcgReviewResponseDetails;", "(Lcom/withings/ecg/webservices/StoreEcgReviewResponseDetails;)V", "getEcgReviewResponse", "()Lcom/withings/ecg/webservices/StoreEcgReviewResponseDetails;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreEcgReviewResponse {
    public static final int $stable = 0;
    @SerializedName("ecg_review")
    private final StoreEcgReviewResponseDetails ecgReviewResponse;

    public StoreEcgReviewResponse(StoreEcgReviewResponseDetails storeEcgReviewResponseDetails) {
        this.ecgReviewResponse = storeEcgReviewResponseDetails;
    }

    public static /* synthetic */ StoreEcgReviewResponse copy$default(StoreEcgReviewResponse storeEcgReviewResponse, StoreEcgReviewResponseDetails storeEcgReviewResponseDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            storeEcgReviewResponseDetails = storeEcgReviewResponse.ecgReviewResponse;
        }
        return storeEcgReviewResponse.copy(storeEcgReviewResponseDetails);
    }

    public final StoreEcgReviewResponseDetails component1() {
        return this.ecgReviewResponse;
    }

    public final StoreEcgReviewResponse copy(StoreEcgReviewResponseDetails storeEcgReviewResponseDetails) {
        return new StoreEcgReviewResponse(storeEcgReviewResponseDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StoreEcgReviewResponse) && u.e(this.ecgReviewResponse, ((StoreEcgReviewResponse) obj).ecgReviewResponse)) {
            return true;
        }
        return false;
    }

    public final StoreEcgReviewResponseDetails getEcgReviewResponse() {
        return this.ecgReviewResponse;
    }

    public int hashCode() {
        StoreEcgReviewResponseDetails storeEcgReviewResponseDetails = this.ecgReviewResponse;
        if (storeEcgReviewResponseDetails == null) {
            return 0;
        }
        return storeEcgReviewResponseDetails.hashCode();
    }

    public String toString() {
        StoreEcgReviewResponseDetails storeEcgReviewResponseDetails = this.ecgReviewResponse;
        return "StoreEcgReviewResponse(ecgReviewResponse=" + storeEcgReviewResponseDetails + ")";
    }
}
