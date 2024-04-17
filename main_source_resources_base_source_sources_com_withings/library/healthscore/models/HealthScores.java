package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HealthScores.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003Ji\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/withings/library/healthscore/models/HealthScores;", "", "activityScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/ActivityScores;", "bodyScore", "Lcom/withings/library/healthscore/models/BodyScores;", "heartScore", "Lcom/withings/library/healthscore/models/HeartScores;", "sleepScore", "Lcom/withings/library/healthscore/models/SleepScores;", "healthImprovementScore", "", "trueHealthImprovementScore", "(Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;)V", "getActivityScore", "()Lcom/withings/library/healthscore/models/HSResult;", "getBodyScore", "getHealthImprovementScore", "getHeartScore", "getSleepScore", "getTrueHealthImprovementScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthScores {
    private final HSResult<ActivityScores> activityScore;
    private final HSResult<BodyScores> bodyScore;
    private final HSResult<Double> healthImprovementScore;
    private final HSResult<HeartScores> heartScore;
    private final HSResult<SleepScores> sleepScore;
    private final HSResult<Double> trueHealthImprovementScore;

    public HealthScores(HSResult<ActivityScores> activityScore, HSResult<BodyScores> bodyScore, HSResult<HeartScores> heartScore, HSResult<SleepScores> sleepScore, HSResult<Double> healthImprovementScore, HSResult<Double> trueHealthImprovementScore) {
        u.j(activityScore, "activityScore");
        u.j(bodyScore, "bodyScore");
        u.j(heartScore, "heartScore");
        u.j(sleepScore, "sleepScore");
        u.j(healthImprovementScore, "healthImprovementScore");
        u.j(trueHealthImprovementScore, "trueHealthImprovementScore");
        this.activityScore = activityScore;
        this.bodyScore = bodyScore;
        this.heartScore = heartScore;
        this.sleepScore = sleepScore;
        this.healthImprovementScore = healthImprovementScore;
        this.trueHealthImprovementScore = trueHealthImprovementScore;
    }

    public static /* synthetic */ HealthScores copy$default(HealthScores healthScores, HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, HSResult hSResult5, HSResult hSResult6, int i11, Object obj) {
        HSResult<ActivityScores> hSResult7 = hSResult;
        if ((i11 & 1) != 0) {
            hSResult7 = healthScores.activityScore;
        }
        HSResult<BodyScores> hSResult8 = hSResult2;
        if ((i11 & 2) != 0) {
            hSResult8 = healthScores.bodyScore;
        }
        HSResult hSResult9 = hSResult8;
        HSResult<HeartScores> hSResult10 = hSResult3;
        if ((i11 & 4) != 0) {
            hSResult10 = healthScores.heartScore;
        }
        HSResult hSResult11 = hSResult10;
        HSResult<SleepScores> hSResult12 = hSResult4;
        if ((i11 & 8) != 0) {
            hSResult12 = healthScores.sleepScore;
        }
        HSResult hSResult13 = hSResult12;
        HSResult<Double> hSResult14 = hSResult5;
        if ((i11 & 16) != 0) {
            hSResult14 = healthScores.healthImprovementScore;
        }
        HSResult hSResult15 = hSResult14;
        HSResult<Double> hSResult16 = hSResult6;
        if ((i11 & 32) != 0) {
            hSResult16 = healthScores.trueHealthImprovementScore;
        }
        return healthScores.copy(hSResult7, hSResult9, hSResult11, hSResult13, hSResult15, hSResult16);
    }

    public final HSResult<ActivityScores> component1() {
        return this.activityScore;
    }

    public final HSResult<BodyScores> component2() {
        return this.bodyScore;
    }

    public final HSResult<HeartScores> component3() {
        return this.heartScore;
    }

    public final HSResult<SleepScores> component4() {
        return this.sleepScore;
    }

    public final HSResult<Double> component5() {
        return this.healthImprovementScore;
    }

    public final HSResult<Double> component6() {
        return this.trueHealthImprovementScore;
    }

    public final HealthScores copy(HSResult<ActivityScores> activityScore, HSResult<BodyScores> bodyScore, HSResult<HeartScores> heartScore, HSResult<SleepScores> sleepScore, HSResult<Double> healthImprovementScore, HSResult<Double> trueHealthImprovementScore) {
        u.j(activityScore, "activityScore");
        u.j(bodyScore, "bodyScore");
        u.j(heartScore, "heartScore");
        u.j(sleepScore, "sleepScore");
        u.j(healthImprovementScore, "healthImprovementScore");
        u.j(trueHealthImprovementScore, "trueHealthImprovementScore");
        return new HealthScores(activityScore, bodyScore, heartScore, sleepScore, healthImprovementScore, trueHealthImprovementScore);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthScores)) {
            return false;
        }
        HealthScores healthScores = (HealthScores) obj;
        if (u.e(this.activityScore, healthScores.activityScore) && u.e(this.bodyScore, healthScores.bodyScore) && u.e(this.heartScore, healthScores.heartScore) && u.e(this.sleepScore, healthScores.sleepScore) && u.e(this.healthImprovementScore, healthScores.healthImprovementScore) && u.e(this.trueHealthImprovementScore, healthScores.trueHealthImprovementScore)) {
            return true;
        }
        return false;
    }

    public final HSResult<ActivityScores> getActivityScore() {
        return this.activityScore;
    }

    public final HSResult<BodyScores> getBodyScore() {
        return this.bodyScore;
    }

    public final HSResult<Double> getHealthImprovementScore() {
        return this.healthImprovementScore;
    }

    public final HSResult<HeartScores> getHeartScore() {
        return this.heartScore;
    }

    public final HSResult<SleepScores> getSleepScore() {
        return this.sleepScore;
    }

    public final HSResult<Double> getTrueHealthImprovementScore() {
        return this.trueHealthImprovementScore;
    }

    public int hashCode() {
        int hashCode = this.bodyScore.hashCode();
        int hashCode2 = this.heartScore.hashCode();
        int hashCode3 = this.sleepScore.hashCode();
        int hashCode4 = this.healthImprovementScore.hashCode();
        return this.trueHealthImprovementScore.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.activityScore.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        HSResult<ActivityScores> hSResult = this.activityScore;
        HSResult<BodyScores> hSResult2 = this.bodyScore;
        HSResult<HeartScores> hSResult3 = this.heartScore;
        HSResult<SleepScores> hSResult4 = this.sleepScore;
        HSResult<Double> hSResult5 = this.healthImprovementScore;
        HSResult<Double> hSResult6 = this.trueHealthImprovementScore;
        return "HealthScores(activityScore=" + hSResult + ", bodyScore=" + hSResult2 + ", heartScore=" + hSResult3 + ", sleepScore=" + hSResult4 + ", healthImprovementScore=" + hSResult5 + ", trueHealthImprovementScore=" + hSResult6 + ")";
    }
}
