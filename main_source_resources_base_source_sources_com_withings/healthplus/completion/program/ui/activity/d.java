package com.withings.healthplus.completion.program.ui.activity;

import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import ym0.p;
/* compiled from: EndProgramActivity.kt */
/* loaded from: classes3.dex */
final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EndProgramActivity f40046a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EndProgramActivity endProgramActivity) {
        super(2);
        this.f40046a = endProgramActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        n nVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            n c11 = r.c(new c0[0], aVar2);
            EndProgramActivity endProgramActivity = this.f40046a;
            endProgramActivity.f40031e = c11;
            nVar = endProgramActivity.f40031e;
            if (nVar != null) {
                au.e.a(nVar, null, new b(endProgramActivity), new c(endProgramActivity), EndProgramActivity.C3(endProgramActivity), EndProgramActivity.z3(endProgramActivity), EndProgramActivity.B3(endProgramActivity), aVar2, 8, 2);
            } else {
                u.s("navController");
                throw null;
            }
        }
        return y.f85009a;
    }
}
