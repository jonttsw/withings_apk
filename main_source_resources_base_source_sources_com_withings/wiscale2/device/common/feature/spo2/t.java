package com.withings.wiscale2.device.common.feature.spo2;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.wiscale2.device.common.feature.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: SpO2SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class t extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52551a;

    /* renamed from: b  reason: collision with root package name */
    private final u f52552b;

    /* renamed from: c  reason: collision with root package name */
    private final DeviceFeaturesLiveData f52553c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f52554d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f52555e;

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.l<List<PlatformFeature>, Boolean> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            boolean z5;
            List<PlatformFeature> list2 = list;
            Object obj = null;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    PlatformFeature platformFeature = (PlatformFeature) next;
                    if (platformFeature.getFeatureId() == 5 && PlatformFeatureKt.isActivatedForDevice(platformFeature, t.this.f52551a.getId())) {
                        obj = next;
                        break;
                    }
                }
                obj = (PlatformFeature) obj;
            }
            if (obj != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.l<List<PlatformFeature>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f52557a = new w(1);

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            List<PlatformFeature> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            List<PlatformFeature> list3 = list2;
            boolean z5 = false;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((PlatformFeature) it.next()).getFeatureId() == 15) {
                        z5 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpO2SettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.spo2.Spo2ViewModel$updateAndSyncFeature$1$1", f = "SpO2SettingsActivity.kt", l = {140}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f52558a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<PlatformFeature> f52560c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f52561d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<PlatformFeature> list, boolean z5, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f52560c = list;
            this.f52561d = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f52560c, this.f52561d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f52558a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                t tVar = t.this;
                u uVar = tVar.f52552b;
                Device device = tVar.f52551a;
                List<PlatformFeature> features = this.f52560c;
                kotlin.jvm.internal.u.i(features, "$features");
                com.withings.wiscale2.device.common.feature.t a11 = uVar.a(device, features, null);
                this.f52558a = 1;
                if (a11.e(5, this.f52561d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    public t(Device device, u platformFeatureActivationFactory, PlatformFeatureRepository platformFeatureRepository) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        this.f52551a = device;
        this.f52552b = platformFeatureActivationFactory;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.W(15, 3, 5), platformFeatureRepository, false, 8, null);
        this.f52553c = deviceFeaturesLiveData;
        this.f52554d = e1.b(deviceFeaturesLiveData, b.f52557a);
        this.f52555e = e1.b(deviceFeaturesLiveData, new a());
    }

    public final j0 i0() {
        return this.f52555e;
    }

    public final j0 j0() {
        return this.f52554d;
    }

    public final void k0(boolean z5) {
        List<? extends PlatformFeature> value = this.f52553c.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(value, z5, null), 2, null);
        }
    }
}
