package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.track.data.Track;
/* compiled from: PostWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class e1 extends kotlin.jvm.internal.w implements ym0.l<Track, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PostWorkoutActivity f49170a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(PostWorkoutActivity postWorkoutActivity) {
        super(1);
        this.f49170a = postWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Track track) {
        if (track == null) {
            this.f49170a.finish();
        }
        return nm0.y.f85009a;
    }
}
