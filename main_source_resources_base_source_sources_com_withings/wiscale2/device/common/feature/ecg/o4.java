package com.withings.wiscale2.device.common.feature.ecg;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.LiveData;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.withings.device.Device;
import com.withings.ecg.review.EcgReviewStatusValue;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import com.withings.ecg.webservices.WsStateCode;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.q;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class o4 extends androidx.lifecycle.b {
    private final ParcelableSnapshotMutableState A;
    private final MutableSharedFlow<List<WsStateCode>> B;
    private final StateFlow<List<WsStateCode>> F;
    private final androidx.lifecycle.f G;
    private final ParcelableSnapshotMutableState M;
    private final ParcelableSnapshotMutableState P;
    private ParcelableSnapshotMutableState Q;
    private final ParcelableSnapshotMutableState R;
    private ParcelableSnapshotMutableState S;
    private ParcelableSnapshotMutableState T;
    private ParcelableSnapshotMutableState W;
    private final androidx.lifecycle.f X;

    /* renamed from: a  reason: collision with root package name */
    private final Device f51554a;

    /* renamed from: b  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.d f51555b;

    /* renamed from: c  reason: collision with root package name */
    private final Locale f51556c;

    /* renamed from: d  reason: collision with root package name */
    private final Application f51557d;

    /* renamed from: e  reason: collision with root package name */
    private final PlatformFeatureRepository f51558e;

    /* renamed from: f  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.u f51559f;

    /* renamed from: g  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.c f51560g;

    /* renamed from: h  reason: collision with root package name */
    private final rq.f f51561h;

    /* renamed from: i  reason: collision with root package name */
    private final r70.c f51562i;

    /* renamed from: j  reason: collision with root package name */
    private final EcgReviewRemoteRepository f51563j;

    /* renamed from: k  reason: collision with root package name */
    private final DeviceFeaturesLiveData f51564k;

    /* renamed from: l  reason: collision with root package name */
    public r8.n f51565l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f51566m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f51567n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.j0 f51568o;

    /* renamed from: p  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.o f51569p;

    /* renamed from: q  reason: collision with root package name */
    private final xw.n<Intent> f51570q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableStateFlow<Long> f51571r;

    /* renamed from: s  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51572s;

    /* renamed from: t  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51573t;

    /* renamed from: u  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51574u;

    /* renamed from: v  reason: collision with root package name */
    private final xw.n<nm0.y> f51575v;

    /* renamed from: w  reason: collision with root package name */
    private xw.n<Boolean> f51576w;

    /* renamed from: x  reason: collision with root package name */
    private final xw.n<String> f51577x;

    /* renamed from: y  reason: collision with root package name */
    private final i5 f51578y;

    /* renamed from: z  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f51579z;

    /* compiled from: EcgActivationViewModel.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51580a;

        static {
            int[] iArr = new int[EcgReviewStatusValue.values().length];
            try {
                EcgReviewStatusValue ecgReviewStatusValue = EcgReviewStatusValue.f38854a;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue2 = EcgReviewStatusValue.f38854a;
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue3 = EcgReviewStatusValue.f38854a;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue4 = EcgReviewStatusValue.f38854a;
                iArr[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue5 = EcgReviewStatusValue.f38854a;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue6 = EcgReviewStatusValue.f38854a;
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue7 = EcgReviewStatusValue.f38854a;
                iArr[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue8 = EcgReviewStatusValue.f38854a;
                iArr[2] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f51580a = iArr;
        }
    }

    /* compiled from: EcgActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<PlatformFeature>, User>, LiveData<h5>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<h5> invoke(nm0.j<List<PlatformFeature>, User> jVar) {
            nm0.j<List<PlatformFeature>, User> jVar2 = jVar;
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new q4(jVar2.a(), o4.this, jVar2.b(), null), 2);
        }
    }

    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$flowSpecificity$1", f = "EcgActivationViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<String>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51582a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51583b;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f51583b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<String> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51582a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                o4 o4Var = o4.this;
                String j5 = androidx.health.connect.client.units.d.j(o4Var.f51558e, o4Var.f51554a.getId());
                this.f51582a = 1;
                if (((androidx.lifecycle.h0) this.f51583b).emit(j5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendPhoneNumber$1$1", f = "EcgActivationViewModel.kt", l = {593}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51585a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51586b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Long f51588d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f51589e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EcgActivationViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendPhoneNumber$1$1$2$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o4 f51590a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o4 o4Var, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f51590a = o4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f51590a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                androidx.navigation.e.L(this.f51590a.s1(), "SmsCodeInput", null, 6);
                return nm0.y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EcgActivationViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendPhoneNumber$1$1$3$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o4 f51591a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Throwable f51592b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o4 o4Var, Throwable th2, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f51591a = o4Var;
                this.f51592b = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new b(this.f51591a, this.f51592b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                g5 g5Var;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                o4 o4Var = this.f51591a;
                ParcelableSnapshotMutableState A1 = o4Var.A1();
                g5 g5Var2 = (g5) o4Var.A1().getValue();
                if (g5Var2 != null) {
                    g5Var = g5.a(g5Var2, false);
                } else {
                    g5Var = null;
                }
                A1.setValue(g5Var);
                if (!(this.f51592b instanceof UnauthorizedException)) {
                    o4Var.b2(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
                } else {
                    o4Var.z1().setValue(new Integer((int) C1987R.string._ERROR_));
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Long l5, String str, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f51588d = l5;
            this.f51589e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(this.f51588d, this.f51589e, dVar);
            dVar2.f51586b = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r12.f51585a
                com.withings.wiscale2.device.common.feature.ecg.o4 r2 = com.withings.wiscale2.device.common.feature.ecg.o4.this
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 != r3) goto L15
                java.lang.Object r0 = r12.f51586b
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                nm0.l.b(r13)     // Catch: java.lang.Throwable -> L13
                goto L48
            L13:
                r13 = move-exception
                goto L4f
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                nm0.l.b(r13)
                java.lang.Object r13 = r12.f51586b
                kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
                java.lang.Long r1 = r12.f51588d
                java.lang.String r9 = r12.f51589e
                com.withings.ecg.webservices.EcgReviewRemoteRepository r4 = com.withings.wiscale2.device.common.feature.ecg.o4.m0(r2)     // Catch: java.lang.Throwable -> L4b
                kotlin.jvm.internal.u.g(r1)     // Catch: java.lang.Throwable -> L4b
                long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L4b
                com.withings.device.Device r1 = com.withings.wiscale2.device.common.feature.ecg.o4.j0(r2)     // Catch: java.lang.Throwable -> L4b
                long r7 = r1.getId()     // Catch: java.lang.Throwable -> L4b
                r12.f51586b = r13     // Catch: java.lang.Throwable -> L4b
                r12.f51585a = r3     // Catch: java.lang.Throwable -> L4b
                r10 = r12
                java.lang.Object r1 = r4.sendCode(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L4b
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r13
            L48:
                nm0.y r13 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L13
                goto L53
            L4b:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
            L4f:
                nm0.k$a r13 = nm0.l.a(r13)
            L53:
                boolean r1 = r13 instanceof nm0.k.a
                r1 = r1 ^ r3
                r3 = 0
                if (r1 == 0) goto L6c
                r1 = r13
                nm0.y r1 = (nm0.y) r1
                kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
                com.withings.wiscale2.device.common.feature.ecg.o4$d$a r7 = new com.withings.wiscale2.device.common.feature.ecg.o4$d$a
                r7.<init>(r2, r3)
                r9 = 0
                r6 = 0
                r8 = 2
                r4 = r0
                kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            L6c:
                java.lang.Throwable r13 = nm0.k.b(r13)
                if (r13 == 0) goto L82
                kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
                com.withings.wiscale2.device.common.feature.ecg.o4$d$b r7 = new com.withings.wiscale2.device.common.feature.ecg.o4$d$b
                r7.<init>(r2, r13, r3)
                r9 = 0
                r6 = 0
                r8 = 2
                r4 = r0
                kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            L82:
                nm0.y r13 = nm0.y.f85009a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.o4.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$showSupportScreen$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51596d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EcgActivationViewModel.kt */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f51597a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final nm0.y invoke(androidx.navigation.b0 b0Var) {
                androidx.navigation.b0 navigate = b0Var;
                kotlin.jvm.internal.u.j(navigate, "$this$navigate");
                navigate.d("Loading", b5.f51214a);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, int i12, String str, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f51594b = i11;
            this.f51595c = i12;
            this.f51596d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f51594b, this.f51595c, this.f51596d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            r8.n s12 = o4.this.s1();
            String screenLog = this.f51596d;
            kotlin.jvm.internal.u.j(screenLog, "screenLog");
            s12.J("Support/" + this.f51594b + "/" + this.f51595c + "/" + screenLog, a.f51597a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f51598a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.navigation.b0 b0Var) {
            androidx.navigation.b0 navigate = b0Var;
            kotlin.jvm.internal.u.j(navigate, "$this$navigate");
            navigate.d("Loading", c5.f51251a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$stateItems$1", f = "EcgActivationViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends t5>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51599a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51600b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EcgActivationViewModel.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.h0<List<t5>> f51602a;

            a(androidx.lifecycle.h0<List<t5>> h0Var) {
                this.f51602a = h0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Object emit = this.f51602a.emit(kotlin.collections.x.m0(s5.f51731a, (List) obj), dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return nm0.y.f85009a;
                }
                return emit;
            }
        }

        g(qm0.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f51600b = obj;
            return gVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<? extends t5>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((g) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51599a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = o4.this.B;
                a aVar = new a((androidx.lifecycle.h0) this.f51600b);
                this.f51599a = 1;
                Object collect = mutableSharedFlow.collect(new d5(aVar), this);
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

    /* compiled from: EcgActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.p<String, h5, nm0.y> {
        h() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(String str, h5 h5Var) {
            String smsCodeValue = str;
            h5 ecgFeatureInfoValue = h5Var;
            kotlin.jvm.internal.u.j(smsCodeValue, "smsCodeValue");
            kotlin.jvm.internal.u.j(ecgFeatureInfoValue, "ecgFeatureInfoValue");
            o4.R0(o4.this, smsCodeValue, ecgFeatureInfoValue);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Device device, com.withings.wiscale2.device.common.feature.d dVar, String str, Locale locale, Application application, PlatformFeatureRepository platformFeatureRepository, com.withings.wiscale2.device.common.feature.u platformFeatureActivationFactory, com.withings.wiscale2.device.common.feature.c deviceScreenModifier, rq.f fVar, r70.c userRepository, EcgReviewRemoteRepository ecgReviewRemoteRepository, m70.i userManager) {
        super(application);
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        ParcelableSnapshotMutableState f13;
        i5 i5Var;
        ParcelableSnapshotMutableState f14;
        ParcelableSnapshotMutableState f15;
        ParcelableSnapshotMutableState f16;
        ParcelableSnapshotMutableState f17;
        ParcelableSnapshotMutableState f18;
        ParcelableSnapshotMutableState f19;
        ParcelableSnapshotMutableState f21;
        ParcelableSnapshotMutableState f22;
        ParcelableSnapshotMutableState f23;
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(locale, "locale");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(deviceScreenModifier, "deviceScreenModifier");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(ecgReviewRemoteRepository, "ecgReviewRemoteRepository");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f51554a = device;
        this.f51555b = dVar;
        this.f51556c = locale;
        this.f51557d = application;
        this.f51558e = platformFeatureRepository;
        this.f51559f = platformFeatureActivationFactory;
        this.f51560g = deviceScreenModifier;
        this.f51561h = fVar;
        this.f51562i = userRepository;
        this.f51563j = ecgReviewRemoteRepository.withSyncContext("view_ecg_activation");
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), kotlin.collections.x.W(4, 12), platformFeatureRepository, true);
        this.f51564k = deviceFeaturesLiveData;
        CoroutineScope a11 = androidx.lifecycle.h1.a(this);
        Long userId = device.getUserId();
        kotlin.jvm.internal.u.g(userId);
        this.f51568o = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(deviceFeaturesLiveData, new m70.h(a11, userManager, userId.longValue()))), new b());
        this.f51569p = new com.withings.wiscale2.device.common.feature.o(dVar, androidx.lifecycle.h1.a(this), str);
        this.f51570q = new xw.n<>();
        this.f51571r = StateFlowKt.MutableStateFlow(-1L);
        f11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51572s = f11;
        f12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51573t = f12;
        f13 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51574u = f13;
        this.f51575v = new xw.n<>();
        this.f51576w = new xw.n<>();
        this.f51577x = new xw.n<>();
        if (device.getTrackerWearPosition() == 0) {
            i5Var = new i5(C1987R.string.hwa09_ecgExplanationTutorial_video_URL_right, 2131231316);
        } else {
            i5Var = new i5(C1987R.string.hwa09_ecgExplanationTutorial_video_URL_left, 2131231315);
        }
        this.f51578y = i5Var;
        f14 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f51579z = f14;
        f15 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.A = f15;
        MutableSharedFlow<List<WsStateCode>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.B = MutableSharedFlow$default;
        this.F = FlowKt.stateIn(MutableSharedFlow$default, androidx.lifecycle.h1.a(this), SharingStarted.Companion.getEagerly(), kotlin.collections.i0.f76187a);
        this.G = androidx.lifecycle.h.a(Dispatchers.getIO(), new g(null), 2);
        Boolean bool = Boolean.FALSE;
        f16 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.M = f16;
        f17 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.P = f17;
        f18 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.Q = f18;
        f19 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.R = f19;
        f21 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.S = f21;
        f22 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.T = f22;
        f23 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.W = f23;
        this.X = androidx.lifecycle.h.a(Dispatchers.getIO(), new c(null), 2);
    }

    public static final void A0(o4 o4Var) {
        Object b22;
        rq.b bVar = (rq.b) o4Var.f51579z.getValue();
        if (bVar != null) {
            switch (bVar.d().ordinal()) {
                case 1:
                    b22 = o4Var.b2(C1987R.string.hwa09_usOnboarding_error_age_title, C1987R.string.hwa09_usOnboarding_error_age_paragrapph, "error_age");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    o4Var.d2();
                    b22 = nm0.y.f85009a;
                    break;
                default:
                    o4Var.d2();
                    b22 = nm0.y.f85009a;
                    break;
            }
            if (b22 != null) {
                return;
            }
        }
        o4Var.d2();
        nm0.y yVar = nm0.y.f85009a;
    }

    public static final void K0(o4 o4Var) {
        String str;
        g5 g5Var;
        Job launch$default;
        String c11;
        t5 t5Var = (t5) o4Var.f51573t.getValue();
        if (t5Var instanceof r5) {
            r5 r5Var = (r5) t5Var;
            String iso2 = r5Var.a().getIso2();
            Locale locale = Locale.ROOT;
            String lowerCase = iso2.toLowerCase(locale);
            kotlin.jvm.internal.u.i(lowerCase, "toLowerCase(...)");
            rq.b bVar = (rq.b) o4Var.f51579z.getValue();
            if (bVar != null && (c11 = bVar.c()) != null) {
                str = c11.toLowerCase(locale);
                kotlin.jvm.internal.u.i(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.u.e(lowerCase, str)) {
                o4Var.Q1();
                return;
            }
            String iso22 = r5Var.a().getIso2();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = o4Var.f51572s;
            g5 g5Var2 = (g5) parcelableSnapshotMutableState.getValue();
            if (g5Var2 != null) {
                g5Var = g5.a(g5Var2, true);
            } else {
                g5Var = null;
            }
            parcelableSnapshotMutableState.setValue(g5Var);
            Long userId = o4Var.f51554a.getUserId();
            if (userId != null) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(o4Var), Dispatchers.getIO(), null, new a5(o4Var, userId, iso22, null), 2, null);
                if (launch$default != null) {
                    return;
                }
            }
            c2(o4Var, 0, 0, 7);
        } else if (t5Var instanceof s5) {
            o4Var.b2(C1987R.string.hwa09_usOnboarding_error_usa_title, C1987R.string.hwa09_usOnboarding_error_usa_paragraph, "error_state");
        } else {
            c2(o4Var, 0, 0, 7);
        }
    }

    public static final void M0(o4 o4Var, h5 h5Var) {
        EcgReviewStatusValue ecgReviewStatusValue;
        int i11;
        rq.b bVar = (rq.b) o4Var.f51579z.getValue();
        if (bVar != null) {
            ecgReviewStatusValue = bVar.d();
        } else {
            ecgReviewStatusValue = null;
        }
        if (ecgReviewStatusValue == null) {
            i11 = -1;
        } else {
            i11 = a.f51580a[ecgReviewStatusValue.ordinal()];
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                o4Var.f51577x.setValue("https://support.withings.com/hc/en-us/articles/4407741101457");
                return;
            } else {
                o4Var.d2();
                return;
            }
        }
        o4Var.R1(h5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        Boolean bool = Boolean.FALSE;
        this.M.setValue(bool);
        this.P.setValue(bool);
        androidx.navigation.e.L(s1(), "AcceptationTerms", null, 6);
    }

    public static final void R0(o4 o4Var, String str, h5 h5Var) {
        Job launch$default;
        Long userId = o4Var.f51554a.getUserId();
        if (userId != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(o4Var), Dispatchers.getIO(), null, new z4(o4Var, userId, str, h5Var, null), 2, null);
            if (launch$default != null) {
                return;
            }
        }
        c2(o4Var, 0, 0, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(h5 h5Var) {
        if (h5Var != null && h5Var.a() && !h5Var.c()) {
            androidx.navigation.e.L(s1(), "IntroForUs", null, 6);
        } else {
            T1();
        }
    }

    public static final void T0(o4 o4Var) {
        String str;
        r5 r5Var;
        WsStateCode a11;
        if (o4Var.Y0()) {
            T value = o4Var.f51573t.getValue();
            if (value instanceof r5) {
                r5Var = (r5) value;
            } else {
                r5Var = null;
            }
            if (r5Var != null && (a11 = r5Var.a()) != null && a11.isPhoneRequired()) {
                str = "HeartbeatExplanations";
            } else {
                str = "ReviewExplanations";
            }
        } else {
            str = "Done";
        }
        androidx.navigation.e.L(o4Var.s1(), str, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1() {
        if (this.f51567n) {
            androidx.navigation.e.L(s1(), "Instructions", null, 6);
        } else {
            this.f51576w.setValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Y0() {
        Long userId;
        List<? extends PlatformFeature> value = this.f51564k.getValue();
        PlatformFeature platformFeature = null;
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((PlatformFeature) next).getFeatureId() == 12) {
                    platformFeature = next;
                    break;
                }
            }
            platformFeature = platformFeature;
        }
        if (platformFeature == null) {
            return false;
        }
        Device device = this.f51554a;
        if (!PlatformFeatureKt.isActivatedForDevice(platformFeature, device.getId()) || (userId = device.getUserId()) == null || !PlatformFeatureKt.isActivatedForUser(platformFeature, userId.longValue())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String str) {
        Job launch$default;
        Long userId = this.f51554a.getUserId();
        if (userId != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new d(userId, str, null), 2, null);
            if (launch$default != null) {
                return;
            }
        }
        c2(this, 0, 0, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job b2(int i11, int i12, String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getMain(), null, new e(i11, i12, str, null), 2, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c2(o4 o4Var, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = C1987R.string._ERROR_;
        }
        if ((i13 & 2) != 0) {
            i12 = C1987R.string.helpCenter_contactCustomerSupport;
        }
        o4Var.b2(i11, i12, "error_connection");
    }

    private final void d2() {
        s1().J("Intro", f.f51598a);
    }

    public static final void f0(o4 o4Var) {
        List<? extends PlatformFeature> value = o4Var.f51564k.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(o4Var), Dispatchers.getIO(), null, new p4(o4Var, value, null), 2, null);
        }
    }

    public final ParcelableSnapshotMutableState A1() {
        return this.f51572s;
    }

    public final xw.n<Boolean> C1() {
        return this.f51576w;
    }

    public final ParcelableSnapshotMutableState F1() {
        return this.f51574u;
    }

    public final ParcelableSnapshotMutableState G1() {
        return this.f51573t;
    }

    public final ParcelableSnapshotMutableState K1() {
        return this.T;
    }

    public final ParcelableSnapshotMutableState L1() {
        return this.W;
    }

    public final androidx.lifecycle.f P1() {
        return this.G;
    }

    public final void U1() {
        this.f51567n = true;
        T1();
    }

    public final void V0() {
        rq.a b10;
        String a11;
        rq.b bVar = (rq.b) this.f51579z.getValue();
        if (bVar != null && (b10 = bVar.b()) != null && (a11 = b10.a()) != null) {
            Y1(a11);
        }
    }

    public final void V1(h5 ecgFeatureInfo) {
        String str;
        kotlin.jvm.internal.u.j(ecgFeatureInfo, "ecgFeatureInfo");
        androidx.navigation.t y11 = s1().y();
        if (y11 != null) {
            str = y11.v();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.u.e(str, "ActivationDocumentEu")) {
            R1(ecgFeatureInfo);
        } else if (kotlin.jvm.internal.u.e(str, "Loading")) {
            W0(ecgFeatureInfo);
        }
    }

    public final void W0(h5 ecgFeatureInfo) {
        kotlin.jvm.internal.u.j(ecgFeatureInfo, "ecgFeatureInfo");
        androidx.compose.foundation.lazy.layout.d.j(true);
        if (ecgFeatureInfo.a()) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new s4(this, null), 2, null);
        } else {
            d2();
        }
    }

    public final void X0(boolean z5) {
        this.R.setValue(Boolean.valueOf(z5));
        j2();
    }

    public final String Z0(String str) {
        PhoneNumberUtil i11 = PhoneNumberUtil.i();
        String d11 = i11.d(i11.z(str, this.f51556c.getCountry()), PhoneNumberUtil.PhoneNumberFormat.f27150c);
        kotlin.jvm.internal.u.i(d11, "format(...)");
        return d11;
    }

    public final void Z1(boolean z5) {
        this.f51566m = z5;
    }

    public final String a1() {
        String v11;
        androidx.navigation.t y11 = s1().y();
        if (y11 != null && (v11 = y11.v()) != null) {
            return dp0.j.a0(v11, "?");
        }
        return null;
    }

    public final void a2(String number) {
        kotlin.jvm.internal.u.j(number, "number");
        this.Q.setValue(number);
    }

    public final ParcelableSnapshotMutableState c1() {
        return this.P;
    }

    public final com.withings.wiscale2.device.common.feature.o d1() {
        return this.f51569p;
    }

    public final xw.n<Intent> e1() {
        return this.f51570q;
    }

    public final void e2() {
        String y12;
        if (((Boolean) this.R.getValue()).booleanValue() && (y12 = y1()) != null) {
            Y1(y12);
        }
    }

    public final void f2() {
        if (((nm0.y) cr.a.a(new nm0.j(this.T.getValue(), this.f51568o.getValue()), new h())) == null) {
            this.W.setValue(Integer.valueOf((int) C1987R.string.hwa09_usOnboarding_error_confirmationCode_message));
        }
    }

    public final androidx.lifecycle.j0 g1() {
        return this.f51568o;
    }

    public final ParcelableSnapshotMutableState i1() {
        return this.f51579z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j2() {
        EcgReviewStatusValue ecgReviewStatusValue;
        int i11;
        r5 r5Var;
        WsStateCode a11;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f51572s;
        Object obj = null;
        parcelableSnapshotMutableState.setValue(null);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f51574u;
        parcelableSnapshotMutableState2.setValue(null);
        String a12 = a1();
        if (a12 != null) {
            int hashCode = a12.hashCode();
            boolean z5 = false;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.f51573t;
            boolean z11 = true;
            switch (hashCode) {
                case -1751746413:
                    if (!a12.equals("VideoCallIntro")) {
                        return;
                    }
                    break;
                case -1479427822:
                    if (a12.equals("ReviewExplanations")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string._DONE_, 14, false));
                        return;
                    }
                    return;
                case -1067437477:
                    if (!a12.equals("IntroForUs")) {
                        return;
                    }
                    break;
                case -737996636:
                    if (a12.equals("SmsCodeInput")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string._NEXT_, 14, false));
                        parcelableSnapshotMutableState2.setValue(new g5(C1987R.string.login_2FA_code_sendAgain, 14, false));
                        return;
                    }
                    return;
                case -680498753:
                    if (a12.equals("EcgReviewStatusScreen")) {
                        parcelableSnapshotMutableState2.setValue(new g5(C1987R.string.go_to_support, 14, false));
                        rq.b bVar = (rq.b) this.f51579z.getValue();
                        if (bVar != null) {
                            ecgReviewStatusValue = bVar.d();
                        } else {
                            ecgReviewStatusValue = null;
                        }
                        if (ecgReviewStatusValue == null) {
                            i11 = -1;
                        } else {
                            i11 = a.f51580a[ecgReviewStatusValue.ordinal()];
                        }
                        switch (i11) {
                            case -1:
                            case 5:
                            case 6:
                                parcelableSnapshotMutableState.setValue(new g5(C1987R.string.go_to_support, 14, false));
                                parcelableSnapshotMutableState2.setValue(null);
                                return;
                            case 0:
                            default:
                                return;
                            case 1:
                            case 3:
                            case 4:
                                parcelableSnapshotMutableState.setValue(new g5(C1987R.string.hwa09_usOnboarding_ecgTutorialButton, 14, false));
                                return;
                            case 2:
                                parcelableSnapshotMutableState.setValue(new g5(C1987R.string.hwa09_usOnboarding_newECGButton, 14, false));
                                return;
                        }
                    }
                    return;
                case 2135970:
                    if (a12.equals("Done")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string.understood, 14, false));
                        parcelableSnapshotMutableState2.setValue(new g5(C1987R.string._LEARN_MORE_, 14, false));
                        return;
                    }
                    return;
                case 24235987:
                    if (a12.equals("PhoneNumberInput")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string._NEXT_, 12, ((Boolean) this.R.getValue()).booleanValue()));
                        parcelableSnapshotMutableState2.setValue(new g5(C1987R.string.i_need_help, 14, false));
                        return;
                    }
                    return;
                case 80208581:
                    if (a12.equals("Step1")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string._START_, 14, false));
                        return;
                    }
                    return;
                case 80208582:
                    if (!a12.equals("Step2")) {
                        return;
                    }
                    break;
                case 80208583:
                    if (!a12.equals("Step3")) {
                        return;
                    }
                    break;
                case 576465947:
                    if (a12.equals("StateSelection")) {
                        if (parcelableSnapshotMutableState3.getValue() == null) {
                            z11 = false;
                        }
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string._CONFIRM_YES_, 12, z11));
                        parcelableSnapshotMutableState2.setValue(new g5(C1987R.string.hwa09_usOnboarding_learnUSRegulations, 14, false));
                        return;
                    }
                    return;
                case 921696709:
                    if (!a12.equals("Instructions")) {
                        return;
                    }
                    break;
                case 1223208193:
                    if (a12.equals("ActivationDocumentEu")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string.accept__activate, 12, this.f51569p.getValue() instanceof q.a));
                        return;
                    }
                    return;
                case 1228767006:
                    if (a12.equals("Support/{title}/{description}/{screenLog}")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string.go_to_support, 14, false));
                        parcelableSnapshotMutableState2.setValue(new g5(C1987R.string._EXIT_, 14, false));
                        return;
                    }
                    return;
                case 1480392378:
                    if (a12.equals("AcceptationTerms")) {
                        if (((Boolean) this.M.getValue()).booleanValue()) {
                            Object value = this.P.getValue();
                            ((Boolean) value).getClass();
                            Object value2 = parcelableSnapshotMutableState3.getValue();
                            if (value2 instanceof r5) {
                                r5Var = (r5) value2;
                            } else {
                                r5Var = null;
                            }
                            if (r5Var != null && (a11 = r5Var.a()) != null && a11.isPhoneRequired()) {
                                obj = value;
                            }
                            Boolean bool = (Boolean) obj;
                            if (bool == null || bool.booleanValue()) {
                                z5 = true;
                            }
                        }
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string.accept_and_continue, 12, z5));
                        return;
                    }
                    return;
                case 1973186678:
                    if (a12.equals("HeartbeatExplanations")) {
                        parcelableSnapshotMutableState.setValue(new g5(C1987R.string._NEXT_, 14, false));
                        return;
                    }
                    return;
                default:
                    return;
            }
            parcelableSnapshotMutableState.setValue(new g5(C1987R.string._NEXT_, 14, false));
        }
    }

    public final ParcelableSnapshotMutableState k1() {
        return this.A;
    }

    public final androidx.lifecycle.f l1() {
        return this.X;
    }

    public final boolean m1() {
        return this.f51566m;
    }

    public final xw.n<nm0.y> n1() {
        return this.f51575v;
    }

    public final i5 o1() {
        return this.f51578y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        androidx.compose.foundation.lazy.layout.d.j(false);
        super.onCleared();
    }

    public final Locale q1() {
        return this.f51556c;
    }

    public final ParcelableSnapshotMutableState r1() {
        return this.M;
    }

    public final r8.n s1() {
        r8.n nVar = this.f51565l;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }

    public final MutableStateFlow<Long> t1() {
        return this.f51571r;
    }

    public final xw.n<String> v1() {
        return this.f51577x;
    }

    public final ParcelableSnapshotMutableState w1() {
        return this.Q;
    }

    public final String y1() {
        String str = (String) this.Q.getValue();
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
            String valueOf = String.valueOf(PhoneNumberUtil.i().g(this.f51556c.getCountry()));
            if (dp0.j.R(sb3, valueOf, false)) {
                valueOf = "";
            }
            return androidx.fragment.app.o.d("+", valueOf, sb3);
        }
        return null;
    }

    public final ParcelableSnapshotMutableState z1() {
        return this.S;
    }
}
