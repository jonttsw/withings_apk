package com.withings.measurements.ui;
/* compiled from: MeasurementsFragment.kt */
/* loaded from: classes4.dex */
final class g2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i2 f42038a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var) {
        super(2);
        this.f42038a = i2Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            i2 i2Var = this.f42038a;
            MeasurementsViewModel t12 = i2.t1(i2Var);
            x1 x1Var = new x1(i2Var);
            y1 y1Var = new y1(i2Var);
            z1 z1Var = new z1(i2Var);
            a2 a2Var = new a2(i2Var);
            jz.b.h(t12, x1Var, y1Var, new c2(i2Var), new b2(i2Var), z1Var, a2Var, new d2(i2Var), new e2(i2Var), new f2(i2Var), new v1(i2Var), new w1(i2Var), aVar2, 8, 0);
        }
        return nm0.y.f85009a;
    }
}
