package com.withings.ecg.live;

import android.widget.TextView;
import com.withings.ecg.live.c;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<c.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38711a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(c.a aVar) {
        int i11;
        c N3;
        c.a aVar2 = aVar;
        if (aVar2 != null) {
            LiveEcgActivity liveEcgActivity = this.f38711a;
            LiveEcgActivity.D3(liveEcgActivity).n(aVar2.a());
            TextView E3 = LiveEcgActivity.E3(liveEcgActivity);
            kotlin.jvm.internal.u.i(E3, "access$getFrameRateView(...)");
            if (androidx.compose.foundation.lazy.layout.d.h()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            E3.setVisibility(i11);
            LiveEcgActivity.D3(liveEcgActivity).m(new u(liveEcgActivity));
            N3 = liveEcgActivity.N3();
            N3.K0().removeObservers(liveEcgActivity);
        }
        return nm0.y.f85009a;
    }
}
