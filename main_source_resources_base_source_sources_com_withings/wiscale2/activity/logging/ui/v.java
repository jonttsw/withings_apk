package com.withings.wiscale2.activity.logging.ui;

import android.os.Parcelable;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.WorkoutData;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<Track, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48461a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48461a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Track track) {
        String string;
        Track track2 = track;
        kotlin.jvm.internal.u.g(track2);
        Parcelable data = track2.getData();
        kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
        WorkoutData workoutData = (WorkoutData) data;
        EditWorkoutActivity editWorkoutActivity = this.f48461a;
        EditWorkoutActivity.g4(editWorkoutActivity).setProgress(workoutData.getIntensity());
        LineCellView Z3 = EditWorkoutActivity.Z3(editWorkoutActivity);
        float intensity = workoutData.getIntensity();
        if (intensity < 20.0f) {
            string = editWorkoutActivity.getString(C1987R.string._VERY_LOW_INTENSITY_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
        } else if (intensity < 40.0f) {
            string = editWorkoutActivity.getString(C1987R.string._LOW_INTENSITY_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
        } else if (intensity < 60.0f) {
            string = editWorkoutActivity.getString(C1987R.string._MEDIUM_INTENSITY_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
        } else if (intensity < 80.0f) {
            string = editWorkoutActivity.getString(C1987R.string._HIGH_INTENSITY_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
        } else {
            string = editWorkoutActivity.getString(C1987R.string._VERY_HIGH_INTENSITY_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
        }
        Z3.setValue(string);
        return nm0.y.f85009a;
    }
}
