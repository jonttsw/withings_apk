package com.withings.tutorials.ui.screens.modes.pregnancy;

import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f46188a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f46189b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k1.r0 r0Var, ym0.l lVar) {
        super(1);
        this.f46188a = lVar;
        this.f46189b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        long longValue = l5.longValue();
        this.f46188a.invoke(new DateTime(longValue));
        this.f46189b.setValue(ah.q.a(longValue, null, 6));
        return nm0.y.f85009a;
    }
}
