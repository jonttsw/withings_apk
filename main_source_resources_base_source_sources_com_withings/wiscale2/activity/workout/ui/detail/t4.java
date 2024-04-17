package com.withings.wiscale2.activity.workout.ui.detail;

import android.os.Parcelable;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.WorkoutData;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
final class t4 extends kotlin.jvm.internal.w implements ym0.l<Track, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jm.a f49654a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(jm.a aVar) {
        super(1);
        this.f49654a = aVar;
    }

    @Override // ym0.l
    public final String invoke(Track track) {
        Track track2 = track;
        if (track2 != null) {
            o4 o4Var = new o4(this.f49654a);
            Parcelable data = track2.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            return o4Var.a((WorkoutData) data);
        }
        return null;
    }
}
