package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.p4;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<p4, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var) {
        super(1);
        this.f61138a = k0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(p4 p4Var) {
        SleepDisorderSectionView sleepDisorderSectionView;
        p4 p4Var2 = p4Var;
        boolean z5 = p4Var2 instanceof p4.b;
        k0 k0Var = this.f61138a;
        if (z5) {
            k0Var.X1(true);
        } else if (p4Var2 instanceof p4.a) {
            sleepDisorderSectionView = k0Var.X;
            if (sleepDisorderSectionView != null) {
                p4.a aVar = (p4.a) p4Var2;
                sleepDisorderSectionView.t(aVar.a(), k0Var);
                k0.O1(k0Var, aVar.a());
            } else {
                kotlin.jvm.internal.u.s("sleepDisorder");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
