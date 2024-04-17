package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.liveworkout.model.LiveWorkout;
/* compiled from: LiveWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel$liveWorkoutLiveData$1$1", f = "LiveWorkoutViewModel.kt", l = {99, 103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class u0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<LiveWorkout>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    LiveWorkout f48935a;

    /* renamed from: b  reason: collision with root package name */
    int f48936b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f48937c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Boolean f48938d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ z0 f48939e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Boolean bool, z0 z0Var, qm0.d<? super u0> dVar) {
        super(2, dVar);
        this.f48938d = bool;
        this.f48939e = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u0 u0Var = new u0(this.f48938d, this.f48939e, dVar);
        u0Var.f48937c = obj;
        return u0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<LiveWorkout> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((u0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f48936b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L29
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            nm0.l.b(r19)
            goto Lae
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1b:
            com.withings.liveworkout.model.LiveWorkout r2 = r0.f48935a
            java.lang.Object r4 = r0.f48937c
            androidx.lifecycle.h0 r4 = (androidx.lifecycle.h0) r4
            nm0.l.b(r19)
            r5 = r2
            r2 = r4
            r4 = r19
            goto L68
        L29:
            nm0.l.b(r19)
            java.lang.Object r2 = r0.f48937c
            androidx.lifecycle.h0 r2 = (androidx.lifecycle.h0) r2
            java.lang.Boolean r5 = r0.f48938d
            java.lang.String r6 = "$isPaused"
            kotlin.jvm.internal.u.i(r5, r6)
            boolean r6 = r5.booleanValue()
            com.withings.wiscale2.activity.workout.live.ui.z0 r7 = r0.f48939e
            if (r6 == 0) goto L7d
            com.withings.liveworkout.model.LiveWorkout r6 = r7.c1()
            boolean r6 = r6.isInPause()
            if (r6 != 0) goto L7d
            com.withings.liveworkout.model.LiveWorkout r5 = r7.c1()
            ax.b r6 = com.withings.wiscale2.activity.workout.live.ui.z0.i0(r7)
            com.withings.user.User r8 = com.withings.wiscale2.activity.workout.live.ui.z0.m0(r7)
            com.withings.liveworkout.model.LiveWorkout r7 = r7.c1()
            r0.f48937c = r2
            r0.f48935a = r5
            r0.f48936b = r4
            ta0.a r6 = (ta0.a) r6
            java.io.Serializable r4 = r6.a(r8, r7, r0)
            if (r4 != r1) goto L68
            return r1
        L68:
            r14 = r4
            com.withings.comm.wpp.generated.object.PauseState r14 = (com.withings.comm.wpp.generated.object.PauseState) r14
            r13 = 0
            r15 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 383(0x17f, float:5.37E-43)
            r17 = 0
            com.withings.liveworkout.model.LiveWorkout r4 = com.withings.liveworkout.model.LiveWorkout.copy$default(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto La0
        L7d:
            boolean r4 = r5.booleanValue()
            if (r4 != 0) goto L9c
            com.withings.liveworkout.model.LiveWorkout r4 = r7.c1()
            boolean r4 = r4.isInPause()
            if (r4 == 0) goto L9c
            com.withings.liveworkout.model.LiveWorkout r4 = r7.c1()
            com.withings.comm.wpp.generated.object.PauseState r5 = r4.getPauseState()
            if (r5 != 0) goto L98
            goto La0
        L98:
            r6 = 0
            r5.startTime = r6
            goto La0
        L9c:
            com.withings.liveworkout.model.LiveWorkout r4 = r7.c1()
        La0:
            r5 = 0
            r0.f48937c = r5
            r0.f48935a = r5
            r0.f48936b = r3
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto Lae
            return r1
        Lae:
            nm0.y r1 = nm0.y.f85009a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.live.ui.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
