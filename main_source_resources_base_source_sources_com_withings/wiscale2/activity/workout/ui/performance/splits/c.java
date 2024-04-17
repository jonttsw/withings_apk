package com.withings.wiscale2.activity.workout.ui.performance.splits;

import androidx.lifecycle.h0;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;
import l70.w;
import nm0.y;
/* compiled from: WorkoutSplits.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.performance.splits.SplitsViewModel$splitsLiveData$1$1", f = "WorkoutSplits.kt", l = {46, 48}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<nm0.j<? extends List<? extends b>, ? extends Integer>>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    d f49976a;

    /* renamed from: b  reason: collision with root package name */
    Track f49977b;

    /* renamed from: c  reason: collision with root package name */
    int f49978c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f49979d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Track f49980e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ w f49981f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d f49982g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutSplits.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f49983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f49984b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<Vasistas> f49985c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f49986d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h0<nm0.j<List<b>, Integer>> f49987e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WorkoutSplits.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.performance.splits.SplitsViewModel$splitsLiveData$1$1$1$1", f = "WorkoutSplits.kt", l = {50, 51}, m = "emit")
        /* renamed from: com.withings.wiscale2.activity.workout.ui.performance.splits.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0677a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            Object f49988a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f49989b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a<T> f49990c;

            /* renamed from: d  reason: collision with root package name */
            int f49991d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0677a(a<? super T> aVar, qm0.d<? super C0677a> dVar) {
                super(dVar);
                this.f49990c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f49989b = obj;
                this.f49991d |= Integer.MIN_VALUE;
                return this.f49990c.emit(null, this);
            }
        }

        a(d dVar, Track track, List<Vasistas> list, int i11, h0<nm0.j<List<b>, Integer>> h0Var) {
            this.f49983a = dVar;
            this.f49984b = track;
            this.f49985c = list;
            this.f49986d = i11;
            this.f49987e = h0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.util.List<com.withings.location.model.GpsLocation> r8, qm0.d<? super nm0.y> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.withings.wiscale2.activity.workout.ui.performance.splits.c.a.C0677a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.wiscale2.activity.workout.ui.performance.splits.c$a$a r0 = (com.withings.wiscale2.activity.workout.ui.performance.splits.c.a.C0677a) r0
                int r1 = r0.f49991d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f49991d = r1
                goto L18
            L13:
                com.withings.wiscale2.activity.workout.ui.performance.splits.c$a$a r0 = new com.withings.wiscale2.activity.workout.ui.performance.splits.c$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f49989b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f49991d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                nm0.l.b(r9)
                goto L7a
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                java.lang.Object r8 = r0.f49988a
                com.withings.wiscale2.activity.workout.ui.performance.splits.c$a r8 = (com.withings.wiscale2.activity.workout.ui.performance.splits.c.a) r8
                nm0.l.b(r9)
                goto L66
            L3a:
                nm0.l.b(r9)
                java.util.List<com.withings.vasistas.model.Vasistas> r9 = r7.f49985c
                java.lang.String r2 = "$pausesVasistas"
                kotlin.jvm.internal.u.i(r9, r2)
                com.withings.wiscale2.activity.workout.ui.performance.splits.d r2 = r7.f49983a
                com.withings.wiscale2.track.data.Track r5 = r7.f49984b
                int r6 = r7.f49986d
                java.util.ArrayList r8 = com.withings.wiscale2.activity.workout.ui.performance.splits.d.g0(r2, r5, r8, r9, r6)
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r6)
                nm0.j r2 = new nm0.j
                r2.<init>(r8, r9)
                r0.f49988a = r7
                r0.f49991d = r4
                androidx.lifecycle.h0<nm0.j<java.util.List<com.withings.wiscale2.activity.workout.ui.performance.splits.b>, java.lang.Integer>> r8 = r7.f49987e
                java.lang.Object r8 = r8.emit(r2, r0)
                if (r8 != r1) goto L65
                return r1
            L65:
                r8 = r7
            L66:
                com.withings.wiscale2.activity.workout.ui.performance.splits.d r8 = r8.f49983a
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.withings.wiscale2.activity.workout.ui.performance.splits.d.j0(r8)
                java.lang.Boolean r9 = java.lang.Boolean.FALSE
                r2 = 0
                r0.f49988a = r2
                r0.f49991d = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L7a
                return r1
            L7a:
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.performance.splits.c.a.emit(java.util.List, qm0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Track track, w wVar, d dVar, qm0.d<? super c> dVar2) {
        super(2, dVar2);
        this.f49980e = track;
        this.f49981f = wVar;
        this.f49982g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        c cVar = new c(this.f49980e, this.f49981f, this.f49982g, dVar);
        cVar.f49979d = obj;
        return cVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<nm0.j<? extends List<? extends b>, ? extends Integer>> h0Var, qm0.d<? super y> dVar) {
        return ((c) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f49978c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2c
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            nm0.l.b(r18)
            goto L93
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1b:
            com.withings.wiscale2.track.data.Track r2 = r0.f49977b
            com.withings.wiscale2.activity.workout.ui.performance.splits.d r4 = r0.f49976a
            java.lang.Object r5 = r0.f49979d
            androidx.lifecycle.h0 r5 = (androidx.lifecycle.h0) r5
            nm0.l.b(r18)
            r7 = r2
            r6 = r4
            r10 = r5
            r4 = r18
            goto L4d
        L2c:
            nm0.l.b(r18)
            java.lang.Object r2 = r0.f49979d
            r5 = r2
            androidx.lifecycle.h0 r5 = (androidx.lifecycle.h0) r5
            com.withings.wiscale2.track.data.Track r2 = r0.f49980e
            if (r2 == 0) goto L93
            r0.f49979d = r5
            com.withings.wiscale2.activity.workout.ui.performance.splits.d r6 = r0.f49982g
            r0.f49976a = r6
            r0.f49977b = r2
            r0.f49978c = r4
            l70.w r4 = r0.f49981f
            java.lang.Object r4 = ah.g.q(r4, r0)
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r7 = r2
            r10 = r5
        L4d:
            l70.v r4 = (l70.v) r4
            int r9 = r4.b()
            lj0.h0 r11 = com.withings.wiscale2.activity.workout.ui.performance.splits.d.i0(r6)
            long r12 = r7.getUserId()
            com.withings.vasistas.model.Vasistas$Category r14 = com.withings.vasistas.model.Vasistas.Category.PAUSE
            org.joda.time.DateTime r15 = com.withings.wiscale2.track.data.TrackKt.getEffectiveStartDate(r7)
            org.joda.time.DateTime r16 = com.withings.wiscale2.track.data.TrackKt.getEffectiveEndDate(r7)
            java.util.List r8 = r11.o(r12, r14, r15, r16)
            com.withings.location.repository.GpsLocationRepository r2 = com.withings.wiscale2.activity.workout.ui.performance.splits.d.f0(r6)
            long r4 = r7.getUserId()
            org.joda.time.DateTime r11 = com.withings.wiscale2.track.data.TrackKt.getEffectiveStartDate(r7)
            org.joda.time.DateTime r12 = com.withings.wiscale2.track.data.TrackKt.getEffectiveEndDate(r7)
            kotlinx.coroutines.flow.Flow r2 = r2.get(r4, r11, r12)
            com.withings.wiscale2.activity.workout.ui.performance.splits.c$a r4 = new com.withings.wiscale2.activity.workout.ui.performance.splits.c$a
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r5 = 0
            r0.f49979d = r5
            r0.f49976a = r5
            r0.f49977b = r5
            r0.f49978c = r3
            java.lang.Object r2 = r2.collect(r4, r0)
            if (r2 != r1) goto L93
            return r1
        L93:
            nm0.y r1 = nm0.y.f85009a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.performance.splits.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
