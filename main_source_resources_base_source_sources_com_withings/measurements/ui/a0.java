package com.withings.measurements.ui;

import com.withings.measurements.core.model.StartTrackingMetricItem;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class a0 extends kotlin.jvm.internal.s implements ym0.l<StartTrackingMetricItem, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(HealthVerticalActivity healthVerticalActivity) {
        super(1, healthVerticalActivity, HealthVerticalActivity.class, "onStartTrackingCardClicked", "onStartTrackingCardClicked(Lcom/withings/measurements/core/model/StartTrackingMetricItem;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(StartTrackingMetricItem startTrackingMetricItem) {
        StartTrackingMetricItem p02 = startTrackingMetricItem;
        kotlin.jvm.internal.u.j(p02, "p0");
        HealthVerticalActivity.H3((HealthVerticalActivity) this.receiver, p02);
        return nm0.y.f85009a;
    }
}
