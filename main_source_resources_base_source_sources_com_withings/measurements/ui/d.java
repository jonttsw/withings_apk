package com.withings.measurements.ui;

import com.withings.measurements.ui.verticals.a;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class d extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42034a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.withings.measurements.ui.verticals.a aVar) {
        super(1);
        this.f42034a = aVar;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        return ((a.C0560a) this.f42034a).a().get(num.intValue());
    }
}
