package com.withings.wiscale2.heart.bloodpressure;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BloodPressureHistoryFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureHistoryFragment", f = "BloodPressureHistoryFragment.kt", l = {ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD}, m = "loadData")
/* loaded from: classes5.dex */
public final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f57440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f57441b;

    /* renamed from: c  reason: collision with root package name */
    int f57442c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, qm0.d<? super n> dVar) {
        super(dVar);
        this.f57441b = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57440a = obj;
        this.f57442c |= Integer.MIN_VALUE;
        return k.y1(this.f57441b, this);
    }
}
