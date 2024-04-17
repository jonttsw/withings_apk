package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SleepApneaDisplayer.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepApneaDisplayerKt$isApneaActivated$2", f = "SleepApneaDisplayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f61290a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Device device, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f61290a = device;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f61290a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        PlatformFeature feature = RoomPlatformFeatureRepository.Companion.get().getFeature(2);
        boolean z5 = false;
        if (feature != null && PlatformFeatureKt.isActivatedForDevice(feature, this.f61290a.getId())) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
