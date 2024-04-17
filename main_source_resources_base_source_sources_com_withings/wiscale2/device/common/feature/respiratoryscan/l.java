package com.withings.wiscale2.device.common.feature.respiratoryscan;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.api.PlatformFeatureHelper;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
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
import nm0.y;
import ym0.p;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
public final class l extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52456a;

    /* renamed from: b  reason: collision with root package name */
    private final u f52457b;

    /* renamed from: c  reason: collision with root package name */
    private final DeviceFeaturesLiveData f52458c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f52459d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.n<y> f52460e;

    /* renamed from: f  reason: collision with root package name */
    private final xw.n<y> f52461f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.n<nm0.j<Integer, List<n>>> f52462g;

    /* compiled from: RespiratoryScanActivationActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52463a;

        static {
            int[] iArr = new int[PlatformFeatureHelper.RespiratoryScanState.values().length];
            try {
                iArr[PlatformFeatureHelper.RespiratoryScanState.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlatformFeatureHelper.RespiratoryScanState.Auto.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlatformFeatureHelper.RespiratoryScanState.AlwaysOn.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52463a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RespiratoryScanActivationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.respiratoryscan.RespiratoryScanActivationViewModel$acceptFeature$1$1", f = "RespiratoryScanActivationActivity.kt", l = {ConstantsWs.WS_STATUS_DEVASSOCERROR}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f52464a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<PlatformFeature> f52466c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<PlatformFeature> list, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f52466c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f52466c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f52464a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                l lVar = l.this;
                u uVar = lVar.f52457b;
                Device device = lVar.f52456a;
                List<PlatformFeature> features = this.f52466c;
                kotlin.jvm.internal.u.i(features, "$features");
                t a11 = uVar.a(device, features, null);
                this.f52464a = 1;
                if (a11.e(10, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: RespiratoryScanActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.l<List<PlatformFeature>, Boolean> {
        c() {
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
                    if (((PlatformFeature) obj).getFeatureId() == 10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj;
            boolean z5 = false;
            if (platformFeature != null) {
                l lVar = l.this;
                if (PlatformFeatureKt.isActivatedForDevice(platformFeature, lVar.f52456a.getId()) && PlatformFeatureKt.isTutoSeenForDevice(platformFeature, lVar.f52456a.getId())) {
                    z5 = true;
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: RespiratoryScanActivationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.respiratoryscan.RespiratoryScanActivationViewModel$setFeatureFrequency$1$1", f = "RespiratoryScanActivationActivity.kt", l = {255, 256, ConstantsWs.WS_STATUS_ALREADYACTIVATED}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f52468a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<PlatformFeature> f52470c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f52471d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<PlatformFeature> list, int i11, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f52470c = list;
            this.f52471d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f52470c, this.f52471d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f52468a;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                l lVar = l.this;
                u uVar = lVar.f52457b;
                Device device = lVar.f52456a;
                List<PlatformFeature> features = this.f52470c;
                kotlin.jvm.internal.u.i(features, "$features");
                t a11 = uVar.a(device, features, null);
                int i12 = this.f52471d;
                if (i12 == 0) {
                    this.f52468a = 1;
                    if (a11.j(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i12 == 1 && lVar.y0()) {
                    this.f52468a = 2;
                    if (a11.h(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i12 == 1 || i12 == 2) {
                    this.f52468a = 3;
                    if (a11.i(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return y.f85009a;
        }
    }

    public l(Device device, u platformFeatureActivationFactory, PlatformFeatureRepository platformFeatureRepository) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        this.f52456a = device;
        this.f52457b = platformFeatureActivationFactory;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.W(10, 9, 11), platformFeatureRepository, false, 8, null);
        this.f52458c = deviceFeaturesLiveData;
        this.f52459d = e1.b(deviceFeaturesLiveData, new c());
        this.f52460e = new xw.n<>();
        this.f52461f = new xw.n<>();
        this.f52462g = new xw.n<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0() {
        Object obj;
        List<? extends PlatformFeature> value = this.f52458c.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((PlatformFeature) obj).getFeatureId() == 11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj;
            if (platformFeature != null) {
                return PlatformFeatureKt.isDeviceEligible(platformFeature, this.f52456a.getId());
            }
        }
        return false;
    }

    public final void A0(int i11) {
        xw.n<y> nVar;
        List<? extends PlatformFeature> value = this.f52458c.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(value, i11, null), 2, null);
            if (i11 == 0) {
                nVar = this.f52461f;
            } else {
                nVar = this.f52460e;
            }
            nVar.setValue(null);
        }
    }

    public final void f0() {
        List<? extends PlatformFeature> value = this.f52458c.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(value, null), 2, null);
        }
    }

    public final DeviceFeaturesLiveData k0() {
        return this.f52458c;
    }

    public final xw.n<nm0.j<Integer, List<n>>> m0() {
        return this.f52462g;
    }

    public final xw.n<y> p0() {
        return this.f52461f;
    }

    public final xw.n<y> q0() {
        return this.f52460e;
    }

    public final boolean r0() {
        Boolean bool = (Boolean) this.f52459d.getValue();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final j0 t0() {
        return this.f52459d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            r12 = this;
            com.withings.features.platform.model.DeviceFeaturesLiveData r0 = r12.f52458c
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            r3 = 2
            com.withings.device.Device r4 = r12.f52456a
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L40
            com.withings.features.platform.api.PlatformFeatureHelper$Companion r7 = com.withings.features.platform.api.PlatformFeatureHelper.Companion
            long r8 = r4.getId()
            com.withings.features.platform.api.PlatformFeatureHelper$RespiratoryScanState r1 = r7.getRespiratoryScanState(r1, r8)
            int[] r7 = com.withings.wiscale2.device.common.feature.respiratoryscan.l.a.f52463a
            int r1 = r1.ordinal()
            r1 = r7[r1]
            if (r1 == r5) goto L35
            if (r1 == r3) goto L30
            r7 = 3
            if (r1 == r7) goto L2b
            r1 = r6
            goto L39
        L2b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L39
        L30:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L39
        L35:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L39:
            if (r1 == 0) goto L40
            int r1 = r1.intValue()
            goto L41
        L40:
            r1 = r5
        L41:
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lcf
            boolean r7 = r12.y0()
            com.withings.wiscale2.device.common.feature.respiratoryscan.n[] r3 = new com.withings.wiscale2.device.common.feature.respiratoryscan.n[r3]
            com.withings.wiscale2.device.common.feature.respiratoryscan.n r8 = new com.withings.wiscale2.device.common.feature.respiratoryscan.n
            r9 = 2132026225(0x7f142371, float:1.9690977E38)
            r10 = 2132025246(0x7f141f9e, float:1.968899E38)
            r8.<init>(r9, r10, r5)
            r3[r2] = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r8 = r0.iterator()
        L62:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L78
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.withings.features.platform.model.PlatformFeature r10 = (com.withings.features.platform.model.PlatformFeature) r10
            int r10 = r10.getFeatureId()
            r11 = 9
            if (r10 != r11) goto L62
            goto L79
        L78:
            r9 = r6
        L79:
            com.withings.features.platform.model.PlatformFeature r9 = (com.withings.features.platform.model.PlatformFeature) r9
            if (r9 == 0) goto L86
            long r10 = r4.getId()
            boolean r8 = com.withings.features.platform.model.PlatformFeatureKt.isEnabledForDevice(r9, r10)
            goto L87
        L86:
            r8 = r2
        L87:
            com.withings.wiscale2.device.common.feature.respiratoryscan.n r9 = new com.withings.wiscale2.device.common.feature.respiratoryscan.n
            r10 = 2132026201(0x7f142359, float:1.9690928E38)
            r11 = 2132025239(0x7f141f97, float:1.9688977E38)
            r9.<init>(r10, r11, r8)
            r3[r5] = r9
            java.util.ArrayList r3 = kotlin.collections.x.i0(r3)
            if (r7 == 0) goto Lce
            java.util.Iterator r0 = r0.iterator()
        L9e:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto Lb4
            java.lang.Object r7 = r0.next()
            r8 = r7
            com.withings.features.platform.model.PlatformFeature r8 = (com.withings.features.platform.model.PlatformFeature) r8
            int r8 = r8.getFeatureId()
            r9 = 11
            if (r8 != r9) goto L9e
            r6 = r7
        Lb4:
            com.withings.features.platform.model.PlatformFeature r6 = (com.withings.features.platform.model.PlatformFeature) r6
            if (r6 == 0) goto Lc0
            long r7 = r4.getId()
            boolean r2 = com.withings.features.platform.model.PlatformFeatureKt.isEnabledForDevice(r6, r7)
        Lc0:
            com.withings.wiscale2.device.common.feature.respiratoryscan.n r0 = new com.withings.wiscale2.device.common.feature.respiratoryscan.n
            r4 = 2132026202(0x7f14235a, float:1.969093E38)
            r6 = 2132025240(0x7f141f98, float:1.9688979E38)
            r0.<init>(r4, r6, r2)
            r3.add(r5, r0)
        Lce:
            r6 = r3
        Lcf:
            if (r6 == 0) goto Ldf
            xw.n<nm0.j<java.lang.Integer, java.util.List<com.withings.wiscale2.device.common.feature.respiratoryscan.n>>> r0 = r12.f52462g
            nm0.j r2 = new nm0.j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r1, r6)
            r0.setValue(r2)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.respiratoryscan.l.z0():void");
    }
}
