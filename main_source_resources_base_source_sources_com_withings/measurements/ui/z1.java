package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
/* compiled from: MeasurementsFragment.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class z1 extends kotlin.jvm.internal.s implements ym0.p<MeasurementsVertical, Boolean, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(i2 i2Var) {
        super(2, i2Var, i2.class, "onVerticalClicked", "onVerticalClicked(Lcom/withings/measurement/model/MeasurementsVertical;Z)V", 0);
    }

    @Override // ym0.p
    public final nm0.y invoke(MeasurementsVertical measurementsVertical, Boolean bool) {
        MeasurementsVertical p02 = measurementsVertical;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(p02, "p0");
        i2.z1((i2) this.receiver, p02, booleanValue);
        return nm0.y.f85009a;
    }
}
