package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddMeasureManuallyFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureManuallyFragment$saveAction$2", f = "AddMeasureManuallyFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j0 f58223a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f58224b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f58225c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j0 j0Var, User user, MeasuresGroup measuresGroup, qm0.d<? super l0> dVar) {
        super(2, dVar);
        this.f58223a = j0Var;
        this.f58224b = user;
        this.f58225c = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l0(this.f58223a, this.f58224b, this.f58225c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        j0 j0Var = this.f58223a;
        fy.v vVar = j0Var.f58205u;
        if (vVar != null) {
            long q11 = this.f58224b.q();
            MeasuresGroup measuresGroup = this.f58225c;
            measuresGroup.setId(vVar.a(q11, hy.g.a(measuresGroup), null));
            oi0.b bVar = j0Var.f58206v;
            if (bVar != null) {
                zx.r rVar = j0Var.f58204t;
                if (rVar != null) {
                    bVar.j(rVar, "measure", null);
                    return nm0.y.f85009a;
                }
                kotlin.jvm.internal.u.s("sendAccountMeasureGroups");
                throw null;
            }
            kotlin.jvm.internal.u.s("wsSyncManager");
            throw null;
        }
        kotlin.jvm.internal.u.s("insertMeasureGroupUseCase");
        throw null;
    }
}
