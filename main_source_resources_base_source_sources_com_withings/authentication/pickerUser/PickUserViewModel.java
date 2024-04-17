package com.withings.authentication.pickerUser;

import android.app.Application;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import com.withings.account.core.model.Account;
import com.withings.authentication.pickerUser.PickUserViewModel;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.SyncJob;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m70.i;
import nm0.l;
import nm0.y;
import q70.g;
import xw.n;
import ym0.p;
/* compiled from: PickUserViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/authentication/pickerUser/PickUserViewModel;", "Landroidx/lifecycle/b;", "Lcom/withings/webservices/legacy/sync/SyncJob$ProgressListener;", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PickUserViewModel extends androidx.lifecycle.b implements SyncJob.ProgressListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f32256a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f32257b;

    /* renamed from: c  reason: collision with root package name */
    private final t00.d f32258c;

    /* renamed from: d  reason: collision with root package name */
    private final lg.a f32259d;

    /* renamed from: e  reason: collision with root package name */
    private final g f32260e;

    /* renamed from: f  reason: collision with root package name */
    private final m70.a f32261f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<Integer> f32262g;

    /* renamed from: h  reason: collision with root package name */
    private final k0<Integer> f32263h;

    /* renamed from: i  reason: collision with root package name */
    private final n<y> f32264i;

    /* renamed from: j  reason: collision with root package name */
    private final n<a> f32265j;

    /* compiled from: PickUserViewModel.kt */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* compiled from: PickUserViewModel.kt */
        /* renamed from: com.withings.authentication.pickerUser.PickUserViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0431a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0431a f32266a = new C0431a();

            private C0431a() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0431a)) {
                    return false;
                }
                C0431a c0431a = (C0431a) obj;
                return true;
            }

            public final int hashCode() {
                return 750901029;
            }

            public final String toString() {
                return "Default";
            }
        }

        /* compiled from: PickUserViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f32267a = new b();

            private b() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return true;
            }

            public final int hashCode() {
                return 1047717593;
            }

            public final String toString() {
                return "Failed";
            }
        }

        /* compiled from: PickUserViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f32268a = new c();

            private c() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return true;
            }

            public final int hashCode() {
                return 2096695892;
            }

            public final String toString() {
                return "NeedChooseUser";
            }
        }

        /* compiled from: PickUserViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f32269a = new d();

            private d() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return true;
            }

            public final int hashCode() {
                return 1442265785;
            }

            public final String toString() {
                return "NeedCreateUser";
            }
        }

        /* compiled from: PickUserViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f32270a = new e();

            private e() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return true;
            }

            public final int hashCode() {
                return -1727990182;
            }

            public final String toString() {
                return "NeedToReactivateAccount";
            }
        }

        /* compiled from: PickUserViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class f extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f32271a = new f();

            private f() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return true;
            }

            public final int hashCode() {
                return 1633894631;
            }

            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickUserViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.pickerUser.PickUserViewModel$fetchUsers$1", f = "PickUserViewModel.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32272a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f32273b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Account f32275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Account account, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f32275d = account;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f32275d, dVar);
            bVar.f32273b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f32272a
                com.withings.authentication.pickerUser.PickUserViewModel r2 = com.withings.authentication.pickerUser.PickUserViewModel.this
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 != r3) goto L15
                java.lang.Object r0 = r8.f32273b
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L13
                goto L40
            L13:
                r9 = move-exception
                goto L47
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                nm0.l.b(r9)
                java.lang.Object r9 = r8.f32273b
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                com.withings.account.core.model.Account r1 = r8.f32275d
                q70.g r4 = com.withings.authentication.pickerUser.PickUserViewModel.k0(r2)     // Catch: java.lang.Throwable -> L43
                com.withings.account.core.model.Account$b r1 = r1.i()     // Catch: java.lang.Throwable -> L43
                long r5 = r1.b()     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = "syncForLogin"
                r8.f32273b = r9     // Catch: java.lang.Throwable -> L43
                r8.f32272a = r3     // Catch: java.lang.Throwable -> L43
                java.lang.Object r1 = r4.f(r5, r1, r8)     // Catch: java.lang.Throwable -> L43
                if (r1 != r0) goto L3f
                return r0
            L3f:
                r0 = r9
            L40:
                nm0.y r9 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L13
                goto L4b
            L43:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L47:
                nm0.k$a r9 = nm0.l.a(r9)
            L4b:
                boolean r1 = r9 instanceof nm0.k.a
                r1 = r1 ^ r3
                if (r1 == 0) goto L56
                r1 = r9
                nm0.y r1 = (nm0.y) r1
                com.withings.authentication.pickerUser.PickUserViewModel.m0(r2)
            L56:
                java.lang.Throwable r9 = nm0.k.b(r9)
                if (r9 == 0) goto L5f
                x70.b.e(r0, r9)
            L5f:
                nm0.y r9 = nm0.y.f85009a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.pickerUser.PickUserViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickUserViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.pickerUser.PickUserViewModel$startLoginForUser$1", f = "PickUserViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {
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
            l.b(obj);
            PickUserViewModel.p0(PickUserViewModel.this);
            return y.f85009a;
        }
    }

    /* compiled from: PickUserViewModel.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.l<User, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f32277a = new w(1);

        @Override // ym0.l
        public final Boolean invoke(User user) {
            User it = user;
            u.j(it, "it");
            boolean z5 = true;
            return Boolean.valueOf((it.A() != 1 || it.D()) ? false : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PickUserViewModel(Application application, i userManager, vf.c accountManager, t00.d networkSyncManager, lg.a aVar, g gVar) {
        super(application);
        u.j(userManager, "userManager");
        u.j(accountManager, "accountManager");
        u.j(networkSyncManager, "networkSyncManager");
        this.f32256a = userManager;
        this.f32257b = accountManager;
        this.f32258c = networkSyncManager;
        this.f32259d = aVar;
        this.f32260e = gVar;
        this.f32261f = new m70.a(h1.a(this), userManager, d.f32277a);
        this.f32262g = new k0<>();
        this.f32263h = new k0<>();
        this.f32264i = new n<>();
        this.f32265j = new n<>();
    }

    public static void F0(PickUserViewModel pickUserViewModel, Account account) {
        pickUserViewModel.getClass();
        Locale locale = Locale.getDefault();
        u.i(locale, "getDefault(...)");
        Account a11 = Account.a(account, null, false, locale, null, null, null, true, false, false, 443);
        pickUserViewModel.f32257b.n(a11);
        pickUserViewModel.q0(a11);
    }

    public static void f0(PickUserViewModel this$0, int i11) {
        u.j(this$0, "this$0");
        n<a> nVar = this$0.f32265j;
        if (i11 != 2) {
            if (i11 == 3) {
                nVar.postValue(a.b.f32267a);
                return;
            }
            return;
        }
        nVar.postValue(a.f.f32271a);
    }

    public static final void m0(PickUserViewModel pickUserViewModel) {
        List<User> c11 = pickUserViewModel.f32256a.c();
        u.i(c11, "getAccountUsers(...)");
        if (c11.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(pickUserViewModel), Dispatchers.getIO(), null, new com.withings.authentication.pickerUser.a(pickUserViewModel, null), 2, null);
        } else if (c11.size() == 1) {
            Object I = x.I(c11);
            u.i(I, "first(...)");
            pickUserViewModel.G0((User) I);
        } else {
            pickUserViewModel.f32265j.postValue(a.c.f32268a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qh.b] */
    public static final void p0(final PickUserViewModel pickUserViewModel) {
        pickUserViewModel.getClass();
        pickUserViewModel.f32258c.b(pickUserViewModel, new SyncJob.Listener() { // from class: qh.b
            @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
            public final void onSyncJobDone(SyncJob syncJob, int i11) {
                PickUserViewModel.f0(PickUserViewModel.this, i11);
            }
        });
    }

    public final m70.a A0() {
        return this.f32261f;
    }

    public final void B0() {
        this.f32257b.g();
        this.f32264i.setValue(null);
    }

    public final void G0(User user) {
        u.j(user, "user");
        this.f32256a.p(user);
        int i11 = v70.a.f103433b;
        v70.a.f(user.q(), this.f32257b.h().i().b());
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(null), 2, null);
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.ProgressListener
    public final void onProgressUpdate(SyncJob syncJob, SyncJob syncJob1, int i11, int i12) {
        u.j(syncJob, "syncJob");
        u.j(syncJob1, "syncJob1");
        this.f32263h.postValue(Integer.valueOf(i12));
        this.f32262g.postValue(Integer.valueOf(i11));
    }

    public final void q0(Account account) {
        u.j(account, "account");
        Locale locale = Locale.getDefault();
        u.i(locale, "getDefault(...)");
        Account a11 = Account.a(account, null, false, locale, null, null, null, true, false, false, 443);
        this.f32257b.n(a11);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(a11, null), 2, null);
    }

    public final n<y> r0() {
        return this.f32264i;
    }

    public final n<a> t0() {
        return this.f32265j;
    }

    public final k0<Integer> y0() {
        return this.f32263h;
    }

    public final k0<Integer> z0() {
        return this.f32262g;
    }
}
