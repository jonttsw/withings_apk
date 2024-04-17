package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.h;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.ref.WeakReference;
import kn.e;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: FirstEcgVideoInstructionScreen.kt */
/* loaded from: classes5.dex */
public final class FirstEcgVideoInstructionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final e f51941a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51942b;

    /* renamed from: c  reason: collision with root package name */
    private final long f51943c;

    /* renamed from: d  reason: collision with root package name */
    private final Flow<Boolean> f51944d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<a> f51945e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<Context> f51946f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<Boolean> f51947g;

    /* renamed from: h  reason: collision with root package name */
    private final EcgMeasurementEndBroadcastReceiver f51948h;

    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/us/hwa10/ui/tutorial/FirstEcgVideoInstructionViewModel$EcgMeasurementEndBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class EcgMeasurementEndBroadcastReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final ym0.a<y> f51949a;

        public EcgMeasurementEndBroadcastReceiver(ym0.a<y> aVar) {
            this.f51949a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            u.j(context, "context");
            u.j(intent, "intent");
            this.f51949a.invoke();
        }
    }

    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f51950a;

        public a(boolean z5) {
            this.f51950a = z5;
        }

        public final boolean a() {
            return this.f51950a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f51950a == ((a) obj).f51950a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f51950a);
        }

        public final String toString() {
            return h.d(new StringBuilder("EcgMeasurementSuccessEvent(needReview="), this.f51950a, ")");
        }
    }

    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$isWearRight$1", f = "FirstEcgVideoInstructionScreen.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<FlowCollector<? super Boolean>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51951a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51952b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f51952b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super y> dVar) {
            return ((b) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51951a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f51952b;
                FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel = FirstEcgVideoInstructionViewModel.this;
                Device d11 = firstEcgVideoInstructionViewModel.f51941a.d(firstEcgVideoInstructionViewModel.f51943c);
                if (d11 != null) {
                    if (d11.getTrackerWearPosition() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z5);
                    this.f51951a = 1;
                    if (flowCollector.emit(valueOf, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<y> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel = FirstEcgVideoInstructionViewModel.this;
            BuildersKt__Builders_commonKt.launch$default(h1.a(firstEcgVideoInstructionViewModel), null, null, new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.b(firstEcgVideoInstructionViewModel, null), 3, null);
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class d implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f51955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FirstEcgVideoInstructionViewModel f51956b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f51957a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FirstEcgVideoInstructionViewModel f51958b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$special$$inlined$map$1$2", f = "FirstEcgVideoInstructionScreen.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0700a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f51959a;

                /* renamed from: b  reason: collision with root package name */
                int f51960b;

                public C0700a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f51959a = obj;
                    this.f51960b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel) {
                this.f51957a = flowCollector;
                this.f51958b = firstEcgVideoInstructionViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel.d.a.C0700a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$d$a$a r0 = (com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel.d.a.C0700a) r0
                    int r1 = r0.f51960b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f51960b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$d$a$a r0 = new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$d$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f51959a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f51960b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r8)
                    goto L6f
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    nm0.l.b(r8)
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L3a:
                    boolean r8 = r7.hasNext()
                    r2 = 0
                    if (r8 == 0) goto L51
                    java.lang.Object r8 = r7.next()
                    r4 = r8
                    ur.a r4 = (ur.a) r4
                    int r4 = r4.c()
                    r5 = 12
                    if (r4 != r5) goto L3a
                    goto L52
                L51:
                    r8 = r2
                L52:
                    ur.a r8 = (ur.a) r8
                    if (r8 == 0) goto L64
                    com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel r7 = r6.f51958b
                    long r4 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel.j0(r7)
                    boolean r7 = r8.e(r4)
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                L64:
                    r0.f51960b = r3
                    kotlinx.coroutines.flow.FlowCollector r7 = r6.f51957a
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6f
                    return r1
                L6f:
                    nm0.y r7 = nm0.y.f85009a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel.d.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public d(Flow flow, FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel) {
            this.f51955a = flow;
            this.f51956b = firstEcgVideoInstructionViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f51955a.collect(new a(flowCollector, this.f51956b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    public FirstEcgVideoInstructionViewModel(Context context, e deviceManager, vr.d featureTagsRepository, long j5, long j11) {
        u.j(deviceManager, "deviceManager");
        u.j(featureTagsRepository, "featureTagsRepository");
        this.f51941a = deviceManager;
        this.f51942b = j5;
        this.f51943c = j11;
        this.f51944d = FlowKt.flow(new b(null));
        this.f51945e = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f51946f = new WeakReference<>(context);
        this.f51947g = FlowKt.shareIn(new d(featureTagsRepository.get(j11), this), h1.a(this), SharingStarted.Companion.getEagerly(), 1);
        EcgMeasurementEndBroadcastReceiver ecgMeasurementEndBroadcastReceiver = new EcgMeasurementEndBroadcastReceiver(new c());
        this.f51948h = ecgMeasurementEndBroadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_ECG_MEASUREMENT_FINISHED");
        androidx.core.content.a.registerReceiver(context, ecgMeasurementEndBroadcastReceiver, intentFilter, 4);
    }

    public final MutableSharedFlow<a> k0() {
        return this.f51945e;
    }

    public final Flow<Boolean> m0() {
        return this.f51944d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        super.onCleared();
        Context context = this.f51946f.get();
        if (context != null) {
            ay.b.w(context, this.f51948h);
        }
    }
}
