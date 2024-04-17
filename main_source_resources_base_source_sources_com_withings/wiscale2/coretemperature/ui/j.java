package com.withings.wiscale2.coretemperature.ui;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class j implements Flow<ts.d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f50454a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f50455b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f50456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50457b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivityKt$rememberExploreDataState$lambda$7$$inlined$map$2$2", f = "ExploreCoreTemperatureActivity.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.coretemperature.ui.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0684a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f50458a;

            /* renamed from: b  reason: collision with root package name */
            int f50459b;

            public C0684a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50458a = obj;
                this.f50459b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, Context context) {
            this.f50456a = flowCollector;
            this.f50457b = context;
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
                boolean r0 = r6 instanceof com.withings.wiscale2.coretemperature.ui.j.a.C0684a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.wiscale2.coretemperature.ui.j$a$a r0 = (com.withings.wiscale2.coretemperature.ui.j.a.C0684a) r0
                int r1 = r0.f50459b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f50459b = r1
                goto L18
            L13:
                com.withings.wiscale2.coretemperature.ui.j$a$a r0 = new com.withings.wiscale2.coretemperature.ui.j$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f50458a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f50459b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L4a
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                java.util.List r5 = (java.util.List) r5
                com.withings.wiscale2.coretemperature.ui.l r6 = new com.withings.wiscale2.coretemperature.ui.l
                android.content.Context r2 = r4.f50457b
                r6.<init>(r2)
                ts.a r5 = r6.a(r5)
                r0.f50459b = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f50456a
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L4a
                return r1
            L4a:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.coretemperature.ui.j.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public j(Flow flow, Context context) {
        this.f50454a = flow;
        this.f50455b = context;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super ts.d> flowCollector, qm0.d dVar) {
        Object collect = this.f50454a.collect(new a(flowCollector, this.f50455b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return y.f85009a;
    }
}
