package com.withings.wiscale2.device.common.onboarding;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepApneaOnboardingActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.onboarding.SleepApneaActivationViewModel$activateSoundSensor$1", f = "SleepApneaOnboardingActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f53113a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f53113a = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f53113a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kn.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        c cVar = this.f53113a;
        cVar.f53091a.setIsMicMuted(false);
        eVar = cVar.f53093c;
        eVar.t(cVar.f53091a);
        return y.f85009a;
    }
}
