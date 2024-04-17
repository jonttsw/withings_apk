package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.track.data.Track;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class m6 extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<Boolean> f49453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LiveData<MeasuresGroup> f49454b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f49455c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(androidx.lifecycle.j0 j0Var, androidx.lifecycle.j0 j0Var2, Context context) {
        super(1);
        this.f49453a = j0Var;
        this.f49454b = j0Var2;
        this.f49455c = context;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(Track track) {
        return androidx.lifecycle.e1.c(this.f49453a, new l6(this.f49454b, track, this.f49455c));
    }
}
