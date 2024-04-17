package com.withings.library.ecg.diag;

import androidx.activity.b;
import kotlin.Metadata;
/* compiled from: EcgDiagnosticProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/library/ecg/diag/Qrs;", "", "start", "", "width", "(II)V", "getStart", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Qrs {
    private final int start;
    private final int width;

    public Qrs(int i11, int i12) {
        this.start = i11;
        this.width = i12;
    }

    public static /* synthetic */ Qrs copy$default(Qrs qrs, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = qrs.start;
        }
        if ((i13 & 2) != 0) {
            i12 = qrs.width;
        }
        return qrs.copy(i11, i12);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.width;
    }

    public final Qrs copy(int i11, int i12) {
        return new Qrs(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qrs)) {
            return false;
        }
        Qrs qrs = (Qrs) obj;
        if (this.start == qrs.start && this.width == qrs.width) {
            return true;
        }
        return false;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.width) + (Integer.hashCode(this.start) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Qrs(start=");
        sb2.append(this.start);
        sb2.append(", width=");
        return b.c(sb2, this.width, ')');
    }
}
