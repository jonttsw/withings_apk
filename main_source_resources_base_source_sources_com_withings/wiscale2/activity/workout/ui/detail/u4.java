package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.user.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Emitters.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutHeartRateKt$createHeartRateGraphDataLiveData$1$invoke$$inlined$transform$1", f = "WorkoutHeartRate.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class u4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super q4>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49681a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49682b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Flow f49683c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f49684d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ User f49685e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List f49686f;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector<q4> f49687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f49688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f49689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f49690d;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutHeartRateKt$createHeartRateGraphDataLiveData$1$invoke$$inlined$transform$1$1", f = "WorkoutHeartRate.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.wiscale2.activity.workout.ui.detail.u4$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0674a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f49691a;

            /* renamed from: b  reason: collision with root package name */
            int f49692b;

            public C0674a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f49691a = obj;
                this.f49692b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, Context context, User user, List list) {
            this.f49688b = context;
            this.f49689c = user;
            this.f49690d = list;
            this.f49687a = flowCollector;
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
                boolean r0 = r8 instanceof com.withings.wiscale2.activity.workout.ui.detail.u4.a.C0674a
                if (r0 == 0) goto L13
                r0 = r8
                com.withings.wiscale2.activity.workout.ui.detail.u4$a$a r0 = (com.withings.wiscale2.activity.workout.ui.detail.u4.a.C0674a) r0
                int r1 = r0.f49692b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f49692b = r1
                goto L18
            L13:
                com.withings.wiscale2.activity.workout.ui.detail.u4$a$a r0 = new com.withings.wiscale2.activity.workout.ui.detail.u4$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f49691a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f49692b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r8)
                goto L5d
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                nm0.l.b(r8)
                nm0.j r7 = (nm0.j) r7
                java.lang.Object r8 = r7.a()
                com.withings.wiscale2.track.data.Track r8 = (com.withings.wiscale2.track.data.Track) r8
                java.lang.Object r7 = r7.b()
                java.util.List r7 = (java.util.List) r7
                com.withings.wiscale2.activity.workout.ui.detail.r4 r2 = new com.withings.wiscale2.activity.workout.ui.detail.r4
                android.content.Context r4 = r6.f49688b
                r2.<init>(r4)
                java.util.List r4 = r6.f49690d
                kotlin.jvm.internal.u.g(r4)
                com.withings.user.User r5 = r6.f49689c
                com.withings.wiscale2.activity.workout.ui.detail.q4 r7 = r2.a(r5, r8, r7, r4)
                r0.f49692b = r3
                kotlinx.coroutines.flow.FlowCollector<com.withings.wiscale2.activity.workout.ui.detail.q4> r8 = r6.f49687a
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L5d
                return r1
            L5d:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.detail.u4.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(Flow flow, qm0.d dVar, Context context, User user, List list) {
        super(2, dVar);
        this.f49683c = flow;
        this.f49684d = context;
        this.f49685e = user;
        this.f49686f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u4 u4Var = new u4(this.f49683c, dVar, this.f49684d, this.f49685e, this.f49686f);
        u4Var.f49682b = obj;
        return u4Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super q4> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((u4) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49681a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a aVar = new a((FlowCollector) this.f49682b, this.f49684d, this.f49685e, this.f49686f);
            this.f49681a = 1;
            if (this.f49683c.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
