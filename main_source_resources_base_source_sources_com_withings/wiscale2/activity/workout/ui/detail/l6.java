package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.track.data.Track;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class l6 extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<MeasuresGroup> f49413a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f49414b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f49415c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(LiveData<MeasuresGroup> liveData, Track track, Context context) {
        super(1);
        this.f49413a = liveData;
        this.f49414b = track;
        this.f49415c = context;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(Boolean bool) {
        return androidx.lifecycle.e1.b(this.f49413a, new k6(this.f49414b, bool.booleanValue(), this.f49415c));
    }
}
