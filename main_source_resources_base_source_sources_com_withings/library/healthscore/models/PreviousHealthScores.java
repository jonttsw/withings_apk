package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PreviousHealthScores.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/withings/library/healthscore/models/PreviousHealthScores;", "", "activityScore", "", "bodyScore", "heartScore", "sleepScore", "healthImprovementScore", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getActivityScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBodyScore", "getHealthImprovementScore", "getHeartScore", "getSleepScore", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/withings/library/healthscore/models/PreviousHealthScores;", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PreviousHealthScores {
    private final Double activityScore;
    private final Double bodyScore;
    private final Double healthImprovementScore;
    private final Double heartScore;
    private final Double sleepScore;

    public PreviousHealthScores(Double d11, Double d12, Double d13, Double d14, Double d15) {
        this.activityScore = d11;
        this.bodyScore = d12;
        this.heartScore = d13;
        this.sleepScore = d14;
        this.healthImprovementScore = d15;
    }

    public static /* synthetic */ PreviousHealthScores copy$default(PreviousHealthScores previousHealthScores, Double d11, Double d12, Double d13, Double d14, Double d15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = previousHealthScores.activityScore;
        }
        if ((i11 & 2) != 0) {
            d12 = previousHealthScores.bodyScore;
        }
        Double d16 = d12;
        if ((i11 & 4) != 0) {
            d13 = previousHealthScores.heartScore;
        }
        Double d17 = d13;
        if ((i11 & 8) != 0) {
            d14 = previousHealthScores.sleepScore;
        }
        Double d18 = d14;
        if ((i11 & 16) != 0) {
            d15 = previousHealthScores.healthImprovementScore;
        }
        return previousHealthScores.copy(d11, d16, d17, d18, d15);
    }

    public final Double component1() {
        return this.activityScore;
    }

    public final Double component2() {
        return this.bodyScore;
    }

    public final Double component3() {
        return this.heartScore;
    }

    public final Double component4() {
        return this.sleepScore;
    }

    public final Double component5() {
        return this.healthImprovementScore;
    }

    public final PreviousHealthScores copy(Double d11, Double d12, Double d13, Double d14, Double d15) {
        return new PreviousHealthScores(d11, d12, d13, d14, d15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviousHealthScores)) {
            return false;
        }
        PreviousHealthScores previousHealthScores = (PreviousHealthScores) obj;
        if (u.e(this.activityScore, previousHealthScores.activityScore) && u.e(this.bodyScore, previousHealthScores.bodyScore) && u.e(this.heartScore, previousHealthScores.heartScore) && u.e(this.sleepScore, previousHealthScores.sleepScore) && u.e(this.healthImprovementScore, previousHealthScores.healthImprovementScore)) {
            return true;
        }
        return false;
    }

    public final Double getActivityScore() {
        return this.activityScore;
    }

    public final Double getBodyScore() {
        return this.bodyScore;
    }

    public final Double getHealthImprovementScore() {
        return this.healthImprovementScore;
    }

    public final Double getHeartScore() {
        return this.heartScore;
    }

    public final Double getSleepScore() {
        return this.sleepScore;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Double d11 = this.activityScore;
        int i11 = 0;
        if (d11 == null) {
            hashCode = 0;
        } else {
            hashCode = d11.hashCode();
        }
        int i12 = hashCode * 31;
        Double d12 = this.bodyScore;
        if (d12 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d12.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Double d13 = this.heartScore;
        if (d13 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d13.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Double d14 = this.sleepScore;
        if (d14 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d14.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Double d15 = this.healthImprovementScore;
        if (d15 != null) {
            i11 = d15.hashCode();
        }
        return i15 + i11;
    }

    public String toString() {
        Double d11 = this.activityScore;
        Double d12 = this.bodyScore;
        Double d13 = this.heartScore;
        Double d14 = this.sleepScore;
        Double d15 = this.healthImprovementScore;
        return "PreviousHealthScores(activityScore=" + d11 + ", bodyScore=" + d12 + ", heartScore=" + d13 + ", sleepScore=" + d14 + ", healthImprovementScore=" + d15 + ")";
    }
}
