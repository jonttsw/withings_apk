package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import androidx.compose.material.c5;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55542a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ne0.d f55543b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f55544c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<ne0.c> f55545d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c5 f55546e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, ne0.d dVar, CoroutineScope coroutineScope, r0<ne0.c> r0Var, c5 c5Var) {
        super(2);
        this.f55542a = wpa02LaunchMeasurementActivity;
        this.f55543b = dVar;
        this.f55544c = coroutineScope;
        this.f55545d = r0Var;
        this.f55546e = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = this.f55542a;
            ne0.d dVar = this.f55543b;
            wpa02LaunchMeasurementActivity.D3(dVar, new c0(wpa02LaunchMeasurementActivity, dVar), new e0(this.f55546e, this.f55545d, this.f55544c), aVar2, 4104);
        }
        return nm0.y.f85009a;
    }
}
