package com.withings.wiscale2.device.wpm.ui;

import com.withings.library.measure.MeasuresGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpm02ResultScreenFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm02ResultScreenFragment$updateMeasureGroup$1", f = "Wpm02ResultScreenFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0 f55746a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c0 c0Var, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f55746a = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f55746a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MeasuresGroup D1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        c0 c0Var = this.f55746a;
        fy.z zVar = c0Var.f55723u;
        if (zVar != null) {
            long q11 = c0.A1(c0Var).q();
            D1 = c0Var.D1();
            zVar.a(q11, hy.g.a(D1));
            zx.r rVar = c0Var.f55724v;
            if (rVar != null) {
                rVar.run();
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("sendAccountMeasureGroups");
            throw null;
        }
        kotlin.jvm.internal.u.s("updateGroupCommentUseCase");
        throw null;
    }
}
