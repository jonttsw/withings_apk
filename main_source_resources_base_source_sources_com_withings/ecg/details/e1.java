package com.withings.ecg.details;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EcgInReviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgInReviewViewModel$ecgReviewStatus$1", f = "EcgInReviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e1 extends kotlin.coroutines.jvm.internal.i implements ym0.q<rq.b, rq.b, qm0.d<? super rq.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ rq.b f38181a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ rq.b f38182b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.ecg.details.e1, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.q
    public final Object invoke(rq.b bVar, rq.b bVar2, qm0.d<? super rq.b> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f38181a = bVar;
        iVar.f38182b = bVar2;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        rq.b bVar = this.f38181a;
        rq.b bVar2 = this.f38182b;
        if (bVar == null) {
            return bVar2;
        }
        return bVar;
    }
}
