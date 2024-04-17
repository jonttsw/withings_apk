package com.withings.wiscale2.device.common.feature.afib;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import ej.w;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: AfibSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class s extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f51035a;

    /* renamed from: b  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.u f51036b;

    /* renamed from: c  reason: collision with root package name */
    private final zo.a f51037c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f51038d;

    /* renamed from: e  reason: collision with root package name */
    private final DeviceFeaturesLiveData f51039e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f51040f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.p<Boolean, Boolean, nm0.j<Boolean, Boolean>> f51041g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AfibSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.afib.AfibViewModel$updateAndSyncFeature$1$1", f = "AfibSettingsActivity.kt", l = {ConstantsWs.MEASURE_TYPE_INTRACELLULAR_WATER}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51042a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<PlatformFeature> f51044c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f51045d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<PlatformFeature> list, boolean z5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51044c = list;
            this.f51045d = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51044c, this.f51045d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51042a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                s sVar = s.this;
                com.withings.wiscale2.device.common.feature.u uVar = sVar.f51036b;
                Device i02 = sVar.i0();
                List<PlatformFeature> features = this.f51044c;
                kotlin.jvm.internal.u.i(features, "$features");
                com.withings.wiscale2.device.common.feature.t a11 = uVar.a(i02, features, null);
                this.f51042a = 1;
                if (a11.e(17, this.f51045d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    public s(w wVar, Device device, PlatformFeatureRepository platformFeatureRepository, com.withings.wiscale2.device.common.feature.u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f51035a = device;
        this.f51036b = platformFeatureActivationFactory;
        zo.a aVar = new zo.a(device, wVar, h1.a(this).getCoroutineContext());
        this.f51037c = aVar;
        j0 b10 = e1.b(aVar, q.f51033a);
        this.f51038d = b10;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.V(17), platformFeatureRepository, false, 8, null);
        this.f51039e = deviceFeaturesLiveData;
        j0 b11 = e1.b(deviceFeaturesLiveData, new r(this));
        this.f51040f = b11;
        this.f51041g = xw.a.d(new nm0.j(b11, b10));
    }

    public final j0 g0() {
        return this.f51038d;
    }

    public final Device i0() {
        return this.f51035a;
    }

    public final j0 j0() {
        return this.f51040f;
    }

    public final DeviceFeaturesLiveData k0() {
        return this.f51039e;
    }

    public final xw.p<Boolean, Boolean, nm0.j<Boolean, Boolean>> m0() {
        return this.f51041g;
    }

    public final void p0(boolean z5) {
        List<? extends PlatformFeature> value = this.f51039e.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(value, z5, null), 2, null);
        }
    }

    public final void q0(boolean z5) {
        this.f51037c.y(z5, 1);
    }
}
