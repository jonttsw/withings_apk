package com.withings.device.details.wsm;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SoundSensorActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsm.SoundSensorActivity$saveSoundSensorActivated$1", f = "SoundSensorActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SoundSensorActivity f37314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SoundSensorActivity soundSensorActivity, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f37314a = soundSensorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f37314a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        kn.e.c().t(SoundSensorActivity.D3(this.f37314a));
        return y.f85009a;
    }
}
