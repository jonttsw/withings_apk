package com.withings.wiscale2.activity.workout.category.ui;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.category.ui.ChooseWorkoutCategoryActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
/* loaded from: classes4.dex */
final class i extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseWorkoutCategoryActivity f48701a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity) {
        super(1);
        this.f48701a = chooseWorkoutCategoryActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        bool.booleanValue();
        ChooseWorkoutCategoryActivity.a aVar = ChooseWorkoutCategoryActivity.f48655i;
        ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity = this.f48701a;
        chooseWorkoutCategoryActivity.getClass();
        Toast.makeText(chooseWorkoutCategoryActivity, (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 0).show();
        chooseWorkoutCategoryActivity.finish();
        return y.f85009a;
    }
}
