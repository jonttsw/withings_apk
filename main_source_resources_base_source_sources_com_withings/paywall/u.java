package com.withings.paywall;

import com.withings.paywall.c0;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: PaywallRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.paywall.a f43693a;

    /* renamed from: b  reason: collision with root package name */
    private final n20.d f43694b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<b0> f43695c = StateFlowKt.MutableStateFlow(null);

    /* compiled from: PaywallRepositoryImpl.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.PaywallRepositoryImpl$getPurchaseStatus$1", f = "PaywallRepositoryImpl.kt", l = {74, 76, 78, 80, 83, 85, 88}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.r<FlowCollector<? super y>, x, b0, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43696a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f43697b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f43698c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ b0 f43699d;

        a(qm0.d<? super a> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(FlowCollector<? super y> flowCollector, x xVar, b0 b0Var, qm0.d<? super nm0.y> dVar) {
            a aVar = new a(dVar);
            aVar.f43697b = flowCollector;
            aVar.f43698c = xVar;
            aVar.f43699d = b0Var;
            return aVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.paywall.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PaywallRepositoryImpl.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.PaywallRepositoryImpl$getSubscriptions$1", f = "PaywallRepositoryImpl.kt", l = {19, 21, 23}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super c0>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43701a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f43702b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaywallRepositoryImpl.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector<c0> f43704a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f43705b;

            /* JADX WARN: Multi-variable type inference failed */
            a(FlowCollector<? super c0> flowCollector, u uVar) {
                this.f43704a = flowCollector;
                this.f43705b = uVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:138:0x01cc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
            /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.i0] */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Comparator] */
            /* JADX WARN: Type inference failed for: r6v27, types: [com.withings.paywall.b0$a] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r27, qm0.d r28) {
                /*
                    Method dump skipped, instructions count: 718
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.paywall.u.b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f43702b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super c0> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((b) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43701a;
            u uVar = u.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nm0.l.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                flowCollector = (FlowCollector) this.f43702b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f43702b;
                com.withings.paywall.a aVar = uVar.f43693a;
                this.f43702b = flowCollector;
                this.f43701a = 1;
                obj = aVar.i(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                c0.a aVar2 = new c0.a(0);
                this.f43702b = null;
                this.f43701a = 2;
                if (flowCollector.emit(aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return nm0.y.f85009a;
            }
            StateFlow<e> e11 = uVar.f43693a.e();
            a aVar3 = new a(flowCollector, uVar);
            this.f43702b = null;
            this.f43701a = 3;
            if (e11.collect(aVar3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public u(com.withings.paywall.a aVar, n20.d dVar) {
        this.f43693a = aVar;
        this.f43694b = dVar;
    }

    @Override // com.withings.paywall.t
    public final Flow<y> a() {
        return FlowKt.distinctUntilChanged(FlowKt.combineTransform(this.f43693a.f(), this.f43695c, new a(null)));
    }

    @Override // com.withings.paywall.t
    public final void b(b0 b0Var) {
        this.f43695c.setValue(b0Var);
    }

    @Override // com.withings.paywall.t
    public final Flow<c0> c() {
        return FlowKt.flow(new b(null));
    }
}
