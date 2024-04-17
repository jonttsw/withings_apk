package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.views.view.BlockableViewPager;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
final class a1 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f61279a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(w0 w0Var) {
        super(1);
        this.f61279a = w0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        BlockableViewPager blockableViewPager;
        int intValue = num.intValue();
        blockableViewPager = this.f61279a.f61482i;
        if (blockableViewPager != null) {
            blockableViewPager.D(intValue, false);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewPager");
        throw null;
    }
}
