package com.withings.insight.core.model;

import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: UpdateScenarioResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/insight/core/model/UpdateScenarioResponse;", "", InsightItemData.WS_TYPE, "Lcom/withings/insight/core/model/UpdateResponse;", "(Lcom/withings/insight/core/model/UpdateResponse;)V", "getInsight", "()Lcom/withings/insight/core/model/UpdateResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateScenarioResponse {
    @SerializedName(InsightItemData.WS_TYPE)
    private final UpdateResponse insight;

    public UpdateScenarioResponse(UpdateResponse updateResponse) {
        this.insight = updateResponse;
    }

    public static /* synthetic */ UpdateScenarioResponse copy$default(UpdateScenarioResponse updateScenarioResponse, UpdateResponse updateResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            updateResponse = updateScenarioResponse.insight;
        }
        return updateScenarioResponse.copy(updateResponse);
    }

    public final UpdateResponse component1() {
        return this.insight;
    }

    public final UpdateScenarioResponse copy(UpdateResponse updateResponse) {
        return new UpdateScenarioResponse(updateResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpdateScenarioResponse) && u.e(this.insight, ((UpdateScenarioResponse) obj).insight)) {
            return true;
        }
        return false;
    }

    public final UpdateResponse getInsight() {
        return this.insight;
    }

    public int hashCode() {
        UpdateResponse updateResponse = this.insight;
        if (updateResponse == null) {
            return 0;
        }
        return updateResponse.hashCode();
    }

    public String toString() {
        UpdateResponse updateResponse = this.insight;
        return "UpdateScenarioResponse(insight=" + updateResponse + ")";
    }
}
