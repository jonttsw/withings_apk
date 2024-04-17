package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class n0 implements Flow<List<Vasistas>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f49461a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.a f49462b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f49463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListGpsPointActivity.a f49464b;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity$ListGpsPointViewModel$special$$inlined$map$1$2", f = "ListGpsPointActivity.kt", l = {224, 223}, m = "emit")
        /* renamed from: com.withings.wiscale2.activity.workout.ui.detail.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0673a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f49465a;

            /* renamed from: b  reason: collision with root package name */
            int f49466b;

            /* renamed from: c  reason: collision with root package name */
            FlowCollector f49467c;

            public C0673a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f49465a = obj;
                this.f49466b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, ListGpsPointActivity.a aVar) {
            this.f49463a = flowCollector;
            this.f49464b = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.withings.wiscale2.activity.workout.ui.detail.n0.a.C0673a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.wiscale2.activity.workout.ui.detail.n0$a$a r0 = (com.withings.wiscale2.activity.workout.ui.detail.n0.a.C0673a) r0
                int r1 = r0.f49466b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f49466b = r1
                goto L18
            L13:
                com.withings.wiscale2.activity.workout.ui.detail.n0$a$a r0 = new com.withings.wiscale2.activity.workout.ui.detail.n0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f49465a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f49466b
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L33
                if (r2 != r4) goto L2b
                nm0.l.b(r9)
                goto L61
            L2b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L33:
                kotlinx.coroutines.flow.FlowCollector r8 = r0.f49467c
                nm0.l.b(r9)
                goto L56
            L39:
                nm0.l.b(r9)
                com.withings.wiscale2.track.data.Track r8 = (com.withings.wiscale2.track.data.Track) r8
                kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
                com.withings.wiscale2.activity.workout.ui.detail.l0 r2 = new com.withings.wiscale2.activity.workout.ui.detail.l0
                com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity$a r6 = r7.f49464b
                r2.<init>(r6, r8, r3)
                kotlinx.coroutines.flow.FlowCollector r8 = r7.f49463a
                r0.f49467c = r8
                r0.f49466b = r5
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
                if (r9 != r1) goto L56
                return r1
            L56:
                r0.f49467c = r3
                r0.f49466b = r4
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L61
                return r1
            L61:
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.detail.n0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public n0(Flow flow, ListGpsPointActivity.a aVar) {
        this.f49461a = flow;
        this.f49462b = aVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super List<Vasistas>> flowCollector, qm0.d dVar) {
        Object collect = this.f49461a.collect(new a(flowCollector, this.f49462b), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
