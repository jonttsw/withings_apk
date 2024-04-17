package com.withings.weight.ui.limbExplore;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalLimbExploreViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$limbExploreGraph$1", f = "SegmentalLimbExploreViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements ym0.q<m, Boolean, qm0.d<? super List<? extends ts.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ m f47713a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ boolean f47714b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f47715c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, qm0.d<? super r> dVar) {
        super(3, dVar);
        this.f47715c = a0Var;
    }

    @Override // ym0.q
    public final Object invoke(m mVar, Boolean bool, qm0.d<? super List<? extends ts.d>> dVar) {
        boolean booleanValue = bool.booleanValue();
        r rVar = new r(this.f47715c, dVar);
        rVar.f47713a = mVar;
        rVar.f47714b = booleanValue;
        return rVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f47713a;
        boolean z5 = this.f47714b;
        aVar = this.f47715c.f47668d;
        return aVar.a(mVar, z5);
    }
}
