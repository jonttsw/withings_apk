package com.withings.fever.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.Interval;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class i0 implements Flow<Interval> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f39290a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o0 f39291b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f39292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0 f39293b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$special$$inlined$map$1$2", f = "BodyTemperatureViewModel.kt", l = {224, 223}, m = "emit")
        /* renamed from: com.withings.fever.ui.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0511a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f39294a;

            /* renamed from: b  reason: collision with root package name */
            int f39295b;

            /* renamed from: c  reason: collision with root package name */
            FlowCollector f39296c;

            public C0511a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f39294a = obj;
                this.f39295b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, o0 o0Var) {
            this.f39292a = flowCollector;
            this.f39293b = o0Var;
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
                boolean r0 = r9 instanceof com.withings.fever.ui.i0.a.C0511a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.fever.ui.i0$a$a r0 = (com.withings.fever.ui.i0.a.C0511a) r0
                int r1 = r0.f39295b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f39295b = r1
                goto L18
            L13:
                com.withings.fever.ui.i0$a$a r0 = new com.withings.fever.ui.i0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f39294a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f39295b
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
                kotlinx.coroutines.flow.FlowCollector r8 = r0.f39296c
                nm0.l.b(r9)
                goto L56
            L38:
                nm0.l.b(r9)
                com.withings.user.core.models.User r8 = (com.withings.user.core.models.User) r8
                com.withings.fever.ui.o0 r9 = r7.f39293b
                v90.g r9 = com.withings.fever.ui.o0.j0(r9)
                long r5 = r8.getId()
                kotlinx.coroutines.flow.FlowCollector r8 = r7.f39292a
                r0.f39296c = r8
                r0.f39295b = r4
                r2 = 71
                java.lang.Object r9 = r9.b(r5, r2, r0)
                if (r9 != r1) goto L56
                return r1
            L56:
                r2 = 0
                r0.f39296c = r2
                r0.f39295b = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L62
                return r1
            L62:
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.i0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public i0(Flow flow, o0 o0Var) {
        this.f39290a = flow;
        this.f39291b = o0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Interval> flowCollector, qm0.d dVar) {
        Object collect = this.f39290a.collect(new a(flowCollector, this.f39291b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
