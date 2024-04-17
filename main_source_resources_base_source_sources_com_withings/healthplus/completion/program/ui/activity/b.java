package com.withings.healthplus.completion.program.ui.activity;

import androidx.camera.camera2.internal.q;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
/* compiled from: EndProgramActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EndProgramActivity f40044a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EndProgramActivity endProgramActivity) {
        super(0);
        this.f40044a = endProgramActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        n nVar;
        EndProgramActivity endProgramActivity = this.f40044a;
        nVar = endProgramActivity.f40031e;
        if (nVar != null) {
            nVar.J(q.c("endProgramStats/", EndProgramActivity.B3(endProgramActivity)), a.f40043a);
            return y.f85009a;
        }
        u.s("navController");
        throw null;
    }
}
