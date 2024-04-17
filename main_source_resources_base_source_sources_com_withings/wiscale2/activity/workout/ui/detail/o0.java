package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListGpsPointActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity$ListGpsPointViewModel$track$1", f = "ListGpsPointActivity.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX, ConstantsWs.MEASURE_TYPE_PAUSE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class o0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Track>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49504a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49505b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.a f49506c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListGpsPointActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity$ListGpsPointViewModel$track$1$track$1", f = "ListGpsPointActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListGpsPointActivity.a f49507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ListGpsPointActivity.a aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f49507a = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f49507a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WorkoutManager workoutManager;
            long j5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ListGpsPointActivity.a aVar = this.f49507a;
            workoutManager = aVar.f49048c;
            j5 = aVar.f49046a;
            return workoutManager.getWorkoutById(j5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ListGpsPointActivity.a aVar, qm0.d<? super o0> dVar) {
        super(2, dVar);
        this.f49506c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        o0 o0Var = new o0(this.f49506c, dVar);
        o0Var.f49505b = obj;
        return o0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Track> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((o0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49504a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f49505b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f49505b;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f49506c, null);
            this.f49505b = flowCollector;
            this.f49504a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Track track = (Track) obj;
        if (track != null) {
            this.f49505b = null;
            this.f49504a = 2;
            if (flowCollector.emit(track, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
