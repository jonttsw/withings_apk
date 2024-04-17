package com.withings.cycletracking.ui;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final /* synthetic */ class m extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(CycleTrackingActivity cycleTrackingActivity) {
        super(0, cycleTrackingActivity, CycleTrackingActivity.class, "onAnalysisHelpClick", "onAnalysisHelpClick()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        CycleTrackingActivity cycleTrackingActivity = (CycleTrackingActivity) this.receiver;
        fn0.k<Object>[] kVarArr = CycleTrackingActivity.f35469l;
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = cycleTrackingActivity.getString(C1987R.string.cycleTracking_analysis_url);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        cycleTrackingActivity.startActivity(aVar.c(cycleTrackingActivity, null, string));
        v70.a.e("cycle_logs", "learn_more_about_cycle_analysis", null, true, 4);
        return nm0.y.f85009a;
    }
}
