package com.withings.wiscale2.vo2max.view;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxImprovement.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2MaxImprovementViewModel", f = "Vo2MaxImprovement.kt", l = {74}, m = "getFirstValidVo2maxForCurrentFitnessLevel")
/* loaded from: classes5.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f62827a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62828b;

    /* renamed from: c  reason: collision with root package name */
    int f62829c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0 r0Var, qm0.d<? super s0> dVar) {
        super(dVar);
        this.f62828b = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f62827a = obj;
        this.f62829c |= Integer.MIN_VALUE;
        return r0.f0(this.f62828b, null, this);
    }
}
