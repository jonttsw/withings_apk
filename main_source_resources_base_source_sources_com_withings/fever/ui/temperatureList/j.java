package com.withings.fever.ui.temperatureList;

import android.content.Context;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material3.o7;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.u0;
import com.withings.fever.ui.temperatureList.o;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.r0;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: TemperatureListActivity.kt */
/* loaded from: classes3.dex */
final class j extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TemperatureListActivity f39437a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TemperatureListActivity temperatureListActivity) {
        super(2);
        this.f39437a = temperatureListActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            TemperatureListActivity temperatureListActivity = this.f39437a;
            r0 b10 = l0.b(TemperatureListActivity.A3(temperatureListActivity).k0(), aVar2);
            o oVar = (o) b10.getValue();
            if (oVar instanceof o.b) {
                aVar2.s(-606549565);
                Context context = (Context) aVar2.D(u0.d());
                aVar2.s(-606549472);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = l0.f(null, v0.f8878a);
                    aVar2.n(t11);
                }
                r0 r0Var = (r0) t11;
                aVar2.J();
                aVar2.s(-606549302);
                o oVar2 = (o) b10.getValue();
                u.h(oVar2, "null cannot be cast to non-null type com.withings.fever.ui.temperatureList.TemperatureListState.Ready");
                List<nm0.j<DateTime, List<ky.d>>> a11 = ((o.b) oVar2).a();
                int i11 = 10;
                ArrayList arrayList = new ArrayList(x.y(a11, 10));
                Iterator<T> it = a11.iterator();
                while (it.hasNext()) {
                    nm0.j jVar = (nm0.j) it.next();
                    String a12 = Period.f43723h.a(context, (DateTime) jVar.a());
                    aVar2.s(-606549047);
                    List<ky.d> list = (List) jVar.b();
                    ArrayList arrayList2 = new ArrayList(x.y(list, i11));
                    for (ky.d dVar : list) {
                        aVar2.s(-606548908);
                        ky.a d11 = ly.a.d(71, dVar);
                        hk.a aVar3 = new hk.a(Integer.valueOf((int) C1987R.drawable.icon_large_device_thermo), ((jm.a) aVar2.D(com.withings.core.ui.b.b())).b(d11.f(), 71), b50.b.m(d11.b(), context, false, 6), "", dVar, Integer.valueOf((int) C1987R.drawable.ic_arrow_right_30dp));
                        aVar2.J();
                        arrayList2.add(aVar3);
                    }
                    aVar2.J();
                    arrayList.add(new hk.k(a12, arrayList2));
                    i11 = 10;
                }
                aVar2.J();
                String u11 = ay.b.u(C1987R.string._TEMPERATURE_, aVar2);
                i0 i0Var = i0.f76187a;
                d dVar2 = new d(temperatureListActivity);
                aVar2.s(-606547681);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new e(r0Var);
                    aVar2.n(t12);
                }
                aVar2.J();
                hk.b.b(false, u11, i0Var, arrayList, c.f39427a, dVar2, (ym0.l) t12, aVar2, 1601920, 1);
                if (r0Var.getValue() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l0.g.e(z5, null, null, null, null, s1.b.b(aVar2, 1569995172, new i(r0Var, temperatureListActivity)), aVar2, 196608, 30);
                aVar2.J();
            } else if (oVar instanceof o.a) {
                aVar2.s(-606546288);
                o7.a(0.0f, 0, 0, 30, 0L, 0L, aVar2, e1.n(androidx.compose.ui.e.f8927a, yk.h.u()));
                aVar2.J();
            } else {
                aVar2.s(-606546117);
                aVar2.J();
            }
        }
        return y.f85009a;
    }
}
