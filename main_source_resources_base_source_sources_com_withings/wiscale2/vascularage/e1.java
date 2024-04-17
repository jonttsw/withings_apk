package com.withings.wiscale2.vascularage;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes5.dex */
public final class e1 implements Flow<List<? extends ky.a>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f62277a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62278b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f62279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f62280b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$special$$inlined$map$2$2", f = "VascularAgeViewModel.kt", l = {224, 223}, m = "emit")
        /* renamed from: com.withings.wiscale2.vascularage.e1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0791a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f62281a;

            /* renamed from: b  reason: collision with root package name */
            int f62282b;

            /* renamed from: c  reason: collision with root package name */
            FlowCollector f62283c;

            public C0791a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f62281a = obj;
                this.f62282b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, r0 r0Var) {
            this.f62279a = flowCollector;
            this.f62280b = r0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[LOOP:0: B:21:0x008b->B:23:0x0091, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r19, qm0.d r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r20
                boolean r2 = r1 instanceof com.withings.wiscale2.vascularage.e1.a.C0791a
                if (r2 == 0) goto L17
                r2 = r1
                com.withings.wiscale2.vascularage.e1$a$a r2 = (com.withings.wiscale2.vascularage.e1.a.C0791a) r2
                int r3 = r2.f62282b
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f62282b = r3
                goto L1c
            L17:
                com.withings.wiscale2.vascularage.e1$a$a r2 = new com.withings.wiscale2.vascularage.e1$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f62281a
                kotlin.coroutines.intrinsics.CoroutineSingletons r15 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r3 = r2.f62282b
                r14 = 2
                r4 = 1
                if (r3 == 0) goto L3e
                if (r3 == r4) goto L37
                if (r3 != r14) goto L2f
                nm0.l.b(r1)
                goto Lad
            L2f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L37:
                kotlinx.coroutines.flow.FlowCollector r3 = r2.f62283c
                nm0.l.b(r1)
                r0 = r14
                goto L7a
            L3e:
                nm0.l.b(r1)
                r1 = r19
                com.withings.user.core.models.User r1 = (com.withings.user.core.models.User) r1
                com.withings.wiscale2.vascularage.r0 r3 = r0.f62280b
                iy.e r3 = com.withings.wiscale2.vascularage.r0.t0(r3)
                long r5 = r1.getId()
                r1 = 8
                int[] r9 = new int[]{r1}
                kotlinx.coroutines.flow.FlowCollector r1 = r0.f62279a
                r2.f62283c = r1
                r2.f62282b = r4
                r12 = 0
                r16 = 668(0x29c, float:9.36E-43)
                r7 = 155(0x9b, float:2.17E-43)
                r8 = 0
                r10 = 0
                r11 = 1
                r13 = 0
                r4 = r5
                r6 = r7
                r7 = r8
                r8 = r10
                r10 = r11
                r11 = r13
                r13 = r2
                r0 = r14
                r14 = r16
                java.lang.Object r3 = iy.e.b(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                if (r3 != r15) goto L75
                return r15
            L75:
                r17 = r3
                r3 = r1
                r1 = r17
            L7a:
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.x.y(r1, r5)
                r4.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L8b:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto La1
                java.lang.Object r5 = r1.next()
                ky.d r5 = (ky.d) r5
                r6 = 155(0x9b, float:2.17E-43)
                ky.a r5 = ly.a.d(r6, r5)
                r4.add(r5)
                goto L8b
            La1:
                r1 = 0
                r2.f62283c = r1
                r2.f62282b = r0
                java.lang.Object r0 = r3.emit(r4, r2)
                if (r0 != r15) goto Lad
                return r15
            Lad:
                nm0.y r0 = nm0.y.f85009a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vascularage.e1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public e1(SharedFlow sharedFlow, r0 r0Var) {
        this.f62277a = sharedFlow;
        this.f62278b = r0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super List<? extends ky.a>> flowCollector, qm0.d dVar) {
        Object collect = this.f62277a.collect(new a(flowCollector, this.f62278b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
