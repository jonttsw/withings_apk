package com.withings.wiscale2.activity.workout.goal.ui;

import java.util.Map;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutGoalActivity.kt */
@e(c = "com.withings.wiscale2.activity.workout.goal.ui.WorkoutGoalActivity$onGoalSaved$1", f = "WorkoutGoalActivity.kt", l = {218}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48725a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutGoalActivity f48726b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f48727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkoutGoalActivity workoutGoalActivity, int i11, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f48726b = workoutGoalActivity;
        this.f48727c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f48726b, this.f48727c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ma0.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48725a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            eVar = this.f48726b.f48713c;
            if (eVar != null) {
                Flow<String> f02 = eVar.f0();
                this.f48725a = 1;
                obj = FlowKt.last(f02, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u.s("viewModel");
                throw null;
            }
        }
        String categoryName = (String) obj;
        u.j(categoryName, "categoryName");
        Map j5 = s0.j(new j("value", 1), new j("category", categoryName), new j("goalValue", Integer.valueOf(this.f48727c)));
        dm.a aVar = dm.a.f63977a;
        x70.b.l(aVar, "workout_set_goal " + j5, new Object[0]);
        return y.f85009a;
    }
}
