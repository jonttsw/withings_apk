package com.withings.wiscale2.device.common.feature.highlowhr;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;
import com.withings.comm.wpp.generated.object.LocalNotification;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class a extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f52228a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f52229b;

    /* renamed from: c  reason: collision with root package name */
    private final TargetRepository f52230c;

    /* renamed from: d  reason: collision with root package name */
    private final kn.e f52231d;

    /* renamed from: e  reason: collision with root package name */
    private final ej.w f52232e;

    /* renamed from: f  reason: collision with root package name */
    private final fl.p f52233f;

    /* renamed from: g  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.u f52234g;

    /* renamed from: h  reason: collision with root package name */
    private final PlatformFeatureRepository f52235h;

    /* renamed from: i  reason: collision with root package name */
    private final ng0.b f52236i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f52237j;

    /* renamed from: k  reason: collision with root package name */
    private final zo.a f52238k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.j0 f52239l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.j0 f52240m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.j0 f52241n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.j0 f52242o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.lifecycle.j0 f52243p;

    /* compiled from: HighLowHRSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HREventsNotificationSettingsViewModel$1", f = "HighLowHRSettingsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.device.common.feature.highlowhr.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0704a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        C0704a(qm0.d<? super C0704a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new C0704a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((C0704a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            a aVar = a.this;
            a.p0(aVar).b(aVar.getUser().q());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.o<Target, Target, Boolean>, HRThresholdMode> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f52245a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final HRThresholdMode invoke(nm0.o<Target, Target, Boolean> oVar) {
            nm0.o<Target, Target, Boolean> oVar2 = oVar;
            Target a11 = oVar2.a();
            Target b10 = oVar2.b();
            if (oVar2.c().booleanValue()) {
                return HRThresholdMode.f52174b;
            }
            if (!a11.isActive() && !b10.isActive()) {
                return HRThresholdMode.f52173a;
            }
            return HRThresholdMode.f52175c;
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Target, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f52246a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Integer invoke(Target target) {
            Target target2 = target;
            kotlin.jvm.internal.u.j(target2, "target");
            if (!target2.isActive()) {
                target2 = null;
            }
            if (target2 == null) {
                return null;
            }
            return Integer.valueOf(target2.getAsInt());
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Target, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f52247a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Integer invoke(Target target) {
            Target target2 = target;
            kotlin.jvm.internal.u.j(target2, "target");
            if (!target2.isActive()) {
                target2 = null;
            }
            if (target2 == null) {
                return null;
            }
            return Integer.valueOf(target2.getAsInt());
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<List<LocalNotification>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f52248a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(List<LocalNotification> list) {
            boolean z5;
            List<LocalNotification> notifications = list;
            kotlin.jvm.internal.u.j(notifications, "notifications");
            if (androidx.health.connect.client.units.d.k(notifications, (short) 3) && androidx.health.connect.client.units.d.k(notifications, (short) 2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<nm0.j<HRThresholdMode, PlatformFeature>, List<nm0.j<gi.b, ym0.a<nm0.y>>>> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final List<nm0.j<gi.b, ym0.a<nm0.y>>> invoke(nm0.j<HRThresholdMode, PlatformFeature> jVar) {
            boolean z5;
            boolean z11;
            boolean z12;
            nm0.j<HRThresholdMode, PlatformFeature> jVar2 = jVar;
            HRThresholdMode a11 = jVar2.a();
            PlatformFeature b10 = jVar2.b();
            a aVar = a.this;
            Application application = aVar.getApplication();
            kotlin.jvm.internal.u.h(application, "null cannot be cast to non-null type android.content.Context");
            String string = application.getString(C1987R.string.status_off);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            if (a11 == HRThresholdMode.f52173a) {
                z5 = true;
            } else {
                z5 = false;
            }
            gi.b bVar = new gi.b(10, string, null, z5, false);
            String string2 = application.getString(C1987R.string.status_automaticRecommended);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            String string3 = application.getString(C1987R.string.heartEvents_lowHR_setting_auto);
            if (a11 == HRThresholdMode.f52174b) {
                z11 = true;
            } else {
                z11 = false;
            }
            gi.b bVar2 = new gi.b(8, string2, string3, z11, false);
            String string4 = application.getString(C1987R.string.status_custom_threshold);
            kotlin.jvm.internal.u.i(string4, "getString(...)");
            if (a11 == HRThresholdMode.f52175c) {
                z12 = true;
            } else {
                z12 = false;
            }
            gi.b bVar3 = new gi.b(10, string4, null, z12, false);
            nm0.j[] jVarArr = new nm0.j[3];
            jVarArr[0] = new nm0.j(bVar, new com.withings.wiscale2.device.common.feature.highlowhr.f(aVar));
            new nm0.j(bVar2, new com.withings.wiscale2.device.common.feature.highlowhr.g(aVar));
            jVarArr[1] = (b10 == null || !PlatformFeatureKt.isDeviceEligible(b10, aVar.A0().getId())) ? null : null;
            jVarArr[2] = new nm0.j(bVar3, new com.withings.wiscale2.device.common.feature.highlowhr.h(aVar));
            return kotlin.collections.l.z(jVarArr);
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<PlatformFeature, Boolean> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(PlatformFeature platformFeature) {
            boolean z5;
            PlatformFeature platformFeature2 = platformFeature;
            if (platformFeature2 != null) {
                z5 = PlatformFeatureKt.isActivatedForDevice(platformFeature2, a.this.A0().getId());
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<ng0.i> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final ng0.i invoke() {
            a aVar = a.this;
            return new ng0.i(aVar.f52233f, aVar.f52231d, aVar.f52232e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(User user, Device device, Application application, TargetRepository targetRepository, kn.e deviceManager, ej.w wVar, fl.p pVar, com.withings.wiscale2.device.common.feature.u platformFeatureActivationFactory, PlatformFeatureRepository featureRepository, ng0.b bVar) {
        super(application);
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(featureRepository, "featureRepository");
        this.f52228a = user;
        this.f52229b = device;
        this.f52230c = targetRepository;
        this.f52231d = deviceManager;
        this.f52232e = wVar;
        this.f52233f = pVar;
        this.f52234g = platformFeatureActivationFactory;
        this.f52235h = featureRepository;
        this.f52236i = bVar;
        this.f52237j = nm0.h.b(new h());
        zo.a aVar = new zo.a(device, wVar, h1.a(this).getCoroutineContext());
        this.f52238k = aVar;
        this.f52239l = e1.b(aVar, e.f52248a);
        LiveData<PlatformFeature> featureLiveData = featureRepository.getFeatureLiveData(26);
        androidx.lifecycle.j0 b10 = e1.b(featureLiveData, new g());
        androidx.lifecycle.f b11 = androidx.lifecycle.q.b(targetRepository.getHRLastTargetOrDefaultFlow(user.q(), ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN), Dispatchers.getIO(), 2);
        androidx.lifecycle.f b12 = androidx.lifecycle.q.b(targetRepository.getHRLastTargetOrDefaultFlow(user.q(), ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX), Dispatchers.getIO(), 2);
        this.f52240m = e1.b(b12, c.f52246a);
        this.f52241n = e1.b(b11, d.f52247a);
        androidx.lifecycle.j0 b13 = e1.b(xw.a.c(new nm0.o(b11, b12, b10)), b.f52245a);
        this.f52242o = b13;
        this.f52243p = e1.b(xw.a.d(new nm0.j(b13, featureLiveData)), new f());
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new C0704a(null), 2, null);
    }

    public static final ng0.i p0(a aVar) {
        return (ng0.i) aVar.f52237j.getValue();
    }

    public static final Object r0(a aVar, boolean z5, qm0.d dVar) {
        aVar.getClass();
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new i(aVar, z5, null), dVar);
        if (withContext != CoroutineSingletons.f76214a) {
            return nm0.y.f85009a;
        }
        return withContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t0(com.withings.wiscale2.device.common.feature.highlowhr.a r9, boolean r10, qm0.d r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof com.withings.wiscale2.device.common.feature.highlowhr.j
            if (r0 == 0) goto L16
            r0 = r11
            com.withings.wiscale2.device.common.feature.highlowhr.j r0 = (com.withings.wiscale2.device.common.feature.highlowhr.j) r0
            int r1 = r0.f52297e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f52297e = r1
            goto L1b
        L16:
            com.withings.wiscale2.device.common.feature.highlowhr.j r0 = new com.withings.wiscale2.device.common.feature.highlowhr.j
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f52295c
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r0.f52297e
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L35
            if (r1 != r8) goto L2d
            nm0.l.b(r11)
            goto L73
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            boolean r10 = r0.f52294b
            com.withings.wiscale2.device.common.feature.highlowhr.a r9 = r0.f52293a
            nm0.l.b(r11)
        L3c:
            r5 = r10
            goto L5c
        L3e:
            nm0.l.b(r11)
            com.withings.user.User r11 = r9.f52228a
            long r3 = r11.q()
            r0.f52293a = r9
            r0.f52294b = r10
            r0.f52297e = r2
            com.withings.target.data.TargetRepository r1 = r9.f52230c
            r11 = 143(0x8f, float:2.0E-43)
            r2 = r3
            r4 = r11
            r5 = r10
            r6 = r0
            java.lang.Object r11 = r1.changeHeartRateThresholdActivation(r2, r4, r5, r6)
            if (r11 != r7) goto L3c
            goto L75
        L5c:
            com.withings.target.data.TargetRepository r1 = r9.f52230c
            com.withings.user.User r9 = r9.f52228a
            long r2 = r9.q()
            r9 = 0
            r0.f52293a = r9
            r0.f52297e = r8
            r4 = 144(0x90, float:2.02E-43)
            r6 = r0
            java.lang.Object r9 = r1.changeHeartRateThresholdActivation(r2, r4, r5, r6)
            if (r9 != r7) goto L73
            goto L75
        L73:
            nm0.y r7 = nm0.y.f85009a
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.highlowhr.a.t0(com.withings.wiscale2.device.common.feature.highlowhr.a, boolean, qm0.d):java.lang.Object");
    }

    public final Device A0() {
        return this.f52229b;
    }

    public final androidx.lifecycle.j0 B0() {
        return this.f52240m;
    }

    public final androidx.lifecycle.j0 F0() {
        return this.f52241n;
    }

    public final androidx.lifecycle.j0 G0() {
        return this.f52239l;
    }

    public final androidx.lifecycle.j0 K0() {
        return this.f52243p;
    }

    public final User getUser() {
        return this.f52228a;
    }

    public final void y0(boolean z5) {
        this.f52238k.y(z5, 2, 3);
    }

    public final androidx.lifecycle.j0 z0() {
        return this.f52242o;
    }
}
