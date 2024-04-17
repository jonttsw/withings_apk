package com.withings.library.ecg.diag;

import androidx.activity.b;
import androidx.appcompat.app.h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: EcgDiagnosticProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J~\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00065"}, d2 = {"Lcom/withings/library/ecg/diag/DiagnosticResult;", "", "afibStatus", "Lcom/withings/library/ecg/diag/AfibStatus;", "heartRate", "", "ecgIntervals", "Lcom/withings/library/ecg/diag/EcgIntervals;", "featuresForDebug", "", "probsForDebug", "qrsForDebug", "", "Lcom/withings/library/ecg/diag/Qrs;", "rmssd", "sdnn", "pnn50", "algoVersion", "(Lcom/withings/library/ecg/diag/AfibStatus;ILcom/withings/library/ecg/diag/EcgIntervals;[I[I[Lcom/withings/library/ecg/diag/Qrs;IIII)V", "getAfibStatus", "()Lcom/withings/library/ecg/diag/AfibStatus;", "getAlgoVersion", "()I", "getEcgIntervals", "()Lcom/withings/library/ecg/diag/EcgIntervals;", "getFeaturesForDebug", "()[I", "getHeartRate", "getPnn50", "getProbsForDebug", "getQrsForDebug", "()[Lcom/withings/library/ecg/diag/Qrs;", "[Lcom/withings/library/ecg/diag/Qrs;", "getRmssd", "getSdnn", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/withings/library/ecg/diag/AfibStatus;ILcom/withings/library/ecg/diag/EcgIntervals;[I[I[Lcom/withings/library/ecg/diag/Qrs;IIII)Lcom/withings/library/ecg/diag/DiagnosticResult;", "equals", "", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiagnosticResult {
    private final AfibStatus afibStatus;
    private final int algoVersion;
    private final EcgIntervals ecgIntervals;
    private final int[] featuresForDebug;
    private final int heartRate;
    private final int pnn50;
    private final int[] probsForDebug;
    private final Qrs[] qrsForDebug;
    private final int rmssd;
    private final int sdnn;

    public DiagnosticResult(AfibStatus afibStatus, int i11, EcgIntervals ecgIntervals, int[] iArr, int[] iArr2, Qrs[] qrsArr, int i12, int i13, int i14, int i15) {
        u.j(afibStatus, "afibStatus");
        u.j(ecgIntervals, "ecgIntervals");
        this.afibStatus = afibStatus;
        this.heartRate = i11;
        this.ecgIntervals = ecgIntervals;
        this.featuresForDebug = iArr;
        this.probsForDebug = iArr2;
        this.qrsForDebug = qrsArr;
        this.rmssd = i12;
        this.sdnn = i13;
        this.pnn50 = i14;
        this.algoVersion = i15;
    }

    public static /* synthetic */ DiagnosticResult copy$default(DiagnosticResult diagnosticResult, AfibStatus afibStatus, int i11, EcgIntervals ecgIntervals, int[] iArr, int[] iArr2, Qrs[] qrsArr, int i12, int i13, int i14, int i15, int i16, Object obj) {
        AfibStatus afibStatus2;
        int i17;
        EcgIntervals ecgIntervals2;
        int[] iArr3;
        int[] iArr4;
        Qrs[] qrsArr2;
        int i18;
        int i19;
        int i21;
        int i22;
        if ((i16 & 1) != 0) {
            afibStatus2 = diagnosticResult.afibStatus;
        } else {
            afibStatus2 = afibStatus;
        }
        if ((i16 & 2) != 0) {
            i17 = diagnosticResult.heartRate;
        } else {
            i17 = i11;
        }
        if ((i16 & 4) != 0) {
            ecgIntervals2 = diagnosticResult.ecgIntervals;
        } else {
            ecgIntervals2 = ecgIntervals;
        }
        if ((i16 & 8) != 0) {
            iArr3 = diagnosticResult.featuresForDebug;
        } else {
            iArr3 = iArr;
        }
        if ((i16 & 16) != 0) {
            iArr4 = diagnosticResult.probsForDebug;
        } else {
            iArr4 = iArr2;
        }
        if ((i16 & 32) != 0) {
            qrsArr2 = diagnosticResult.qrsForDebug;
        } else {
            qrsArr2 = qrsArr;
        }
        if ((i16 & 64) != 0) {
            i18 = diagnosticResult.rmssd;
        } else {
            i18 = i12;
        }
        if ((i16 & 128) != 0) {
            i19 = diagnosticResult.sdnn;
        } else {
            i19 = i13;
        }
        if ((i16 & 256) != 0) {
            i21 = diagnosticResult.pnn50;
        } else {
            i21 = i14;
        }
        if ((i16 & 512) != 0) {
            i22 = diagnosticResult.algoVersion;
        } else {
            i22 = i15;
        }
        return diagnosticResult.copy(afibStatus2, i17, ecgIntervals2, iArr3, iArr4, qrsArr2, i18, i19, i21, i22);
    }

    public final AfibStatus component1() {
        return this.afibStatus;
    }

    public final int component10() {
        return this.algoVersion;
    }

    public final int component2() {
        return this.heartRate;
    }

    public final EcgIntervals component3() {
        return this.ecgIntervals;
    }

    public final int[] component4() {
        return this.featuresForDebug;
    }

    public final int[] component5() {
        return this.probsForDebug;
    }

    public final Qrs[] component6() {
        return this.qrsForDebug;
    }

    public final int component7() {
        return this.rmssd;
    }

    public final int component8() {
        return this.sdnn;
    }

    public final int component9() {
        return this.pnn50;
    }

    public final DiagnosticResult copy(AfibStatus afibStatus, int i11, EcgIntervals ecgIntervals, int[] iArr, int[] iArr2, Qrs[] qrsArr, int i12, int i13, int i14, int i15) {
        u.j(afibStatus, "afibStatus");
        u.j(ecgIntervals, "ecgIntervals");
        return new DiagnosticResult(afibStatus, i11, ecgIntervals, iArr, iArr2, qrsArr, i12, i13, i14, i15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticResult)) {
            return false;
        }
        DiagnosticResult diagnosticResult = (DiagnosticResult) obj;
        if (this.afibStatus == diagnosticResult.afibStatus && this.heartRate == diagnosticResult.heartRate && u.e(this.ecgIntervals, diagnosticResult.ecgIntervals) && u.e(this.featuresForDebug, diagnosticResult.featuresForDebug) && u.e(this.probsForDebug, diagnosticResult.probsForDebug) && u.e(this.qrsForDebug, diagnosticResult.qrsForDebug) && this.rmssd == diagnosticResult.rmssd && this.sdnn == diagnosticResult.sdnn && this.pnn50 == diagnosticResult.pnn50 && this.algoVersion == diagnosticResult.algoVersion) {
            return true;
        }
        return false;
    }

    public final AfibStatus getAfibStatus() {
        return this.afibStatus;
    }

    public final int getAlgoVersion() {
        return this.algoVersion;
    }

    public final EcgIntervals getEcgIntervals() {
        return this.ecgIntervals;
    }

    public final int[] getFeaturesForDebug() {
        return this.featuresForDebug;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getPnn50() {
        return this.pnn50;
    }

    public final int[] getProbsForDebug() {
        return this.probsForDebug;
    }

    public final Qrs[] getQrsForDebug() {
        return this.qrsForDebug;
    }

    public final int getRmssd() {
        return this.rmssd;
    }

    public final int getSdnn() {
        return this.sdnn;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.ecgIntervals.hashCode() + h.a(this.heartRate, this.afibStatus.hashCode() * 31, 31)) * 31;
        int[] iArr = this.featuresForDebug;
        int i11 = 0;
        if (iArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(iArr);
        }
        int i12 = (hashCode3 + hashCode) * 31;
        int[] iArr2 = this.probsForDebug;
        if (iArr2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Arrays.hashCode(iArr2);
        }
        int i13 = (i12 + hashCode2) * 31;
        Qrs[] qrsArr = this.qrsForDebug;
        if (qrsArr != null) {
            i11 = Arrays.hashCode(qrsArr);
        }
        return Integer.hashCode(this.algoVersion) + h.a(this.pnn50, h.a(this.sdnn, h.a(this.rmssd, (i13 + i11) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DiagnosticResult(afibStatus=");
        sb2.append(this.afibStatus);
        sb2.append(", heartRate=");
        sb2.append(this.heartRate);
        sb2.append(", ecgIntervals=");
        sb2.append(this.ecgIntervals);
        sb2.append(", featuresForDebug=");
        sb2.append(Arrays.toString(this.featuresForDebug));
        sb2.append(", probsForDebug=");
        sb2.append(Arrays.toString(this.probsForDebug));
        sb2.append(", qrsForDebug=");
        sb2.append(Arrays.toString(this.qrsForDebug));
        sb2.append(", rmssd=");
        sb2.append(this.rmssd);
        sb2.append(", sdnn=");
        sb2.append(this.sdnn);
        sb2.append(", pnn50=");
        sb2.append(this.pnn50);
        sb2.append(", algoVersion=");
        return b.c(sb2, this.algoVersion, ')');
    }

    public /* synthetic */ DiagnosticResult(AfibStatus afibStatus, int i11, EcgIntervals ecgIntervals, int[] iArr, int[] iArr2, Qrs[] qrsArr, int i12, int i13, int i14, int i15, int i16, m mVar) {
        this(afibStatus, i11, ecgIntervals, iArr, iArr2, qrsArr, i12, i13, i14, (i16 & 512) != 0 ? 0 : i15);
    }
}
