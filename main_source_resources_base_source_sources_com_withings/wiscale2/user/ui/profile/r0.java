package com.withings.wiscale2.user.ui.profile;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes5.dex */
public final class r0 implements Flow<Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f62033a;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f62034a;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$special$$inlined$map$2$2", f = "EditProfileViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.user.ui.profile.r0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0788a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f62035a;

            /* renamed from: b  reason: collision with root package name */
            int f62036b;

            public C0788a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f62035a = obj;
                this.f62036b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f62034a = flowCollector;
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
                boolean r0 = r6 instanceof com.withings.wiscale2.user.ui.profile.r0.a.C0788a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.wiscale2.user.ui.profile.r0$a$a r0 = (com.withings.wiscale2.user.ui.profile.r0.a.C0788a) r0
                int r1 = r0.f62036b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f62036b = r1
                goto L18
            L13:
                com.withings.wiscale2.user.ui.profile.r0$a$a r0 = new com.withings.wiscale2.user.ui.profile.r0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f62035a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f62036b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L4c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                ky.d r5 = (ky.d) r5
                if (r5 == 0) goto L40
                double r5 = ly.a.f(r3, r5)
                java.lang.Double r2 = new java.lang.Double
                r2.<init>(r5)
                goto L41
            L40:
                r2 = 0
            L41:
                r0.f62036b = r3
                kotlinx.coroutines.flow.FlowCollector r5 = r4.f62034a
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L4c
                return r1
            L4c:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.r0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public r0(Flow flow) {
        this.f62033a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Double> flowCollector, qm0.d dVar) {
        Object collect = this.f62033a.collect(new a(flowCollector), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
