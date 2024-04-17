package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public final class k4 extends kotlin.jvm.internal.w implements ym0.q<Track, WorkoutCategory, List<? extends GpsLocation>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j4 f49365a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(j4 j4Var) {
        super(3);
        this.f49365a = j4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.withings.workout.ui.GpsLocationMapView$b] */
    @Override // ym0.q
    public final nm0.y invoke(Track track, WorkoutCategory workoutCategory, List<? extends GpsLocation> list) {
        HasEnoughGpsLocations hasEnoughGpsLocations;
        Context context;
        c4 xVar;
        Context context2;
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        Track workout = track;
        WorkoutCategory category = workoutCategory;
        List<? extends GpsLocation> locations = list;
        kotlin.jvm.internal.u.j(workout, "workout");
        kotlin.jvm.internal.u.j(category, "category");
        kotlin.jvm.internal.u.j(locations, "locations");
        Object a11 = ah.c0.a(workout);
        j4 j4Var = this.f49365a;
        hasEnoughGpsLocations = j4Var.f49334e;
        boolean forMap = hasEnoughGpsLocations.forMap(locations);
        context = j4Var.f49330a;
        String name = category.getName(context);
        GpsSummary gpsSummary = workout.getGpsSummary();
        if (a11 != null && forMap) {
            j0Var2 = j4Var.f49335f;
            kotlin.jvm.internal.u.g(name);
            xVar = new c0(a11, (String) j0Var2.getValue(), locations, gpsSummary, name);
        } else if (a11 == null && forMap && mm.a.f82252a.c()) {
            j0Var = j4Var.f49335f;
            kotlin.jvm.internal.u.g(name);
            xVar = new v0((String) j0Var.getValue(), locations, gpsSummary, name, new Object());
        } else if (a11 == null && forMap) {
            context2 = j4Var.f49330a;
            na0.f fVar = new na0.f(context2);
            fVar.i(locations);
            fVar.j(androidx.core.content.a.getColor(context2, C1987R.color.datavizMonochromaticNeutral2));
            fVar.e(androidx.core.content.a.getColor(context2, C1987R.color.statusGood));
            fVar.h(androidx.core.content.a.getColor(context2, C1987R.color.statusInfo));
            fVar.f();
            String a12 = fVar.a();
            kotlin.jvm.internal.u.g(name);
            xVar = new o1(a12, name);
        } else if (a11 != null && !forMap) {
            kotlin.jvm.internal.u.g(name);
            xVar = new d0(a11, name);
        } else {
            int glyphRes = category.getGlyphRes();
            kotlin.jvm.internal.u.g(name);
            xVar = new x(glyphRes, name);
        }
        j4Var.setValue(xVar);
        return nm0.y.f85009a;
    }
}
