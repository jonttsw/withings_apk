package com.withings.authentication.accountConsent;

import com.withings.account.core.model.Account;
import com.withings.authentication.accountConsent.i;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.k;
import nm0.y;
import ym0.l;
import ym0.p;
/* compiled from: AccountLoginConsentViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.AccountLoginConsentViewModel$updateAccount$1", f = "AccountLoginConsentViewModel.kt", l = {56, 61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31368a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f31369b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AccountLoginConsentViewModel f31370c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountLoginConsentViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements l<i.a, i.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31371a = new w(1);

        @Override // ym0.l
        public final i.a invoke(i.a aVar) {
            i.a loadedLoginState = aVar;
            u.j(loadedLoginState, "loadedLoginState");
            return i.a.a(loadedLoginState, false, false, true, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountLoginConsentViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements l<i.a, i.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31372a = new w(1);

        @Override // ym0.l
        public final i.a invoke(i.a aVar) {
            i.a loadedLoginState = aVar;
            u.j(loadedLoginState, "loadedLoginState");
            return i.a.a(loadedLoginState, false, false, false, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountLoginConsentViewModel accountLoginConsentViewModel, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f31370c = accountLoginConsentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        d dVar2 = new d(this.f31370c, dVar);
        dVar2.f31369b = obj;
        return dVar2;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        vf.c cVar;
        vf.c cVar2;
        t00.d dVar;
        lg.a aVar;
        Object a12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31368a;
        AccountLoginConsentViewModel accountLoginConsentViewModel = this.f31370c;
        try {
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    e.a(accountLoginConsentViewModel.f31350d, b.f31372a);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
            a12 = obj;
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f31369b;
            e.a(accountLoginConsentViewModel.f31350d, a.f31371a);
            cVar = accountLoginConsentViewModel.f31347a;
            cVar2 = accountLoginConsentViewModel.f31347a;
            cVar.n(Account.a(cVar2.h(), null, false, null, null, null, null, false, true, true, 127));
            dVar = accountLoginConsentViewModel.f31349c;
            aVar = accountLoginConsentViewModel.f31348b;
            ActionSyncJob a13 = aVar.a(true);
            this.f31368a = 1;
            a12 = t00.g.a(dVar, a13, "account_login_consent", this);
            if (a12 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        a11 = (Boolean) a12;
        a11.getClass();
        if (true ^ (a11 instanceof k.a)) {
            Boolean bool = (Boolean) a11;
            MutableSharedFlow<y> k02 = accountLoginConsentViewModel.k0();
            y yVar = y.f85009a;
            this.f31369b = a11;
            this.f31368a = 2;
            if (k02.emit(yVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        e.a(accountLoginConsentViewModel.f31350d, b.f31372a);
        return y.f85009a;
    }
}
