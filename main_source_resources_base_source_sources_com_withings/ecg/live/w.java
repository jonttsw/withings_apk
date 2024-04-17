package com.withings.ecg.live;

import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38712a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38712a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        int i11;
        Long l6 = l5;
        if (l6 != null) {
            long longValue = l6.longValue();
            LiveEcgActivity liveEcgActivity = this.f38712a;
            LiveEcgActivity.A3(liveEcgActivity).setText(String.valueOf(longValue));
            TextView B3 = LiveEcgActivity.B3(liveEcgActivity);
            int i12 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            if (i12 == 0 || longValue == 1) {
                i11 = C1987R.string.ecg_live_liveCountdownSecondMessage;
            } else {
                i11 = C1987R.string.ecg_live_liveCountdownMessage;
            }
            B3.setText(liveEcgActivity.getString(i11));
            if (i12 <= 0) {
                LiveEcgActivity.L3(liveEcgActivity);
            }
        }
        return nm0.y.f85009a;
    }
}
