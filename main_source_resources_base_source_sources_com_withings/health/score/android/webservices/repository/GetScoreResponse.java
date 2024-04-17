package com.withings.health.score.android.webservices.repository;

import androidx.appcompat.app.h;
import com.google.gson.annotations.SerializedName;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetScoreResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/withings/health/score/android/webservices/repository/GetScoreResponse;", "", GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "scores", "", "Lcom/withings/health/score/android/webservices/repository/ScoreResponse;", "(ZILjava/util/List;)V", "getMore", "()Z", "getOffset", "()I", "getScores", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetScoreResponse {
    @SerializedName(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME)
    private final boolean more;
    @SerializedName(GetHealthAttributeResponse.FIELD_OFFSET_NAME)
    private final int offset;
    @SerializedName("healthscores")
    private final List<ScoreResponse> scores;

    public GetScoreResponse(boolean z5, int i11, List<ScoreResponse> scores) {
        u.j(scores, "scores");
        this.more = z5;
        this.offset = i11;
        this.scores = scores;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetScoreResponse copy$default(GetScoreResponse getScoreResponse, boolean z5, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z5 = getScoreResponse.more;
        }
        if ((i12 & 2) != 0) {
            i11 = getScoreResponse.offset;
        }
        if ((i12 & 4) != 0) {
            list = getScoreResponse.scores;
        }
        return getScoreResponse.copy(z5, i11, list);
    }

    public final boolean component1() {
        return this.more;
    }

    public final int component2() {
        return this.offset;
    }

    public final List<ScoreResponse> component3() {
        return this.scores;
    }

    public final GetScoreResponse copy(boolean z5, int i11, List<ScoreResponse> scores) {
        u.j(scores, "scores");
        return new GetScoreResponse(z5, i11, scores);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetScoreResponse)) {
            return false;
        }
        GetScoreResponse getScoreResponse = (GetScoreResponse) obj;
        if (this.more == getScoreResponse.more && this.offset == getScoreResponse.offset && u.e(this.scores, getScoreResponse.scores)) {
            return true;
        }
        return false;
    }

    public final boolean getMore() {
        return this.more;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<ScoreResponse> getScores() {
        return this.scores;
    }

    public int hashCode() {
        return this.scores.hashCode() + h.a(this.offset, Boolean.hashCode(this.more) * 31, 31);
    }

    public String toString() {
        boolean z5 = this.more;
        int i11 = this.offset;
        List<ScoreResponse> list = this.scores;
        StringBuilder sb2 = new StringBuilder("GetScoreResponse(more=");
        sb2.append(z5);
        sb2.append(", offset=");
        sb2.append(i11);
        sb2.append(", scores=");
        return d.i(sb2, list, ")");
    }
}
