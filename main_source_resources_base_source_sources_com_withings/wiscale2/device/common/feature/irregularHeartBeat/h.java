package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.wiscale2.device.common.feature.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IrregularHeartBeatActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatActivationViewModel$setMonitoringAndActivateNotifications$1", f = "IrregularHeartBeatActivationActivity.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52360a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f52361b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f52362c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, boolean z5, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f52361b = iVar;
        this.f52362c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f52361b, this.f52362c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zo.a aVar;
        DeviceFeaturesLiveData deviceFeaturesLiveData;
        u uVar;
        Device device;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52360a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            i iVar = this.f52361b;
            aVar = iVar.f52367e;
            boolean z5 = this.f52362c;
            aVar.y(z5, 1);
            deviceFeaturesLiveData = iVar.f52365c;
            List<? extends PlatformFeature> value = deviceFeaturesLiveData.getValue();
            if (value != null) {
                uVar = iVar.f52364b;
                device = iVar.f52363a;
                com.withings.wiscale2.device.common.feature.t a11 = uVar.a(device, value, null);
                List<? extends PlatformFeature> list = value;
                ArrayList arrayList = new ArrayList(x.y(list, 10));
                for (PlatformFeature platformFeature : list) {
                    arrayList.add(new Integer(platformFeature.getFeatureId()));
                }
                this.f52360a = 1;
                if (a11.f(arrayList, this, z5) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return y.f85009a;
    }
}
