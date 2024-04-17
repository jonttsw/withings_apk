package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61225a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k0 k0Var) {
        super(2);
        this.f61225a = k0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, 214928311, new r0((Context) aVar2.D(androidx.compose.ui.platform.u0.d()), this.f61225a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
