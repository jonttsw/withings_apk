package com.withings.library.ecg.filter.v1;

import com.withings.library.ecg.filter.EcgFilter;
import com.withings.library.ecg.p003native.EcgNative;
import com.withings.library.ecg.p003native.NativeHrListener;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeEcgFilter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withings/library/ecg/filter/v1/NativeEcgFilter;", "", "", "frequency", "mode", "nbSample", "flip", "gain", "deviceModel", "Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "hrListener", "", "init", "(IIIIIILcom/withings/library/ecg/filter/EcgFilter$HrListener;)J", "contextPointer", "", "values", "filterAll", "(JI[S)[S", "Lnm0/y;", "finish", "(J)V", "<init>", "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class NativeEcgFilter {
    public final short[] filterAll(long j5, int i11, short[] values) {
        u.j(values, "values");
        return EcgNative.INSTANCE.filterAll(j5, i11, values);
    }

    public final void finish(long j5) {
        EcgNative.INSTANCE.filterFinish(j5);
    }

    public final long init(int i11, int i12, int i13, int i14, int i15, int i16, final EcgFilter.HrListener hrListener) {
        return EcgNative.INSTANCE.filterInit(i11, i12, i13, i14, i15, i16, new NativeHrListener() { // from class: com.withings.library.ecg.filter.v1.NativeEcgFilter$init$1
            @Override // com.withings.library.ecg.p003native.NativeHrListener
            public void onHrReceived(int i17, int i18) {
                EcgFilter.HrListener hrListener2 = EcgFilter.HrListener.this;
                if (hrListener2 != null) {
                    hrListener2.onHrReceived(i17);
                }
            }
        });
    }
}
