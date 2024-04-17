package com.withings.paywall.subscription;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.paywall.b0;
import com.withings.paywall.c0;
import com.withings.paywall.subscription.f;
import com.withings.paywall.t;
import com.withings.paywall.y;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import ym0.p;
/* compiled from: SubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/paywall/subscription/SubscriptionViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SubscriptionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final t f43625a;

    /* renamed from: b  reason: collision with root package name */
    private final com.withings.paywall.c f43626b;

    /* renamed from: c  reason: collision with root package name */
    private final t00.d f43627c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<f> f43628d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<f> f43629e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<y> f43630f;

    /* compiled from: SubscriptionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionViewModel$1", f = "SubscriptionViewModel.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43631a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SubscriptionViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionViewModel$1$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.paywall.subscription.SubscriptionViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0590a extends i implements p<c0, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43633a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SubscriptionViewModel f43634b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0590a(SubscriptionViewModel subscriptionViewModel, qm0.d<? super C0590a> dVar) {
                super(2, dVar);
                this.f43634b = subscriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0590a c0590a = new C0590a(this.f43634b, dVar);
                c0590a.f43633a = obj;
                return c0590a;
            }

            @Override // ym0.p
            public final Object invoke(c0 c0Var, qm0.d<? super nm0.y> dVar) {
                return ((C0590a) create(c0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object cVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                c0 c0Var = (c0) this.f43633a;
                MutableStateFlow mutableStateFlow = this.f43634b.f43628d;
                if (u.e(c0Var, c0.b.f43603a)) {
                    cVar = f.b.f43686a;
                } else if (c0Var instanceof c0.a) {
                    cVar = f.a.f43685a;
                } else if (c0Var instanceof c0.c) {
                    List<b0> a11 = ((c0.c) c0Var).a();
                    cVar = new f.c(a11, ((b0) x.I(a11)).getId());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                mutableStateFlow.setValue(cVar);
                return nm0.y.f85009a;
            }
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43631a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                SubscriptionViewModel subscriptionViewModel = SubscriptionViewModel.this;
                Flow<c0> c11 = subscriptionViewModel.f43625a.c();
                C0590a c0590a = new C0590a(subscriptionViewModel, null);
                this.f43631a = 1;
                if (FlowKt.collectLatest(c11, c0590a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class b implements Flow<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f43635a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SubscriptionViewModel f43636b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f43637a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SubscriptionViewModel f43638b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionViewModel$special$$inlined$map$1$2", f = "SubscriptionViewModel.kt", l = {225, 223}, m = "emit")
            /* renamed from: com.withings.paywall.subscription.SubscriptionViewModel$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0591a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f43639a;

                /* renamed from: b  reason: collision with root package name */
                int f43640b;

                /* renamed from: c  reason: collision with root package name */
                FlowCollector f43641c;

                public C0591a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43639a = obj;
                    this.f43640b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, SubscriptionViewModel subscriptionViewModel) {
                this.f43637a = flowCollector;
                this.f43638b = subscriptionViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withings.paywall.subscription.SubscriptionViewModel.b.a.C0591a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withings.paywall.subscription.SubscriptionViewModel$b$a$a r0 = (com.withings.paywall.subscription.SubscriptionViewModel.b.a.C0591a) r0
                    int r1 = r0.f43640b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f43640b = r1
                    goto L18
                L13:
                    com.withings.paywall.subscription.SubscriptionViewModel$b$a$a r0 = new com.withings.paywall.subscription.SubscriptionViewModel$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f43639a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f43640b
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L39
                    if (r2 == r5) goto L33
                    if (r2 != r4) goto L2b
                    nm0.l.b(r9)
                    goto L78
                L2b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L33:
                    kotlinx.coroutines.flow.FlowCollector r8 = r0.f43641c
                    nm0.l.b(r9)
                    goto L69
                L39:
                    nm0.l.b(r9)
                    com.withings.paywall.y r8 = (com.withings.paywall.y) r8
                    boolean r9 = r8 instanceof com.withings.paywall.y.d
                    kotlinx.coroutines.flow.FlowCollector r2 = r7.f43637a
                    if (r9 == 0) goto L6d
                    com.withings.paywall.subscription.SubscriptionViewModel r8 = r7.f43638b
                    t00.d r8 = com.withings.paywall.subscription.SubscriptionViewModel.g0(r8)
                    r0.f43641c = r2
                    r0.f43640b = r5
                    qm0.i r9 = new qm0.i
                    qm0.d r5 = rm0.a.b(r0)
                    r9.<init>(r5)
                    t00.e r5 = new t00.e
                    r5.<init>(r9)
                    java.lang.String r6 = "in_app_purchase_sync"
                    r8.c(r6, r3, r5)
                    java.lang.Object r8 = r9.a()
                    if (r8 != r1) goto L68
                    return r1
                L68:
                    r8 = r2
                L69:
                    com.withings.paywall.y$d r9 = com.withings.paywall.y.d.f43715a
                    r2 = r8
                    r8 = r9
                L6d:
                    r0.f43641c = r3
                    r0.f43640b = r4
                    java.lang.Object r8 = r2.emit(r8, r0)
                    if (r8 != r1) goto L78
                    return r1
                L78:
                    nm0.y r8 = nm0.y.f85009a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.paywall.subscription.SubscriptionViewModel.b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public b(Flow flow, SubscriptionViewModel subscriptionViewModel) {
            this.f43635a = flow;
            this.f43636b = subscriptionViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super y> flowCollector, qm0.d dVar) {
            Object collect = this.f43635a.collect(new a(flowCollector, this.f43636b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    @Inject
    public SubscriptionViewModel(t paywallRepository, com.withings.paywall.c billingNavigation, t00.d networkSyncManager) {
        u.j(paywallRepository, "paywallRepository");
        u.j(billingNavigation, "billingNavigation");
        u.j(networkSyncManager, "networkSyncManager");
        this.f43625a = paywallRepository;
        this.f43626b = billingNavigation;
        this.f43627c = networkSyncManager;
        MutableStateFlow<f> MutableStateFlow = StateFlowKt.MutableStateFlow(f.b.f43686a);
        this.f43628d = MutableStateFlow;
        this.f43629e = FlowKt.asStateFlow(MutableStateFlow);
        this.f43630f = FlowKt.stateIn(new b(paywallRepository.a(), this), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), y.c.f43714a);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
    }

    public static final void k0(SubscriptionViewModel subscriptionViewModel) {
        Object obj;
        f value = subscriptionViewModel.f43629e.getValue();
        u.h(value, "null cannot be cast to non-null type com.withings.paywall.subscription.SubscriptionState.Ready");
        f.c cVar = (f.c) value;
        Iterator<T> it = cVar.c().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (u.e(((b0) obj).getId(), cVar.b())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        subscriptionViewModel.f43625a.b((b0) obj);
    }

    public final StateFlow<y> m0() {
        return this.f43630f;
    }

    public final StateFlow<f> p0() {
        return this.f43629e;
    }
}
