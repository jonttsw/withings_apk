package com.withings.nervehealthscore;

import com.withings.nervehealthscore.NeuropathyMeasureNative;
import kotlin.Metadata;
/* compiled from: NeuropathyMeasureNative.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toSudoMode", "Lcom/withings/nervehealthscore/NeuropathyMeasureNative$SudoMode;", "", "nervehealthscore_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NeuropathyMeasureNativeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NeuropathyMeasureNative.SudoMode toSudoMode(int i11) {
        if (i11 == 1) {
            return NeuropathyMeasureNative.SudoMode.SUDO_MODE_GUIDED_SCAN;
        }
        return NeuropathyMeasureNative.SudoMode.SUDO_MODE_ROUTINE;
    }
}
