package com.withings.wiscale2.activity.logging.ui;

import com.withings.user.User;
import com.withings.wiscale2.activity.workout.category.ui.ChooseWorkoutCategoryActivity;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends nm0.y>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48346a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48346a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends nm0.y> cVar) {
        xw.c<? extends nm0.y> cVar2 = cVar;
        if (cVar2 != null && cVar2.a() != null) {
            ChooseWorkoutCategoryActivity.a aVar = ChooseWorkoutCategoryActivity.f48655i;
            EditWorkoutActivity editWorkoutActivity = this.f48346a;
            User m42 = EditWorkoutActivity.m4(editWorkoutActivity);
            boolean k42 = EditWorkoutActivity.k4(editWorkoutActivity);
            aVar.getClass();
            editWorkoutActivity.startActivityForResult(ChooseWorkoutCategoryActivity.a.a(editWorkoutActivity, m42, k42, null), 1);
        }
        return nm0.y.f85009a;
    }
}
