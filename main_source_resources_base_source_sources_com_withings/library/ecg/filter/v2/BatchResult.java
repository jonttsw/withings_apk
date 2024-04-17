package com.withings.library.ecg.filter.v2;

import androidx.activity.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BatchResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/library/ecg/filter/v2/BatchResult;", "", "filtered", "", "hr", "", "([II)V", "getFiltered", "()[I", "getHr", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BatchResult {
    private final int[] filtered;

    /* renamed from: hr  reason: collision with root package name */
    private final int f40633hr;

    public BatchResult(int[] filtered, int i11) {
        u.j(filtered, "filtered");
        this.filtered = filtered;
        this.f40633hr = i11;
    }

    public static /* synthetic */ BatchResult copy$default(BatchResult batchResult, int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iArr = batchResult.filtered;
        }
        if ((i12 & 2) != 0) {
            i11 = batchResult.f40633hr;
        }
        return batchResult.copy(iArr, i11);
    }

    public final int[] component1() {
        return this.filtered;
    }

    public final int component2() {
        return this.f40633hr;
    }

    public final BatchResult copy(int[] filtered, int i11) {
        u.j(filtered, "filtered");
        return new BatchResult(filtered, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchResult)) {
            return false;
        }
        BatchResult batchResult = (BatchResult) obj;
        if (u.e(this.filtered, batchResult.filtered) && this.f40633hr == batchResult.f40633hr) {
            return true;
        }
        return false;
    }

    public final int[] getFiltered() {
        return this.filtered;
    }

    public final int getHr() {
        return this.f40633hr;
    }

    public int hashCode() {
        return Integer.hashCode(this.f40633hr) + (Arrays.hashCode(this.filtered) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BatchResult(filtered=");
        sb2.append(Arrays.toString(this.filtered));
        sb2.append(", hr=");
        return b.c(sb2, this.f40633hr, ')');
    }
}
