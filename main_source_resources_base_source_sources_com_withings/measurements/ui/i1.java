package com.withings.measurements.ui;

import com.withings.measurements.ui.verticals.a;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class i1 extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42048a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.withings.measurements.ui.verticals.a aVar) {
        super(0);
        this.f42048a = aVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(((a.C0560a) this.f42048a).a().size());
    }
}
