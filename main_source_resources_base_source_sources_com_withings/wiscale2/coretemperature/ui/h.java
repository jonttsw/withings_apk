package com.withings.wiscale2.coretemperature.ui;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class h implements Flow<xs.c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f50442a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f50443b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f50444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50445b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivityKt$rememberExploreDataState$lambda$4$$inlined$map$2$2", f = "ExploreCoreTemperatureActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.coretemperature.ui.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0682a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f50446a;

            /* renamed from: b  reason: collision with root package name */
            int f50447b;

            public C0682a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50446a = obj;
                this.f50447b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, Context context) {
            this.f50444a = flowCollector;
            this.f50445b = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, qm0.d r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.withings.wiscale2.coretemperature.ui.h.a.C0682a
                if (r0 == 0) goto L13
                r0 = r13
                com.withings.wiscale2.coretemperature.ui.h$a$a r0 = (com.withings.wiscale2.coretemperature.ui.h.a.C0682a) r0
                int r1 = r0.f50447b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f50447b = r1
                goto L18
            L13:
                com.withings.wiscale2.coretemperature.ui.h$a$a r0 = new com.withings.wiscale2.coretemperature.ui.h$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f50446a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f50447b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r13)
                goto L6b
            L27:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L2f:
                nm0.l.b(r13)
                org.joda.time.Interval r12 = (org.joda.time.Interval) r12
                xs.c$a r13 = xs.c.f107461a
                android.content.Context r13 = r11.f50445b
                java.lang.String r2 = "activityContext"
                kotlin.jvm.internal.u.j(r13, r2)
                java.lang.String r2 = "interval"
                kotlin.jvm.internal.u.j(r12, r2)
                r2 = 2131099931(0x7f06011b, float:1.781223E38)
                int r7 = r13.getColor(r2)
                r6 = 1056964608(0x3f000000, float:0.5)
                r10 = 200(0xc8, float:2.8E-43)
                java.lang.String r4 = "°C"
                r5 = 1065353216(0x3f800000, float:1.0)
                r8 = 0
                r9 = 0
                xs.c r13 = xs.d.a(r4, r5, r6, r7, r8, r9, r10)
                com.withings.wiscale2.coretemperature.ui.m r2 = new com.withings.wiscale2.coretemperature.ui.m
                r2.<init>(r12)
                xs.c r12 = r13.c(r2)
                r0.f50447b = r3
                kotlinx.coroutines.flow.FlowCollector r13 = r11.f50444a
                java.lang.Object r12 = r13.emit(r12, r0)
                if (r12 != r1) goto L6b
                return r1
            L6b:
                nm0.y r12 = nm0.y.f85009a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.coretemperature.ui.h.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public h(Flow flow, Context context) {
        this.f50442a = flow;
        this.f50443b = context;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super xs.c> flowCollector, qm0.d dVar) {
        Object collect = this.f50442a.collect(new a(flowCollector, this.f50443b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return y.f85009a;
    }
}
