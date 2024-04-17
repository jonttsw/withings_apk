package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class x4 extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<List<com.withings.common.compose.component.u1>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f49815a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Context context) {
        super(1);
        this.f49815a = context;
    }

    @Override // ym0.l
    public final LiveData<List<com.withings.common.compose.component.u1>> invoke(Track track) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new w4(track, this.f49815a, null), 2);
    }
}
