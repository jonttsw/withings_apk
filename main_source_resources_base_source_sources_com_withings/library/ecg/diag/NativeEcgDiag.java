package com.withings.library.ecg.diag;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.p003native.EcgNative;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeEcgDiag.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withings/library/ecg/diag/NativeEcgDiag;", "", "", "frequency", "gain", "flip", "deviceModel", "", "init", "(IIII)J", "contextPointer", "", "values", "nbSample", "", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "Lcom/withings/library/ecg/diag/DiagnosticResult;", "getDiagnosticAndHr", "(J[SIZ)Lcom/withings/library/ecg/diag/DiagnosticResult;", "Lnm0/y;", "finish", "(J)V", "getAlgoVersion", "(I)I", "<init>", "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class NativeEcgDiag {
    public final void finish(long j5) {
        EcgNative.INSTANCE.finish(j5);
    }

    public final int getAlgoVersion(int i11) {
        return EcgNative.INSTANCE.getAlgoVersion(i11);
    }

    public final DiagnosticResult getDiagnosticAndHr(long j5, short[] values, int i11, boolean z5) {
        u.j(values, "values");
        return EcgNative.INSTANCE.getDiagnosticAndHr(j5, values, i11, z5);
    }

    public final long init(int i11, int i12, int i13, int i14) {
        return EcgNative.INSTANCE.init(i11, i12, i13, i14);
    }
}
