package com.withings.wiscale2.vascularage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.DateTime;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes5.dex */
public final class f1 implements Flow<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f62287a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62288b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f62289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f62290b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$special$$inlined$map$3$2", f = "VascularAgeViewModel.kt", l = {226, 223}, m = "emit")
        /* renamed from: com.withings.wiscale2.vascularage.f1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0792a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f62291a;

            /* renamed from: b  reason: collision with root package name */
            int f62292b;

            /* renamed from: c  reason: collision with root package name */
            FlowCollector f62293c;

            public C0792a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f62291a = obj;
                this.f62292b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, r0 r0Var) {
            this.f62289a = flowCollector;
            this.f62290b = r0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r14, qm0.d r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.withings.wiscale2.vascularage.f1.a.C0792a
                if (r0 == 0) goto L13
                r0 = r15
                com.withings.wiscale2.vascularage.f1$a$a r0 = (com.withings.wiscale2.vascularage.f1.a.C0792a) r0
                int r1 = r0.f62292b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f62292b = r1
                goto L18
            L13:
                com.withings.wiscale2.vascularage.f1$a$a r0 = new com.withings.wiscale2.vascularage.f1$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f62291a
                kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r0.f62292b
                r11 = 2
                r2 = 1
                if (r1 == 0) goto L38
                if (r1 == r2) goto L32
                if (r1 != r11) goto L2a
                nm0.l.b(r15)
                goto L74
            L2a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L32:
                kotlinx.coroutines.flow.FlowCollector r14 = r0.f62293c
                nm0.l.b(r15)
                goto L5e
            L38:
                nm0.l.b(r15)
                com.withings.user.core.models.User r14 = (com.withings.user.core.models.User) r14
                com.withings.wiscale2.vascularage.r0 r15 = r13.f62290b
                iy.e r1 = com.withings.wiscale2.vascularage.r0.t0(r15)
                long r14 = r14.getId()
                kotlinx.coroutines.flow.FlowCollector r12 = r13.f62289a
                r0.f62293c = r12
                r0.f62292b = r2
                r7 = 0
                r9 = 508(0x1fc, float:7.12E-43)
                r4 = 155(0x9b, float:2.17E-43)
                r5 = 0
                r6 = 0
                r2 = r14
                r8 = r0
                java.lang.Object r15 = iy.e.d(r1, r2, r4, r5, r6, r7, r8, r9)
                if (r15 != r10) goto L5d
                return r10
            L5d:
                r14 = r12
            L5e:
                ky.d r15 = (ky.d) r15
                r1 = 0
                if (r15 == 0) goto L68
                org.joda.time.DateTime r15 = r15.c()
                goto L69
            L68:
                r15 = r1
            L69:
                r0.f62293c = r1
                r0.f62292b = r11
                java.lang.Object r14 = r14.emit(r15, r0)
                if (r14 != r10) goto L74
                return r10
            L74:
                nm0.y r14 = nm0.y.f85009a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vascularage.f1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public f1(SharedFlow sharedFlow, r0 r0Var) {
        this.f62287a = sharedFlow;
        this.f62288b = r0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super DateTime> flowCollector, qm0.d dVar) {
        Object collect = this.f62287a.collect(new a(flowCollector, this.f62288b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
