package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.e2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$sections$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.i implements ym0.t<en.m, e2.c.b, en.l, e2.a, e2.c.a, qm0.d<? super e2.c.C0470c>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ en.m f35935a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ e2.c.b f35936b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ en.l f35937c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ e2.a f35938d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ e2.c.a f35939e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(qm0.d<? super r> dVar) {
        super(6, dVar);
    }

    @Override // ym0.t
    public final Object c(en.m mVar, e2.c.b bVar, en.l lVar, e2.a aVar, e2.c.a aVar2, qm0.d<? super e2.c.C0470c> dVar) {
        r rVar = new r(dVar);
        rVar.f35935a = mVar;
        rVar.f35936b = bVar;
        rVar.f35937c = lVar;
        rVar.f35938d = aVar;
        rVar.f35939e = aVar2;
        return rVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        en.m mVar = this.f35935a;
        e2.c.b bVar = this.f35936b;
        en.l lVar = this.f35937c;
        return new e2.c.C0470c(this.f35939e, this.f35938d, bVar, lVar, mVar);
    }
}
