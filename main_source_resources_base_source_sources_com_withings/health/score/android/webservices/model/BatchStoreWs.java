package com.withings.health.score.android.webservices.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScoresWs.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/withings/health/score/android/webservices/model/BatchStoreWs;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", WsVasistasSerie.KEY_ALGO, "", "timestamp", "", "scores", "Lcom/withings/health/score/android/webservices/model/ScoresWs;", "(Ljava/lang/String;IJLcom/withings/health/score/android/webservices/model/ScoresWs;)V", "getAlgo", "()I", "getAppId", "()Ljava/lang/String;", "getScores", "()Lcom/withings/health/score/android/webservices/model/ScoresWs;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatchStoreWs {
    @SerializedName(WsVasistasSerie.KEY_ALGO)
    private final int algo;
    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_APPID)
    private final String appId;
    private final ScoresWs scores;
    private final long timestamp;

    public BatchStoreWs(String appId, int i11, long j5, ScoresWs scores) {
        u.j(appId, "appId");
        u.j(scores, "scores");
        this.appId = appId;
        this.algo = i11;
        this.timestamp = j5;
        this.scores = scores;
    }

    public static /* synthetic */ BatchStoreWs copy$default(BatchStoreWs batchStoreWs, String str, int i11, long j5, ScoresWs scoresWs, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = batchStoreWs.appId;
        }
        if ((i12 & 2) != 0) {
            i11 = batchStoreWs.algo;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j5 = batchStoreWs.timestamp;
        }
        long j11 = j5;
        if ((i12 & 8) != 0) {
            scoresWs = batchStoreWs.scores;
        }
        return batchStoreWs.copy(str, i13, j11, scoresWs);
    }

    public final String component1() {
        return this.appId;
    }

    public final int component2() {
        return this.algo;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final ScoresWs component4() {
        return this.scores;
    }

    public final BatchStoreWs copy(String appId, int i11, long j5, ScoresWs scores) {
        u.j(appId, "appId");
        u.j(scores, "scores");
        return new BatchStoreWs(appId, i11, j5, scores);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchStoreWs)) {
            return false;
        }
        BatchStoreWs batchStoreWs = (BatchStoreWs) obj;
        if (u.e(this.appId, batchStoreWs.appId) && this.algo == batchStoreWs.algo && this.timestamp == batchStoreWs.timestamp && u.e(this.scores, batchStoreWs.scores)) {
            return true;
        }
        return false;
    }

    public final int getAlgo() {
        return this.algo;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final ScoresWs getScores() {
        return this.scores;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.scores.hashCode() + c.a(this.timestamp, h.a(this.algo, this.appId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.appId;
        int i11 = this.algo;
        long j5 = this.timestamp;
        ScoresWs scoresWs = this.scores;
        StringBuilder b10 = g.b("BatchStoreWs(appId=", str, ", algo=", i11, ", timestamp=");
        b10.append(j5);
        b10.append(", scores=");
        b10.append(scoresWs);
        b10.append(")");
        return b10.toString();
    }
}
