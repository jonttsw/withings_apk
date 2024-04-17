package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.location.model.GpsLocation;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
final class n3 extends kotlin.jvm.internal.w implements ym0.l<nm0.o<Track, WorkoutCategory, List<GpsLocation>>, LiveData<ab0.i>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j3 f49475a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f49476b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(j3 j3Var, List<Vasistas> list) {
        super(1);
        this.f49475a = j3Var;
        this.f49476b = list;
    }

    @Override // ym0.l
    public final LiveData<ab0.i> invoke(nm0.o<Track, WorkoutCategory, List<GpsLocation>> oVar) {
        nm0.o<Track, WorkoutCategory, List<GpsLocation>> oVar2 = oVar;
        kotlin.jvm.internal.u.j(oVar2, "<name for destructuring parameter 0>");
        List<GpsLocation> c11 = oVar2.c();
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new m3(this.f49475a, oVar2.a(), oVar2.b(), c11, this.f49476b, null), 2);
    }
}
