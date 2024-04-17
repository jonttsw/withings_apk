package com.withings.wiscale2.activity.workout.ui.performance.splits;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import java.util.Arrays;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.w;
import nm0.y;
import x1.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class h extends w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f50010a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50011b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f50012c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f50013d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i11, WorkoutSplitsActivity workoutSplitsActivity, b bVar, String str) {
        super(3);
        this.f50010a = i11;
        this.f50011b = workoutSplitsActivity;
        this.f50012c = bVar;
        this.f50013d = str;
    }

    @Override // ym0.q
    public final y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.c WorkoutSplitCell = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(WorkoutSplitCell, "$this$WorkoutSplitCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
            aVar2.s(-483455358);
            l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                androidx.compose.ui.e e12 = e1.e(aVar3, 1.0f);
                l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G2 = aVar2.G();
                v0 l6 = aVar2.l();
                ym0.a a13 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(e12);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a13);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c14 = com.google.protobuf.t.c(aVar2, b10, aVar2, l6);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar2, G2, c14);
                    }
                    l0.r.c(0, c13, j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    nk.a.d(mVar.g(aVar3, b.a.h()), String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f50010a + 1)}, 1)), 0L, null, 0, 0, null, aVar2, 0, 124);
                    androidx.compose.ui.e g11 = mVar.g(aVar3, b.a.e());
                    b bVar = this.f50012c;
                    WorkoutSplitsActivity.B3(this.f50011b, g11, bVar.a(), bVar.b(), aVar2, 4096);
                    String str = this.f50013d;
                    if (str == null) {
                        str = "-";
                    }
                    nk.a.d(mVar.g(aVar3, b.a.f()), str, 0L, null, 0, 0, null, aVar2, 0, 124);
                    androidx.compose.material3.d.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return y.f85009a;
    }
}
