package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: SleepScores.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/withings/library/healthscore/models/SleepScores;", "", "sleepScore", "Lcom/withings/library/healthscore/models/HSResult;", "", "sleepEngagement", "sleepApneaBurden", "sleepQuality", "(Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;)V", "getSleepApneaBurden", "()Lcom/withings/library/healthscore/models/HSResult;", "getSleepEngagement", "getSleepQuality", "getSleepScore", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SleepScores {
    private final HSResult<Double> sleepApneaBurden;
    private final HSResult<Double> sleepEngagement;
    private final HSResult<Double> sleepQuality;
    private final HSResult<Double> sleepScore;

    public SleepScores(HSResult<Double> hSResult, HSResult<Double> hSResult2, HSResult<Double> hSResult3, HSResult<Double> hSResult4) {
        this.sleepScore = hSResult;
        this.sleepEngagement = hSResult2;
        this.sleepApneaBurden = hSResult3;
        this.sleepQuality = hSResult4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepScores copy$default(SleepScores sleepScores, HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hSResult = sleepScores.sleepScore;
        }
        if ((i11 & 2) != 0) {
            hSResult2 = sleepScores.sleepEngagement;
        }
        if ((i11 & 4) != 0) {
            hSResult3 = sleepScores.sleepApneaBurden;
        }
        if ((i11 & 8) != 0) {
            hSResult4 = sleepScores.sleepQuality;
        }
        return sleepScores.copy(hSResult, hSResult2, hSResult3, hSResult4);
    }

    public final HSResult<Double> component1() {
        return this.sleepScore;
    }

    public final HSResult<Double> component2() {
        return this.sleepEngagement;
    }

    public final HSResult<Double> component3() {
        return this.sleepApneaBurden;
    }

    public final HSResult<Double> component4() {
        return this.sleepQuality;
    }

    public final SleepScores copy(HSResult<Double> hSResult, HSResult<Double> hSResult2, HSResult<Double> hSResult3, HSResult<Double> hSResult4) {
        return new SleepScores(hSResult, hSResult2, hSResult3, hSResult4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepScores)) {
            return false;
        }
        SleepScores sleepScores = (SleepScores) obj;
        if (u.e(this.sleepScore, sleepScores.sleepScore) && u.e(this.sleepEngagement, sleepScores.sleepEngagement) && u.e(this.sleepApneaBurden, sleepScores.sleepApneaBurden) && u.e(this.sleepQuality, sleepScores.sleepQuality)) {
            return true;
        }
        return false;
    }

    public final HSResult<Double> getSleepApneaBurden() {
        return this.sleepApneaBurden;
    }

    public final HSResult<Double> getSleepEngagement() {
        return this.sleepEngagement;
    }

    public final HSResult<Double> getSleepQuality() {
        return this.sleepQuality;
    }

    public final HSResult<Double> getSleepScore() {
        return this.sleepScore;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        HSResult<Double> hSResult = this.sleepScore;
        int i11 = 0;
        if (hSResult == null) {
            hashCode = 0;
        } else {
            hashCode = hSResult.hashCode();
        }
        int i12 = hashCode * 31;
        HSResult<Double> hSResult2 = this.sleepEngagement;
        if (hSResult2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hSResult2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        HSResult<Double> hSResult3 = this.sleepApneaBurden;
        if (hSResult3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = hSResult3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        HSResult<Double> hSResult4 = this.sleepQuality;
        if (hSResult4 != null) {
            i11 = hSResult4.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        HSResult<Double> hSResult = this.sleepScore;
        HSResult<Double> hSResult2 = this.sleepEngagement;
        HSResult<Double> hSResult3 = this.sleepApneaBurden;
        HSResult<Double> hSResult4 = this.sleepQuality;
        return "SleepScores(sleepScore=" + hSResult + ", sleepEngagement=" + hSResult2 + ", sleepApneaBurden=" + hSResult3 + ", sleepQuality=" + hSResult4 + ")";
    }

    public /* synthetic */ SleepScores(HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, int i11, m mVar) {
        this(hSResult, (i11 & 2) != 0 ? null : hSResult2, (i11 & 4) != 0 ? null : hSResult3, (i11 & 8) != 0 ? null : hSResult4);
    }
}
