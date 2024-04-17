package com.withings.ecg.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.l0;
import com.withings.wiscale2.activity.workout.model.WorkoutPauseLiveData;
import com.withings.wiscale2.track.data.Track;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LiveData f38706b;

    public /* synthetic */ r(LiveData liveData, int i11) {
        this.f38705a = i11;
        this.f38706b = liveData;
    }

    @Override // androidx.lifecycle.l0
    public final void onChanged(Object obj) {
        int i11 = this.f38705a;
        LiveData liveData = this.f38706b;
        switch (i11) {
            case 0:
                s.t((s) liveData, (String) obj);
                return;
            default:
                WorkoutPauseLiveData.t((WorkoutPauseLiveData) liveData, (Track) obj);
                return;
        }
    }
}
