package com.withings.prediction.remote.repository.api;

import bn.d;
import com.withings.prediction.remote.model.WsPrediction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetPredictionResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withings/prediction/remote/repository/api/GetPredictionResponse;", "", "predictions", "", "Lcom/withings/prediction/remote/model/WsPrediction;", "(Ljava/util/List;)V", "getPredictions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetPredictionResponse {
    private final List<WsPrediction> predictions;

    public GetPredictionResponse(List<WsPrediction> predictions) {
        u.j(predictions, "predictions");
        this.predictions = predictions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPredictionResponse copy$default(GetPredictionResponse getPredictionResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getPredictionResponse.predictions;
        }
        return getPredictionResponse.copy(list);
    }

    public final List<WsPrediction> component1() {
        return this.predictions;
    }

    public final GetPredictionResponse copy(List<WsPrediction> predictions) {
        u.j(predictions, "predictions");
        return new GetPredictionResponse(predictions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GetPredictionResponse) && u.e(this.predictions, ((GetPredictionResponse) obj).predictions)) {
            return true;
        }
        return false;
    }

    public final List<WsPrediction> getPredictions() {
        return this.predictions;
    }

    public int hashCode() {
        return this.predictions.hashCode();
    }

    public String toString() {
        return d.b("GetPredictionResponse(predictions=", this.predictions, ")");
    }
}
