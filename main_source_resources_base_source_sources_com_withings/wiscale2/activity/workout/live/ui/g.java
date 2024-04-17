package com.withings.wiscale2.activity.workout.live.ui;

import androidx.activity.result.ActivityResult;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import com.withings.wiscale2.heart.HeartHistoryActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f48886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WithingsActivity f48887b;

    public /* synthetic */ g(WithingsActivity withingsActivity, int i11) {
        this.f48886a = i11;
        this.f48887b = withingsActivity;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f48886a;
        WithingsActivity withingsActivity = this.f48887b;
        switch (i11) {
            case 0:
                LiveWorkoutActivity.A3((LiveWorkoutActivity) withingsActivity, (ActivityResult) obj);
                return;
            case 1:
                Wpa02LaunchMeasurementActivity.z3((Wpa02LaunchMeasurementActivity) withingsActivity, (ActivityResult) obj);
                return;
            default:
                HeartHistoryActivity.z3((HeartHistoryActivity) withingsActivity, (ActivityResult) obj);
                return;
        }
    }
}
