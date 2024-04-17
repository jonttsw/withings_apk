package com.withings.nervehealth.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p00.c;
/* compiled from: NerveHealthActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthActivity$initFlows$1", f = "NerveHealthActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class g extends kotlin.coroutines.jvm.internal.i implements ym0.q<c.b.a, c.b.C1488b, qm0.d<? super c.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ c.b.a f42516a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ c.b.C1488b f42517b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.nervehealth.ui.g] */
    @Override // ym0.q
    public final Object invoke(c.b.a aVar, c.b.C1488b c1488b, qm0.d<? super c.b> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f42516a = aVar;
        iVar.f42517b = c1488b;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return new c.b(this.f42517b, this.f42516a);
    }
}
