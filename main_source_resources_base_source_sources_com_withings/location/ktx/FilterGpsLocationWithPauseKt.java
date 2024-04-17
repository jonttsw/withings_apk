package com.withings.location.ktx;

import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FilterGpsLocationWithPause.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¨\u0006\u0007"}, d2 = {"filter", "", "Lcom/withings/location/model/GpsLocation;", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "locations", "pauses", "Lcom/withings/location/model/Pause;", "core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FilterGpsLocationWithPauseKt {
    public static final List<GpsLocation> filter(FilterGpsLocationWithPause filterGpsLocationWithPause, List<GpsLocation> locations, List<Pause> pauses) {
        u.j(filterGpsLocationWithPause, "<this>");
        u.j(locations, "locations");
        u.j(pauses, "pauses");
        return filterGpsLocationWithPause.partition(locations, pauses).c();
    }
}
