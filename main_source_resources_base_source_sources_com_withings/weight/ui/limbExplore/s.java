package com.withings.weight.ui.limbExplore;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalLimbExploreViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$limbExploreGraphModifier$1", f = "SegmentalLimbExploreViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class s extends kotlin.coroutines.jvm.internal.i implements ym0.r<m, Interval, Boolean, qm0.d<? super o>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ m f47716a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f47717b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f47718c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a0 f47719d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, qm0.d<? super s> dVar) {
        super(4, dVar);
        this.f47719d = a0Var;
    }

    @Override // ym0.r
    public final Object invoke(m mVar, Interval interval, Boolean bool, qm0.d<? super o> dVar) {
        boolean booleanValue = bool.booleanValue();
        s sVar = new s(this.f47719d, dVar);
        sVar.f47716a = mVar;
        sVar.f47717b = interval;
        sVar.f47718c = booleanValue;
        return sVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        l70.u uVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f47716a;
        Interval interval = this.f47717b;
        boolean z5 = this.f47718c;
        uVar = this.f47719d.f47670f;
        return new o(uVar, interval, z5, mVar.b());
    }
}
