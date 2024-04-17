package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: BodyScores.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/withings/library/healthscore/models/BodyScores;", "", "bodyScore", "Lcom/withings/library/healthscore/models/HSResult;", "", "bodyComposition", "weightEngagement", "bmi", "(Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;)V", "getBmi", "()Lcom/withings/library/healthscore/models/HSResult;", "getBodyComposition", "getBodyScore", "getWeightEngagement", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BodyScores {
    private final HSResult<Double> bmi;
    private final HSResult<Double> bodyComposition;
    private final HSResult<Double> bodyScore;
    private final HSResult<Double> weightEngagement;

    public BodyScores(HSResult<Double> bodyScore, HSResult<Double> hSResult, HSResult<Double> hSResult2, HSResult<Double> hSResult3) {
        u.j(bodyScore, "bodyScore");
        this.bodyScore = bodyScore;
        this.bodyComposition = hSResult;
        this.weightEngagement = hSResult2;
        this.bmi = hSResult3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BodyScores copy$default(BodyScores bodyScores, HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hSResult = bodyScores.bodyScore;
        }
        if ((i11 & 2) != 0) {
            hSResult2 = bodyScores.bodyComposition;
        }
        if ((i11 & 4) != 0) {
            hSResult3 = bodyScores.weightEngagement;
        }
        if ((i11 & 8) != 0) {
            hSResult4 = bodyScores.bmi;
        }
        return bodyScores.copy(hSResult, hSResult2, hSResult3, hSResult4);
    }

    public final HSResult<Double> component1() {
        return this.bodyScore;
    }

    public final HSResult<Double> component2() {
        return this.bodyComposition;
    }

    public final HSResult<Double> component3() {
        return this.weightEngagement;
    }

    public final HSResult<Double> component4() {
        return this.bmi;
    }

    public final BodyScores copy(HSResult<Double> bodyScore, HSResult<Double> hSResult, HSResult<Double> hSResult2, HSResult<Double> hSResult3) {
        u.j(bodyScore, "bodyScore");
        return new BodyScores(bodyScore, hSResult, hSResult2, hSResult3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyScores)) {
            return false;
        }
        BodyScores bodyScores = (BodyScores) obj;
        if (u.e(this.bodyScore, bodyScores.bodyScore) && u.e(this.bodyComposition, bodyScores.bodyComposition) && u.e(this.weightEngagement, bodyScores.weightEngagement) && u.e(this.bmi, bodyScores.bmi)) {
            return true;
        }
        return false;
    }

    public final HSResult<Double> getBmi() {
        return this.bmi;
    }

    public final HSResult<Double> getBodyComposition() {
        return this.bodyComposition;
    }

    public final HSResult<Double> getBodyScore() {
        return this.bodyScore;
    }

    public final HSResult<Double> getWeightEngagement() {
        return this.weightEngagement;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.bodyScore.hashCode() * 31;
        HSResult<Double> hSResult = this.bodyComposition;
        int i11 = 0;
        if (hSResult == null) {
            hashCode = 0;
        } else {
            hashCode = hSResult.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        HSResult<Double> hSResult2 = this.weightEngagement;
        if (hSResult2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hSResult2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        HSResult<Double> hSResult3 = this.bmi;
        if (hSResult3 != null) {
            i11 = hSResult3.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        HSResult<Double> hSResult = this.bodyScore;
        HSResult<Double> hSResult2 = this.bodyComposition;
        HSResult<Double> hSResult3 = this.weightEngagement;
        HSResult<Double> hSResult4 = this.bmi;
        return "BodyScores(bodyScore=" + hSResult + ", bodyComposition=" + hSResult2 + ", weightEngagement=" + hSResult3 + ", bmi=" + hSResult4 + ")";
    }

    public /* synthetic */ BodyScores(HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, int i11, m mVar) {
        this(hSResult, (i11 & 2) != 0 ? null : hSResult2, (i11 & 4) != 0 ? null : hSResult3, (i11 & 8) != 0 ? null : hSResult4);
    }
}
