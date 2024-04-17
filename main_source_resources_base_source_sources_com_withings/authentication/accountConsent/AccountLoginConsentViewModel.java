package com.withings.authentication.accountConsent;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.authentication.accountConsent.i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: AccountLoginConsentViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/accountConsent/AccountLoginConsentViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AccountLoginConsentViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final vf.c f31347a;

    /* renamed from: b  reason: collision with root package name */
    private final lg.a f31348b;

    /* renamed from: c  reason: collision with root package name */
    private final t00.d f31349c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<i> f31350d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<i> f31351e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<y> f31352f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountLoginConsentViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.AccountLoginConsentViewModel$resetViewModel$1", f = "AccountLoginConsentViewModel.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31353a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31353a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                MutableStateFlow mutableStateFlow = AccountLoginConsentViewModel.this.f31350d;
                i.b bVar = i.b.f31444a;
                this.f31353a = 1;
                if (mutableStateFlow.emit(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public AccountLoginConsentViewModel(vf.c accountManager, lg.a aVar, t00.d networkSyncManager) {
        u.j(accountManager, "accountManager");
        u.j(networkSyncManager, "networkSyncManager");
        this.f31347a = accountManager;
        this.f31348b = aVar;
        this.f31349c = networkSyncManager;
        MutableStateFlow<i> MutableStateFlow = StateFlowKt.MutableStateFlow(i.b.f31444a);
        this.f31350d = MutableStateFlow;
        this.f31351e = FlowKt.asStateFlow(MutableStateFlow);
        this.f31352f = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    public final MutableSharedFlow<y> k0() {
        return this.f31352f;
    }

    public final StateFlow<i> m0() {
        return this.f31351e;
    }

    public final void p0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }
}
