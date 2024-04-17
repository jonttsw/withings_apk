package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: EcgScores.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/withings/library/healthscore/models/EcgScores;", "", "ecgAFibScore", "Lcom/withings/library/healthscore/models/HSResult;", "", "ecgAFibBurdenScore", "ecgAFibMonitoringEngagement", "(Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;)V", "getEcgAFibBurdenScore", "()Lcom/withings/library/healthscore/models/HSResult;", "getEcgAFibMonitoringEngagement", "getEcgAFibScore", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgScores {
    private final HSResult<Double> ecgAFibBurdenScore;
    private final HSResult<Double> ecgAFibMonitoringEngagement;
    private final HSResult<Double> ecgAFibScore;

    public EcgScores(HSResult<Double> ecgAFibScore, HSResult<Double> hSResult, HSResult<Double> hSResult2) {
        u.j(ecgAFibScore, "ecgAFibScore");
        this.ecgAFibScore = ecgAFibScore;
        this.ecgAFibBurdenScore = hSResult;
        this.ecgAFibMonitoringEngagement = hSResult2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcgScores copy$default(EcgScores ecgScores, HSResult hSResult, HSResult hSResult2, HSResult hSResult3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hSResult = ecgScores.ecgAFibScore;
        }
        if ((i11 & 2) != 0) {
            hSResult2 = ecgScores.ecgAFibBurdenScore;
        }
        if ((i11 & 4) != 0) {
            hSResult3 = ecgScores.ecgAFibMonitoringEngagement;
        }
        return ecgScores.copy(hSResult, hSResult2, hSResult3);
    }

    public final HSResult<Double> component1() {
        return this.ecgAFibScore;
    }

    public final HSResult<Double> component2() {
        return this.ecgAFibBurdenScore;
    }

    public final HSResult<Double> component3() {
        return this.ecgAFibMonitoringEngagement;
    }

    public final EcgScores copy(HSResult<Double> ecgAFibScore, HSResult<Double> hSResult, HSResult<Double> hSResult2) {
        u.j(ecgAFibScore, "ecgAFibScore");
        return new EcgScores(ecgAFibScore, hSResult, hSResult2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcgScores)) {
            return false;
        }
        EcgScores ecgScores = (EcgScores) obj;
        if (u.e(this.ecgAFibScore, ecgScores.ecgAFibScore) && u.e(this.ecgAFibBurdenScore, ecgScores.ecgAFibBurdenScore) && u.e(this.ecgAFibMonitoringEngagement, ecgScores.ecgAFibMonitoringEngagement)) {
            return true;
        }
        return false;
    }

    public final HSResult<Double> getEcgAFibBurdenScore() {
        return this.ecgAFibBurdenScore;
    }

    public final HSResult<Double> getEcgAFibMonitoringEngagement() {
        return this.ecgAFibMonitoringEngagement;
    }

    public final HSResult<Double> getEcgAFibScore() {
        return this.ecgAFibScore;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.ecgAFibScore.hashCode() * 31;
        HSResult<Double> hSResult = this.ecgAFibBurdenScore;
        int i11 = 0;
        if (hSResult == null) {
            hashCode = 0;
        } else {
            hashCode = hSResult.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        HSResult<Double> hSResult2 = this.ecgAFibMonitoringEngagement;
        if (hSResult2 != null) {
            i11 = hSResult2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        HSResult<Double> hSResult = this.ecgAFibScore;
        HSResult<Double> hSResult2 = this.ecgAFibBurdenScore;
        HSResult<Double> hSResult3 = this.ecgAFibMonitoringEngagement;
        return "EcgScores(ecgAFibScore=" + hSResult + ", ecgAFibBurdenScore=" + hSResult2 + ", ecgAFibMonitoringEngagement=" + hSResult3 + ")";
    }

    public /* synthetic */ EcgScores(HSResult hSResult, HSResult hSResult2, HSResult hSResult3, int i11, m mVar) {
        this(hSResult, (i11 & 2) != 0 ? null : hSResult2, (i11 & 4) != 0 ? null : hSResult3);
    }
}
