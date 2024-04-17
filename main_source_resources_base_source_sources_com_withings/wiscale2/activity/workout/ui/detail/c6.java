package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.target.data.TargetRepository;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class c6 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Track, WorkoutCategory>, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TargetRepository f49149a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f49150b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WorkoutManager f49151c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f49152d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(TargetRepository targetRepository, long j5, WorkoutManager workoutManager, Context context) {
        super(1);
        this.f49149a = targetRepository;
        this.f49150b = j5;
        this.f49151c = workoutManager;
        this.f49152d = context;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(nm0.j<Track, WorkoutCategory> jVar) {
        nm0.j<Track, WorkoutCategory> jVar2 = jVar;
        kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
        Track a11 = jVar2.a();
        WorkoutCategory b10 = jVar2.b();
        if (b10.isGoalRelevant()) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new b6(a11, this.f49149a, this.f49150b, this.f49151c, this.f49152d, b10, null), 2);
        }
        return xw.d.a(null);
    }
}
