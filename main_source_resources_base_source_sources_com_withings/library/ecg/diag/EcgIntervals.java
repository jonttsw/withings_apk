package com.withings.library.ecg.diag;

import androidx.activity.b;
import androidx.appcompat.app.h;
import kotlin.Metadata;
/* compiled from: EcgDiagnosticProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/withings/library/ecg/diag/EcgIntervals;", "", "qrs", "", "pr", "qt", "qtc", "(IIII)V", "getPr", "()I", "getQrs", "getQt", "getQtc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgIntervals {

    /* renamed from: pr  reason: collision with root package name */
    private final int f40631pr;
    private final int qrs;

    /* renamed from: qt  reason: collision with root package name */
    private final int f40632qt;
    private final int qtc;

    public EcgIntervals(int i11, int i12, int i13, int i14) {
        this.qrs = i11;
        this.f40631pr = i12;
        this.f40632qt = i13;
        this.qtc = i14;
    }

    public static /* synthetic */ EcgIntervals copy$default(EcgIntervals ecgIntervals, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = ecgIntervals.qrs;
        }
        if ((i15 & 2) != 0) {
            i12 = ecgIntervals.f40631pr;
        }
        if ((i15 & 4) != 0) {
            i13 = ecgIntervals.f40632qt;
        }
        if ((i15 & 8) != 0) {
            i14 = ecgIntervals.qtc;
        }
        return ecgIntervals.copy(i11, i12, i13, i14);
    }

    public final int component1() {
        return this.qrs;
    }

    public final int component2() {
        return this.f40631pr;
    }

    public final int component3() {
        return this.f40632qt;
    }

    public final int component4() {
        return this.qtc;
    }

    public final EcgIntervals copy(int i11, int i12, int i13, int i14) {
        return new EcgIntervals(i11, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcgIntervals)) {
            return false;
        }
        EcgIntervals ecgIntervals = (EcgIntervals) obj;
        if (this.qrs == ecgIntervals.qrs && this.f40631pr == ecgIntervals.f40631pr && this.f40632qt == ecgIntervals.f40632qt && this.qtc == ecgIntervals.qtc) {
            return true;
        }
        return false;
    }

    public final int getPr() {
        return this.f40631pr;
    }

    public final int getQrs() {
        return this.qrs;
    }

    public final int getQt() {
        return this.f40632qt;
    }

    public final int getQtc() {
        return this.qtc;
    }

    public int hashCode() {
        return Integer.hashCode(this.qtc) + h.a(this.f40632qt, h.a(this.f40631pr, Integer.hashCode(this.qrs) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EcgIntervals(qrs=");
        sb2.append(this.qrs);
        sb2.append(", pr=");
        sb2.append(this.f40631pr);
        sb2.append(", qt=");
        sb2.append(this.f40632qt);
        sb2.append(", qtc=");
        return b.c(sb2, this.qtc, ')');
    }
}
