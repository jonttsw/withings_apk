package com.withings.wiscale2.device.common.feature;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: PlatformFeatureActivation.kt */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52562a;

    /* renamed from: b  reason: collision with root package name */
    private final List<PlatformFeature> f52563b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f52564c;

    /* renamed from: d  reason: collision with root package name */
    private final qr.a f52565d;

    /* renamed from: e  reason: collision with root package name */
    private final PlatformFeatureRepository f52566e;

    /* renamed from: f  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.c f52567f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformFeatureActivation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {48}, m = "setFeatureActivation")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        t f52568a;

        /* renamed from: b  reason: collision with root package name */
        int f52569b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f52570c;

        /* renamed from: e  reason: collision with root package name */
        int f52572e;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52570c = obj;
            this.f52572e |= Integer.MIN_VALUE;
            return t.this.e(0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformFeatureActivation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS}, m = "setFeatures")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        t f52573a;

        /* renamed from: b  reason: collision with root package name */
        DateTime f52574b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f52575c;

        /* renamed from: d  reason: collision with root package name */
        List f52576d;

        /* renamed from: e  reason: collision with root package name */
        Iterator f52577e;

        /* renamed from: f  reason: collision with root package name */
        PlatformFeature f52578f;

        /* renamed from: g  reason: collision with root package name */
        boolean f52579g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f52580h;

        /* renamed from: j  reason: collision with root package name */
        int f52582j;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52580h = obj;
            this.f52582j |= Integer.MIN_VALUE;
            return t.this.g(null, false, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformFeatureActivation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {60, 61}, m = "setRespiratoryScanAuto")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        t f52583a;

        /* renamed from: b  reason: collision with root package name */
        t f52584b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f52585c;

        /* renamed from: e  reason: collision with root package name */
        int f52587e;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52585c = obj;
            this.f52587e |= Integer.MIN_VALUE;
            return t.this.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformFeatureActivation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {71, 72}, m = "setRespiratoryScanContinuous")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        t f52588a;

        /* renamed from: b  reason: collision with root package name */
        t f52589b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f52590c;

        /* renamed from: e  reason: collision with root package name */
        int f52592e;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52590c = obj;
            this.f52592e |= Integer.MIN_VALUE;
            return t.this.i(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformFeatureActivation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {82, 83}, m = "unsetRespiratoryScan")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        t f52593a;

        /* renamed from: b  reason: collision with root package name */
        t f52594b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f52595c;

        /* renamed from: e  reason: collision with root package name */
        int f52597e;

        e(qm0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52595c = obj;
            this.f52597e |= Integer.MIN_VALUE;
            return t.this.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformFeatureActivation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.PlatformFeatureActivation", f = "PlatformFeatureActivation.kt", l = {112, 121}, m = "updateFeature")
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        t f52598a;

        /* renamed from: b  reason: collision with root package name */
        PlatformFeature f52599b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f52600c;

        /* renamed from: d  reason: collision with root package name */
        DateTime f52601d;

        /* renamed from: e  reason: collision with root package name */
        Long f52602e;

        /* renamed from: f  reason: collision with root package name */
        boolean f52603f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f52604g;

        /* renamed from: i  reason: collision with root package name */
        int f52606i;

        f(qm0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52604g = obj;
            this.f52606i |= Integer.MIN_VALUE;
            return t.this.k(null, 0, false, null, null, this);
        }
    }

    public t(Device device, List<PlatformFeature> features, Long l5, qr.a platformFeatureApi, PlatformFeatureRepository platformFeatureRepository, com.withings.wiscale2.device.common.feature.c deviceScreenModifier) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(features, "features");
        kotlin.jvm.internal.u.j(platformFeatureApi, "platformFeatureApi");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(deviceScreenModifier, "deviceScreenModifier");
        this.f52562a = device;
        this.f52563b = features;
        this.f52564c = l5;
        this.f52565d = platformFeatureApi;
        this.f52566e = platformFeatureRepository;
        this.f52567f = deviceScreenModifier;
    }

    private final void c() {
        com.withings.wiscale2.device.common.feature.c cVar = this.f52567f;
        cVar.getClass();
        Device device = this.f52562a;
        kotlin.jvm.internal.u.j(device, "device");
        oi0.b.h().l(device, "feature_tag_activation");
        cVar.e(device);
    }

    static Object d(t tVar, int i11, boolean z5, DateTime dateTime, kotlin.coroutines.jvm.internal.c cVar, int i12) {
        if ((i12 & 4) != 0) {
            dateTime = null;
        }
        tVar.getClass();
        Object g11 = tVar.g(x.V(new Integer(i11)), z5, dateTime, null, cVar);
        if (g11 != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return g11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b5 -> B:30:0x00be). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c9 -> B:32:0x00ca). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List<java.lang.Integer> r18, boolean r19, org.joda.time.DateTime r20, org.joda.time.DateTime r21, qm0.d<? super nm0.y> r22) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.g(java.util.List, boolean, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.withings.features.platform.model.PlatformFeature r21, int r22, boolean r23, org.joda.time.DateTime r24, org.joda.time.DateTime r25, qm0.d<? super nm0.y> r26) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.k(com.withings.features.platform.model.PlatformFeature, int, boolean, org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r9, boolean r10, qm0.d<? super nm0.y> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.withings.wiscale2.device.common.feature.t.a
            if (r0 == 0) goto L14
            r0 = r11
            com.withings.wiscale2.device.common.feature.t$a r0 = (com.withings.wiscale2.device.common.feature.t.a) r0
            int r1 = r0.f52572e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f52572e = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.withings.wiscale2.device.common.feature.t$a r0 = new com.withings.wiscale2.device.common.feature.t$a
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f52570c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.f52572e
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L2f
            int r9 = r5.f52569b
            com.withings.wiscale2.device.common.feature.t r10 = r5.f52568a
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r11 = move-exception
            goto L55
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            nm0.l.b(r11)
            r5.f52568a = r8     // Catch: java.lang.Throwable -> L53
            r5.f52569b = r9     // Catch: java.lang.Throwable -> L53
            r5.f52572e = r7     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r6 = 12
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r10 = d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L53
            if (r10 != r0) goto L4d
            return r0
        L4d:
            r10 = r8
        L4e:
            nm0.y r11 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2d
            goto L59
        L51:
            r10 = r8
            goto L55
        L53:
            r11 = move-exception
            goto L51
        L55:
            nm0.k$a r11 = nm0.l.a(r11)
        L59:
            boolean r0 = r11 instanceof nm0.k.a
            r0 = r0 ^ r7
            if (r0 == 0) goto L64
            r0 = r11
            nm0.y r0 = (nm0.y) r0
            r10.c()
        L64:
            java.lang.Throwable r11 = nm0.k.b(r11)
            if (r11 == 0) goto L94
            com.withings.device.Device r0 = r10.f52562a
            long r0 = r0.getId()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error syncing platform feature id "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = " for device "
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = " error "
            r2.append(r9)
            r2.append(r11)
            java.lang.String r9 = r2.toString()
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            x70.b.d(r10, r9, r11)
        L94:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.e(int, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.ArrayList r9, qm0.d r10, boolean r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.device.common.feature.s
            if (r0 == 0) goto L14
            r0 = r10
            com.withings.wiscale2.device.common.feature.s r0 = (com.withings.wiscale2.device.common.feature.s) r0
            int r1 = r0.f52479e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f52479e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.withings.wiscale2.device.common.feature.s r0 = new com.withings.wiscale2.device.common.feature.s
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f52477c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f52479e
            r7 = 1
            if (r1 == 0) goto L39
            if (r1 != r7) goto L31
            java.util.List r9 = r6.f52476b
            java.util.List r9 = (java.util.List) r9
            com.withings.wiscale2.device.common.feature.t r11 = r6.f52475a
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L4f
        L2f:
            r10 = move-exception
            goto L56
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            nm0.l.b(r10)
            r6.f52475a = r8     // Catch: java.lang.Throwable -> L54
            r6.f52476b = r9     // Catch: java.lang.Throwable -> L54
            r6.f52479e = r7     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r11
            java.lang.Object r10 = r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L54
            if (r10 != r0) goto L4e
            return r0
        L4e:
            r11 = r8
        L4f:
            nm0.y r10 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2f
            goto L5a
        L52:
            r11 = r8
            goto L56
        L54:
            r10 = move-exception
            goto L52
        L56:
            nm0.k$a r10 = nm0.l.a(r10)
        L5a:
            boolean r0 = r10 instanceof nm0.k.a
            r0 = r0 ^ r7
            if (r0 == 0) goto L65
            r0 = r10
            nm0.y r0 = (nm0.y) r0
            r11.c()
        L65:
            java.lang.Throwable r10 = nm0.k.b(r10)
            if (r10 == 0) goto L99
            com.withings.device.Device r0 = r11.f52562a
            long r0 = r0.getId()
            java.lang.Throwable r10 = r10.getCause()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error syncing platform feature ids "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = " for device "
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = " error "
            r2.append(r9)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            x70.b.d(r11, r9, r10)
        L99:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.f(java.util.ArrayList, qm0.d, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(4:26|27|28|29))(9:37|(1:39)|40|41|42|43|44|(1:46)(1:50)|(1:48)(1:49))|30|(1:32)|13|14|(0)|17|(0)|20|21))|58|6|7|(0)(0)|30|(0)|13|14|(0)|17|(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Type inference failed for: r12v22, types: [com.withings.wiscale2.device.common.feature.t] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, com.withings.wiscale2.device.common.feature.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(org.joda.time.DateTime r12, qm0.d<? super nm0.y> r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.h(org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(4:26|27|28|29))(4:37|38|39|(1:41)(1:42))|30|(1:32)|13|14|(0)|17|(0)|20|21))|47|6|7|(0)(0)|30|(0)|13|14|(0)|17|(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(org.joda.time.DateTime r12, qm0.d<? super nm0.y> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.withings.wiscale2.device.common.feature.t.d
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.wiscale2.device.common.feature.t$d r0 = (com.withings.wiscale2.device.common.feature.t.d) r0
            int r1 = r0.f52592e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52592e = r1
            goto L18
        L13:
            com.withings.wiscale2.device.common.feature.t$d r0 = new com.withings.wiscale2.device.common.feature.t$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f52590c
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r0.f52592e
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L44
            if (r1 == r9) goto L36
            if (r1 != r8) goto L2e
            com.withings.wiscale2.device.common.feature.t r12 = r0.f52588a
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L2c
            goto L73
        L2c:
            r13 = move-exception
            goto L7a
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.withings.wiscale2.device.common.feature.t r12 = r0.f52589b
            com.withings.wiscale2.device.common.feature.t r1 = r0.f52588a
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L41
            r10 = r1
            r1 = r12
            r12 = r10
            goto L5e
        L41:
            r13 = move-exception
            r12 = r1
            goto L7a
        L44:
            nm0.l.b(r13)
            r0.f52588a = r11     // Catch: java.lang.Throwable -> L78
            r0.f52589b = r11     // Catch: java.lang.Throwable -> L78
            r0.f52592e = r9     // Catch: java.lang.Throwable -> L78
            r2 = 9
            r3 = 1
            r6 = 8
            r1 = r11
            r4 = r12
            r5 = r0
            java.lang.Object r12 = d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L78
            if (r12 != r7) goto L5c
            return r7
        L5c:
            r12 = r11
            r1 = r12
        L5e:
            r0.f52588a = r12     // Catch: java.lang.Throwable -> L2c
            r13 = 0
            r0.f52589b = r13     // Catch: java.lang.Throwable -> L2c
            r0.f52592e = r8     // Catch: java.lang.Throwable -> L2c
            r2 = 11
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r0
            java.lang.Object r13 = d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r13 != r7) goto L73
            return r7
        L73:
            nm0.y r13 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2c
            goto L7e
        L76:
            r12 = r11
            goto L7a
        L78:
            r13 = move-exception
            goto L76
        L7a:
            nm0.k$a r13 = nm0.l.a(r13)
        L7e:
            boolean r0 = r13 instanceof nm0.k.a
            r0 = r0 ^ r9
            if (r0 == 0) goto L89
            r0 = r13
            nm0.y r0 = (nm0.y) r0
            r12.c()
        L89:
            java.lang.Throwable r13 = nm0.k.b(r13)
            if (r13 == 0) goto Lb5
            com.withings.device.Device r0 = r12.f52562a
            long r0 = r0.getId()
            java.lang.Throwable r13 = r13.getCause()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error syncing platform feature RespiratoryScan.setContinuous for device "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " error "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            x70.b.d(r12, r13, r0)
        Lb5:
            nm0.y r12 = nm0.y.f85009a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.i(org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(1:(1:(10:10|11|12|13|14|(1:16)|17|(1:19)|20|21)(2:26|27))(4:28|29|30|31))(4:43|44|45|(1:47)(1:48))|32|33|(1:35)(8:36|13|14|(0)|17|(0)|20|21)))|52|6|(0)(0)|32|33|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        r0 = r12;
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(qm0.d<? super nm0.y> r12) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.t.j(qm0.d):java.lang.Object");
    }
}
