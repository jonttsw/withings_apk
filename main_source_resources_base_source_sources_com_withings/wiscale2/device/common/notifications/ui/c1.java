package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Emitters.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$special$$inlined$transform$1", f = "DeviceNotificationSettingsFragment.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends Short>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52845a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f52846b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Flow f52847c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f1 f52848d;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector<List<? extends Short>> f52849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f1 f52850b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$special$$inlined$transform$1$1", f = "DeviceNotificationSettingsFragment.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.device.common.notifications.ui.c1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0707a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f52851a;

            /* renamed from: b  reason: collision with root package name */
            int f52852b;

            public C0707a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f52851a = obj;
                this.f52852b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, f1 f1Var) {
            this.f52850b = f1Var;
            this.f52849a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, qm0.d<? super nm0.y> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.withings.wiscale2.device.common.notifications.ui.c1.a.C0707a
                if (r0 == 0) goto L13
                r0 = r8
                com.withings.wiscale2.device.common.notifications.ui.c1$a$a r0 = (com.withings.wiscale2.device.common.notifications.ui.c1.a.C0707a) r0
                int r1 = r0.f52852b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f52852b = r1
                goto L18
            L13:
                com.withings.wiscale2.device.common.notifications.ui.c1$a$a r0 = new com.withings.wiscale2.device.common.notifications.ui.c1$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f52851a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f52852b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r8)
                goto L7b
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                nm0.l.b(r8)
                nm0.y r7 = (nm0.y) r7
                com.withings.wiscale2.device.common.notifications.ui.f1 r7 = r6.f52850b
                gb0.c r8 = com.withings.wiscale2.device.common.notifications.ui.f1.j0(r7)
                com.withings.device.Device r2 = com.withings.wiscale2.device.common.notifications.ui.f1.m0(r7)
                u70.i r2 = r2.getMacAddress()
                java.lang.String r4 = "getMacAddress(...)"
                kotlin.jvm.internal.u.i(r2, r4)
                java.util.ArrayList r8 = r8.h(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r8 = r8.iterator()
            L54:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L70
                java.lang.Object r4 = r8.next()
                r5 = r4
                java.lang.Number r5 = (java.lang.Number) r5
                short r5 = r5.shortValue()
                short r5 = (short) r5
                boolean r5 = com.withings.wiscale2.device.common.notifications.ui.f1.G0(r7, r5)
                if (r5 == 0) goto L54
                r2.add(r4)
                goto L54
            L70:
                r0.f52852b = r3
                kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends java.lang.Short>> r7 = r6.f52849a
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L7b
                return r1
            L7b:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.notifications.ui.c1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Flow flow, qm0.d dVar, f1 f1Var) {
        super(2, dVar);
        this.f52847c = flow;
        this.f52848d = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        c1 c1Var = new c1(this.f52847c, dVar, this.f52848d);
        c1Var.f52846b = obj;
        return c1Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends Short>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((c1) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52845a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a aVar = new a((FlowCollector) this.f52846b, this.f52848d);
            this.f52845a = 1;
            if (this.f52847c.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
