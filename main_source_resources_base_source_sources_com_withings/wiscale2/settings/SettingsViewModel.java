package com.withings.wiscale2.settings;

import com.withings.account.core.model.Account;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.wiscale2.settings.i;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import nm0.k;
import sf.c;
/* compiled from: SettingsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/SettingsViewModel;", "Landroidx/lifecycle/b;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsViewModel extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final m70.i f59758a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f59759b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f59760c;

    /* renamed from: d  reason: collision with root package name */
    private final oi0.b f59761d;

    /* renamed from: e  reason: collision with root package name */
    private final lg.a f59762e;

    /* renamed from: f  reason: collision with root package name */
    private final t00.d f59763f;

    /* renamed from: g  reason: collision with root package name */
    private final qf.a f59764g;

    /* renamed from: h  reason: collision with root package name */
    private final AccountRemoteRepository f59765h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<Account> f59766i;

    /* renamed from: j  reason: collision with root package name */
    private final Flow<Boolean> f59767j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f59768k;

    /* renamed from: l  reason: collision with root package name */
    private final Flow<User> f59769l;

    /* renamed from: m  reason: collision with root package name */
    private final Flow<Boolean> f59770m;

    /* renamed from: n  reason: collision with root package name */
    private final Flow<Boolean> f59771n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<qf.b> f59772o;

    /* renamed from: p  reason: collision with root package name */
    private final StateFlow<qf.b> f59773p;

    /* renamed from: q  reason: collision with root package name */
    private final xw.n<nm0.j<Integer, Integer>> f59774q;

    /* renamed from: r  reason: collision with root package name */
    private final Flow<nm0.j<Integer, Integer>> f59775r;

    /* renamed from: s  reason: collision with root package name */
    private final xw.n<i> f59776s;

    /* compiled from: SettingsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$createPassword$1", f = "SettingsViewModel.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f59779c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59780d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, SettingsViewModel settingsViewModel, String str2, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f59778b = str;
            this.f59779c = settingsViewModel;
            this.f59780d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f59778b, this.f59779c, this.f59780d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59777a;
            final SettingsViewModel settingsViewModel = this.f59779c;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    String str2 = this.f59778b;
                    if (str2 != null) {
                        str = androidx.camera.core.impl.utils.k.d(str2);
                    } else {
                        str = null;
                    }
                    String str3 = str;
                    String str4 = this.f59780d;
                    AccountRemoteRepository accountRemoteRepository = settingsViewModel.f59765h;
                    this.f59777a = 1;
                    if (AccountRemoteRepository.changePassword$default(accountRemoteRepository, str3, str4, null, this, 4, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                a11 = nm0.y.f85009a;
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (!(a11 instanceof k.a)) {
                nm0.y yVar = (nm0.y) a11;
                Account h11 = settingsViewModel.f59759b.h();
                if (h11.i().d() instanceof c.C1619c) {
                    settingsViewModel.f59759b.n(Account.a(h11, null, false, null, null, null, Account.b.a(h11.i(), 0L, new c.C1619c(this.f59780d, h11.i().d().b()), false, null, 111), false, false, false, 479));
                }
                settingsViewModel.f59763f.d(settingsViewModel.f59762e.a(false), "after_update_password", new SyncJob.Listener() { // from class: com.withings.wiscale2.settings.f5
                    @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
                    public final void onSyncJobDone(SyncJob syncJob, int i12) {
                        SettingsViewModel.this.A0().postValue(i.d.f60040a);
                    }
                });
            }
            Throwable b10 = nm0.k.b(a11);
            if (b10 != null) {
                settingsViewModel.A0().postValue(new i.b(b10));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SettingsViewModel(android.content.Context r2, m70.i r3, vf.c r4, com.withings.wiscale2.settings.f0 r5, oi0.b r6, lg.a r7, t00.d r8, com.withings.wiscale2.settings.k0 r9, com.withings.account.network.ws.AccountRemoteRepository r10) {
        /*
            r1 = this;
            java.lang.String r0 = "userManager"
            kotlin.jvm.internal.u.j(r3, r0)
            java.lang.String r0 = "accountManager"
            kotlin.jvm.internal.u.j(r4, r0)
            java.lang.String r0 = "wsSyncManager"
            kotlin.jvm.internal.u.j(r6, r0)
            java.lang.String r0 = "networkSyncManager"
            kotlin.jvm.internal.u.j(r8, r0)
            java.lang.String r0 = "_accountRemoteRepository"
            kotlin.jvm.internal.u.j(r10, r0)
            android.app.Application r2 = ah.m.p(r2)
            java.lang.String r0 = "getApplication(...)"
            kotlin.jvm.internal.u.i(r2, r0)
            r1.<init>(r2)
            r1.f59758a = r3
            r1.f59759b = r4
            r1.f59760c = r5
            r1.f59761d = r6
            r1.f59762e = r7
            r1.f59763f = r8
            r1.f59764g = r9
            java.lang.String r2 = "settings"
            com.withings.account.network.ws.AccountRemoteRepository r2 = r10.withSyncContext(r2)
            r1.f59765h = r2
            com.withings.wiscale2.settings.d5 r2 = new com.withings.wiscale2.settings.d5
            r3 = 0
            r2.<init>(r1, r3)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flowOn(r2, r4)
            r1.f59766i = r2
            com.withings.wiscale2.settings.h5 r2 = new com.withings.wiscale2.settings.h5
            r2.<init>(r1, r3)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flowOn(r2, r4)
            r1.f59767j = r2
            java.lang.String r2 = "com.withings.thermo"
            java.lang.String r4 = "com.withings.home"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            java.util.List r2 = kotlin.collections.x.W(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L7f
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L7f
            goto La2
        L7f:
            java.util.Iterator r2 = r2.iterator()
        L83:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La2
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            android.app.Application r6 = r1.getApplication()
            android.content.Context r6 = r6.getApplicationContext()
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.Intent r4 = r6.getLaunchIntentForPackage(r4)
            if (r4 == 0) goto L83
            r5 = 1
        La2:
            r1.f59768k = r5
            m70.c r2 = new m70.c
            kotlinx.coroutines.CoroutineScope r4 = androidx.lifecycle.h1.a(r1)
            m70.i r5 = r1.f59758a
            r2.<init>(r4, r5)
            kotlinx.coroutines.flow.Flow r2 = androidx.lifecycle.q.a(r2)
            r1.f59769l = r2
            com.withings.wiscale2.settings.g5 r2 = new com.withings.wiscale2.settings.g5
            r2.<init>(r1, r3)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            r1.f59770m = r2
            com.withings.wiscale2.settings.e5 r2 = new com.withings.wiscale2.settings.e5
            r2.<init>(r1, r3)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flowOn(r2, r3)
            r1.f59771n = r2
            qf.b$b r2 = qf.b.C1546b.f92607a
            kotlinx.coroutines.flow.MutableStateFlow r2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r2)
            r1.f59772o = r2
            kotlinx.coroutines.flow.StateFlow r2 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r2)
            r1.f59773p = r2
            xw.n r2 = new xw.n
            r2.<init>()
            r1.f59774q = r2
            kotlinx.coroutines.flow.Flow r2 = androidx.lifecycle.q.a(r2)
            r1.f59775r = r2
            xw.n r2 = new xw.n
            r2.<init>()
            r1.f59776s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.SettingsViewModel.<init>(android.content.Context, m70.i, vf.c, com.withings.wiscale2.settings.f0, oi0.b, lg.a, t00.d, com.withings.wiscale2.settings.k0, com.withings.account.network.ws.AccountRemoteRepository):void");
    }

    public final xw.n<i> A0() {
        return this.f59776s;
    }

    public final Flow<Boolean> B0() {
        return this.f59770m;
    }

    public final Flow<Boolean> F0() {
        return this.f59767j;
    }

    public final StateFlow<qf.b> G0() {
        return this.f59773p;
    }

    public final Flow<User> K0() {
        return this.f59769l;
    }

    public final boolean M0() {
        return this.f59768k;
    }

    public final Flow<nm0.j<Integer, Integer>> O0() {
        return this.f59775r;
    }

    public final void R0() {
        User f11 = this.f59758a.f();
        if (f11 != null) {
            this.f59761d.r(Long.valueOf(f11.q()));
        }
    }

    public final void T0() {
        this.f59776s.postValue(null);
    }

    public final void t0(String newPassword, String str) {
        kotlin.jvm.internal.u.j(newPassword, "newPassword");
        this.f59776s.postValue(i.c.f60039a);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new a(str, this, newPassword, null), 2, null);
    }

    public final Flow<Account> y0() {
        return this.f59766i;
    }

    public final Flow<Boolean> z0() {
        return this.f59771n;
    }
}
