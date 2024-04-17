package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepApneaDisplayer.kt */
/* loaded from: classes5.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepApneaDisplayer.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepApneaDisplayerKt$isApneaEligible$2", f = "SleepApneaDisplayer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Device f61293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Device device, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61293a = device;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61293a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            boolean z11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            PlatformFeatureRepository platformFeatureRepository = RoomPlatformFeatureRepository.Companion.get();
            boolean z12 = true;
            PlatformFeature feature = platformFeatureRepository.getFeature(1);
            Device device = this.f61293a;
            if (feature != null && PlatformFeatureKt.isDeviceEligible(feature, device.getId())) {
                z5 = true;
            } else {
                z5 = false;
            }
            PlatformFeature feature2 = platformFeatureRepository.getFeature(2);
            if (feature2 != null && PlatformFeatureKt.isDeviceEligible(feature2, device.getId())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z5 || !z11) {
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: SleepApneaDisplayer.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepApneaDisplayerKt$isApneaEligibleAndNotActivated$2", f = "SleepApneaDisplayer.kt", l = {32, 32}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f61295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Device device, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f61295b = device;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f61295b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
            if (((java.lang.Boolean) r6).booleanValue() != false) goto L8;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r5.f61294a
                com.withings.device.Device r2 = r5.f61295b
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                nm0.l.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                nm0.l.b(r6)
                goto L2a
            L1e:
                nm0.l.b(r6)
                r5.f61294a = r4
                java.lang.Object r6 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.e.a(r2, r5)
                if (r6 != r0) goto L2a
                return r0
            L2a:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L4e
                r5.f61294a = r3
                kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
                com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.d r1 = new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.d
                r3 = 0
                r1.<init>(r2, r3)
                java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r1, r5)
                if (r6 != r0) goto L45
                return r0
            L45:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L4e
                goto L4f
            L4e:
                r4 = 0
            L4f:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(Device device, qm0.d<? super Boolean> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(device, null), dVar);
    }

    public static final Object b(Device device, qm0.d<? super Boolean> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(device, null), dVar);
    }
}
