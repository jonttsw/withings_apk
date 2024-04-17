package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42156a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasurementsVertical f42157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(HealthVerticalActivity healthVerticalActivity, MeasurementsVertical measurementsVertical) {
        super(1);
        this.f42156a = healthVerticalActivity;
        this.f42157b = measurementsVertical;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String url = str;
        kotlin.jvm.internal.u.j(url, "url");
        HealthVerticalActivity.E3(this.f42156a, url, this.f42157b);
        return nm0.y.f85009a;
    }
}
