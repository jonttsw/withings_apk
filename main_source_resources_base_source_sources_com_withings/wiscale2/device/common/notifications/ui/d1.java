package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Emitters.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$special$$inlined$transform$2", f = "DeviceNotificationSettingsFragment.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends String>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52857a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f52858b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Flow f52859c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f1 f52860d;

    /* compiled from: Emitters.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector<List<? extends String>> f52861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f1 f52862b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$special$$inlined$transform$2$1", f = "DeviceNotificationSettingsFragment.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.device.common.notifications.ui.d1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0708a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f52863a;

            /* renamed from: b  reason: collision with root package name */
            int f52864b;

            public C0708a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f52863a = obj;
                this.f52864b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, f1 f1Var) {
            this.f52862b = f1Var;
            this.f52861a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, qm0.d<? super nm0.y> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.withings.wiscale2.device.common.notifications.ui.d1.a.C0708a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.wiscale2.device.common.notifications.ui.d1$a$a r0 = (com.withings.wiscale2.device.common.notifications.ui.d1.a.C0708a) r0
                int r1 = r0.f52864b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f52864b = r1
                goto L18
            L13:
                com.withings.wiscale2.device.common.notifications.ui.d1$a$a r0 = new com.withings.wiscale2.device.common.notifications.ui.d1$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f52863a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f52864b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L56
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                nm0.y r5 = (nm0.y) r5
                com.withings.wiscale2.device.common.notifications.ui.f1 r5 = r4.f52862b
                gb0.c r6 = com.withings.wiscale2.device.common.notifications.ui.f1.j0(r5)
                com.withings.device.Device r5 = com.withings.wiscale2.device.common.notifications.ui.f1.m0(r5)
                u70.i r5 = r5.getMacAddress()
                java.lang.String r2 = "getMacAddress(...)"
                kotlin.jvm.internal.u.i(r5, r2)
                java.util.ArrayList r5 = r6.g(r5)
                r0.f52864b = r3
                kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends java.lang.String>> r6 = r4.f52861a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L56
                return r1
            L56:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.notifications.ui.d1.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Flow flow, qm0.d dVar, f1 f1Var) {
        super(2, dVar);
        this.f52859c = flow;
        this.f52860d = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        d1 d1Var = new d1(this.f52859c, dVar, this.f52860d);
        d1Var.f52858b = obj;
        return d1Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends String>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((d1) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52857a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a aVar = new a((FlowCollector) this.f52858b, this.f52860d);
            this.f52857a = 1;
            if (this.f52859c.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
