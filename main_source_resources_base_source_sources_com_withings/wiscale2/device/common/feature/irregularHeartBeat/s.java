package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.feature.u;
import ej.w;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class s extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52375a;

    /* renamed from: b  reason: collision with root package name */
    private final u f52376b;

    /* renamed from: c  reason: collision with root package name */
    private final DeviceFeaturesLiveData f52377c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f52378d;

    /* renamed from: e  reason: collision with root package name */
    private final zo.a f52379e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f52380f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.p<Boolean, Boolean, nm0.j<Boolean, Boolean>> f52381g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IrregularHeartBeatSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatViewModel$updateAndSyncFeature$1$1", f = "IrregularHeartBeatSettingsActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f52382a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<PlatformFeature> f52384c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f52385d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<PlatformFeature> list, boolean z5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f52384c = list;
            this.f52385d = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f52384c, this.f52385d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f52382a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                s sVar = s.this;
                u uVar = sVar.f52376b;
                Device device = sVar.f52375a;
                List<PlatformFeature> features = this.f52384c;
                kotlin.jvm.internal.u.i(features, "$features");
                com.withings.wiscale2.device.common.feature.t a11 = uVar.a(device, features, null);
                this.f52382a = 1;
                if (a11.e(17, this.f52385d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    public s(w wVar, Device device, PlatformFeatureRepository platformFeatureRepository, u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        this.f52375a = device;
        this.f52376b = platformFeatureActivationFactory;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.V(17), platformFeatureRepository, false, 8, null);
        this.f52377c = deviceFeaturesLiveData;
        j0 b10 = e1.b(deviceFeaturesLiveData, new q(this));
        this.f52378d = b10;
        zo.a aVar = new zo.a(device, wVar, h1.a(this).getCoroutineContext());
        this.f52379e = aVar;
        j0 b11 = e1.b(aVar, r.f52374a);
        this.f52380f = b11;
        this.f52381g = xw.a.d(new nm0.j(b10, b11));
    }

    public final j0 i0() {
        return this.f52378d;
    }

    public final DeviceFeaturesLiveData j0() {
        return this.f52377c;
    }

    public final j0 k0() {
        return this.f52380f;
    }

    public final xw.p<Boolean, Boolean, nm0.j<Boolean, Boolean>> m0() {
        return this.f52381g;
    }

    public final void p0(boolean z5) {
        List<? extends PlatformFeature> value = this.f52377c.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(value, z5, null), 2, null);
        }
    }

    public final void q0(boolean z5) {
        this.f52379e.y(z5, 1);
    }
}
