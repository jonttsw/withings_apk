package com.withings.wiscale2.vo2max;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxGenerator.kt */
@e(c = "com.withings.wiscale2.vo2max.ComputeVo2Max", f = "Vo2MaxGenerator.kt", l = {222, 223}, m = "removeVo2maxInfoItemIfNecessary")
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    ComputeVo2Max f62617a;

    /* renamed from: b  reason: collision with root package name */
    long f62618b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f62619c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ComputeVo2Max f62620d;

    /* renamed from: e  reason: collision with root package name */
    int f62621e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComputeVo2Max computeVo2Max, d<? super a> dVar) {
        super(dVar);
        this.f62620d = computeVo2Max;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f62619c = obj;
        this.f62621e |= Integer.MIN_VALUE;
        return ComputeVo2Max.B(this.f62620d, 0L, 0L, this);
    }
}
