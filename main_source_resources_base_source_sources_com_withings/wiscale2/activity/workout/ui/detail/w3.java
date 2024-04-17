package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.library.measure.MeasuresGroup;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class w3 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Track, List<Vasistas>>, LiveData<MeasuresGroup>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j3 f49767a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(j3 j3Var) {
        super(1);
        this.f49767a = j3Var;
    }

    @Override // ym0.l
    public final LiveData<MeasuresGroup> invoke(nm0.j<Track, List<Vasistas>> jVar) {
        nm0.j<Track, List<Vasistas>> jVar2 = jVar;
        kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new v3(this.f49767a, jVar2.a(), null), 2);
    }
}
