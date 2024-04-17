package com.withings.wiscale2.device.common.onboarding;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.t;
import com.withings.wiscale2.device.common.feature.u;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import xw.n;
import ym0.p;
/* compiled from: SleepApneaOnboardingActivity.kt */
/* loaded from: classes5.dex */
public final class c extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f53091a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f53092b;

    /* renamed from: c  reason: collision with root package name */
    private final kn.e f53093c;

    /* renamed from: d  reason: collision with root package name */
    private final u f53094d;

    /* renamed from: e  reason: collision with root package name */
    private final DeviceFeaturesLiveData f53095e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f53096f;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f53097g;

    /* renamed from: h  reason: collision with root package name */
    private final j0 f53098h;

    /* renamed from: i  reason: collision with root package name */
    private final n<y> f53099i;

    /* renamed from: j  reason: collision with root package name */
    private final n<y> f53100j;

    /* renamed from: k  reason: collision with root package name */
    private final n<Boolean> f53101k;

    /* renamed from: l  reason: collision with root package name */
    private final n<Integer> f53102l;

    /* renamed from: m  reason: collision with root package name */
    private final j0 f53103m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepApneaOnboardingActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.onboarding.SleepApneaActivationViewModel$activateSleepApnea$1$1", f = "SleepApneaOnboardingActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGAPPLICATIONCTX}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53104a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f53105b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<PlatformFeature> f53107d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepApneaOnboardingActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.onboarding.SleepApneaActivationViewModel$activateSleepApnea$1$1$1", f = "SleepApneaOnboardingActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.device.common.onboarding.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0709a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f53108a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0709a(c cVar, qm0.d<? super C0709a> dVar) {
                super(2, dVar);
                this.f53108a = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new C0709a(this.f53108a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((C0709a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                this.f53108a.m0().setValue(Boolean.FALSE);
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<PlatformFeature> list, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f53107d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f53107d, dVar);
            aVar.f53105b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53104a;
            c cVar = c.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                    coroutineScope = (CoroutineScope) this.f53105b;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f53105b;
                u uVar = cVar.f53094d;
                Device device = cVar.f53091a;
                List<PlatformFeature> features = this.f53107d;
                kotlin.jvm.internal.u.i(features, "$features");
                t a11 = uVar.a(device, features, null);
                this.f53105b = coroutineScope2;
                this.f53104a = 1;
                if (a11.e(2, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope = coroutineScope2;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new C0709a(cVar, null), 2, null);
            return y.f85009a;
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.l<List<PlatformFeature>, Boolean> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            boolean z5;
            Object obj;
            List<PlatformFeature> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            Iterator<T> it = list2.iterator();
            while (true) {
                z5 = true;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((PlatformFeature) obj).getFeatureId() == 1) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj;
            if (platformFeature == null || !PlatformFeatureKt.isActivatedForDevice(platformFeature, c.this.f53091a.getId())) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* renamed from: com.withings.wiscale2.device.common.onboarding.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0710c extends w implements ym0.l<List<PlatformFeature>, Boolean> {
        C0710c() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            Object obj;
            List<PlatformFeature> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((PlatformFeature) obj).getFeatureId() == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj;
            boolean z5 = false;
            if (platformFeature != null && PlatformFeatureKt.isActivatedForDevice(platformFeature, c.this.f53091a.getId())) {
                z5 = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.l<Device, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f53111a = new w(1);

        @Override // ym0.l
        public final Boolean invoke(Device device) {
            Device device2 = device;
            kotlin.jvm.internal.u.j(device2, "device");
            return Boolean.valueOf(!device2.isMicMuted());
        }
    }

    /* compiled from: SleepApneaOnboardingActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.l<Boolean, Integer> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final Integer invoke(Boolean bool) {
            int i11;
            if (!bool.booleanValue()) {
                i11 = C1987R.id.intro_destination;
            } else if (c.this.f53092b) {
                i11 = C1987R.id.calibrating_destination;
            } else {
                return null;
            }
            return Integer.valueOf(i11);
        }
    }

    public c(Device device, boolean z5, kn.e deviceManager, u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f53091a = device;
        this.f53092b = z5;
        this.f53093c = deviceManager;
        this.f53094d = platformFeatureActivationFactory;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.W(1, 2), null, false, 12, null);
        this.f53095e = deviceFeaturesLiveData;
        this.f53096f = e1.b(deviceFeaturesLiveData, new b());
        j0 b10 = e1.b(deviceFeaturesLiveData, new C0710c());
        this.f53097g = b10;
        this.f53098h = e1.b(b10, new e());
        this.f53099i = new n<>();
        this.f53100j = new n<>();
        this.f53101k = new n<>();
        this.f53102l = new n<>();
        this.f53103m = e1.b(new fl.h(h1.a(this), deviceManager, device.getId()), d.f53111a);
    }

    public final j0 A0() {
        return this.f53096f;
    }

    public final j0 B0() {
        return this.f53097g;
    }

    public final void k0() {
        this.f53101k.setValue(Boolean.TRUE);
        List<? extends PlatformFeature> value = this.f53095e.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(value, null), 2, null);
        }
    }

    public final n<Boolean> m0() {
        return this.f53101k;
    }

    public final n<y> p0() {
        return this.f53100j;
    }

    public final n<y> q0() {
        return this.f53099i;
    }

    public final j0 r0() {
        return this.f53103m;
    }

    public final j0 t0() {
        return this.f53098h;
    }

    public final n<Integer> y0() {
        return this.f53102l;
    }

    public final void z0() {
        if (this.f53091a.isMicMuted()) {
            this.f53099i.setValue(null);
        } else {
            this.f53100j.setValue(null);
        }
    }
}
