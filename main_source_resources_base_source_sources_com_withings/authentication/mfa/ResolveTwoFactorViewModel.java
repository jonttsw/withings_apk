package com.withings.authentication.mfa;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: ResolveMultiFactorActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/authentication/mfa/ResolveTwoFactorViewModel;", "Landroidx/lifecycle/g1;", com.huawei.hms.feature.dynamic.e.b.f28627a, "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ResolveTwoFactorViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<b> f31583a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<b> f31584b;

    /* compiled from: ResolveMultiFactorActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.ResolveTwoFactorViewModel$1", f = "ResolveMultiFactorActivity.kt", l = {ConstantsWs.MEASURE_TYPE_CAN}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountRemoteRepository f31586b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ResolveTwoFactorViewModel f31587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AccountRemoteRepository accountRemoteRepository, ResolveTwoFactorViewModel resolveTwoFactorViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f31586b = accountRemoteRepository;
            this.f31587c = resolveTwoFactorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f31586b, this.f31587c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31585a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                com.withings.authentication.mfa.b bVar = new com.withings.authentication.mfa.b(this.f31586b);
                this.f31585a = 1;
                obj = bVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ResolveTwoFactorViewModel resolveTwoFactorViewModel = this.f31587c;
            if (booleanValue) {
                resolveTwoFactorViewModel.f31583a.setValue(b.C0408b.f31589a);
            } else {
                resolveTwoFactorViewModel.f31583a.setValue(b.c.f31590a);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ResolveMultiFactorActivity.kt */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* compiled from: ResolveMultiFactorActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f31588a = new a();

            private a() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return true;
            }

            public final int hashCode() {
                return -997965900;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ResolveMultiFactorActivity.kt */
        /* renamed from: com.withings.authentication.mfa.ResolveTwoFactorViewModel$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0408b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0408b f31589a = new C0408b();

            private C0408b() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0408b)) {
                    return false;
                }
                C0408b c0408b = (C0408b) obj;
                return true;
            }

            public final int hashCode() {
                return 2045222149;
            }

            public final String toString() {
                return "WithAuthFactor";
            }
        }

        /* compiled from: ResolveMultiFactorActivity.kt */
        /* loaded from: classes3.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f31590a = new c();

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
                return 2079395959;
            }

            public final String toString() {
                return "WithoutAuthFactor";
            }
        }

        public /* synthetic */ b(int i11) {
            this();
        }

        private b() {
        }
    }

    @Inject
    public ResolveTwoFactorViewModel(AccountRemoteRepository accountRemoteRepository) {
        kotlin.jvm.internal.u.j(accountRemoteRepository, "accountRemoteRepository");
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.a.f31588a);
        this.f31583a = MutableStateFlow;
        this.f31584b = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(accountRemoteRepository, this, null), 2, null);
    }

    public final StateFlow<b> g0() {
        return this.f31584b;
    }
}
