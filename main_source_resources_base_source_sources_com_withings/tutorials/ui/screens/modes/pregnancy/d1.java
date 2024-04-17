package com.withings.tutorials.ui.screens.modes.pregnancy;

import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class d1 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f45930a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<DateTime> f45931b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f45932c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(ym0.l<? super DateTime, nm0.y> lVar, k1.r0<DateTime> r0Var, k1.r0<String> r0Var2) {
        super(1);
        this.f45930a = lVar;
        this.f45931b = r0Var;
        this.f45932c = r0Var2;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        long longValue = l5.longValue();
        this.f45930a.invoke(new DateTime(longValue));
        this.f45931b.setValue(new DateTime(longValue));
        this.f45932c.setValue(ah.q.a(longValue, null, 6));
        return nm0.y.f85009a;
    }
}
