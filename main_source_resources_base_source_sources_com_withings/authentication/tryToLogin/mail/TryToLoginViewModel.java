package com.withings.authentication.tryToLogin.mail;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import cg.i;
import cg.j;
import cg.k;
import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import th.e;
import th.m;
import th.t;
import th.z;
import xw.n;
import ym0.p;
/* compiled from: TryToLoginViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/authentication/tryToLogin/mail/TryToLoginViewModel;", "Landroidx/lifecycle/g1;", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TryToLoginViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final vf.c f32382a;

    /* renamed from: b  reason: collision with root package name */
    private final AccountSessionRepository f32383b;

    /* renamed from: c  reason: collision with root package name */
    private final jg.c f32384c;

    /* renamed from: d  reason: collision with root package name */
    private final m f32385d;

    /* renamed from: e  reason: collision with root package name */
    private final z f32386e;

    /* renamed from: f  reason: collision with root package name */
    private final i f32387f;

    /* renamed from: g  reason: collision with root package name */
    private final t f32388g;

    /* renamed from: h  reason: collision with root package name */
    private final j f32389h;

    /* renamed from: i  reason: collision with root package name */
    private final th.e f32390i;

    /* renamed from: j  reason: collision with root package name */
    private final lg.a f32391j;

    /* renamed from: k  reason: collision with root package name */
    private final t00.d f32392k;

    /* renamed from: l  reason: collision with root package name */
    private final uf.a f32393l;

    /* renamed from: m  reason: collision with root package name */
    private final String f32394m;

    /* renamed from: n  reason: collision with root package name */
    private String f32395n;

    /* renamed from: o  reason: collision with root package name */
    private String f32396o;

    /* renamed from: p  reason: collision with root package name */
    private String f32397p;

    /* renamed from: q  reason: collision with root package name */
    private String f32398q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableSharedFlow<m.a> f32399r;

    /* renamed from: s  reason: collision with root package name */
    private final n<e.a> f32400s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableSharedFlow<a> f32401t;

    /* renamed from: u  reason: collision with root package name */
    private k0<Boolean> f32402u;

    /* renamed from: v  reason: collision with root package name */
    private MutableStateFlow<z.a> f32403v;

    /* renamed from: w  reason: collision with root package name */
    private MutableStateFlow<k> f32404w;

    /* compiled from: TryToLoginViewModel.kt */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* compiled from: TryToLoginViewModel.kt */
        /* renamed from: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0435a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f32405a;

            public C0435a(boolean z5) {
                super(0);
                this.f32405a = z5;
            }

            public final boolean a() {
                return this.f32405a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0435a) && this.f32405a == ((C0435a) obj).f32405a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f32405a);
            }

            public final String toString() {
                return androidx.appcompat.app.h.d(new StringBuilder("AuthenticationVerified(isVerified="), this.f32405a, ")");
            }
        }

        /* compiled from: TryToLoginViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                if (u.e(null, null)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Navigate(route=null)";
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$checkGoogleAuthentication$1", f = "TryToLoginViewModel.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32406a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Account f32408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Account account, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f32408c = account;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f32408c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32406a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                Account account = this.f32408c;
                TryToLoginViewModel tryToLoginViewModel = TryToLoginViewModel.this;
                tryToLoginViewModel.F0(account);
                MutableSharedFlow<a> T0 = tryToLoginViewModel.T0();
                a.C0435a c0435a = new a.C0435a(true);
                this.f32406a = 1;
                if (T0.emit(c0435a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$checkSecureAndContinueLogin$1", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONG_GEOIPFORCE}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32409a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TryToLoginViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TryToLoginViewModel f32411a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TryToLoginViewModel.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$checkSecureAndContinueLogin$1$1", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGROLEID}, m = "emit")
            /* renamed from: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0436a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                Object f32412a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f32413b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a<T> f32414c;

                /* renamed from: d  reason: collision with root package name */
                int f32415d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0436a(a<? super T> aVar, qm0.d<? super C0436a> dVar) {
                    super(dVar);
                    this.f32414c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f32413b = obj;
                    this.f32415d |= Integer.MIN_VALUE;
                    return this.f32414c.emit(null, this);
                }
            }

            a(TryToLoginViewModel tryToLoginViewModel) {
                this.f32411a = tryToLoginViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(th.e.a r5, qm0.d<? super nm0.y> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.c.a.C0436a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$c$a$a r0 = (com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.c.a.C0436a) r0
                    int r1 = r0.f32415d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32415d = r1
                    goto L18
                L13:
                    com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$c$a$a r0 = new com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$c$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f32413b
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f32415d
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L2b
                    java.lang.Object r5 = r0.f32412a
                    com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$c$a r5 = (com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.c.a) r5
                    nm0.l.b(r6)
                    goto L56
                L2b:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L33:
                    nm0.l.b(r6)
                    boolean r6 = r5 instanceof th.e.a.c
                    com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r2 = r4.f32411a
                    if (r6 == 0) goto L6f
                    t00.d r5 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.r0(r2)
                    lg.a r6 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.g0(r2)
                    com.withings.webservices.legacy.sync.ActionSyncJob r6 = r6.a(r3)
                    r0.f32412a = r4
                    r0.f32415d = r3
                    java.lang.String r2 = "login"
                    java.lang.Object r5 = t00.g.a(r5, r6, r2, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    r5 = r4
                L56:
                    com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r6 = r5.f32411a
                    xw.n r6 = r6.O0()
                    th.e$a$c r0 = new th.e$a$c
                    com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r5 = r5.f32411a
                    vf.c r5 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.i0(r5)
                    com.withings.account.core.model.Account r5 = r5.h()
                    r0.<init>(r5)
                    r6.postValue(r0)
                    goto L76
                L6f:
                    xw.n r6 = r2.O0()
                    r6.postValue(r5)
                L76:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.c.a.emit(th.e$a, qm0.d):java.lang.Object");
            }
        }

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32409a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                TryToLoginViewModel tryToLoginViewModel = TryToLoginViewModel.this;
                Flow<e.a> c11 = tryToLoginViewModel.f32390i.c();
                a aVar = new a(tryToLoginViewModel);
                this.f32409a = 1;
                if (c11.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$checkSecureAndContinueLogin$2", f = "TryToLoginViewModel.kt", l = {362, 366}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32416a;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r6.f32416a
                r2 = 2
                r3 = 1
                com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r4 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.this
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                nm0.l.b(r7)
                goto L45
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                nm0.l.b(r7)
                goto L38
            L1e:
                nm0.l.b(r7)
                t00.d r7 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.r0(r4)
                lg.a r1 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.g0(r4)
                com.withings.webservices.legacy.sync.ActionSyncJob r1 = r1.a(r3)
                r6.f32416a = r3
                java.lang.String r5 = "login"
                java.lang.Object r7 = t00.g.a(r7, r1, r5, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                com.withings.account.core.repositories.AccountSessionRepository r7 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.j0(r4)
                r6.f32416a = r2
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L45
                return r0
            L45:
                java.util.List r7 = (java.util.List) r7
                int r7 = r7.size()
                if (r7 <= r3) goto L57
                xw.n r7 = r4.O0()
                th.e$a$d r0 = th.e.a.d.f99827a
                r7.postValue(r0)
                goto L6b
            L57:
                xw.n r7 = r4.O0()
                th.e$a$c r0 = new th.e$a$c
                vf.c r1 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.i0(r4)
                com.withings.account.core.model.Account r1 = r1.h()
                r0.<init>(r1)
                r7.postValue(r0)
            L6b:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$confirmShortCode$1", f = "TryToLoginViewModel.kt", l = {130, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN, ConstantsWs.MEASURE_TYPE_LEUKOCYTES, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE, ConstantsWs.MEASURE_TYPE_CAN, ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32418a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32420c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32421d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f32420c = str;
            this.f32421d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f32420c, this.f32421d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$confirmShortCode$2", f = "TryToLoginViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32422a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32424c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32425d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TryToLoginViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TryToLoginViewModel f32426a;

            a(TryToLoginViewModel tryToLoginViewModel) {
                this.f32426a = tryToLoginViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Object emit = this.f32426a.R0().emit((m.a) obj, dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return y.f85009a;
                }
                return emit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f32424c = str;
            this.f32425d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f32424c, this.f32425d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32422a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                TryToLoginViewModel tryToLoginViewModel = TryToLoginViewModel.this;
                Flow<m.a> g11 = tryToLoginViewModel.f32385d.g(this.f32424c, this.f32425d, tryToLoginViewModel.f32394m);
                a aVar = new a(tryToLoginViewModel);
                this.f32422a = 1;
                if (g11.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$loginWithPassword$1", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGCONTEXT, 306}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32427a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32430d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f32429c = str;
            this.f32430d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f32429c, this.f32430d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r6.f32427a
                r2 = 2
                r3 = 1
                java.lang.String r4 = r6.f32430d
                com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r5 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.this
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                nm0.l.b(r7)
                goto Lba
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                nm0.l.b(r7)
                goto L44
            L21:
                nm0.l.b(r7)
                kotlinx.coroutines.flow.MutableStateFlow r7 = r5.U0()
                cg.k$c r1 = cg.k.c.f22765a
                r7.setValue(r1)
                com.withings.features.FeatureFlag r7 = com.withings.features.FeatureFlag.f39120n0
                boolean r7 = wr.b.c(r7)
                java.lang.String r1 = r6.f32429c
                if (r7 == 0) goto Lb1
                cg.j r7 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.q0(r5)
                r6.f32427a = r3
                java.lang.Object r7 = r7.a(r1, r4, r6)
                if (r7 != r0) goto L44
                return r0
            L44:
                com.withings.library.authentication.login.state.LoggedOut$OutputState r7 = (com.withings.library.authentication.login.state.LoggedOut.OutputState) r7
                boolean r0 = r7 instanceof com.withings.library.authentication.login.state.LoggedOut.OutputState.SuccessLoggedIn
                if (r0 == 0) goto L5f
                kotlinx.coroutines.flow.MutableStateFlow r7 = r5.U0()
                cg.k$d r0 = new cg.k$d
                vf.c r1 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.i0(r5)
                com.withings.account.core.model.Account r1 = r1.h()
                r0.<init>(r1, r4)
                r7.setValue(r0)
                goto Lba
            L5f:
                boolean r0 = r7 instanceof com.withings.library.authentication.login.state.LoggedOut.OutputState.SuccessNeed2FACode
                if (r0 == 0) goto L6d
                xw.n r7 = r5.O0()
                th.e$a$e r0 = th.e.a.C1659e.f99828a
                r7.postValue(r0)
                goto Lba
            L6d:
                boolean r0 = r7 instanceof com.withings.library.authentication.login.state.LoggedOut.OutputState.SuccessNeedPhoneNumber2FACreation
                if (r0 == 0) goto L7b
                xw.n r7 = r5.O0()
                th.e$a$e r0 = th.e.a.C1659e.f99828a
                r7.postValue(r0)
                goto Lba
            L7b:
                r5.getClass()
                boolean r0 = r7 instanceof com.withings.library.authentication.login.state.LoggedOut.OutputState.TooManyRequest
                if (r0 != 0) goto Lae
                boolean r0 = r7 instanceof com.withings.library.authentication.login.state.LoggedOut.OutputState.WithingsError
                if (r0 == 0) goto Lab
                r0 = 601(0x259, float:8.42E-43)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1 = 559(0x22f, float:7.83E-43)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1}
                java.util.List r0 = kotlin.collections.x.W(r0)
                com.withings.library.authentication.login.state.LoggedOut$OutputState$WithingsError r7 = (com.withings.library.authentication.login.state.LoggedOut.OutputState.WithingsError) r7
                int r7 = r7.getStatusCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                boolean r7 = r0.contains(r7)
                if (r7 == 0) goto Lab
                goto Lae
            Lab:
                cg.k$b$a r7 = cg.k.b.a.f22762a
                goto Lba
            Lae:
                cg.k$b$c r7 = cg.k.b.c.f22764a
                goto Lba
            Lb1:
                r6.f32427a = r2
                java.lang.Object r7 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.z0(r5, r1, r4, r6)
                if (r7 != r0) goto Lba
                return r0
            Lba:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TryToLoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$setAuthenticationVerified$1", f = "TryToLoginViewModel.kt", l = {395}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class h extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32431a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f32433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z5, qm0.d<? super h> dVar) {
            super(2, dVar);
            this.f32433c = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new h(this.f32433c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32431a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                MutableSharedFlow<a> T0 = TryToLoginViewModel.this.T0();
                a.C0435a c0435a = new a.C0435a(this.f32433c);
                this.f32431a = 1;
                if (T0.emit(c0435a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public TryToLoginViewModel(vf.c accountManager, AccountSessionRepository accountSessionRepository, jg.a aVar, m mVar, z zVar, i iVar, t tVar, j jVar, th.e eVar, lg.a aVar2, t00.d networkSyncManager, uf.a aVar3, cg.n nVar) {
        u.j(accountManager, "accountManager");
        u.j(accountSessionRepository, "accountSessionRepository");
        u.j(networkSyncManager, "networkSyncManager");
        this.f32382a = accountManager;
        this.f32383b = accountSessionRepository;
        this.f32384c = aVar;
        this.f32385d = mVar;
        this.f32386e = zVar;
        this.f32387f = iVar;
        this.f32388g = tVar;
        this.f32389h = jVar;
        this.f32390i = eVar;
        this.f32391j = aVar2;
        this.f32392k = networkSyncManager;
        this.f32393l = aVar3;
        this.f32394m = nVar.a();
        this.f32399r = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32400s = new n<>();
        this.f32401t = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32402u = new k0<>(Boolean.FALSE);
        this.f32403v = StateFlowKt.MutableStateFlow(z.a.C1671a.f99975a);
        this.f32404w = StateFlowKt.MutableStateFlow(k.a.f22761a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0(com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r12, java.lang.String r13, qm0.d r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof com.withings.authentication.tryToLogin.mail.g
            if (r0 == 0) goto L16
            r0 = r14
            com.withings.authentication.tryToLogin.mail.g r0 = (com.withings.authentication.tryToLogin.mail.g) r0
            int r1 = r0.f32462d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f32462d = r1
            goto L1b
        L16:
            com.withings.authentication.tryToLogin.mail.g r0 = new com.withings.authentication.tryToLogin.mail.g
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.f32460b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f32462d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            nm0.l.b(r14)
            goto Lbd
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r12 = r0.f32459a
            nm0.l.b(r14)
            goto Laa
        L3c:
            nm0.l.b(r14)
            en0.c r14 = new en0.c
            r2 = 97
            r5 = 122(0x7a, float:1.71E-43)
            r14.<init>(r2, r5)
            en0.c r2 = new en0.c
            r5 = 65
            r6 = 90
            r2.<init>(r5, r6)
            java.util.ArrayList r14 = kotlin.collections.x.j0(r14, r2)
            en0.c r2 = new en0.c
            r5 = 48
            r6 = 57
            r2.<init>(r5, r6)
            java.util.ArrayList r14 = kotlin.collections.x.l0(r2, r14)
            en0.k r2 = new en0.k
            r5 = 10
            r2.<init>(r4, r5, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r5 = kotlin.collections.x.y(r2, r5)
            r6.<init>(r5)
            en0.j r2 = r2.iterator()
        L76:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L8e
            r2.a()
            cn0.c$a r5 = cn0.c.f23164a
            java.lang.Object r5 = kotlin.collections.x.o0(r14, r5)
            java.lang.Character r5 = (java.lang.Character) r5
            r5.getClass()
            r6.add(r5)
            goto L76
        L8e:
            r9 = 0
            r10 = 0
            java.lang.String r7 = ""
            r8 = 0
            r11 = 62
            java.lang.String r14 = kotlin.collections.x.R(r6, r7, r8, r9, r10, r11)
            r12.f32398q = r14
            r12.f32395n = r13
            r0.f32459a = r12
            r0.f32462d = r4
            th.z r2 = r12.f32386e
            kotlinx.coroutines.flow.Flow r14 = r2.b(r13, r14)
            if (r14 != r1) goto Laa
            goto Lbf
        Laa:
            kotlinx.coroutines.flow.Flow r14 = (kotlinx.coroutines.flow.Flow) r14
            com.withings.authentication.tryToLogin.mail.h r13 = new com.withings.authentication.tryToLogin.mail.h
            r13.<init>(r12)
            r12 = 0
            r0.f32459a = r12
            r0.f32462d = r3
            java.lang.Object r12 = r14.collect(r13, r0)
            if (r12 != r1) goto Lbd
            goto Lbf
        Lbd:
            nm0.y r1 = nm0.y.f85009a
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.A0(com.withings.authentication.tryToLogin.mail.TryToLoginViewModel, java.lang.String, qm0.d):java.lang.Object");
    }

    public static final void f0(TryToLoginViewModel tryToLoginViewModel, String str, String str2) {
        tryToLoginViewModel.getClass();
        if (wr.b.c(FeatureFlag.f39120n0)) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(tryToLoginViewModel), null, null, new com.withings.authentication.tryToLogin.mail.a(tryToLoginViewModel, str2, str, null), 3, null);
        } else {
            FlowKt.launchIn(FlowKt.onEach(tryToLoginViewModel.f32385d.f(str, str2, tryToLoginViewModel.f32394m), new com.withings.authentication.tryToLogin.mail.b(tryToLoginViewModel, null)), h1.a(tryToLoginViewModel));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z0(com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r7, java.lang.String r8, java.lang.String r9, qm0.d r10) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.z0(com.withings.authentication.tryToLogin.mail.TryToLoginViewModel, java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    public final void B0(Account account) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(account, null), 2, null);
    }

    public final void F0(Account account) {
        u.j(account, "account");
        if (!u.e(this.f32402u.getValue(), Boolean.FALSE) || !account.i().e() || wr.b.c(FeatureFlag.f39120n0)) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(null), 2, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(null), 2, null);
        }
    }

    public final void G0(String email, String code) {
        u.j(email, "email");
        u.j(code, "code");
        if (wr.b.c(FeatureFlag.f39120n0)) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new e(code, email, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new f(email, code, null), 2, null);
        }
    }

    public final String K0() {
        return this.f32395n;
    }

    public final String M0() {
        return this.f32396o;
    }

    public final n<e.a> O0() {
        return this.f32400s;
    }

    public final MutableSharedFlow<m.a> R0() {
        return this.f32399r;
    }

    public final MutableSharedFlow<a> T0() {
        return this.f32401t;
    }

    public final MutableStateFlow<k> U0() {
        return this.f32404w;
    }

    public final String V0() {
        return this.f32397p;
    }

    public final MutableStateFlow<z.a> W0() {
        return this.f32403v;
    }

    public final k0<Boolean> X0() {
        return this.f32402u;
    }

    public final void Y0(String email, String password) {
        u.j(email, "email");
        u.j(password, "password");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new g(email, password, null), 2, null);
    }

    public final void Z0(r8.n nVar, String state, String str, String str2) {
        u.j(state, "state");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getMain(), null, new com.withings.authentication.tryToLogin.mail.d(this, state, nVar, str, str2, null), 2, null);
    }

    public final void a1(String str) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.authentication.tryToLogin.mail.e(this, str, null), 2, null);
    }

    public final void c1() {
        this.f32395n = null;
        this.f32396o = null;
        this.f32397p = null;
        this.f32398q = null;
        this.f32402u.setValue(Boolean.FALSE);
        this.f32400s.setValue(e.a.C1658a.f99824a);
        this.f32404w.setValue(k.a.f22761a);
        this.f32403v.setValue(z.a.C1671a.f99975a);
    }

    public final void d1(String email) {
        u.j(email, "email");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.authentication.tryToLogin.mail.f(this, email, null), 2, null);
    }

    public final void e1(String str) {
        this.f32395n = str;
    }

    public final void g1(String str) {
        this.f32396o = str;
    }

    public final void i1(boolean z5) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new h(z5, null), 3, null);
    }

    public final void k1(String str) {
        this.f32397p = str;
    }
}
