package com.withings.nutrisync.ui;

import com.withings.graph.GraphPeriod;
import org.joda.time.DateTime;
/* compiled from: VitaminCScreen.kt */
/* loaded from: classes4.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.r<GraphPeriod, Integer, Integer, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ at.a f43266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(at.a aVar) {
        super(4);
        this.f43266a = aVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(GraphPeriod graphPeriod, Integer num, Integer num2, Integer num3) {
        GraphPeriod graphPeriod2 = graphPeriod;
        int intValue = num.intValue();
        DateTime dateTime = new DateTime(num3.intValue(), num2.intValue(), intValue, 0, 0);
        at.a aVar = this.f43266a;
        if (graphPeriod2 == null) {
            graphPeriod2 = aVar.d();
        }
        at.a.h(aVar, graphPeriod2, dateTime);
        return nm0.y.f85009a;
    }
}
