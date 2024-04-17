package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
public final class r5 extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutListActivity f49590a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r5(WorkoutListActivity workoutListActivity) {
        this.f49590a = workoutListActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        b4 b4Var;
        Period period = Period.f43720e;
        WorkoutListActivity workoutListActivity = this.f49590a;
        b4Var = workoutListActivity.f49078j;
        if (b4Var != null) {
            com.withings.wiscale2.device.hwa08.postinstall.b0.V(workoutListActivity, period, b4Var.getDate(i11));
        } else {
            kotlin.jvm.internal.u.s("pagerAdapter");
            throw null;
        }
    }
}
