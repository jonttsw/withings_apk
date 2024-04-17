package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.views.view.ToggleCellView;
import com.withings.views.widget.LineCellView;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<HRThresholdMode, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity f52313a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        super(1);
        this.f52313a = highLowHRSettingsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(HRThresholdMode hRThresholdMode) {
        tb0.x J3;
        tb0.x J32;
        tb0.x J33;
        HRThresholdMode hRThresholdMode2 = hRThresholdMode;
        HighLowHRSettingsActivity highLowHRSettingsActivity = this.f52313a;
        J3 = highLowHRSettingsActivity.J3();
        LineCellView lowHeartrateThreshold = J3.f99603f;
        kotlin.jvm.internal.u.i(lowHeartrateThreshold, "lowHeartrateThreshold");
        kotlin.jvm.internal.u.g(hRThresholdMode2);
        HighLowHRSettingsActivity.B3(highLowHRSettingsActivity, lowHeartrateThreshold, hRThresholdMode2);
        J32 = highLowHRSettingsActivity.J3();
        LineCellView highHeartrateThreshold = J32.f99601d;
        kotlin.jvm.internal.u.i(highHeartrateThreshold, "highHeartrateThreshold");
        HighLowHRSettingsActivity.B3(highLowHRSettingsActivity, highHeartrateThreshold, hRThresholdMode2);
        J33 = highLowHRSettingsActivity.J3();
        ToggleCellView heartrateNotificationsToggle = J33.f99600c;
        kotlin.jvm.internal.u.i(heartrateNotificationsToggle, "heartrateNotificationsToggle");
        if (hRThresholdMode2 != HRThresholdMode.f52173a) {
            heartrateNotificationsToggle.y();
        } else {
            heartrateNotificationsToggle.w();
        }
        HighLowHRSettingsActivity.C3(highLowHRSettingsActivity);
        return nm0.y.f85009a;
    }
}
