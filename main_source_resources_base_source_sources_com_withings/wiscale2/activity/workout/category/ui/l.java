package com.withings.wiscale2.activity.workout.category.ui;

import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
/* loaded from: classes4.dex */
final class l extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseWorkoutCategoryActivity f48703a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f48704b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<wk.k<WorkoutCategory>> f48705c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity, int i11, List<wk.k<WorkoutCategory>> list) {
        super(2);
        this.f48703a = chooseWorkoutCategoryActivity;
        this.f48704b = i11;
        this.f48705c = list;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity = this.f48703a;
            j jVar = new j(chooseWorkoutCategoryActivity);
            wk.m.a(this.f48704b, this.f48705c, new k(chooseWorkoutCategoryActivity), jVar, aVar2, 64, 0);
        }
        return y.f85009a;
    }
}
