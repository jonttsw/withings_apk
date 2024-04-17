package com.withings.wiscale2.sleep.ui.sleepscore;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.l<vx.e, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61185a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(k0 k0Var) {
        super(1);
        this.f61185a = k0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(vx.e eVar) {
        vx.e it = eVar;
        kotlin.jvm.internal.u.j(it, "it");
        j1 H1 = k0.H1(this.f61185a);
        H1.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(H1), Dispatchers.getIO(), null, new o1(H1, it, null), 2, null);
        return nm0.y.f85009a;
    }
}
