package com.withings.wiscale2.activity.workout.category.ui;

import androidx.lifecycle.h0;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.category.ui.ChooseCategoryViewModel$errorSyncWorkoutCategory$1$1", f = "ChooseWorkoutCategoryActivity.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<Boolean>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48689a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f48690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<WorkoutCategory> f48691c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<WorkoutCategory> list, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f48691c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        c cVar = new c(this.f48691c, dVar);
        cVar.f48690b = obj;
        return cVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<Boolean> h0Var, qm0.d<? super y> dVar) {
        return ((c) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48689a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            h0 h0Var = (h0) this.f48690b;
            if (this.f48691c.isEmpty()) {
                Boolean bool = Boolean.TRUE;
                this.f48689a = 1;
                if (h0Var.emit(bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return y.f85009a;
    }
}
