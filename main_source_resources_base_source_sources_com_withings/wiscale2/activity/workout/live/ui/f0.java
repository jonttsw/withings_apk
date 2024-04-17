package com.withings.wiscale2.activity.workout.live.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
/* compiled from: LiveWorkoutEmptyFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/f0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class f0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private ImageView f48883c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f48884d;

    /* renamed from: e  reason: collision with root package name */
    private LiveWorkoutChronometer f48885e;

    public static final void s1(f0 f0Var, WorkoutCategory workoutCategory) {
        ImageView imageView = f0Var.f48883c;
        if (imageView != null) {
            imageView.setImageResource(workoutCategory.getGlyphRes());
            TextView textView = f0Var.f48884d;
            if (textView != null) {
                textView.setText(workoutCategory.getName(textView.getContext()));
                return;
            } else {
                kotlin.jvm.internal.u.s("categoryTextView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("categoryIcon");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_workout_live_empty, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LiveWorkoutChronometer liveWorkoutChronometer = this.f48885e;
        if (liveWorkoutChronometer != null) {
            liveWorkoutChronometer.b();
            super.onDestroyView();
            return;
        }
        kotlin.jvm.internal.u.s("liveChronometer");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.category_icon);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f48883c = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.category_name);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f48884d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.duration);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f48885e = new LiveWorkoutChronometer((Chronometer) findViewById3);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            z0 z0Var = (z0) new k1(activity).a(z0.class);
            xw.d.c(this, z0Var.n1(), new e0(this));
            LiveWorkoutChronometer liveWorkoutChronometer = this.f48885e;
            if (liveWorkoutChronometer != null) {
                liveWorkoutChronometer.e(z0Var.c1());
            } else {
                kotlin.jvm.internal.u.s("liveChronometer");
                throw null;
            }
        }
    }
}
