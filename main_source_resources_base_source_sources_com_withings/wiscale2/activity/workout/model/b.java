package com.withings.wiscale2.activity.workout.model;

import android.view.View;
import android.widget.ProgressBar;
import com.withings.graph.GraphView;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.ui.map.WorkoutMapActivity;
import com.withings.wiscale2.activity.workout.ui.performance.PerformanceGraphLegendView;
import com.withings.wiscale2.track.data.Track;
import f80.i;
import kotlin.jvm.internal.u;
import tb0.z0;
import u70.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements h.a, i.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f48983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f48984b;

    public /* synthetic */ b(Object obj, boolean z5) {
        this.f48984b = obj;
        this.f48983a = z5;
    }

    @Override // f80.i.c
    public final void a() {
        int i11;
        int i12;
        int i13;
        z0 this_with = (z0) this.f48984b;
        WorkoutMapActivity.a aVar = WorkoutMapActivity.f49844s;
        u.j(this_with, "$this_with");
        ProgressBar workoutPerformanceLoading = this_with.f99671g;
        u.i(workoutPerformanceLoading, "workoutPerformanceLoading");
        boolean z5 = this.f48983a;
        int i14 = 8;
        if (!z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        workoutPerformanceLoading.setVisibility(i11);
        GraphView workoutPerformanceGraph = this_with.f99669e;
        u.i(workoutPerformanceGraph, "workoutPerformanceGraph");
        if (z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        workoutPerformanceGraph.setVisibility(i12);
        PerformanceGraphLegendView workoutPerformanceLegendView = this_with.f99670f;
        u.i(workoutPerformanceLegendView, "workoutPerformanceLegendView");
        if (z5) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        workoutPerformanceLegendView.setVisibility(i13);
        View workoutPerformanceDivider = this_with.f99668d;
        u.i(workoutPerformanceDivider, "workoutPerformanceDivider");
        if (z5) {
            i14 = 0;
        }
        workoutPerformanceDivider.setVisibility(i14);
    }

    @Override // u70.h.a
    public final void e(Object obj) {
        WorkoutManager.insertTrackAndNotify$lambda$4((Track) this.f48984b, this.f48983a, (WorkoutManager.Listener) obj);
    }
}
