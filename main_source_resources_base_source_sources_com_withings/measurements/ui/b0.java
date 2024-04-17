package com.withings.measurements.ui;

import com.withings.measurements.ui.verticals.a;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42020a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(HealthVerticalActivity healthVerticalActivity, com.withings.measurements.ui.verticals.a aVar, int i11) {
        super(0);
        this.f42020a = healthVerticalActivity;
        this.f42021b = aVar;
        this.f42022c = i11;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HealthVerticalActivity.D3(this.f42020a, ((a.C0560a) this.f42021b).a().get(this.f42022c));
        return nm0.y.f85009a;
    }
}
