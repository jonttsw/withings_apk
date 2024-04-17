package com.withings.library.healthscore.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: HeartScores.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J«\u0001\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006)"}, d2 = {"Lcom/withings/library/healthscore/models/HeartScores;", "", "heartScore", "Lcom/withings/library/healthscore/models/HSResult;", "", "ecgEngagement", "bloodPressure", "vascularAge", "bloodPressureBurden", "ecgAfib", "bpmEngagement", "nightHr", "afibBurden", "(Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;Lcom/withings/library/healthscore/models/HSResult;)V", "getAfibBurden", "()Lcom/withings/library/healthscore/models/HSResult;", "getBloodPressure", "getBloodPressureBurden", "getBpmEngagement", "getEcgAfib", "getEcgEngagement", "getHeartScore", "getNightHr", "getVascularAge", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeartScores {
    private final HSResult<Double> afibBurden;
    private final HSResult<Double> bloodPressure;
    private final HSResult<Double> bloodPressureBurden;
    private final HSResult<Double> bpmEngagement;
    private final HSResult<Double> ecgAfib;
    private final HSResult<Double> ecgEngagement;
    private final HSResult<Double> heartScore;
    private final HSResult<Double> nightHr;
    private final HSResult<Double> vascularAge;

    public HeartScores(HSResult<Double> hSResult, HSResult<Double> hSResult2, HSResult<Double> hSResult3, HSResult<Double> hSResult4, HSResult<Double> hSResult5, HSResult<Double> hSResult6, HSResult<Double> hSResult7, HSResult<Double> hSResult8, HSResult<Double> hSResult9) {
        this.heartScore = hSResult;
        this.ecgEngagement = hSResult2;
        this.bloodPressure = hSResult3;
        this.vascularAge = hSResult4;
        this.bloodPressureBurden = hSResult5;
        this.ecgAfib = hSResult6;
        this.bpmEngagement = hSResult7;
        this.nightHr = hSResult8;
        this.afibBurden = hSResult9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeartScores copy$default(HeartScores heartScores, HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, HSResult hSResult5, HSResult hSResult6, HSResult hSResult7, HSResult hSResult8, HSResult hSResult9, int i11, Object obj) {
        HSResult<Double> hSResult10;
        HSResult<Double> hSResult11;
        HSResult<Double> hSResult12;
        HSResult<Double> hSResult13;
        HSResult<Double> hSResult14;
        HSResult<Double> hSResult15;
        HSResult<Double> hSResult16;
        HSResult<Double> hSResult17;
        HSResult<Double> hSResult18;
        if ((i11 & 1) != 0) {
            hSResult10 = heartScores.heartScore;
        } else {
            hSResult10 = hSResult;
        }
        if ((i11 & 2) != 0) {
            hSResult11 = heartScores.ecgEngagement;
        } else {
            hSResult11 = hSResult2;
        }
        if ((i11 & 4) != 0) {
            hSResult12 = heartScores.bloodPressure;
        } else {
            hSResult12 = hSResult3;
        }
        if ((i11 & 8) != 0) {
            hSResult13 = heartScores.vascularAge;
        } else {
            hSResult13 = hSResult4;
        }
        if ((i11 & 16) != 0) {
            hSResult14 = heartScores.bloodPressureBurden;
        } else {
            hSResult14 = hSResult5;
        }
        if ((i11 & 32) != 0) {
            hSResult15 = heartScores.ecgAfib;
        } else {
            hSResult15 = hSResult6;
        }
        if ((i11 & 64) != 0) {
            hSResult16 = heartScores.bpmEngagement;
        } else {
            hSResult16 = hSResult7;
        }
        if ((i11 & 128) != 0) {
            hSResult17 = heartScores.nightHr;
        } else {
            hSResult17 = hSResult8;
        }
        if ((i11 & 256) != 0) {
            hSResult18 = heartScores.afibBurden;
        } else {
            hSResult18 = hSResult9;
        }
        return heartScores.copy(hSResult10, hSResult11, hSResult12, hSResult13, hSResult14, hSResult15, hSResult16, hSResult17, hSResult18);
    }

    public final HSResult<Double> component1() {
        return this.heartScore;
    }

    public final HSResult<Double> component2() {
        return this.ecgEngagement;
    }

    public final HSResult<Double> component3() {
        return this.bloodPressure;
    }

    public final HSResult<Double> component4() {
        return this.vascularAge;
    }

    public final HSResult<Double> component5() {
        return this.bloodPressureBurden;
    }

    public final HSResult<Double> component6() {
        return this.ecgAfib;
    }

    public final HSResult<Double> component7() {
        return this.bpmEngagement;
    }

    public final HSResult<Double> component8() {
        return this.nightHr;
    }

    public final HSResult<Double> component9() {
        return this.afibBurden;
    }

    public final HeartScores copy(HSResult<Double> hSResult, HSResult<Double> hSResult2, HSResult<Double> hSResult3, HSResult<Double> hSResult4, HSResult<Double> hSResult5, HSResult<Double> hSResult6, HSResult<Double> hSResult7, HSResult<Double> hSResult8, HSResult<Double> hSResult9) {
        return new HeartScores(hSResult, hSResult2, hSResult3, hSResult4, hSResult5, hSResult6, hSResult7, hSResult8, hSResult9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartScores)) {
            return false;
        }
        HeartScores heartScores = (HeartScores) obj;
        if (u.e(this.heartScore, heartScores.heartScore) && u.e(this.ecgEngagement, heartScores.ecgEngagement) && u.e(this.bloodPressure, heartScores.bloodPressure) && u.e(this.vascularAge, heartScores.vascularAge) && u.e(this.bloodPressureBurden, heartScores.bloodPressureBurden) && u.e(this.ecgAfib, heartScores.ecgAfib) && u.e(this.bpmEngagement, heartScores.bpmEngagement) && u.e(this.nightHr, heartScores.nightHr) && u.e(this.afibBurden, heartScores.afibBurden)) {
            return true;
        }
        return false;
    }

    public final HSResult<Double> getAfibBurden() {
        return this.afibBurden;
    }

    public final HSResult<Double> getBloodPressure() {
        return this.bloodPressure;
    }

    public final HSResult<Double> getBloodPressureBurden() {
        return this.bloodPressureBurden;
    }

    public final HSResult<Double> getBpmEngagement() {
        return this.bpmEngagement;
    }

    public final HSResult<Double> getEcgAfib() {
        return this.ecgAfib;
    }

    public final HSResult<Double> getEcgEngagement() {
        return this.ecgEngagement;
    }

    public final HSResult<Double> getHeartScore() {
        return this.heartScore;
    }

    public final HSResult<Double> getNightHr() {
        return this.nightHr;
    }

    public final HSResult<Double> getVascularAge() {
        return this.vascularAge;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        HSResult<Double> hSResult = this.heartScore;
        int i11 = 0;
        if (hSResult == null) {
            hashCode = 0;
        } else {
            hashCode = hSResult.hashCode();
        }
        int i12 = hashCode * 31;
        HSResult<Double> hSResult2 = this.ecgEngagement;
        if (hSResult2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hSResult2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        HSResult<Double> hSResult3 = this.bloodPressure;
        if (hSResult3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = hSResult3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        HSResult<Double> hSResult4 = this.vascularAge;
        if (hSResult4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = hSResult4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        HSResult<Double> hSResult5 = this.bloodPressureBurden;
        if (hSResult5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = hSResult5.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        HSResult<Double> hSResult6 = this.ecgAfib;
        if (hSResult6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = hSResult6.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        HSResult<Double> hSResult7 = this.bpmEngagement;
        if (hSResult7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = hSResult7.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        HSResult<Double> hSResult8 = this.nightHr;
        if (hSResult8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = hSResult8.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        HSResult<Double> hSResult9 = this.afibBurden;
        if (hSResult9 != null) {
            i11 = hSResult9.hashCode();
        }
        return i19 + i11;
    }

    public String toString() {
        HSResult<Double> hSResult = this.heartScore;
        HSResult<Double> hSResult2 = this.ecgEngagement;
        HSResult<Double> hSResult3 = this.bloodPressure;
        HSResult<Double> hSResult4 = this.vascularAge;
        HSResult<Double> hSResult5 = this.bloodPressureBurden;
        HSResult<Double> hSResult6 = this.ecgAfib;
        HSResult<Double> hSResult7 = this.bpmEngagement;
        HSResult<Double> hSResult8 = this.nightHr;
        HSResult<Double> hSResult9 = this.afibBurden;
        return "HeartScores(heartScore=" + hSResult + ", ecgEngagement=" + hSResult2 + ", bloodPressure=" + hSResult3 + ", vascularAge=" + hSResult4 + ", bloodPressureBurden=" + hSResult5 + ", ecgAfib=" + hSResult6 + ", bpmEngagement=" + hSResult7 + ", nightHr=" + hSResult8 + ", afibBurden=" + hSResult9 + ")";
    }

    public /* synthetic */ HeartScores(HSResult hSResult, HSResult hSResult2, HSResult hSResult3, HSResult hSResult4, HSResult hSResult5, HSResult hSResult6, HSResult hSResult7, HSResult hSResult8, HSResult hSResult9, int i11, m mVar) {
        this(hSResult, (i11 & 2) != 0 ? null : hSResult2, (i11 & 4) != 0 ? null : hSResult3, (i11 & 8) != 0 ? null : hSResult4, (i11 & 16) != 0 ? null : hSResult5, (i11 & 32) != 0 ? null : hSResult6, (i11 & 64) != 0 ? null : hSResult7, (i11 & 128) != 0 ? null : hSResult8, (i11 & 256) == 0 ? hSResult9 : null);
    }
}
