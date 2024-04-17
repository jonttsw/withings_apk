package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
final class e4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Track> f60928a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y3 f60929b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ tb0.c3 f60930c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(tb0.c3 c3Var, y3 y3Var, List list) {
        super(2);
        this.f60928a = list;
        this.f60929b = y3Var;
        this.f60930c = c3Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        List list;
        String str;
        String str2;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), 0.0f, 0.0f, 3);
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a12);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                List<Track> list2 = this.f60928a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    DateTime endDate = ((Track) obj).getEndDate();
                    kotlin.jvm.internal.u.j(endDate, "<this>");
                    if (endDate.getDayOfWeek() != 7 && endDate.getDayOfWeek() != 6) {
                        arrayList2.add(obj);
                    } else {
                        arrayList.add(obj);
                    }
                }
                nm0.j jVar = new nm0.j(arrayList, arrayList2);
                List list3 = (List) jVar.a();
                List list4 = (List) jVar.b();
                boolean z5 = !list4.isEmpty();
                y3 y3Var = this.f60929b;
                tb0.c3 c3Var = this.f60930c;
                if (!z5) {
                    str = "-";
                } else {
                    Context context = c3Var.f98914k.getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    str = y3.t1(y3Var, context, list4);
                }
                if (!(!list.isEmpty())) {
                    str2 = "-";
                } else {
                    Context context2 = c3Var.f98914k.getContext();
                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                    str2 = y3.t1(y3Var, context2, list3);
                }
                y3.s1(y3Var, list2, aVar2, 72);
                com.withings.common.compose.component.o.o(null, null, ay.b.u(C1987R.string._SLEEP_WEEK_DAYS_AVG_, aVar2), null, str, true, false, false, null, null, null, null, null, aVar2, 196608, 0, 8139);
                com.withings.common.compose.component.o.o(null, null, ay.b.u(C1987R.string._SLEEP_WEEKENDS_AVG_, aVar2), null, str2, true, false, false, null, null, null, null, null, aVar2, 196608, 0, 8139);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
