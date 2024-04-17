package com.withings.wiscale2.measure.accountmeasure.ui.add;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddBodyTemperatureFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddBodyTemperatureFragment", f = "AddBodyTemperatureFragment.kt", l = {92}, m = "loadInitialTemperature")
/* loaded from: classes5.dex */
public final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    k f58192a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f58193b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f58194c;

    /* renamed from: d  reason: collision with root package name */
    int f58195d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, qm0.d<? super i> dVar) {
        super(dVar);
        this.f58194c = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f58193b = obj;
        this.f58195d |= Integer.MIN_VALUE;
        return k.J1(this.f58194c, this);
    }
}
