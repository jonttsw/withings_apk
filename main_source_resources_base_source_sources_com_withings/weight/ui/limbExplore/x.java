package com.withings.weight.ui.limbExplore;

import com.withings.weight.core.model.LimbModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class x implements Flow<m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f47739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LimbModel f47740b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f47741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LimbModel f47742b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$special$$inlined$map$2$2", f = "SegmentalLimbExploreViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.weight.ui.limbExplore.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0656a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f47743a;

            /* renamed from: b  reason: collision with root package name */
            int f47744b;

            public C0656a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f47743a = obj;
                this.f47744b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, LimbModel limbModel) {
            this.f47741a = flowCollector;
            this.f47742b = limbModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
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
                boolean r2 = r1 instanceof com.withings.weight.ui.limbExplore.x.a.C0656a
                if (r2 == 0) goto L17
                r2 = r1
                com.withings.weight.ui.limbExplore.x$a$a r2 = (com.withings.weight.ui.limbExplore.x.a.C0656a) r2
                int r3 = r2.f47744b
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f47744b = r3
                goto L1c
            L17:
                com.withings.weight.ui.limbExplore.x$a$a r2 = new com.withings.weight.ui.limbExplore.x$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f47743a
                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r4 = r2.f47744b
                r5 = 1
                if (r4 == 0) goto L34
                if (r4 != r5) goto L2c
                nm0.l.b(r1)
                goto Lb0
            L2c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L34:
                nm0.l.b(r1)
                r1 = r19
                java.util.List r1 = (java.util.List) r1
                java.lang.String r4 = "<this>"
                kotlin.jvm.internal.u.j(r1, r4)
                com.withings.weight.core.model.LimbModel r4 = r0.f47742b
                java.lang.String r6 = "limb"
                kotlin.jvm.internal.u.j(r4, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L57:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto La0
                java.lang.Object r8 = r1.next()
                z80.a r8 = (z80.a) r8
                com.withings.weight.ui.limbExplore.c r9 = new com.withings.weight.ui.limbExplore.c
                org.joda.time.DateTime r10 = r8.a()
                double r11 = r8.d()
                float r11 = (float) r11
                double r12 = r8.d()
                double r14 = r8.c()
                double r12 = r12 / r14
                r14 = 100
                double r14 = (double) r14
                double r12 = r12 * r14
                float r12 = (float) r12
                r9.<init>(r10, r11, r12)
                r6.add(r9)
                com.withings.weight.ui.limbExplore.c r9 = new com.withings.weight.ui.limbExplore.c
                org.joda.time.DateTime r10 = r8.a()
                double r11 = r8.b()
                float r11 = (float) r11
                double r12 = r8.b()
                double r16 = r8.c()
                double r12 = r12 / r16
                double r12 = r12 * r14
                float r8 = (float) r12
                r9.<init>(r10, r11, r8)
                r7.add(r9)
                goto L57
            La0:
                com.withings.weight.ui.limbExplore.m r1 = new com.withings.weight.ui.limbExplore.m
                r1.<init>(r7, r6, r4)
                r2.f47744b = r5
                kotlinx.coroutines.flow.FlowCollector r4 = r0.f47741a
                java.lang.Object r1 = r4.emit(r1, r2)
                if (r1 != r3) goto Lb0
                return r3
            Lb0:
                nm0.y r1 = nm0.y.f85009a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.ui.limbExplore.x.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public x(t80.b bVar, LimbModel limbModel) {
        this.f47739a = bVar;
        this.f47740b = limbModel;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super m> flowCollector, qm0.d dVar) {
        Object collect = this.f47739a.collect(new a(flowCollector, this.f47740b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
