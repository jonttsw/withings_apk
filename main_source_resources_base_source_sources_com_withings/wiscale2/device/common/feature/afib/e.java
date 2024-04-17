package com.withings.wiscale2.device.common.feature.afib;

import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AfibActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.afib.AfibActivationViewModel$activateFeatureAndMonitoring$1", f = "AfibActivationActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICEID}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f51016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f51016b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f51016b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeviceFeaturesLiveData deviceFeaturesLiveData;
        com.withings.wiscale2.device.common.feature.u uVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51015a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            h hVar = this.f51016b;
            deviceFeaturesLiveData = hVar.f51023d;
            List<? extends PlatformFeature> value = deviceFeaturesLiveData.getValue();
            if (value != null) {
                uVar = hVar.f51021b;
                com.withings.wiscale2.device.common.feature.t a11 = uVar.a(hVar.k0(), value, null);
                List<? extends PlatformFeature> list = value;
                ArrayList arrayList = new ArrayList(x.y(list, 10));
                for (PlatformFeature platformFeature : list) {
                    arrayList.add(new Integer(platformFeature.getFeatureId()));
                }
                this.f51015a = 1;
                if (a11.f(arrayList, this, true) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return y.f85009a;
    }
}
