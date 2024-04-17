package com.withings.ecg.live;

import android.widget.TextView;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38715a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38715a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        LiveEcgActivity liveEcgActivity = this.f38715a;
        if (booleanValue) {
            LiveEcgActivity.K3(liveEcgActivity);
            TextView F3 = LiveEcgActivity.F3(liveEcgActivity);
            kotlin.jvm.internal.u.i(F3, "access$getLiveHR(...)");
            F3.setVisibility(8);
        } else {
            LiveEcgActivity.J3(liveEcgActivity);
        }
        return nm0.y.f85009a;
    }
}
