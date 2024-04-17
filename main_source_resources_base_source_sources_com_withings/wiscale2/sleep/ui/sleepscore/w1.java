package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.views.view.BlockableViewPager;
/* compiled from: SleepDisorderDayPagerFragment.kt */
/* loaded from: classes5.dex */
final class w1 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f61547a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(t1 t1Var) {
        super(1);
        this.f61547a = t1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        BlockableViewPager blockableViewPager;
        int intValue = num.intValue();
        blockableViewPager = this.f61547a.f61512n;
        if (blockableViewPager != null) {
            blockableViewPager.D(intValue, false);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewPager");
        throw null;
    }
}
