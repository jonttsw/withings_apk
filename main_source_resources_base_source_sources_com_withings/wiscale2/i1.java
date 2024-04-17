package com.withings.wiscale2;

import com.withings.target.Target;
import com.withings.wiscale2.h1;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HMCommonDeviceModule.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.HMCommonDeviceModule$WppHrThresholdRepository", f = "HMCommonDeviceModule.kt", l = {30}, m = "getOrPutHrThreshold")
/* loaded from: classes4.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    h1.a f57855a;

    /* renamed from: b  reason: collision with root package name */
    Target f57856b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f57857c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h1.a f57858d;

    /* renamed from: e  reason: collision with root package name */
    int f57859e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(h1.a aVar, qm0.d<? super i1> dVar) {
        super(dVar);
        this.f57858d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable c11;
        this.f57857c = obj;
        this.f57859e |= Integer.MIN_VALUE;
        c11 = this.f57858d.c(0L, 0, this);
        return c11;
    }
}
