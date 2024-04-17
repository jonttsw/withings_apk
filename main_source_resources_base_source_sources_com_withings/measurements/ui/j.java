package com.withings.measurements.ui;

import com.withings.measurements.ui.verticals.a;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42060a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42061b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42062c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HealthVerticalActivity healthVerticalActivity, com.withings.measurements.ui.verticals.a aVar, int i11) {
        super(0);
        this.f42060a = healthVerticalActivity;
        this.f42061b = aVar;
        this.f42062c = i11;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HealthVerticalActivity.D3(this.f42060a, ((a.C0560a) this.f42061b).a().get(this.f42062c));
        return nm0.y.f85009a;
    }
}
