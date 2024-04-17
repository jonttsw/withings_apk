package com.withings.nervehealth.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class f implements Flow<xs.c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f42506a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42507b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f42508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthActivity f42509b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthActivity$initFlows$$inlined$map$2$2", f = "NerveHealthActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.nervehealth.ui.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0570a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f42510a;

            /* renamed from: b  reason: collision with root package name */
            int f42511b;

            public C0570a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42510a = obj;
                this.f42511b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, NerveHealthActivity nerveHealthActivity) {
            this.f42508a = flowCollector;
            this.f42509b = nerveHealthActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r14, qm0.d r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.withings.nervehealth.ui.f.a.C0570a
                if (r0 == 0) goto L13
                r0 = r15
                com.withings.nervehealth.ui.f$a$a r0 = (com.withings.nervehealth.ui.f.a.C0570a) r0
                int r1 = r0.f42511b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f42511b = r1
                goto L18
            L13:
                com.withings.nervehealth.ui.f$a$a r0 = new com.withings.nervehealth.ui.f$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f42510a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f42511b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r15)
                goto L7a
            L27:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L2f:
                nm0.l.b(r15)
                org.joda.time.Interval r14 = (org.joda.time.Interval) r14
                xs.c$a r15 = xs.c.f107461a
                com.withings.nervehealth.ui.NerveHealthActivity r15 = r13.f42509b
                r2 = 2132018921(0x7f1406e9, float:1.9676162E38)
                java.lang.String r4 = r15.getString(r2)
                java.util.List r5 = com.withings.nervehealth.ui.NerveHealthActivity.E3(r15)
                int r10 = com.withings.nervehealth.ui.NerveHealthActivity.C3(r15)
                r9 = 1
                r11 = 0
                r6 = 1112014848(0x42480000, float:50.0)
                r7 = 3
                r8 = 1112014848(0x42480000, float:50.0)
                r12 = 288(0x120, float:4.04E-43)
                xs.c r15 = xs.d.b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                o00.j r2 = new o00.j
                org.joda.time.DateTime r4 = r14.getStart()
                java.lang.String r5 = "getStart(...)"
                kotlin.jvm.internal.u.i(r4, r5)
                org.joda.time.DateTime r14 = r14.getEnd()
                java.lang.String r5 = "getEnd(...)"
                kotlin.jvm.internal.u.i(r14, r5)
                r2.<init>(r4, r14)
                xs.c r14 = r15.c(r2)
                r0.f42511b = r3
                kotlinx.coroutines.flow.FlowCollector r15 = r13.f42508a
                java.lang.Object r14 = r15.emit(r14, r0)
                if (r14 != r1) goto L7a
                return r1
            L7a:
                nm0.y r14 = nm0.y.f85009a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.f.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public f(SharedFlow sharedFlow, NerveHealthActivity nerveHealthActivity) {
        this.f42506a = sharedFlow;
        this.f42507b = nerveHealthActivity;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super xs.c> flowCollector, qm0.d dVar) {
        Object collect = this.f42506a.collect(new a(flowCollector, this.f42507b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
