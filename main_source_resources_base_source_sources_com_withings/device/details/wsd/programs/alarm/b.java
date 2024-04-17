package com.withings.device.details.wsd.programs.alarm;

import com.withings.alarm.model.DeviceAlarm;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdMultipleAlarmActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity$getAlarms$2", f = "WsdMultipleAlarmActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super List<DeviceAlarm>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdMultipleAlarmActivity f37157a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WsdMultipleAlarmActivity wsdMultipleAlarmActivity, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f37157a = wsdMultipleAlarmActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f37157a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<DeviceAlarm>> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        rg.b m42;
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        WsdMultipleAlarmActivity wsdMultipleAlarmActivity = this.f37157a;
        m42 = wsdMultipleAlarmActivity.m4();
        List<DeviceAlarm> c11 = m42.c(wsdMultipleAlarmActivity.G3().getId());
        int size = c11.size();
        int i11 = 0;
        while (i11 < size) {
            DeviceAlarm deviceAlarm = c11.get(i11);
            i11++;
            deviceAlarm.Y((short) i11);
            if (deviceAlarm.f31069o + deviceAlarm.f31070p + deviceAlarm.f31071q > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            deviceAlarm.f0(z5);
        }
        return c11;
    }
}
