package com.withings.fever.ui;

import com.withings.graph.GraphPeriod;
import java.time.YearMonth;
import java.util.List;
import k1.o1;
import org.joda.time.Interval;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ YearMonth f39473a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.s<GraphPeriod, Integer, Integer, Integer, Boolean, nm0.y> f39474b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<Interval> f39475c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<List<as.h>> f39476d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(YearMonth yearMonth, ym0.s<? super GraphPeriod, ? super Integer, ? super Integer, ? super Integer, ? super Boolean, nm0.y> sVar, o1<Interval> o1Var, k1.r0<List<as.h>> r0Var) {
        super(3);
        this.f39473a = yearMonth;
        this.f39474b = sVar;
        this.f39475c = o1Var;
        this.f39476d = r0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        List<as.h> value = this.f39476d.getValue();
        YearMonth currentMonth = this.f39473a;
        kotlin.jvm.internal.u.i(currentMonth, "$currentMonth");
        Interval value2 = this.f39475c.getValue();
        as.c.a(value, currentMonth, this.f39474b, value2, aVar, 4168);
        return nm0.y.f85009a;
    }
}
