package com.withings.wiscale2.activity.workout.live.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
        LiveWorkoutActivity.a aVar = LiveWorkoutActivity.f48791z;
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(insets, "insets");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = insets.getSystemWindowInsetTop();
            marginLayoutParams.bottomMargin = insets.getSystemWindowInsetBottom();
            view.setLayoutParams(marginLayoutParams);
            return insets;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
