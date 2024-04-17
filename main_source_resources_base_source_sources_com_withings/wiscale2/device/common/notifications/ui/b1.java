package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$setFeatureFlowSeen$1", f = "DeviceNotificationSettingsFragment.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_UNABLE_SAVE_FILE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52838a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f52839b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f1 f1Var, qm0.d<? super b1> dVar) {
        super(2, dVar);
        this.f52839b = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b1(this.f52839b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PlatformFeatureRepository platformFeatureRepository;
        u60.a aVar;
        Device device;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52838a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            f1 f1Var = this.f52839b;
            platformFeatureRepository = f1Var.f52876d;
            PlatformFeature feature = platformFeatureRepository.getFeature(19);
            if (feature != null) {
                aVar = f1Var.f52878f;
                device = f1Var.f52874b;
                long id2 = device.getId();
                user = f1Var.f52873a;
                long q11 = user.q();
                int featureId = feature.getFeatureId();
                this.f52838a = 1;
                if (aVar.a(id2, q11, featureId, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
