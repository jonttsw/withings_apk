package com.withings.wiscale2.activity.workout.live.ui;

import androidx.compose.foundation.layout.e1;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.a5;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
import k1.j1;
import x1.b;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LiveWorkoutActivity liveWorkoutActivity) {
        super(2);
        this.f48897a = liveWorkoutActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        z0 U3;
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LiveWorkoutActivity liveWorkoutActivity = this.f48897a;
            U3 = liveWorkoutActivity.U3();
            Boolean bool = (Boolean) t1.d.a(U3.t1(), aVar2).getValue();
            if (bool != null) {
                androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
                x1.d m11 = b.a.m();
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 d11 = androidx.compose.foundation.layout.k.d(m11, false, aVar2);
                aVar2.s(-1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                j jVar = null;
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, d11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    boolean booleanValue = bool.booleanValue();
                    j jVar2 = new j(liveWorkoutActivity);
                    if (booleanValue) {
                        i11 = C1987R.string.status_on;
                    } else {
                        i11 = C1987R.string.status_off;
                    }
                    String string = liveWorkoutActivity.getString(i11);
                    kotlin.jvm.internal.u.g(string);
                    String string2 = liveWorkoutActivity.getString(C1987R.string.GPS_tracking_title);
                    kotlin.jvm.internal.u.i(string2, "getString(...)");
                    if (!booleanValue) {
                        jVar = jVar2;
                    }
                    LiveWorkoutActivity.b bVar = new LiveWorkoutActivity.b(string2, string, booleanValue, jVar);
                    if (bVar.d()) {
                        aVar2.s(-172338453);
                        a5.b(bVar.b(), bVar.a(), null, aVar2, 0, 4);
                        aVar2.J();
                    } else {
                        aVar2.s(-172338313);
                        a5.a(bVar.b(), bVar.a(), bVar.c(), aVar2, 0, 0);
                        aVar2.J();
                    }
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
