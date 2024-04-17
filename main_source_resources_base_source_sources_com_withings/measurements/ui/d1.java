package com.withings.measurements.ui;

import com.withings.measurements.ui.verticals.a;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class d1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42035a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42036b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42037c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(HealthVerticalActivity healthVerticalActivity, com.withings.measurements.ui.verticals.a aVar, int i11) {
        super(0);
        this.f42035a = healthVerticalActivity;
        this.f42036b = aVar;
        this.f42037c = i11;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HealthVerticalActivity.D3(this.f42035a, ((a.C0560a) this.f42036b).a().get(this.f42037c));
        return nm0.y.f85009a;
    }
}
