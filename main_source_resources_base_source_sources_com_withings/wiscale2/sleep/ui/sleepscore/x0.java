package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.SleepScore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScore f61555a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0 f61556b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(SleepScore sleepScore, k0 k0Var) {
        super(2);
        this.f61555a = sleepScore;
        this.f61556b = k0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, -1835666946, new w0(this.f61555a, this.f61556b)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
