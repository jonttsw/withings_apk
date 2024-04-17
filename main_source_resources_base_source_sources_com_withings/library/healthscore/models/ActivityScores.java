package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: ActivityScores.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/withings/library/healthscore/models/ActivityScores;", "", "activityScore", "Lcom/withings/library/healthscore/models/HSResult;", "", "stepsScore", "activeMinutesScore", "(Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;)V", "getActiveMinutesScore", "()Lcom/withings/library/healthscore/models/HSResult;", "getActivityScore", "getStepsScore", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityScores {
    private final HSResult<Double> activeMinutesScore;
    private final HSResult<Double> activityScore;
    private final HSResult<Double> stepsScore;

    public ActivityScores(HSResult<Double> activityScore, HSResult<Double> hSResult, HSResult<Double> hSResult2) {
        u.j(activityScore, "activityScore");
        this.activityScore = activityScore;
        this.stepsScore = hSResult;
        this.activeMinutesScore = hSResult2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityScores copy$default(ActivityScores activityScores, HSResult hSResult, HSResult hSResult2, HSResult hSResult3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hSResult = activityScores.activityScore;
        }
        if ((i11 & 2) != 0) {
            hSResult2 = activityScores.stepsScore;
        }
        if ((i11 & 4) != 0) {
            hSResult3 = activityScores.activeMinutesScore;
        }
        return activityScores.copy(hSResult, hSResult2, hSResult3);
    }

    public final HSResult<Double> component1() {
        return this.activityScore;
    }

    public final HSResult<Double> component2() {
        return this.stepsScore;
    }

    public final HSResult<Double> component3() {
        return this.activeMinutesScore;
    }

    public final ActivityScores copy(HSResult<Double> activityScore, HSResult<Double> hSResult, HSResult<Double> hSResult2) {
        u.j(activityScore, "activityScore");
        return new ActivityScores(activityScore, hSResult, hSResult2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityScores)) {
            return false;
        }
        ActivityScores activityScores = (ActivityScores) obj;
        if (u.e(this.activityScore, activityScores.activityScore) && u.e(this.stepsScore, activityScores.stepsScore) && u.e(this.activeMinutesScore, activityScores.activeMinutesScore)) {
            return true;
        }
        return false;
    }

    public final HSResult<Double> getActiveMinutesScore() {
        return this.activeMinutesScore;
    }

    public final HSResult<Double> getActivityScore() {
        return this.activityScore;
    }

    public final HSResult<Double> getStepsScore() {
        return this.stepsScore;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.activityScore.hashCode() * 31;
        HSResult<Double> hSResult = this.stepsScore;
        int i11 = 0;
        if (hSResult == null) {
            hashCode = 0;
        } else {
            hashCode = hSResult.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        HSResult<Double> hSResult2 = this.activeMinutesScore;
        if (hSResult2 != null) {
            i11 = hSResult2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        HSResult<Double> hSResult = this.activityScore;
        HSResult<Double> hSResult2 = this.stepsScore;
        HSResult<Double> hSResult3 = this.activeMinutesScore;
        return "ActivityScores(activityScore=" + hSResult + ", stepsScore=" + hSResult2 + ", activeMinutesScore=" + hSResult3 + ")";
    }

    public /* synthetic */ ActivityScores(HSResult hSResult, HSResult hSResult2, HSResult hSResult3, int i11, m mVar) {
        this(hSResult, (i11 & 2) != 0 ? null : hSResult2, (i11 & 4) != 0 ? null : hSResult3);
    }
}
