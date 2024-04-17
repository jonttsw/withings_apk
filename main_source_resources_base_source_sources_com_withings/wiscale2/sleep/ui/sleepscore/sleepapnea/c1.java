package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.fragment.app.FragmentActivity;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends Boolean>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f61289a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(w0 w0Var) {
        super(1);
        this.f61289a = w0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends Boolean> cVar) {
        FragmentActivity activity;
        if (kotlin.jvm.internal.u.e(cVar.a(), Boolean.TRUE) && (activity = this.f61289a.getActivity()) != null) {
            activity.finish();
        }
        return nm0.y.f85009a;
    }
}
