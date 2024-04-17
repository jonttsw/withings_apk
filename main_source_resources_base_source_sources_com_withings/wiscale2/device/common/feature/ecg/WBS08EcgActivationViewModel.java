package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.LiveData;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.device.Device;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import com.withings.ecg.webservices.WsStateCode;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import com.withings.wiscale2.C1987R;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: WBS08EcgActivationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/WBS08EcgActivationViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WBS08EcgActivationViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final PlatformFeatureRepository f51112a;

    /* renamed from: b  reason: collision with root package name */
    private final zb0.c f51113b;

    /* renamed from: c  reason: collision with root package name */
    private final r70.c f51114c;

    /* renamed from: d  reason: collision with root package name */
    private final rq.f f51115d;

    /* renamed from: e  reason: collision with root package name */
    private final Locale f51116e;

    /* renamed from: f  reason: collision with root package name */
    private final Device f51117f;

    /* renamed from: g  reason: collision with root package name */
    private final long f51118g;

    /* renamed from: h  reason: collision with root package name */
    private final EcgReviewRemoteRepository f51119h;

    /* renamed from: i  reason: collision with root package name */
    public r8.n f51120i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.j0 f51121j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<Long> f51122k;

    /* renamed from: l  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51123l;

    /* renamed from: m  reason: collision with root package name */
    private final xw.n<String> f51124m;

    /* renamed from: n  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51125n;

    /* renamed from: o  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51126o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableSharedFlow<List<WsStateCode>> f51127p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.f f51128q;

    /* renamed from: r  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51129r;

    /* renamed from: s  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51130s;

    /* renamed from: t  reason: collision with root package name */
    private ParcelableSnapshotMutableState f51131t;

    /* renamed from: u  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51132u;

    /* renamed from: v  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51133v;

    /* renamed from: w  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51134w;

    /* renamed from: x  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51135x;

    /* renamed from: y  reason: collision with root package name */
    private final androidx.lifecycle.f f51136y;

    /* renamed from: z  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51137z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$activateEcgFeature$1", f = "WBS08EcgActivationViewModel.kt", l = {ConstantsWs.WS_STATUS_BAD_OBJECT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51138a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51138a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                WBS08EcgActivationViewModel wBS08EcgActivationViewModel = WBS08EcgActivationViewModel.this;
                zb0.c cVar = wBS08EcgActivationViewModel.f51113b;
                long id2 = wBS08EcgActivationViewModel.B0().getId();
                long g12 = wBS08EcgActivationViewModel.g1();
                this.f51138a = 1;
                if (cVar.a(id2, g12, 4, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<PlatformFeature>, User>, LiveData<h5>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<h5> invoke(nm0.j<List<PlatformFeature>, User> jVar) {
            nm0.j<List<PlatformFeature>, User> jVar2 = jVar;
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new nb(jVar2.b(), jVar2.a(), WBS08EcgActivationViewModel.this, null), 2);
        }
    }

    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$flowSpecificity$1", f = "WBS08EcgActivationViewModel.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<String>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51141a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51142b;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f51142b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<String> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51141a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                WBS08EcgActivationViewModel wBS08EcgActivationViewModel = WBS08EcgActivationViewModel.this;
                String j5 = androidx.health.connect.client.units.d.j(wBS08EcgActivationViewModel.f51112a, wBS08EcgActivationViewModel.B0().getId());
                this.f51141a = 1;
                if (((androidx.lifecycle.h0) this.f51142b).emit(j5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendPhoneNumber$1", f = "WBS08EcgActivationViewModel.kt", l = {ConstantsWs.WS_STATUS_NOSHARINGS}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51144a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51145b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51147d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WBS08EcgActivationViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendPhoneNumber$1$2$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WBS08EcgActivationViewModel f51148a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f51148a = wBS08EcgActivationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f51148a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                WBS08EcgActivationViewModel wBS08EcgActivationViewModel = this.f51148a;
                androidx.navigation.e.L(wBS08EcgActivationViewModel.T0(), "SmsCodeInput", null, 6);
                wBS08EcgActivationViewModel.Z0().setValue(Boolean.FALSE);
                return nm0.y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WBS08EcgActivationViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendPhoneNumber$1$3$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WBS08EcgActivationViewModel f51149a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Throwable f51150b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, Throwable th2, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f51149a = wBS08EcgActivationViewModel;
                this.f51150b = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new b(this.f51149a, this.f51150b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                WBS08EcgActivationViewModel wBS08EcgActivationViewModel = this.f51149a;
                wBS08EcgActivationViewModel.Z0().setValue(Boolean.FALSE);
                if (!(this.f51150b instanceof UnauthorizedException)) {
                    wBS08EcgActivationViewModel.o1(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
                } else {
                    wBS08EcgActivationViewModel.Y0().setValue(new Integer((int) C1987R.string._ERROR_));
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f51147d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(this.f51147d, dVar);
            dVar2.f51145b = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r12.f51144a
                com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel r2 = com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel.this
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 != r3) goto L15
                java.lang.Object r0 = r12.f51145b
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                nm0.l.b(r13)     // Catch: java.lang.Throwable -> L13
                goto L43
            L13:
                r13 = move-exception
                goto L4a
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                nm0.l.b(r13)
                java.lang.Object r13 = r12.f51145b
                kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
                java.lang.String r9 = r12.f51147d
                com.withings.ecg.webservices.EcgReviewRemoteRepository r4 = com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel.f0(r2)     // Catch: java.lang.Throwable -> L46
                long r5 = r2.g1()     // Catch: java.lang.Throwable -> L46
                com.withings.device.Device r1 = r2.B0()     // Catch: java.lang.Throwable -> L46
                long r7 = r1.getId()     // Catch: java.lang.Throwable -> L46
                r12.f51145b = r13     // Catch: java.lang.Throwable -> L46
                r12.f51144a = r3     // Catch: java.lang.Throwable -> L46
                r10 = r12
                java.lang.Object r1 = r4.sendCode(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L46
                if (r1 != r0) goto L42
                return r0
            L42:
                r0 = r13
            L43:
                nm0.y r13 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L13
                goto L4e
            L46:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
            L4a:
                nm0.k$a r13 = nm0.l.a(r13)
            L4e:
                boolean r1 = r13 instanceof nm0.k.a
                r1 = r1 ^ r3
                r3 = 0
                if (r1 == 0) goto L67
                r1 = r13
                nm0.y r1 = (nm0.y) r1
                kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
                com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$d$a r7 = new com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$d$a
                r7.<init>(r2, r3)
                r9 = 0
                r6 = 0
                r8 = 2
                r4 = r0
                kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            L67:
                java.lang.Throwable r13 = nm0.k.b(r13)
                if (r13 == 0) goto L7d
                kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
                com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$d$b r7 = new com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$d$b
                r7.<init>(r2, r13, r3)
                r9 = 0
                r6 = 0
                r8 = 2
                r4 = r0
                kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            L7d:
                nm0.y r13 = nm0.y.f85009a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$showSupportScreen$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51152b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51154d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WBS08EcgActivationViewModel.kt */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f51155a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final nm0.y invoke(androidx.navigation.b0 b0Var) {
                androidx.navigation.b0 navigate = b0Var;
                kotlin.jvm.internal.u.j(navigate, "$this$navigate");
                navigate.d("Loading", rb.f51709a);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, int i12, String str, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f51152b = i11;
            this.f51153c = i12;
            this.f51154d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f51152b, this.f51153c, this.f51154d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            r8.n T0 = WBS08EcgActivationViewModel.this.T0();
            String screenLog = this.f51154d;
            kotlin.jvm.internal.u.j(screenLog, "screenLog");
            T0.J("Support/" + this.f51152b + "/" + this.f51153c + "/" + screenLog, a.f51155a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$stateItems$1", f = "WBS08EcgActivationViewModel.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends t5>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51156a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51157b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WBS08EcgActivationViewModel.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.h0<List<t5>> f51159a;

            a(androidx.lifecycle.h0<List<t5>> h0Var) {
                this.f51159a = h0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Object emit = this.f51159a.emit(kotlin.collections.x.m0(s5.f51731a, (List) obj), dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return nm0.y.f85009a;
                }
                return emit;
            }
        }

        f(qm0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f51157b = obj;
            return fVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<? extends t5>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((f) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51156a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = WBS08EcgActivationViewModel.this.f51127p;
                a aVar = new a((androidx.lifecycle.h0) this.f51157b);
                this.f51156a = 1;
                Object collect = mutableSharedFlow.collect(new ub(aVar), this);
                if (collect != CoroutineSingletons.f76214a) {
                    collect = nm0.y.f85009a;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    @Inject
    public WBS08EcgActivationViewModel(PlatformFeatureRepository platformFeatureRepository, zb0.c cVar, r70.c userRepository, rq.f fVar, EcgReviewRemoteRepository ecgReviewRemoteRepository, m70.i userManager, androidx.lifecycle.u0 savedStateHandle) {
        long q11;
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        ParcelableSnapshotMutableState f13;
        ParcelableSnapshotMutableState f14;
        ParcelableSnapshotMutableState f15;
        ParcelableSnapshotMutableState f16;
        ParcelableSnapshotMutableState f17;
        ParcelableSnapshotMutableState f18;
        ParcelableSnapshotMutableState f19;
        ParcelableSnapshotMutableState f21;
        ParcelableSnapshotMutableState f22;
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(ecgReviewRemoteRepository, "ecgReviewRemoteRepository");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f51112a = platformFeatureRepository;
        this.f51113b = cVar;
        this.f51114c = userRepository;
        this.f51115d = fVar;
        Locale US = Locale.US;
        kotlin.jvm.internal.u.i(US, "US");
        this.f51116e = US;
        Object c11 = savedStateHandle.c("device");
        kotlin.jvm.internal.u.g(c11);
        Device device = (Device) c11;
        this.f51117f = device;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            q11 = l5.longValue();
        } else {
            q11 = userManager.e().q();
        }
        this.f51118g = q11;
        this.f51119h = ecgReviewRemoteRepository.withSyncContext("view_wbs08_ecg_activation");
        this.f51121j = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(new DeviceFeaturesLiveData(device.getId(), kotlin.collections.x.W(4, 12), platformFeatureRepository, true), new m70.h(androidx.lifecycle.h1.a(this), userManager, q11))), new b());
        this.f51122k = StateFlowKt.MutableStateFlow(-1L);
        f11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51123l = f11;
        this.f51124m = new xw.n<>();
        f12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51125n = f12;
        f13 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51126o = f13;
        this.f51127p = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f51128q = androidx.lifecycle.h.a(Dispatchers.getIO(), new f(null), 2);
        Boolean bool = Boolean.FALSE;
        f14 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.f51129r = f14;
        f15 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.f51130s = f15;
        f16 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51131t = f16;
        f17 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.f51132u = f17;
        f18 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51133v = f18;
        f19 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51134w = f19;
        f21 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51135x = f21;
        this.f51136y = androidx.lifecycle.h.a(Dispatchers.getIO(), new c(null), 2);
        f22 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.f51137z = f22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1() {
        Boolean bool = Boolean.FALSE;
        this.f51129r.setValue(bool);
        this.f51130s.setValue(bool);
        androidx.navigation.e.L(T0(), "AcceptationTerms", null, 6);
    }

    private final void n1(String str) {
        this.f51137z.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new d(str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job o1(int i11, int i12, String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getMain(), null, new e(i11, i12, str, null), 2, null);
        return launch$default;
    }

    public static final void p0(WBS08EcgActivationViewModel wBS08EcgActivationViewModel) {
        Object o12;
        rq.b bVar = (rq.b) wBS08EcgActivationViewModel.f51125n.getValue();
        tb tbVar = tb.f51758a;
        if (bVar != null) {
            switch (bVar.d().ordinal()) {
                case 1:
                    o12 = wBS08EcgActivationViewModel.o1(C1987R.string.wbs08Rx_usOnboarding_error_age_title, C1987R.string.wbs08Rx_usOnboarding_error_age_description, "error_age");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    wBS08EcgActivationViewModel.T0().J("Intro", tbVar);
                    o12 = nm0.y.f85009a;
                    break;
                default:
                    wBS08EcgActivationViewModel.T0().J("Intro", tbVar);
                    o12 = nm0.y.f85009a;
                    break;
            }
            if (o12 != null) {
                return;
            }
        }
        wBS08EcgActivationViewModel.T0().J("Intro", tbVar);
        nm0.y yVar = nm0.y.f85009a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void q1(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = C1987R.string._ERROR_;
        }
        if ((i13 & 2) != 0) {
            i12 = C1987R.string.helpCenter_contactCustomerSupport;
        }
        wBS08EcgActivationViewModel.o1(i11, i12, "error_connection");
    }

    public final ParcelableSnapshotMutableState A0() {
        return this.f51130s;
    }

    public final Device B0() {
        return this.f51117f;
    }

    public final androidx.lifecycle.j0 F0() {
        return this.f51121j;
    }

    public final ParcelableSnapshotMutableState G0() {
        return this.f51125n;
    }

    public final ParcelableSnapshotMutableState K0() {
        return this.f51126o;
    }

    public final androidx.lifecycle.f M0() {
        return this.f51136y;
    }

    public final Locale O0() {
        return this.f51116e;
    }

    public final ParcelableSnapshotMutableState R0() {
        return this.f51129r;
    }

    public final r8.n T0() {
        r8.n nVar = this.f51120i;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }

    public final MutableStateFlow<Long> U0() {
        return this.f51122k;
    }

    public final xw.n<String> V0() {
        return this.f51124m;
    }

    public final ParcelableSnapshotMutableState W0() {
        return this.f51131t;
    }

    public final String X0() {
        String str = (String) this.f51131t.getValue();
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (!fk.y.e().contains(Character.valueOf(charAt))) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.u.i(sb3, "toString(...)");
            String valueOf = String.valueOf(PhoneNumberUtil.i().g(this.f51116e.getCountry()));
            if (dp0.j.R(sb3, valueOf, false)) {
                valueOf = "";
            }
            return androidx.fragment.app.o.d("+", valueOf, sb3);
        }
        return null;
    }

    public final ParcelableSnapshotMutableState Y0() {
        return this.f51133v;
    }

    public final ParcelableSnapshotMutableState Z0() {
        return this.f51137z;
    }

    public final ParcelableSnapshotMutableState a1() {
        return this.f51123l;
    }

    public final ParcelableSnapshotMutableState c1() {
        return this.f51134w;
    }

    public final ParcelableSnapshotMutableState d1() {
        return this.f51135x;
    }

    public final androidx.lifecycle.f e1() {
        return this.f51128q;
    }

    public final long g1() {
        return this.f51118g;
    }

    public final ParcelableSnapshotMutableState i1() {
        return this.f51132u;
    }

    public final void l1() {
        String str;
        String c11;
        t5 t5Var = (t5) this.f51123l.getValue();
        if (t5Var instanceof r5) {
            r5 r5Var = (r5) t5Var;
            String iso2 = r5Var.a().getIso2();
            Locale locale = Locale.ROOT;
            String lowerCase = iso2.toLowerCase(locale);
            kotlin.jvm.internal.u.i(lowerCase, "toLowerCase(...)");
            rq.b bVar = (rq.b) this.f51125n.getValue();
            if (bVar != null && (c11 = bVar.c()) != null) {
                str = c11.toLowerCase(locale);
                kotlin.jvm.internal.u.i(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.u.e(lowerCase, str)) {
                k1();
                return;
            }
            String iso22 = r5Var.a().getIso2();
            this.f51137z.setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new qb(this, iso22, null), 2, null);
        } else if (t5Var instanceof s5) {
            o1(C1987R.string.wbs08Rx_usOnboarding_error_usa_title, C1987R.string.wbs08Rx_usOnboarding_error_usa_description, "error_state");
        } else {
            q1(this, 0, 0, 7);
        }
    }

    public final void m1() {
        r5 r5Var;
        boolean z5;
        String s11;
        rq.a b10;
        WsStateCode a11;
        h5 h5Var = (h5) this.f51121j.getValue();
        T value = this.f51123l.getValue();
        if (value instanceof r5) {
            r5Var = (r5) value;
        } else {
            r5Var = null;
        }
        boolean z11 = false;
        if (r5Var != null && (a11 = r5Var.a()) != null && a11.isPhoneRequired()) {
            z5 = true;
        } else {
            z5 = false;
        }
        rq.b bVar = (rq.b) this.f51125n.getValue();
        if (bVar != null && (b10 = bVar.b()) != null && b10.b()) {
            z11 = true;
        }
        if (h5Var != null && ((s11 = h5Var.b().s()) == null || dp0.j.D(s11))) {
            this.f51122k.setValue(Long.valueOf(cn0.c.f23164a.i()));
        } else if (z5 && !z11) {
            androidx.navigation.e.L(T0(), "VideoCall", null, 6);
        } else {
            if (h5Var == null || !h5Var.c()) {
                t0();
            }
            androidx.navigation.e.L(T0(), "EcgMeasurement", null, 6);
        }
    }

    public final void r1() {
        this.f51134w.setValue(null);
        String X0 = X0();
        if (X0 != null) {
            n1(X0);
        } else {
            q1(this, 0, 0, 7);
        }
    }

    public final void s1() {
        String X0;
        if (((Boolean) this.f51132u.getValue()).booleanValue() && (X0 = X0()) != null) {
            n1(X0);
        }
    }

    public final void t0() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void t1() {
        String str = (String) this.f51134w.getValue();
        nm0.y yVar = null;
        if (str != null) {
            this.f51137z.setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new pb(this, str, null), 2, null);
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            this.f51135x.setValue(Integer.valueOf((int) C1987R.string.hwa09_usOnboarding_error_confirmationCode_message));
        }
    }

    public final void y0() {
        rq.a b10;
        String a11;
        rq.b bVar = (rq.b) this.f51125n.getValue();
        if (bVar != null && (b10 = bVar.b()) != null && (a11 = b10.a()) != null) {
            n1(a11);
        }
    }

    public final String z0(String str) {
        PhoneNumberUtil i11 = PhoneNumberUtil.i();
        String d11 = i11.d(i11.z(str, this.f51116e.getCountry()), PhoneNumberUtil.PhoneNumberFormat.f27150c);
        kotlin.jvm.internal.u.i(d11, "format(...)");
        return d11;
    }
}
