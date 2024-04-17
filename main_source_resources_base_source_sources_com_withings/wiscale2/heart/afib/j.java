package com.withings.wiscale2.heart.afib;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AFibLoader.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibLoader", f = "AFibLoader.kt", l = {22}, m = "getAFibMeasures")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    l f57174a;

    /* renamed from: b  reason: collision with root package name */
    AFibType[] f57175b;

    /* renamed from: c  reason: collision with root package name */
    Collection f57176c;

    /* renamed from: d  reason: collision with root package name */
    long f57177d;

    /* renamed from: e  reason: collision with root package name */
    long f57178e;

    /* renamed from: f  reason: collision with root package name */
    int f57179f;

    /* renamed from: g  reason: collision with root package name */
    int f57180g;

    /* renamed from: h  reason: collision with root package name */
    /* synthetic */ Object f57181h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ l f57182i;

    /* renamed from: j  reason: collision with root package name */
    int f57183j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, qm0.d<? super j> dVar) {
        super(dVar);
        this.f57182i = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57181h = obj;
        this.f57183j |= Integer.MIN_VALUE;
        return this.f57182i.a(null, 0L, this);
    }
}
