package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42046a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasurementsVertical f42047b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(HealthVerticalActivity healthVerticalActivity, MeasurementsVertical measurementsVertical) {
        super(1);
        this.f42046a = healthVerticalActivity;
        this.f42047b = measurementsVertical;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String url = str;
        kotlin.jvm.internal.u.j(url, "url");
        HealthVerticalActivity.E3(this.f42046a, url, this.f42047b);
        return nm0.y.f85009a;
    }
}
