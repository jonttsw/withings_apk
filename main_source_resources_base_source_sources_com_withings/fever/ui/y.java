package com.withings.fever.ui;

import com.withings.graph.GraphPeriod;
import org.joda.time.DateTime;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.s<GraphPeriod, Integer, Integer, Integer, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39483a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ at.a f39484b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.p0<k1.r0<Boolean>> p0Var, at.a aVar) {
        super(5);
        this.f39483a = p0Var;
        this.f39484b = aVar;
    }

    @Override // ym0.s
    public final nm0.y k(GraphPeriod graphPeriod, Integer num, Integer num2, Integer num3, Boolean bool) {
        boolean z5;
        GraphPeriod graphPeriod2 = graphPeriod;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = num3.intValue();
        boolean booleanValue = bool.booleanValue();
        k1.r0<Boolean> r0Var = this.f39483a.f76257a;
        if (r0Var.getValue().booleanValue() && !booleanValue) {
            z5 = true;
        } else {
            z5 = false;
        }
        r0Var.setValue(Boolean.valueOf(z5));
        DateTime dateTime = new DateTime(intValue3, intValue2, intValue, 0, 0);
        at.a aVar = this.f39484b;
        if (graphPeriod2 == null) {
            graphPeriod2 = aVar.d();
        }
        at.a.h(aVar, graphPeriod2, dateTime);
        return nm0.y.f85009a;
    }
}
