package com.withings.nutrisync.ui;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VitaminCDatavizActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.VitaminCDatavizActivity", f = "VitaminCDatavizActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_ECG}, m = "onShareHealthReport")
/* loaded from: classes4.dex */
public final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    VitaminCDatavizActivity f43333a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f43334b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VitaminCDatavizActivity f43335c;

    /* renamed from: d  reason: collision with root package name */
    int f43336d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(VitaminCDatavizActivity vitaminCDatavizActivity, qm0.d<? super x> dVar) {
        super(dVar);
        this.f43335c = vitaminCDatavizActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f43334b = obj;
        this.f43336d |= Integer.MIN_VALUE;
        return VitaminCDatavizActivity.C3(this.f43335c, this);
    }
}
