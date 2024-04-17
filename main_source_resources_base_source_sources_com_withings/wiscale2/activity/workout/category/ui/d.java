package com.withings.wiscale2.activity.workout.category.ui;

import com.withings.comm.wpp.generated.object.PauseState;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.category.ui.ChooseCategoryViewModel$onLiveWorkout$1", f = "ChooseWorkoutCategoryActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f48692a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f48693b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WorkoutCategory workoutCategory, b bVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f48692a = workoutCategory;
        this.f48693b = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f48692a, this.f48693b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ax.h hVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        LiveWorkout liveWorkout = new LiveWorkout((int) this.f48692a.getId(), DateTime.now().getMillis(), null, true, LiveWorkout.PHONE_MAC_ADDRESS, 1053, null, new PauseState(), null, ConstantsWs.WS_STATUS_WRONGLASTUSEDDATE, null);
        hVar = this.f48693b.f48675c;
        hVar.k(liveWorkout);
        return y.f85009a;
    }
}
