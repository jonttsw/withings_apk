package com.withings.weight.ui.limbExplore;

import com.withings.common.compose.component.m4;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: SegmentalLimbExploreViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$limbExploreHeaderFlow$1$1", f = "SegmentalLimbExploreViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class t extends kotlin.coroutines.jvm.internal.i implements ym0.q<v90.h, Boolean, qm0.d<? super List<? extends m4>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ v90.h f47720a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ boolean f47721b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f47722c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, qm0.d<? super t> dVar) {
        super(3, dVar);
        this.f47722c = a0Var;
    }

    @Override // ym0.q
    public final Object invoke(v90.h hVar, Boolean bool, qm0.d<? super List<? extends m4>> dVar) {
        boolean booleanValue = bool.booleanValue();
        t tVar = new t(this.f47722c, dVar);
        tVar.f47720a = hVar;
        tVar.f47721b = booleanValue;
        return tVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        v90.h hVar = this.f47720a;
        boolean z5 = this.f47721b;
        a0 a0Var = this.f47722c;
        return kotlin.collections.x.W(new m4(a0.f0(a0Var, hVar, true, z5), null, null, null, 14), new m4(a0.f0(a0Var, hVar, false, z5), null, null, null, 14));
    }
}
