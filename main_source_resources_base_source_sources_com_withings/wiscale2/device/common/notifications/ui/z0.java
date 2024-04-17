package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$healthNotification$1", f = "DeviceNotificationSettingsFragment.kt", l = {448}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends PlatformFeature>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53053a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f53054b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f1 f53055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(f1 f1Var, qm0.d<? super z0> dVar) {
        super(2, dVar);
        this.f53055c = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        z0 z0Var = new z0(this.f53055c, dVar);
        z0Var.f53054b = obj;
        return z0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends PlatformFeature>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((z0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PlatformFeatureRepository platformFeatureRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53053a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            platformFeatureRepository = this.f53055c.f52876d;
            List<PlatformFeature> platformFeatures = platformFeatureRepository.getPlatformFeatures(14, 13, 22);
            this.f53053a = 1;
            if (((FlowCollector) this.f53054b).emit(platformFeatures, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
