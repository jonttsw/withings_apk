package com.withings.nutrisync.ui;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: VitaminCDatavizActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class h extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(VitaminCDatavizActivity vitaminCDatavizActivity) {
        super(0, vitaminCDatavizActivity, VitaminCDatavizActivity.class, "onSecondaryCardHelpClick", "onSecondaryCardHelpClick()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        VitaminCDatavizActivity vitaminCDatavizActivity = (VitaminCDatavizActivity) this.receiver;
        int i11 = VitaminCDatavizActivity.f43204j;
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = vitaminCDatavizActivity.getString(C1987R.string.cycleTracking_analysis_url);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        vitaminCDatavizActivity.startActivity(aVar.c(vitaminCDatavizActivity, null, string));
        return nm0.y.f85009a;
    }
}
