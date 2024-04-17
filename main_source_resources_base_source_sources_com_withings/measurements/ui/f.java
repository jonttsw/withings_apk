package com.withings.measurements.ui;

import gz.j0;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class f extends kotlin.jvm.internal.s implements ym0.l<j0.a, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(HealthVerticalActivity healthVerticalActivity) {
        super(1, healthVerticalActivity, HealthVerticalActivity.class, "onLatestMeasurementItemClicked", "onLatestMeasurementItemClicked(Lcom/withings/measurements/core/model/items/MeasurementItem$WithData;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(j0.a aVar) {
        j0.a p02 = aVar;
        kotlin.jvm.internal.u.j(p02, "p0");
        HealthVerticalActivity.F3((HealthVerticalActivity) this.receiver, p02);
        return nm0.y.f85009a;
    }
}
