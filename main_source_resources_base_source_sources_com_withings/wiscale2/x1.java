package com.withings.wiscale2;

import android.content.Context;
import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.common.SessionIdProvider;
import com.withings.webservices.legacy.common.WSHandlerDelegate;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit.RestAdapter;
/* compiled from: LegacyAppWebservicesDelegate.kt */
/* loaded from: classes4.dex */
public final class x1 implements Webservices.Delegate, SessionIdProvider {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62932a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f62933b = nm0.h.b(new b());

    /* compiled from: LegacyAppWebservicesDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/x1$a;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface a {
        pj0.a B();

        dg.a getActiveSessionProvider();
    }

    /* compiled from: LegacyAppWebservicesDelegate.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<dg.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final dg.a invoke() {
            return ((a) ah.o.c(x1.this.f62932a, a.class)).getActiveSessionProvider();
        }
    }

    /* compiled from: LegacyAppWebservicesDelegate.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.LegacyAppWebservicesDelegate$invalidateSession$1$1", f = "LegacyAppWebservicesDelegate.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f62935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Account f62936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Account account, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f62936b = account;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f62936b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f62935a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                AccountSessionRepository a11 = AccountSessionRepository.a.a();
                long b10 = this.f62936b.i().b();
                this.f62935a = 1;
                if (a11.d(b10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    public x1(Context context) {
        this.f62932a = context;
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final String getAppName() {
        return ConstantsWs.APPNAME_WISCALENG;
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final int getAppVersion() {
        return 6040016;
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final Context getContext() {
        return this.f62932a;
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final WSHandlerDelegate getDefaultWSHandlerDelegate() {
        return ((a) ah.o.c(this.f62932a, a.class)).B();
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final RestAdapter.LogLevel getLogLevel() {
        return RestAdapter.LogLevel.NONE;
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final String getMainRootUrl() {
        sf.d a11;
        String m11;
        if (!wr.b.c(FeatureFlag.f39120n0) || (a11 = dg.b.a((dg.a) this.f62933b.getValue(), false)) == null || (m11 = a11.m()) == null) {
            return "https://scalews.withings.net/cgi-bin";
        }
        return m11;
    }

    @Override // com.withings.webservices.legacy.common.SessionIdProvider
    public final String getSessionId() throws WsAuthFailedException {
        sf.d a11 = dg.b.a((dg.a) this.f62933b.getValue(), true);
        if (a11 != null) {
            return a11.n();
        }
        throw new IllegalStateException("Active session missing");
    }

    @Override // com.withings.webservices.legacy.common.SessionIdProvider
    public final void invalidateSession() {
        vf.c cVar;
        cVar = vf.c.f103617d;
        if (cVar != null) {
            Account i11 = cVar.i();
            if (i11 != null) {
                BuildersKt__BuildersKt.runBlocking$default(null, new c(i11, null), 1, null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final boolean shouldFailOnSimpleCallContext() {
        return false;
    }

    @Override // com.withings.webservices.legacy.Webservices.Delegate
    public final SessionIdProvider getSessionIdProvider() {
        return this;
    }
}
