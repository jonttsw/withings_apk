package com.withings.wiscale2.device.common.feature.ecg;

import android.os.Bundle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity$RegisterAnalytics$2", f = "WBS08EcgActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class y8 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52129a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<String> f52130b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<androidx.navigation.d> f52131c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(WBS08EcgActivationActivity wBS08EcgActivationActivity, k1.o1<String> o1Var, k1.o1<androidx.navigation.d> o1Var2, qm0.d<? super y8> dVar) {
        super(2, dVar);
        this.f52129a = wBS08EcgActivationActivity;
        this.f52130b = o1Var;
        this.f52131c = o1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y8(this.f52129a, this.f52130b, this.f52131c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y8) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        androidx.navigation.t d11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        int i11 = WBS08EcgActivationActivity.f51104f;
        String value = this.f52130b.getValue();
        k1.o1<androidx.navigation.d> o1Var = this.f52131c;
        androidx.navigation.d value2 = o1Var.getValue();
        Bundle bundle = null;
        if (value2 != null && (d11 = value2.d()) != null) {
            str = d11.v();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        androidx.navigation.d value3 = o1Var.getValue();
        if (value3 != null) {
            bundle = value3.c();
        }
        WBS08EcgActivationActivity.P3(this.f52129a, value, str, bundle);
        return nm0.y.f85009a;
    }
}
