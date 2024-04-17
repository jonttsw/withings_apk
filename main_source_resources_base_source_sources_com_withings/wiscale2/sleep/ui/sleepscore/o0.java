package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.feature.addNote.AddManualLogActivity;
import com.withings.wiscale2.track.data.Track;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k0 k0Var) {
        super(0);
        this.f61180a = k0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Track track;
        Long l5;
        int i11 = AddManualLogActivity.f40697k;
        k0 k0Var = this.f61180a;
        Context requireContext = k0Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long id2 = k0Var.S1().getId();
        LogType logType = LogType.f40693a;
        track = k0Var.f61069k;
        if (track != null) {
            l5 = track.getId();
        } else {
            l5 = null;
        }
        k0Var.startActivity(AddManualLogActivity.a.a(requireContext, id2, logType, null, l5, null, 40));
        return nm0.y.f85009a;
    }
}
