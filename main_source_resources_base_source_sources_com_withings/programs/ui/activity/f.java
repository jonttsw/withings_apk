package com.withings.programs.ui.activity;

import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import ym0.p;
/* compiled from: ProgramOverviewActivity.kt */
/* loaded from: classes4.dex */
final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProgramOverviewActivity f43765a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ProgramOverviewActivity programOverviewActivity) {
        super(2);
        this.f43765a = programOverviewActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        n nVar;
        n nVar2;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            n c11 = r.c(new c0[0], aVar2);
            ProgramOverviewActivity programOverviewActivity = this.f43765a;
            programOverviewActivity.f43745f = c11;
            nVar = programOverviewActivity.f43745f;
            if (nVar != null) {
                p30.a.a((androidx.navigation.d) r.b(nVar, aVar2).getValue(), aVar2, 8);
                nVar2 = programOverviewActivity.f43745f;
                if (nVar2 != null) {
                    t30.b.a(nVar2, null, ProgramOverviewActivity.B3(programOverviewActivity), ProgramOverviewActivity.C3(programOverviewActivity), ProgramOverviewActivity.z3(programOverviewActivity), new c(programOverviewActivity), new d(programOverviewActivity), new e(programOverviewActivity), aVar2, 8, 2);
                } else {
                    u.s("navController");
                    throw null;
                }
            } else {
                u.s("navController");
                throw null;
            }
        }
        return y.f85009a;
    }
}
