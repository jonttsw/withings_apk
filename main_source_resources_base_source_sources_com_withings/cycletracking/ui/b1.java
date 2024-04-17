package com.withings.cycletracking.ui;

import com.withings.cycletracking.ui.e2;
import com.withings.graph.GraphPeriod;
import java.time.MonthDay;
import java.time.YearMonth;
import org.joda.time.Interval;
/* compiled from: CycleTrackingDatavizScreen.kt */
/* loaded from: classes3.dex */
final class b1 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ at.a f35507a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e2.c f35508b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.r<GraphPeriod, Integer, Integer, Integer, nm0.y> f35509c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.p<MonthDay, YearMonth, Boolean> f35510d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.o1<Interval> f35511e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1(at.a aVar, e2.c cVar, ym0.r<? super GraphPeriod, ? super Integer, ? super Integer, ? super Integer, nm0.y> rVar, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar, k1.o1<Interval> o1Var) {
        super(3);
        this.f35507a = aVar;
        this.f35508b = cVar;
        this.f35509c = rVar;
        this.f35510d = pVar;
        this.f35511e = o1Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        at.a aVar2 = this.f35507a;
        YearMonth of2 = YearMonth.of(aVar2.c().getYear(), aVar2.c().getMonthOfYear());
        kotlin.jvm.internal.u.g(of2);
        ym0.r<GraphPeriod, Integer, Integer, Integer, nm0.y> rVar = this.f35509c;
        ym0.p<MonthDay, YearMonth, Boolean> pVar = this.f35510d;
        e2.c cVar = this.f35508b;
        cn.e.a(cVar, of2, rVar, pVar, this.f35511e.getValue(), aVar, 32840);
        return nm0.y.f85009a;
    }
}
