package com.withings.overview.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class j implements Flow<s10.c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f43360a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s10.b f43361b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f43362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s10.b f43363b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.overview.ui.StartTrackingViewModel$special$$inlined$map$1$2", f = "StartTrackingViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.overview.ui.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0584a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43364a;

            /* renamed from: b  reason: collision with root package name */
            int f43365b;

            public C0584a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43364a = obj;
                this.f43365b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, s10.b bVar) {
            this.f43362a = flowCollector;
            this.f43363b = bVar;
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
                boolean r0 = r6 instanceof com.withings.overview.ui.j.a.C0584a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.overview.ui.j$a$a r0 = (com.withings.overview.ui.j.a.C0584a) r0
                int r1 = r0.f43365b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43365b = r1
                goto L18
            L13:
                com.withings.overview.ui.j$a$a r0 = new com.withings.overview.ui.j$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f43364a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43365b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L45
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                q10.d r5 = (q10.d) r5
                s10.b r6 = r4.f43363b
                s10.c r5 = r6.a(r5)
                r0.f43365b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f43362a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L45
                return r1
            L45:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.overview.ui.j.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public j(Flow flow, s10.b bVar) {
        this.f43360a = flow;
        this.f43361b = bVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super s10.c> flowCollector, qm0.d dVar) {
        Object collect = this.f43360a.collect(new a(flowCollector, this.f43361b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return y.f85009a;
    }
}
