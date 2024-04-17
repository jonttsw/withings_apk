package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.fragment.app.FragmentActivity;
/* compiled from: SleepDisorderDayPagerFragment.kt */
/* loaded from: classes5.dex */
final class y1 extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends Boolean>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f61563a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(t1 t1Var) {
        super(1);
        this.f61563a = t1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends Boolean> cVar) {
        FragmentActivity activity;
        if (kotlin.jvm.internal.u.e(cVar.a(), Boolean.TRUE) && (activity = this.f61563a.getActivity()) != null) {
            activity.finish();
        }
        return nm0.y.f85009a;
    }
}
