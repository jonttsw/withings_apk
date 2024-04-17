package com.withings.wiscale2.activity.logging.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.track.data.Track;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$saveWorkout$1", f = "EditWorkoutViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class r0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48445a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m0 f48446b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f48447c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$saveWorkout$1$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f48448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Track track, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48448a = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48448a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Track track = this.f48448a;
            track.setSyncedToWs(false);
            WorkoutSaver.save(track);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(m0 m0Var, Track track, qm0.d<? super r0> dVar) {
        super(2, dVar);
        this.f48446b = m0Var;
        this.f48447c = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r0(this.f48446b, this.f48447c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48445a;
        Track track = this.f48447c;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(track, null);
            this.f48445a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        m0 m0Var = this.f48446b;
        if (m0Var.c1().getValue() == null) {
            dm.a aVar2 = dm.a.f63977a;
            Map i12 = kotlin.collections.s0.i(new nm0.j("value", 1));
            x70.b.l(aVar2, "workout_edited " + i12, new Object[0]);
        } else {
            m0.F0(m0Var, track);
        }
        m0Var.a1().setValue(null);
        return nm0.y.f85009a;
    }
}
