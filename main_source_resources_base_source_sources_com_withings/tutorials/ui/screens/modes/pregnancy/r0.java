package com.withings.tutorials.ui.screens.modes.pregnancy;

import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f46120a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<DateTime> f46121b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f46122c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(ym0.l<? super DateTime, nm0.y> lVar, k1.r0<DateTime> r0Var, k1.r0<String> r0Var2) {
        super(1);
        this.f46120a = lVar;
        this.f46121b = r0Var;
        this.f46122c = r0Var2;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        long longValue = l5.longValue();
        this.f46120a.invoke(new DateTime(longValue));
        this.f46121b.setValue(new DateTime(longValue));
        this.f46122c.setValue(ah.q.a(longValue, null, 6));
        return nm0.y.f85009a;
    }
}
