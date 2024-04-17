package com.withings.wiscale2.device.common.feature;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlatformFeatureActivation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {38}, m = "setFeatureActivation")
/* loaded from: classes5.dex */
public final class s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    t f52475a;

    /* renamed from: b  reason: collision with root package name */
    List f52476b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f52477c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t f52478d;

    /* renamed from: e  reason: collision with root package name */
    int f52479e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, qm0.d<? super s> dVar) {
        super(dVar);
        this.f52478d = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f52477c = obj;
        this.f52479e |= Integer.MIN_VALUE;
        return this.f52478d.f(null, this, false);
    }
}
