package com.withings.weight.presentation.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.e;
/* compiled from: BodyCompositionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.BodyCompositionActivity$getUiStateFlow$1", f = "BodyCompositionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.r<e.b.C1297e, e.b.a, e.b.g, qm0.d<? super e.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ e.b.C1297e f47236a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ e.b.a f47237b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ e.b.g f47238c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f47239d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z5, qm0.d<? super f> dVar) {
        super(4, dVar);
        this.f47239d = z5;
    }

    @Override // ym0.r
    public final Object invoke(e.b.C1297e c1297e, e.b.a aVar, e.b.g gVar, qm0.d<? super e.b> dVar) {
        f fVar = new f(this.f47239d, dVar);
        fVar.f47236a = c1297e;
        fVar.f47237b = aVar;
        fVar.f47238c = gVar;
        return fVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return new e.b(this.f47236a, this.f47237b, this.f47238c, this.f47239d);
    }
}
