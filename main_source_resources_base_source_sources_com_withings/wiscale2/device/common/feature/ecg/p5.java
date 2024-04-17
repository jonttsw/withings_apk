package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.common.device.conversation.SetTrackerPositionConversation;
import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: EcgSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class p5 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f51631a;

    /* renamed from: b  reason: collision with root package name */
    private final ej.w f51632b;

    /* renamed from: c  reason: collision with root package name */
    private final kn.e f51633c;

    /* renamed from: d  reason: collision with root package name */
    private final vr.d f51634d;

    /* renamed from: e  reason: collision with root package name */
    private final a f51635e;

    /* renamed from: f  reason: collision with root package name */
    private final fl.h f51636f;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f51637a;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.wiscale2.device.common.feature.ecg.p5$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0693a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f51638a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgSettingsViewModel$special$$inlined$map$1$2", f = "EcgSettingsActivity.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.device.common.feature.ecg.p5$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0694a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f51639a;

                /* renamed from: b  reason: collision with root package name */
                int f51640b;

                public C0694a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f51639a = obj;
                    this.f51640b |= Integer.MIN_VALUE;
                    return C0693a.this.emit(null, this);
                }
            }

            public C0693a(FlowCollector flowCollector) {
                this.f51638a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, qm0.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.withings.wiscale2.device.common.feature.ecg.p5.a.C0693a.C0694a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.withings.wiscale2.device.common.feature.ecg.p5$a$a$a r0 = (com.withings.wiscale2.device.common.feature.ecg.p5.a.C0693a.C0694a) r0
                    int r1 = r0.f51640b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f51640b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.device.common.feature.ecg.p5$a$a$a r0 = new com.withings.wiscale2.device.common.feature.ecg.p5$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f51639a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f51640b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r7)
                    goto L6d
                L27:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L2f:
                    nm0.l.b(r7)
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    boolean r7 = r6 instanceof java.util.Collection
                    r2 = 0
                    if (r7 == 0) goto L45
                    r7 = r6
                    java.util.Collection r7 = (java.util.Collection) r7
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto L45
                    goto L5e
                L45:
                    java.util.Iterator r6 = r6.iterator()
                L49:
                    boolean r7 = r6.hasNext()
                    if (r7 == 0) goto L5e
                    java.lang.Object r7 = r6.next()
                    ur.a r7 = (ur.a) r7
                    int r7 = r7.c()
                    r4 = 27
                    if (r7 != r4) goto L49
                    r2 = r3
                L5e:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                    r0.f51640b = r3
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.f51638a
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L6d
                    return r1
                L6d:
                    nm0.y r6 = nm0.y.f85009a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.p5.a.C0693a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f51637a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f51637a.collect(new C0693a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    public p5(Device device, ej.w wVar, kn.e deviceManager, vr.d featureTagsRepository) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        this.f51631a = device;
        this.f51632b = wVar;
        this.f51633c = deviceManager;
        this.f51634d = featureTagsRepository;
        this.f51635e = new a(featureTagsRepository.get(device.getId()));
        this.f51636f = new fl.h(androidx.lifecycle.h1.a(this), deviceManager, device.getId());
    }

    public final fl.h f0() {
        return this.f51636f;
    }

    public final a g0() {
        return this.f51635e;
    }

    public final void i0(int i11) {
        cj.d b10 = jl.a.b(this.f51631a);
        SetTrackerPositionConversation setTrackerPositionConversation = new SetTrackerPositionConversation(this.f51633c, i11);
        ej.w wVar = this.f51632b;
        wVar.getClass();
        wVar.u(b10, setTrackerPositionConversation, setTrackerPositionConversation.getClass()).r();
    }
}
