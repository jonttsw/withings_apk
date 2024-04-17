package com.withings.wiscale2.activity.logging.ui;

import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$initWorkoutWithCategoryFromTrack$1", f = "EditWorkoutViewModel.kt", l = {463}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48432a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m0 f48433b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f48434c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$initWorkoutWithCategoryFromTrack$1$category$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super WorkoutCategory>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f48435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f48436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, Track track, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48435a = m0Var;
            this.f48436b = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48435a, this.f48436b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super WorkoutCategory> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WorkoutCategoryManager workoutCategoryManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            workoutCategoryManager = this.f48435a.f48368h;
            return workoutCategoryManager.getWorkoutCategory(this.f48436b.getCategory());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(m0 m0Var, Track track, qm0.d<? super p0> dVar) {
        super(2, dVar);
        this.f48433b = m0Var;
        this.f48434c = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p0(this.f48433b, this.f48434c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48432a;
        Track track = this.f48434c;
        nm0.y yVar = null;
        m0 m0Var = this.f48433b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(m0Var, track, null);
            this.f48432a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        WorkoutCategory workoutCategory = (WorkoutCategory) obj;
        if (workoutCategory != null) {
            m0.B0(m0Var, track, workoutCategory);
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            m0Var.m1(null);
        }
        return nm0.y.f85009a;
    }
}
