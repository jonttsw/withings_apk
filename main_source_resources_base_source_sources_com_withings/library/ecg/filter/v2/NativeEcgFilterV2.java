package com.withings.library.ecg.filter.v2;

import com.withings.library.ecg.p003native.EcgNativeV2;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: NativeEcgFilterV2.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withings/library/ecg/filter/v2/NativeEcgFilterV2;", "", "", "frequency", "gain", "Lnm0/j;", "", "init", "(II)Lnm0/j;", "tracingFilterContextPointer", "afibClassificationContextPointer", "", "values", "filterAll", "(JJ[I)[I", "Lcom/withings/library/ecg/filter/v2/BatchResult;", "filterBatch", "(JJ[I)Lcom/withings/library/ecg/filter/v2/BatchResult;", "Lnm0/y;", "finish", "(JJ)V", "<init>", "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class NativeEcgFilterV2 {
    public final int[] filterAll(long j5, long j11, int[] values) {
        u.j(values, "values");
        return EcgNativeV2.INSTANCE.filterAll(j5, j11, values);
    }

    public final BatchResult filterBatch(long j5, long j11, int[] values) {
        u.j(values, "values");
        return EcgNativeV2.INSTANCE.filterBatch(j5, j11, values);
    }

    public final void finish(long j5, long j11) {
        EcgNativeV2.INSTANCE.filterFinish(j5, j11);
    }

    public final j<Long, Long> init(int i11, int i12) {
        EcgNativeV2.ContextPair filterInit = EcgNativeV2.INSTANCE.filterInit(i11, i12);
        return new j<>(Long.valueOf(filterInit.getFilter()), Long.valueOf(filterInit.getAfib()));
    }
}
