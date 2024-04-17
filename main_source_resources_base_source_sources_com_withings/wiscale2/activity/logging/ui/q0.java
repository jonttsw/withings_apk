package com.withings.wiscale2.activity.logging.ui;

import androidx.lifecycle.h1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EditWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$saveOrUpdateWorkout$1", f = "EditWorkoutViewModel.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class q0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m0 f48441b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$saveOrUpdateWorkout$1$1", f = "EditWorkoutViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_INTRACELLULAR_WATER}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.j<? extends Boolean, ? extends Track>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m0 f48443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48443b = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48443b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.j<? extends Boolean, ? extends Track>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48442a;
            m0 m0Var = this.f48443b;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f48442a = 1;
                obj = m0.f0(m0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Track track = (Track) obj;
            return new nm0.j(Boolean.valueOf(m0Var.f48367g.hasWorkoutOverlapping(m0Var.f48361a.q(), track)), track);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(m0 m0Var, qm0.d<? super q0> dVar) {
        super(2, dVar);
        this.f48441b = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q0(this.f48441b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48440a;
        m0 m0Var = this.f48441b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(m0Var, null);
            this.f48440a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        nm0.j jVar = (nm0.j) obj;
        boolean booleanValue = ((Boolean) jVar.a()).booleanValue();
        Track workout = (Track) jVar.b();
        if (booleanValue) {
            m0Var.Z0().setValue(workout);
        } else {
            m0Var.getClass();
            kotlin.jvm.internal.u.j(workout, "workout");
            BuildersKt__Builders_commonKt.launch$default(h1.a(m0Var), null, null, new r0(m0Var, workout, null), 3, null);
        }
        return nm0.y.f85009a;
    }
}
