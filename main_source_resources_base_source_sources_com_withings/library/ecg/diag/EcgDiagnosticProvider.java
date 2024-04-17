package com.withings.library.ecg.diag;

import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.WearPosition;
import com.withings.library.ecg.filter.v1.EcgFilterV1;
import com.withings.library.ecg.leads.EcgLeadsProvider;
import com.withings.library.ecg.parser.decompressor.DecompressionException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgDiagnosticProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/library/ecg/diag/EcgDiagnosticProvider;", "", "()V", "nativeEcgDiag", "Lcom/withings/library/ecg/diag/NativeEcgDiag;", "computeDiagnostic", "Lcom/withings/library/ecg/diag/DiagnosticResult;", "frequency", "", "gain", "wearPosition", "Lcom/withings/library/ecg/WearPosition;", "deviceModel", "duration", "", "debugMode", "", "ecgSignal", "Lcom/withings/library/ecg/EcgSignal;", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgDiagnosticProvider {
    private final NativeEcgDiag nativeEcgDiag = new NativeEcgDiag();

    public final DiagnosticResult computeDiagnostic(int i11, int i12, WearPosition wearPosition, int i13, long j5, boolean z5, EcgSignal ecgSignal) throws DecompressionException {
        EcgFilterV1.FlipMode flipMode;
        u.j(wearPosition, "wearPosition");
        u.j(ecgSignal, "ecgSignal");
        if (wearPosition == WearPosition.WRIST_RIGHT) {
            flipMode = EcgFilterV1.FlipMode.FLIP;
        } else {
            flipMode = EcgFilterV1.FlipMode.NO_FLIP;
        }
        long init = this.nativeEcgDiag.init(i11, i12, flipMode.getValue(), i13);
        Object obj = EcgLeadsProvider.computeLeads$default(new EcgLeadsProvider(i11, i12), ecgSignal, false, 2, null).get(ecgSignal.getSignalType().getDiagnosticLead());
        u.g(obj);
        short[] sArr = (short[]) obj;
        int i14 = (int) (i11 * j5);
        if (sArr.length < i14) {
            i14 = sArr.length;
        }
        DiagnosticResult diagnosticAndHr = this.nativeEcgDiag.getDiagnosticAndHr(init, sArr, i14, z5);
        int algoVersion = this.nativeEcgDiag.getAlgoVersion(i13);
        this.nativeEcgDiag.finish(init);
        return DiagnosticResult.copy$default(diagnosticAndHr, null, 0, null, null, null, null, 0, 0, 0, algoVersion, 511, null);
    }
}
