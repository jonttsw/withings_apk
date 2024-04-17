package com.withings.authentication.accountConsent;

import com.withings.authentication.accountConsent.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.l;
import ym0.p;
/* compiled from: AccountLoginConsentViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.AccountLoginConsentViewModel$termsOfUseAccepted$1", f = "AccountLoginConsentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AccountLoginConsentViewModel f31365a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f31366b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountLoginConsentViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements l<i.a, i.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5) {
            super(1);
            this.f31367a = z5;
        }

        @Override // ym0.l
        public final i.a invoke(i.a aVar) {
            i.a loadedLoginState = aVar;
            u.j(loadedLoginState, "loadedLoginState");
            return i.a.a(loadedLoginState, false, this.f31367a, false, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountLoginConsentViewModel accountLoginConsentViewModel, boolean z5, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f31365a = accountLoginConsentViewModel;
        this.f31366b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f31365a, this.f31366b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        e.a(this.f31365a.f31350d, new a(this.f31366b));
        return y.f85009a;
    }
}
