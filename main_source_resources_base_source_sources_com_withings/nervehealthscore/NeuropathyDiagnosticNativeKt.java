package com.withings.nervehealthscore;

import com.withings.nervehealthscore.NeuropathyDiagnosticNative;
import kotlin.Metadata;
/* compiled from: NeuropathyDiagnosticNative.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toSudoStatus", "Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative$SudoStatus;", "", "nervehealthscore_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NeuropathyDiagnosticNativeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NeuropathyDiagnosticNative.SudoStatus toSudoStatus(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_INCONCLUSIVE;
                }
                return NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_PENDING;
            }
            return NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_SIGNS_OF_NEUROPATHY;
        }
        return NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_NORMAL;
    }
}
