package com.withings.cycletracking.ui;

import org.joda.time.LocalDate;
/* compiled from: CycleTrackingFactorsScreen.kt */
/* loaded from: classes3.dex */
final class m1 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<LocalDate, nm0.y> f35689a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(ym0.l<? super LocalDate, nm0.y> lVar) {
        super(1);
        this.f35689a = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        this.f35689a.invoke(new LocalDate(l5.longValue()));
        return nm0.y.f85009a;
    }
}
