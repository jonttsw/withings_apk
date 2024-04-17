package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddHeartRateCameraFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$saveAction$2", f = "AddHeartRateCameraFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f58261a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f58262b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f58263c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, User user, MeasuresGroup measuresGroup, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f58261a = mVar;
        this.f58262b = user;
        this.f58263c = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f58261a, this.f58262b, this.f58263c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f58261a;
        fy.v vVar = mVar.f58227r;
        if (vVar != null) {
            long q11 = this.f58262b.q();
            MeasuresGroup measuresGroup = this.f58263c;
            measuresGroup.setId(vVar.a(q11, hy.g.a(measuresGroup), null));
            oi0.b bVar = mVar.f58228s;
            if (bVar != null) {
                zx.r rVar = mVar.f58226q;
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
