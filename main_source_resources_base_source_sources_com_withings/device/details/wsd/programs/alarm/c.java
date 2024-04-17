package com.withings.device.details.wsd.programs.alarm;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdMultipleAlarmActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity$saveGlobalStatus$1", f = "WsdMultipleAlarmActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdMultipleAlarmActivity f37158a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WsdMultipleAlarmActivity wsdMultipleAlarmActivity, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f37158a = wsdMultipleAlarmActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f37158a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        WsdMultipleAlarmActivity wsdMultipleAlarmActivity = this.f37158a;
        wsdMultipleAlarmActivity.G3().setAlarmsEnabled(wsdMultipleAlarmActivity.f37123k);
        kn.e.c().t(wsdMultipleAlarmActivity.G3());
        return y.f85009a;
    }
}
