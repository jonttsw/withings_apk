package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class e6 extends kotlin.jvm.internal.w implements ym0.l<nm0.o<Track, WorkoutCategory, List<GpsLocation>>, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HasEnoughGpsLocations f49177a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LiveData<Boolean> f49178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f49179c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(HasEnoughGpsLocations hasEnoughGpsLocations, androidx.lifecycle.j0 j0Var, Context context) {
        super(1);
        this.f49177a = hasEnoughGpsLocations;
        this.f49178b = j0Var;
        this.f49179c = context;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(nm0.o<Track, WorkoutCategory, List<GpsLocation>> oVar) {
        nm0.o<Track, WorkoutCategory, List<GpsLocation>> oVar2 = oVar;
        kotlin.jvm.internal.u.j(oVar2, "<name for destructuring parameter 0>");
        Track a11 = oVar2.a();
        DateTime startDate = a11.getStartDate();
        DateTime endDate = a11.getEndDate();
        boolean forPerformance = this.f49177a.forPerformance(oVar2.c(), startDate, endDate);
        if (oVar2.b().isGpsRelevant() && !forPerformance) {
            return androidx.lifecycle.e1.b(this.f49178b, new d6(this.f49179c));
        }
        return xw.d.a(null);
    }
}
