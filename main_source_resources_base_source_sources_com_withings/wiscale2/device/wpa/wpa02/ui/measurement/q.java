package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.m0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity$NavGraph$2", f = "Wpa02LaunchMeasurementActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55576a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity.g f55577b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Wpa02LaunchMeasurementActivity.g f55578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Wpa02LaunchMeasurementActivity.g gVar) {
            super(1);
            this.f55578a = gVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String str2 = str;
            kotlin.jvm.internal.u.g(str2);
            this.f55578a.a(str2);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, Wpa02LaunchMeasurementActivity.g gVar, qm0.d<? super q> dVar) {
        super(2, dVar);
        this.f55576a = wpa02LaunchMeasurementActivity;
        this.f55577b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q(this.f55576a, this.f55577b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = this.f55576a;
        Wpa02LaunchMeasurementActivity.Q3(wpa02LaunchMeasurementActivity).k0().observe(wpa02LaunchMeasurementActivity, new m0.a(new a(this.f55577b)));
        return nm0.y.f85009a;
    }
}
