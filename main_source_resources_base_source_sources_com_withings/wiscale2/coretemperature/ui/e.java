package com.withings.wiscale2.coretemperature.ui;

import android.content.Context;
import androidx.compose.material.g6;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.h1;
import com.withings.graph.GraphPeriod;
import com.withings.library.authentication.api.ConstantsWs;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ws.b;
/* compiled from: ExploreCoreTemperatureActivity.kt */
/* loaded from: classes4.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExploreCoreTemperatureActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.q<GraphPeriod, DateTime, Interval, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50427a = new w(3);

        @Override // ym0.q
        public final y invoke(GraphPeriod graphPeriod, DateTime dateTime, Interval interval) {
            u.j(graphPeriod, "<anonymous parameter 0>");
            u.j(dateTime, "<anonymous parameter 1>");
            u.j(interval, "<anonymous parameter 2>");
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExploreCoreTemperatureActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.q<GraphPeriod, DateTime, Interval, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f50428a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(3);
            this.f50428a = nVar;
        }

        @Override // ym0.q
        public final y invoke(GraphPeriod graphPeriod, DateTime dateTime, Interval interval) {
            Interval interval2 = interval;
            u.j(graphPeriod, "<anonymous parameter 0>");
            u.j(dateTime, "<anonymous parameter 1>");
            u.j(interval2, "interval");
            n nVar = this.f50428a;
            nVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(nVar), null, null, new o(nVar, interval2, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExploreCoreTemperatureActivity.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f50429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f50430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, ym0.a<y> aVar, int i11) {
            super(2);
            this.f50429a = nVar;
            this.f50430b = aVar;
            this.f50431c = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f50431c | 1);
            e.a(this.f50429a, this.f50430b, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(n exploreCoreTemperatureViewModel, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        u.j(exploreCoreTemperatureViewModel, "exploreCoreTemperatureViewModel");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onClose", aVar2, 262668328, 197740370);
        Context context = (Context) c11.D(u0.d());
        c11.s(907204039);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(null, v0.f8878a);
            c11.n(t11);
        }
        r0 r0Var = (r0) t11;
        Object a11 = com.huawei.hms.health.a.a(c11, 907204115);
        if (a11 == a.C0060a.a()) {
            h hVar = new h(FlowKt.distinctUntilChanged(new g(exploreCoreTemperatureViewModel.i0())), context);
            c11.n(hVar);
            a11 = hVar;
        }
        Flow flow = (Flow) a11;
        Object a12 = com.huawei.hms.health.a.a(c11, 907204348);
        if (a12 == a.C0060a.a()) {
            j jVar = new j(FlowKt.distinctUntilChanged(new i(exploreCoreTemperatureViewModel.i0())), context);
            c11.n(jVar);
            a12 = jVar;
        }
        Flow flow2 = (Flow) a12;
        Object a13 = com.huawei.hms.health.a.a(c11, 907204524);
        if (a13 == a.C0060a.a()) {
            a13 = FlowKt.combine(flow, flow2, exploreCoreTemperatureViewModel.i0(), new f(r0Var, context, null));
            c11.n(a13);
        }
        c11.J();
        r0 a14 = l0.a((Flow) a13, b.a.f106052a, null, c11, 2);
        c11.J();
        ks.p.c((ws.b) a14.getValue(), aVar, a.f50427a, new b(exploreCoreTemperatureViewModel), c11, (i11 & 112) | ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED, 0);
        v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new c(exploreCoreTemperatureViewModel, aVar, i11));
        }
    }
}
