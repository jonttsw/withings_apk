package com.withings.cycletracking.ui;

import com.withings.cycletracking.ui.e2;
import com.withings.graph.GraphPeriod;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingDatavizScreen.kt */
/* loaded from: classes3.dex */
final class a1 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<LocalDate, nm0.y> f35490a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35491b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<LocalDate, nm0.y> f35492c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e2.c f35493d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.r<GraphPeriod, Integer, Integer, Integer, nm0.y> f35494e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ at.a f35495f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(ym0.l<? super LocalDate, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.l<? super LocalDate, nm0.y> lVar2, e2.c cVar, ym0.r<? super GraphPeriod, ? super Integer, ? super Integer, ? super Integer, nm0.y> rVar, at.a aVar2) {
        super(3);
        this.f35490a = lVar;
        this.f35491b = aVar;
        this.f35492c = lVar2;
        this.f35493d = cVar;
        this.f35494e = rVar;
        this.f35495f = aVar2;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        int i11 = at.a.f19549d;
        ym0.r<GraphPeriod, Integer, Integer, Integer, nm0.y> rVar = this.f35494e;
        at.a aVar2 = this.f35495f;
        cn.b.a(this.f35490a, this.f35491b, this.f35492c, this.f35493d, rVar, aVar2, aVar, 4096);
        return nm0.y.f85009a;
    }
}
