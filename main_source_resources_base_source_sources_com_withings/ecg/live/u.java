package com.withings.ecg.live;

import android.widget.TextView;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38710a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38710a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        c N3;
        int intValue = num.intValue();
        LiveEcgActivity liveEcgActivity = this.f38710a;
        N3 = liveEcgActivity.N3();
        if (kotlin.jvm.internal.u.e(N3.V0().getValue(), Boolean.TRUE)) {
            LiveEcgActivity.E3(liveEcgActivity).setText("");
        } else {
            TextView E3 = LiveEcgActivity.E3(liveEcgActivity);
            E3.setText(intValue + " fps");
        }
        return nm0.y.f85009a;
    }
}
