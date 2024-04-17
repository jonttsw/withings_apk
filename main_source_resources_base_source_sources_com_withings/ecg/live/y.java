package com.withings.ecg.live;

import android.widget.ProgressBar;
import android.widget.TextView;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38714a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        int i11;
        int i12;
        int i13;
        boolean e11 = kotlin.jvm.internal.u.e(bool, Boolean.TRUE);
        LiveEcgActivity liveEcgActivity = this.f38714a;
        TextView F3 = LiveEcgActivity.F3(liveEcgActivity);
        kotlin.jvm.internal.u.i(F3, "access$getLiveHR(...)");
        int i14 = 8;
        if (e11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        F3.setVisibility(i11);
        LiveEcgActivity.F3(liveEcgActivity).setText("-");
        TextView A3 = LiveEcgActivity.A3(liveEcgActivity);
        kotlin.jvm.internal.u.i(A3, "access$getCountdown(...)");
        if (e11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        A3.setVisibility(i12);
        TextView B3 = LiveEcgActivity.B3(liveEcgActivity);
        kotlin.jvm.internal.u.i(B3, "access$getCountdownUnit(...)");
        if (e11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        B3.setVisibility(i13);
        ProgressBar G3 = LiveEcgActivity.G3(liveEcgActivity);
        kotlin.jvm.internal.u.i(G3, "access$getLoading(...)");
        if (!e11) {
            i14 = 0;
        }
        G3.setVisibility(i14);
        if (e11) {
            Iterable<pb.f> i15 = ((lb.i) LiveEcgActivity.z3(liveEcgActivity).getData()).i();
            kotlin.jvm.internal.u.i(i15, "getDataSets(...)");
            for (pb.f fVar : i15) {
                fVar.clear();
            }
        }
        return nm0.y.f85009a;
    }
}
