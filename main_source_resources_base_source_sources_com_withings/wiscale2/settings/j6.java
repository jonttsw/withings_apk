package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WithingsAdvertisingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.WithingsAdvertisingViewModel$initUserEmail$1", f = "WithingsAdvertisingViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60082a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WithingsAdvertisingViewModel f60083b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithingsAdvertisingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.WithingsAdvertisingViewModel$initUserEmail$1$2", f = "WithingsAdvertisingViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<String, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f60084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WithingsAdvertisingViewModel f60085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WithingsAdvertisingViewModel withingsAdvertisingViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f60085b = withingsAdvertisingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f60085b, dVar);
            aVar.f60084a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(String str, qm0.d<? super nm0.y> dVar) {
            return ((a) create(str, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            String str = (String) this.f60084a;
            mutableStateFlow = this.f60085b.f59817c;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, g.a((g) value, false, str, null, 5)));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class b implements Flow<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f60086a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f60087a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.WithingsAdvertisingViewModel$initUserEmail$1$invokeSuspend$$inlined$map$1$2", f = "WithingsAdvertisingViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.settings.j6$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0777a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f60088a;

                /* renamed from: b  reason: collision with root package name */
                int f60089b;

                public C0777a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f60088a = obj;
                    this.f60089b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f60087a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.wiscale2.settings.j6.b.a.C0777a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.wiscale2.settings.j6$b$a$a r0 = (com.withings.wiscale2.settings.j6.b.a.C0777a) r0
                    int r1 = r0.f60089b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60089b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.settings.j6$b$a$a r0 = new com.withings.wiscale2.settings.j6$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f60088a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f60089b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L47
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.user.core.models.User r5 = (com.withings.user.core.models.User) r5
                    if (r5 == 0) goto L3b
                    java.lang.String r5 = r5.getEmail()
                    goto L3c
                L3b:
                    r5 = 0
                L3c:
                    r0.f60089b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f60087a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.j6.b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f60086a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super String> flowCollector, qm0.d dVar) {
            Object collect = this.f60086a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(WithingsAdvertisingViewModel withingsAdvertisingViewModel, qm0.d<? super j6> dVar) {
        super(2, dVar);
        this.f60083b = withingsAdvertisingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j6(this.f60083b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j6) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        r70.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60082a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            WithingsAdvertisingViewModel withingsAdvertisingViewModel = this.f60083b;
            cVar = withingsAdvertisingViewModel.f59815a;
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new b(cVar.f()));
            a aVar = new a(withingsAdvertisingViewModel, null);
            this.f60082a = 1;
            if (FlowKt.collectLatest(distinctUntilChanged, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
