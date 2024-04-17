package com.withings.wiscale2.device.common.ui;

import com.google.android.material.card.MaterialCardView;
import com.withings.features.platform.api.PlatformFeatureHelper;
/* compiled from: RespiratoryScanSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class d2 implements ym0.p<Integer, gi.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanSettingsActivity f53791a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity) {
        this.f53791a = respiratoryScanSettingsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, gi.b bVar) {
        boolean z5;
        int intValue = num.intValue();
        gi.b info = bVar;
        kotlin.jvm.internal.u.j(info, "info");
        boolean b10 = info.b();
        RespiratoryScanSettingsActivity respiratoryScanSettingsActivity = this.f53791a;
        if (b10) {
            respiratoryScanSettingsActivity.f53747k = intValue;
            MaterialCardView materialCardView = respiratoryScanSettingsActivity.H3().f99225f;
            if (intValue != PlatformFeatureHelper.RespiratoryScanState.Off.ordinal()) {
                z5 = true;
            } else {
                z5 = false;
            }
            materialCardView.setEnabled(z5);
        }
        RespiratoryScanSettingsActivity.C3(respiratoryScanSettingsActivity).t0(null, intValue);
        return nm0.y.f85009a;
    }
}
