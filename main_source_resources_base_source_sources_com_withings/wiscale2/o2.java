package com.withings.wiscale2;

import androidx.compose.material.g6;
import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.features.FeatureFlag;
import com.withings.network.core.LogLevel;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import s00.d;
/* compiled from: SessionAwareWebServicesDelegate.kt */
@Singleton
/* loaded from: classes4.dex */
public final class o2 implements d.a, s00.e {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f58808a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f58809b;

    /* renamed from: c  reason: collision with root package name */
    private final dg.a f58810c;

    /* renamed from: d  reason: collision with root package name */
    private final AccountSessionRepository f58811d;

    /* renamed from: e  reason: collision with root package name */
    private final String f58812e;

    /* renamed from: f  reason: collision with root package name */
    private final int f58813f;

    /* renamed from: g  reason: collision with root package name */
    private final LogLevel f58814g;

    /* renamed from: h  reason: collision with root package name */
    private final pj0.d f58815h;

    /* compiled from: SessionAwareWebServicesDelegate.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.SessionAwareWebServicesDelegate$invalidateSession$1$1", f = "SessionAwareWebServicesDelegate.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58816a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Account f58818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Account account, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58818c = account;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f58818c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58816a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                AccountSessionRepository accountSessionRepository = o2.this.f58811d;
                long b10 = this.f58818c.i().b();
                this.f58816a = 1;
                if (accountSessionRepository.d(b10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    @Inject
    public o2(g1 defaultWebServicesDelegate, vf.c accountManager, dg.c cVar, AccountSessionRepository accountSessionRepository, pj0.d dVar) {
        kotlin.jvm.internal.u.j(defaultWebServicesDelegate, "defaultWebServicesDelegate");
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(accountSessionRepository, "accountSessionRepository");
        this.f58808a = defaultWebServicesDelegate;
        this.f58809b = accountManager;
        this.f58810c = cVar;
        this.f58811d = accountSessionRepository;
        this.f58812e = defaultWebServicesDelegate.getAppName();
        this.f58813f = defaultWebServicesDelegate.getAppVersion();
        this.f58814g = defaultWebServicesDelegate.getLogLevel();
        this.f58815h = dVar;
    }

    public final String b() {
        boolean c11 = wr.b.c(FeatureFlag.f39120n0);
        g1 g1Var = this.f58808a;
        if (!c11) {
            return g1Var.a();
        }
        sf.d a11 = dg.b.a(this.f58810c, false);
        if (a11 != null) {
            return g6.i(a11.c(), "/connect/");
        }
        return g1Var.a();
    }

    public final String c() {
        String c11;
        boolean c12 = wr.b.c(FeatureFlag.f39120n0);
        g1 g1Var = this.f58808a;
        if (!c12) {
            return g1Var.b();
        }
        sf.d a11 = dg.b.a(this.f58810c, false);
        if (a11 == null || (c11 = a11.c()) == null) {
            return g1Var.b();
        }
        return c11;
    }

    @Override // s00.d.a
    public final String getAppName() {
        return this.f58812e;
    }

    @Override // s00.d.a
    public final int getAppVersion() {
        return this.f58813f;
    }

    @Override // s00.d.a
    public final d.b getDefaultWSHandlerDelegate() {
        return this.f58815h;
    }

    @Override // s00.d.a
    public final LogLevel getLogLevel() {
        return this.f58814g;
    }

    @Override // s00.d.a
    public final String getMainRootUrl() {
        String m11;
        boolean c11 = wr.b.c(FeatureFlag.f39120n0);
        g1 g1Var = this.f58808a;
        if (!c11) {
            return g1Var.getMainRootUrl();
        }
        sf.d a11 = dg.b.a(this.f58810c, false);
        if (a11 == null || (m11 = a11.m()) == null) {
            return g1Var.getMainRootUrl();
        }
        return m11;
    }

    @Override // s00.e
    public final String getSessionId() {
        sf.d a11 = dg.b.a(this.f58810c, true);
        if (a11 != null) {
            return a11.n();
        }
        throw new IllegalStateException("Active session missing");
    }

    @Override // s00.e
    public final void invalidateSession() {
        Account i11 = this.f58809b.i();
        if (i11 != null) {
            BuildersKt__BuildersKt.runBlocking$default(null, new a(i11, null), 1, null);
        }
    }
}
