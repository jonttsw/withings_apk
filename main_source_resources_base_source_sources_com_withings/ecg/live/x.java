package com.withings.ecg.live;

import android.widget.ProgressBar;
import android.widget.TextView;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38713a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38713a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        LiveEcgActivity liveEcgActivity = this.f38713a;
        TextView F3 = LiveEcgActivity.F3(liveEcgActivity);
        kotlin.jvm.internal.u.i(F3, "access$getLiveHR(...)");
        F3.setVisibility(8);
        TextView A3 = LiveEcgActivity.A3(liveEcgActivity);
        kotlin.jvm.internal.u.i(A3, "access$getCountdown(...)");
        A3.setVisibility(8);
        TextView B3 = LiveEcgActivity.B3(liveEcgActivity);
        kotlin.jvm.internal.u.i(B3, "access$getCountdownUnit(...)");
        B3.setVisibility(8);
        ProgressBar G3 = LiveEcgActivity.G3(liveEcgActivity);
        kotlin.jvm.internal.u.i(G3, "access$getLoading(...)");
        G3.setVisibility(0);
        return nm0.y.f85009a;
    }
}
