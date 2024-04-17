package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.ktx.FilterGpsLocationWithPauseKt;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<Vasistas>, List<GpsLocation>>, LiveData<ListGpsPointActivity.b>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.a f49354a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ListGpsPointActivity.a aVar) {
        super(1);
        this.f49354a = aVar;
    }

    @Override // ym0.l
    public final LiveData<ListGpsPointActivity.b> invoke(nm0.j<List<Vasistas>, List<GpsLocation>> jVar) {
        FilterGpsLocationWithPause filterGpsLocationWithPause;
        nm0.j<List<Vasistas>, List<GpsLocation>> jVar2 = jVar;
        List<Vasistas> a11 = jVar2.a();
        List<GpsLocation> b10 = jVar2.b();
        kotlin.jvm.internal.u.g(a11);
        List<Vasistas> list = a11;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (Vasistas vasistas : list) {
            arrayList.add(new Pause(vasistas.getStartDate(), vasistas.getEnd()));
        }
        filterGpsLocationWithPause = this.f49354a.f49047b;
        return xw.d.a(new ListGpsPointActivity.b(FilterGpsLocationWithPauseKt.filter(filterGpsLocationWithPause, b10, arrayList), b10));
    }
}
