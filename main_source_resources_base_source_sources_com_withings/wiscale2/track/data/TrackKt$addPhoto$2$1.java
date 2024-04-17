package com.withings.wiscale2.track.data;

import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Track.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TrackKt$addPhoto$2$1 extends w implements a<y> {
    final /* synthetic */ Track $this_addPhoto;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackKt$addPhoto$2$1(Track track) {
        super(0);
        this.$this_addPhoto = track;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WorkoutSaver.save(this.$this_addPhoto);
    }
}
