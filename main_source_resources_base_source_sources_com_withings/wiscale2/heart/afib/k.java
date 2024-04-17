package com.withings.wiscale2.heart.afib;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AFibLoader.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibLoader", f = "AFibLoader.kt", l = {39}, m = "getAFibMeasuresForType")
/* loaded from: classes5.dex */
public final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    AFibType f57185a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f57186b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f57187c;

    /* renamed from: d  reason: collision with root package name */
    int f57188d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, qm0.d<? super k> dVar) {
        super(dVar);
        this.f57187c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57186b = obj;
        this.f57188d |= Integer.MIN_VALUE;
        return this.f57187c.b(null, 0L, 0L, this);
    }
}
