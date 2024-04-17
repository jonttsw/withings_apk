package com.withings.ecg.webservices;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "", "ecgReviewResponse", "Lcom/withings/ecg/webservices/GetEcgReviewResponseDetails;", "(Lcom/withings/ecg/webservices/GetEcgReviewResponseDetails;)V", "getEcgReviewResponse", "()Lcom/withings/ecg/webservices/GetEcgReviewResponseDetails;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetEcgReviewResponse {
    public static final int $stable = 8;
    @SerializedName("ecg_review")
    private final GetEcgReviewResponseDetails ecgReviewResponse;

    public GetEcgReviewResponse(GetEcgReviewResponseDetails getEcgReviewResponseDetails) {
        this.ecgReviewResponse = getEcgReviewResponseDetails;
    }

    public static /* synthetic */ GetEcgReviewResponse copy$default(GetEcgReviewResponse getEcgReviewResponse, GetEcgReviewResponseDetails getEcgReviewResponseDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            getEcgReviewResponseDetails = getEcgReviewResponse.ecgReviewResponse;
        }
        return getEcgReviewResponse.copy(getEcgReviewResponseDetails);
    }

    public final GetEcgReviewResponseDetails component1() {
        return this.ecgReviewResponse;
    }

    public final GetEcgReviewResponse copy(GetEcgReviewResponseDetails getEcgReviewResponseDetails) {
        return new GetEcgReviewResponse(getEcgReviewResponseDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GetEcgReviewResponse) && u.e(this.ecgReviewResponse, ((GetEcgReviewResponse) obj).ecgReviewResponse)) {
            return true;
        }
        return false;
    }

    public final GetEcgReviewResponseDetails getEcgReviewResponse() {
        return this.ecgReviewResponse;
    }

    public int hashCode() {
        GetEcgReviewResponseDetails getEcgReviewResponseDetails = this.ecgReviewResponse;
        if (getEcgReviewResponseDetails == null) {
            return 0;
        }
        return getEcgReviewResponseDetails.hashCode();
    }

    public String toString() {
        GetEcgReviewResponseDetails getEcgReviewResponseDetails = this.ecgReviewResponse;
        return "GetEcgReviewResponse(ecgReviewResponse=" + getEcgReviewResponseDetails + ")";
    }
}
