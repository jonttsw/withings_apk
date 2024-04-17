package com.withings.library.vo2.firstbeat;

import androidx.activity.b;
import androidx.appcompat.app.h;
import com.withings.library.vo2.Vo2MaxComputeStatus;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EteResults.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lcom/withings/library/vo2/firstbeat/EteResults;", "", "status", "Lcom/withings/library/vo2/Vo2MaxComputeStatus;", "correctedHr", "", "artifactPercent", "minimalHr", "maximalHr", "trainingLoadPeak", "maximalMet", "", "maximalMetMinutes", "(Lcom/withings/library/vo2/Vo2MaxComputeStatus;IIIII[II)V", "getArtifactPercent", "()I", "getCorrectedHr", "getMaximalHr", "getMaximalMet", "()[I", "getMaximalMetMinutes", "getMinimalHr", "getStatus", "()Lcom/withings/library/vo2/Vo2MaxComputeStatus;", "getTrainingLoadPeak", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EteResults {
    private final int artifactPercent;
    private final int correctedHr;
    private final int maximalHr;
    private final int[] maximalMet;
    private final int maximalMetMinutes;
    private final int minimalHr;
    private final Vo2MaxComputeStatus status;
    private final int trainingLoadPeak;

    public EteResults(Vo2MaxComputeStatus status, int i11, int i12, int i13, int i14, int i15, int[] maximalMet, int i16) {
        u.j(status, "status");
        u.j(maximalMet, "maximalMet");
        this.status = status;
        this.correctedHr = i11;
        this.artifactPercent = i12;
        this.minimalHr = i13;
        this.maximalHr = i14;
        this.trainingLoadPeak = i15;
        this.maximalMet = maximalMet;
        this.maximalMetMinutes = i16;
    }

    public static /* synthetic */ EteResults copy$default(EteResults eteResults, Vo2MaxComputeStatus vo2MaxComputeStatus, int i11, int i12, int i13, int i14, int i15, int[] iArr, int i16, int i17, Object obj) {
        Vo2MaxComputeStatus vo2MaxComputeStatus2;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int[] iArr2;
        int i24;
        if ((i17 & 1) != 0) {
            vo2MaxComputeStatus2 = eteResults.status;
        } else {
            vo2MaxComputeStatus2 = vo2MaxComputeStatus;
        }
        if ((i17 & 2) != 0) {
            i18 = eteResults.correctedHr;
        } else {
            i18 = i11;
        }
        if ((i17 & 4) != 0) {
            i19 = eteResults.artifactPercent;
        } else {
            i19 = i12;
        }
        if ((i17 & 8) != 0) {
            i21 = eteResults.minimalHr;
        } else {
            i21 = i13;
        }
        if ((i17 & 16) != 0) {
            i22 = eteResults.maximalHr;
        } else {
            i22 = i14;
        }
        if ((i17 & 32) != 0) {
            i23 = eteResults.trainingLoadPeak;
        } else {
            i23 = i15;
        }
        if ((i17 & 64) != 0) {
            iArr2 = eteResults.maximalMet;
        } else {
            iArr2 = iArr;
        }
        if ((i17 & 128) != 0) {
            i24 = eteResults.maximalMetMinutes;
        } else {
            i24 = i16;
        }
        return eteResults.copy(vo2MaxComputeStatus2, i18, i19, i21, i22, i23, iArr2, i24);
    }

    public final Vo2MaxComputeStatus component1() {
        return this.status;
    }

    public final int component2() {
        return this.correctedHr;
    }

    public final int component3() {
        return this.artifactPercent;
    }

    public final int component4() {
        return this.minimalHr;
    }

    public final int component5() {
        return this.maximalHr;
    }

    public final int component6() {
        return this.trainingLoadPeak;
    }

    public final int[] component7() {
        return this.maximalMet;
    }

    public final int component8() {
        return this.maximalMetMinutes;
    }

    public final EteResults copy(Vo2MaxComputeStatus status, int i11, int i12, int i13, int i14, int i15, int[] maximalMet, int i16) {
        u.j(status, "status");
        u.j(maximalMet, "maximalMet");
        return new EteResults(status, i11, i12, i13, i14, i15, maximalMet, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EteResults)) {
            return false;
        }
        EteResults eteResults = (EteResults) obj;
        if (this.status == eteResults.status && this.correctedHr == eteResults.correctedHr && this.artifactPercent == eteResults.artifactPercent && this.minimalHr == eteResults.minimalHr && this.maximalHr == eteResults.maximalHr && this.trainingLoadPeak == eteResults.trainingLoadPeak && u.e(this.maximalMet, eteResults.maximalMet) && this.maximalMetMinutes == eteResults.maximalMetMinutes) {
            return true;
        }
        return false;
    }

    public final int getArtifactPercent() {
        return this.artifactPercent;
    }

    public final int getCorrectedHr() {
        return this.correctedHr;
    }

    public final int getMaximalHr() {
        return this.maximalHr;
    }

    public final int[] getMaximalMet() {
        return this.maximalMet;
    }

    public final int getMaximalMetMinutes() {
        return this.maximalMetMinutes;
    }

    public final int getMinimalHr() {
        return this.minimalHr;
    }

    public final Vo2MaxComputeStatus getStatus() {
        return this.status;
    }

    public final int getTrainingLoadPeak() {
        return this.trainingLoadPeak;
    }

    public int hashCode() {
        int a11 = h.a(this.trainingLoadPeak, h.a(this.maximalHr, h.a(this.minimalHr, h.a(this.artifactPercent, h.a(this.correctedHr, this.status.hashCode() * 31, 31), 31), 31), 31), 31);
        return Integer.hashCode(this.maximalMetMinutes) + ((Arrays.hashCode(this.maximalMet) + a11) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EteResults(status=");
        sb2.append(this.status);
        sb2.append(", correctedHr=");
        sb2.append(this.correctedHr);
        sb2.append(", artifactPercent=");
        sb2.append(this.artifactPercent);
        sb2.append(", minimalHr=");
        sb2.append(this.minimalHr);
        sb2.append(", maximalHr=");
        sb2.append(this.maximalHr);
        sb2.append(", trainingLoadPeak=");
        sb2.append(this.trainingLoadPeak);
        sb2.append(", maximalMet=");
        sb2.append(Arrays.toString(this.maximalMet));
        sb2.append(", maximalMetMinutes=");
        return b.c(sb2, this.maximalMetMinutes, ')');
    }
}
