package com.withings.tutorials.ui.screens.modes.pregnancy;

import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class f1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateTime f45939a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f45940b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45941c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f1(DateTime dateTime, ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar) {
        super(0);
        this.f45939a = dateTime;
        this.f45940b = lVar;
        this.f45941c = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        if (this.f45939a == null) {
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            this.f45940b.invoke(now);
        }
        this.f45941c.invoke();
        return nm0.y.f85009a;
    }
}
