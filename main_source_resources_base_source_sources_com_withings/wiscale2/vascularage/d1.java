package com.withings.wiscale2.vascularage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.Interval;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes5.dex */
public final class d1 implements Flow<Interval> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f62267a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62268b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f62269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f62270b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$special$$inlined$map$1$2", f = "VascularAgeViewModel.kt", l = {224, 223}, m = "emit")
        /* renamed from: com.withings.wiscale2.vascularage.d1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0790a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f62271a;

            /* renamed from: b  reason: collision with root package name */
            int f62272b;

            /* renamed from: c  reason: collision with root package name */
            FlowCollector f62273c;

            public C0790a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f62271a = obj;
                this.f62272b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, r0 r0Var) {
            this.f62269a = flowCollector;
            this.f62270b = r0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.withings.wiscale2.vascularage.d1.a.C0790a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.wiscale2.vascularage.d1$a$a r0 = (com.withings.wiscale2.vascularage.d1.a.C0790a) r0
                int r1 = r0.f62272b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f62272b = r1
                goto L18
            L13:
                com.withings.wiscale2.vascularage.d1$a$a r0 = new com.withings.wiscale2.vascularage.d1$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f62271a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f62272b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                nm0.l.b(r9)
                goto L62
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                kotlinx.coroutines.flow.FlowCollector r8 = r0.f62273c
                nm0.l.b(r9)
                goto L56
            L38:
                nm0.l.b(r9)
                com.withings.user.core.models.User r8 = (com.withings.user.core.models.User) r8
                com.withings.wiscale2.vascularage.r0 r9 = r7.f62270b
                v90.g r9 = com.withings.wiscale2.vascularage.r0.m0(r9)
                long r5 = r8.getId()
                kotlinx.coroutines.flow.FlowCollector r8 = r7.f62269a
                r0.f62273c = r8
                r0.f62272b = r4
                r2 = 91
                java.lang.Object r9 = r9.b(r5, r2, r0)
                if (r9 != r1) goto L56
                return r1
            L56:
                r2 = 0
                r0.f62273c = r2
                r0.f62272b = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L62
                return r1
            L62:
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vascularage.d1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public d1(SharedFlow sharedFlow, r0 r0Var) {
        this.f62267a = sharedFlow;
        this.f62268b = r0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Interval> flowCollector, qm0.d dVar) {
        Object collect = this.f62267a.collect(new a(flowCollector, this.f62268b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
