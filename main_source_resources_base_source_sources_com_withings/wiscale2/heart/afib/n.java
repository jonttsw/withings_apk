package com.withings.wiscale2.heart.afib;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AFibLoader.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibLoader", f = "AFibLoader.kt", l = {30}, m = "getIrregularHeartbeatMeasures")
/* loaded from: classes5.dex */
public final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    boolean f57213a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f57214b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f57215c;

    /* renamed from: d  reason: collision with root package name */
    int f57216d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, qm0.d<? super n> dVar) {
        super(dVar);
        this.f57215c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57214b = obj;
        this.f57216d |= Integer.MIN_VALUE;
        return this.f57215c.e(0L, this);
    }
}
