package com.withings.authentication.tryToLogin.google;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.camera.core.y1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import cg.g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.account.models.AccountPrefEntity;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lg.o;
import nm0.h;
import nm0.k;
import nm0.y;
import rh.i;
import rh.j;
import rh.k;
import rh.l;
import th.e;
import vf.f;
import xw.n;
import ym0.p;
/* compiled from: GoogleAuthProviderViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/authentication/tryToLogin/google/GoogleAuthProviderViewModel;", "Landroidx/lifecycle/g1;", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"HardwareIds"})
/* loaded from: classes3.dex */
public final class GoogleAuthProviderViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32346a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f32347b;

    /* renamed from: c  reason: collision with root package name */
    private final AccountSessionRepository f32348c;

    /* renamed from: d  reason: collision with root package name */
    private final e f32349d;

    /* renamed from: e  reason: collision with root package name */
    private final f f32350e;

    /* renamed from: f  reason: collision with root package name */
    private final lg.a f32351f;

    /* renamed from: g  reason: collision with root package name */
    private final t00.d f32352g;

    /* renamed from: h  reason: collision with root package name */
    private final g f32353h;

    /* renamed from: i  reason: collision with root package name */
    private final cg.f f32354i;

    /* renamed from: j  reason: collision with root package name */
    private final k0<l> f32355j;

    /* renamed from: k  reason: collision with root package name */
    private final k0<rh.b> f32356k;

    /* renamed from: l  reason: collision with root package name */
    private final n<e.a> f32357l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f32358m;

    /* renamed from: n  reason: collision with root package name */
    private i f32359n;

    /* renamed from: o  reason: collision with root package name */
    private a f32360o;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GoogleAuthProviderViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f32361a;

        /* renamed from: b  reason: collision with root package name */
        private final String f32362b;

        /* renamed from: c  reason: collision with root package name */
        private final String f32363c;

        /* renamed from: d  reason: collision with root package name */
        private final String f32364d;

        public a(String str, String str2, String str3, String str4) {
            this.f32361a = str;
            this.f32362b = str2;
            this.f32363c = str3;
            this.f32364d = str4;
        }

        public final String a() {
            return this.f32361a;
        }

        public final String b() {
            return this.f32362b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f32361a, aVar.f32361a) && u.e(this.f32362b, aVar.f32362b) && u.e(this.f32363c, aVar.f32363c) && u.e(this.f32364d, aVar.f32364d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int c11 = defpackage.d.c(this.f32363c, defpackage.d.c(this.f32362b, this.f32361a.hashCode() * 31, 31), 31);
            String str = this.f32364d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return c11 + hashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoogleAccount(email=");
            sb2.append(this.f32361a);
            sb2.append(", idToken=");
            sb2.append(this.f32362b);
            sb2.append(", givenName=");
            sb2.append(this.f32363c);
            sb2.append(", familyName=");
            return y1.e(sb2, this.f32364d, ")");
        }
    }

    /* compiled from: GoogleAuthProviderViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$checkSecureAndContinueLogin$1", f = "GoogleAuthProviderViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32365a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GoogleAuthProviderViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GoogleAuthProviderViewModel f32367a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: GoogleAuthProviderViewModel.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$checkSecureAndContinueLogin$1$1", f = "GoogleAuthProviderViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT}, m = "emit")
            /* renamed from: com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0434a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                Object f32368a;

                /* renamed from: b  reason: collision with root package name */
                e.a f32369b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f32370c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a<T> f32371d;

                /* renamed from: e  reason: collision with root package name */
                int f32372e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0434a(a<? super T> aVar, qm0.d<? super C0434a> dVar) {
                    super(dVar);
                    this.f32371d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f32370c = obj;
                    this.f32372e |= Integer.MIN_VALUE;
                    return this.f32371d.emit(null, this);
                }
            }

            a(GoogleAuthProviderViewModel googleAuthProviderViewModel) {
                this.f32367a = googleAuthProviderViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(th.e.a r5, qm0.d<? super nm0.y> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.b.a.C0434a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$b$a$a r0 = (com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.b.a.C0434a) r0
                    int r1 = r0.f32372e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32372e = r1
                    goto L18
                L13:
                    com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$b$a$a r0 = new com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$b$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f32370c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f32372e
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    th.e$a r5 = r0.f32369b
                    java.lang.Object r0 = r0.f32368a
                    com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$b$a r0 = (com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.b.a) r0
                    nm0.l.b(r6)
                    goto L5a
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    nm0.l.b(r6)
                    boolean r6 = r5 instanceof th.e.a.c
                    if (r6 == 0) goto L59
                    com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel r6 = r4.f32367a
                    t00.d r2 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.y0(r6)
                    lg.a r6 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.f0(r6)
                    com.withings.webservices.legacy.sync.ActionSyncJob r6 = r6.a(r3)
                    r0.f32368a = r4
                    r0.f32369b = r5
                    r0.f32372e = r3
                    java.lang.String r3 = "login"
                    java.lang.Object r6 = t00.g.a(r2, r6, r3, r0)
                    if (r6 != r1) goto L59
                    return r1
                L59:
                    r0 = r4
                L5a:
                    com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel r6 = r0.f32367a
                    xw.n r6 = r6.K0()
                    r6.postValue(r5)
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.b.a.emit(th.e$a, qm0.d):java.lang.Object");
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32365a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                GoogleAuthProviderViewModel googleAuthProviderViewModel = GoogleAuthProviderViewModel.this;
                Flow<e.a> c11 = googleAuthProviderViewModel.f32349d.c();
                a aVar = new a(googleAuthProviderViewModel);
                this.f32365a = 1;
                if (c11.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: GoogleAuthProviderViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$checkSecureAndContinueLogin$2", f = "GoogleAuthProviderViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_CYCLE_DURATION, 188}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32373a;

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
                int r1 = r6.f32373a
                r2 = 2
                r3 = 1
                com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel r4 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.this
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
                t00.d r7 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.y0(r4)
                lg.a r1 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.f0(r4)
                com.withings.webservices.legacy.sync.ActionSyncJob r1 = r1.a(r3)
                r6.f32373a = r3
                java.lang.String r5 = "login"
                java.lang.Object r7 = t00.g.a(r7, r1, r5, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                com.withings.account.core.repositories.AccountSessionRepository r7 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.i0(r4)
                r6.f32373a = r2
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L45
                return r0
            L45:
                java.util.List r7 = (java.util.List) r7
                int r7 = r7.size()
                if (r7 <= r3) goto L57
                xw.n r7 = r4.K0()
                th.e$a$d r0 = th.e.a.d.f99827a
                r7.postValue(r0)
                goto L6b
            L57:
                xw.n r7 = r4.K0()
                th.e$a$c r0 = new th.e$a$c
                vf.c r1 = com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.g0(r4)
                com.withings.account.core.model.Account r1 = r1.h()
                r0.<init>(r1)
                r7.postValue(r0)
            L6b:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GoogleAuthProviderViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$updatePlatformToken$1$1", f = "GoogleAuthProviderViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGTZNAME}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32375a;

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

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32375a;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    GoogleAuthProviderViewModel googleAuthProviderViewModel = GoogleAuthProviderViewModel.this;
                    googleAuthProviderViewModel.M0().postValue(k.f95043a);
                    f fVar = googleAuthProviderViewModel.f32350e;
                    String id2 = googleAuthProviderViewModel.f32354i.getId();
                    a aVar = googleAuthProviderViewModel.f32360o;
                    if (aVar != null) {
                        String a12 = aVar.a();
                        a aVar2 = googleAuthProviderViewModel.f32360o;
                        if (aVar2 != null) {
                            String b10 = aVar2.b();
                            String z02 = GoogleAuthProviderViewModel.z0(googleAuthProviderViewModel);
                            u.i(z02, "access$getUniqueId(...)");
                            this.f32375a = 1;
                            if (fVar.a(id2, a12, false, b10, AccountPrefEntity.PROVIDER_GOOGLE, z02, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            u.s("googleAccount");
                            throw null;
                        }
                    } else {
                        u.s("googleAccount");
                        throw null;
                    }
                }
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            Throwable b11 = nm0.k.b(a11);
            if (b11 != null) {
                b11.printStackTrace();
            }
            return y.f85009a;
        }
    }

    @Inject
    public GoogleAuthProviderViewModel(Context context, vf.c accountManager, AccountSessionRepository accountSessionRepository, e eVar, f fVar, lg.d dVar, lg.a aVar, q70.g gVar, t00.d networkSyncManager, g gVar2, y90.e eVar2, o oVar, i iVar) {
        u.j(accountManager, "accountManager");
        u.j(accountSessionRepository, "accountSessionRepository");
        u.j(networkSyncManager, "networkSyncManager");
        this.f32346a = context;
        this.f32347b = accountManager;
        this.f32348c = accountSessionRepository;
        this.f32349d = eVar;
        this.f32350e = fVar;
        this.f32351f = aVar;
        this.f32352g = networkSyncManager;
        this.f32353h = gVar2;
        this.f32354i = eVar2;
        u.e(Locale.getDefault().getCountry(), Locale.CANADA.getCountry());
        this.f32355j = xw.d.b(null);
        this.f32356k = xw.d.b(null);
        this.f32357l = new n<>();
        this.f32358m = h.b(new com.withings.authentication.tryToLogin.google.c(this));
        if (mm.a.f82252a.a()) {
            this.f32359n = iVar;
        }
    }

    public static final void A0(GoogleAuthProviderViewModel googleAuthProviderViewModel) {
        i iVar = googleAuthProviderViewModel.f32359n;
        if (iVar != null) {
            iVar.e();
        }
        googleAuthProviderViewModel.f32355j.postValue(j.f95042a);
    }

    private static void B0(GoogleSignInAccount googleSignInAccount) {
        if (googleSignInAccount.getEmail() == null) {
            x70.b.n(new NullPointerException("email is null"));
        }
        if (googleSignInAccount.getIdToken() == null) {
            x70.b.n(new NullPointerException("idToken is null"));
        }
        if (googleSignInAccount.getGivenName() == null) {
            x70.b.n(new NullPointerException("givenName is null"));
        }
        if (googleSignInAccount.getFamilyName() == null) {
            x70.b.n(new NullPointerException("familyName is null"));
        }
    }

    public static GoogleSignInAccount O0(Task task) {
        Object a11;
        try {
            a11 = (GoogleSignInAccount) task.getResult(ApiException.class);
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (a11 instanceof k.a) {
            a11 = null;
        }
        return (GoogleSignInAccount) a11;
    }

    public static final String z0(GoogleAuthProviderViewModel googleAuthProviderViewModel) {
        return (String) googleAuthProviderViewModel.f32358m.getValue();
    }

    public final void F0(Account account) {
        u.j(account, "account");
        if (!account.i().e() || wr.b.c(FeatureFlag.f39120n0)) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(null), 2, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(null), 2, null);
        }
    }

    public final k0<rh.b> G0() {
        return this.f32356k;
    }

    public final n<e.a> K0() {
        return this.f32357l;
    }

    public final k0<l> M0() {
        return this.f32355j;
    }

    public final void R0(GoogleSignInAccount googleSignInAccount) {
        B0(googleSignInAccount);
        String email = googleSignInAccount.getEmail();
        u.g(email);
        String idToken = googleSignInAccount.getIdToken();
        u.g(idToken);
        String givenName = googleSignInAccount.getGivenName();
        u.g(givenName);
        this.f32360o = new a(email, idToken, givenName, googleSignInAccount.getFamilyName());
        this.f32355j.postValue(rh.k.f95043a);
        if (wr.b.c(FeatureFlag.f39120n0)) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new com.withings.authentication.tryToLogin.google.a(this, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.authentication.tryToLogin.google.b(this, null), 2, null);
        }
    }

    public final void T0(androidx.activity.result.b signInResultLauncher) {
        u.j(signInResultLauncher, "signInResultLauncher");
        i iVar = this.f32359n;
        if (iVar != null) {
            iVar.d(signInResultLauncher);
            y yVar = y.f85009a;
        }
    }

    public final void U0(GoogleSignInAccount googleSignInAccount) {
        B0(googleSignInAccount);
        String email = googleSignInAccount.getEmail();
        u.g(email);
        String idToken = googleSignInAccount.getIdToken();
        u.g(idToken);
        String givenName = googleSignInAccount.getGivenName();
        u.g(givenName);
        this.f32360o = new a(email, idToken, givenName, googleSignInAccount.getFamilyName());
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }
}
