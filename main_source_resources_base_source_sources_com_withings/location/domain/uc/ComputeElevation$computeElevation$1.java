package com.withings.location.domain.uc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.location.model.GpsLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import ym0.p;
/* compiled from: ComputeElevation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", FirebaseAnalytics.Param.INDEX, "Lcom/withings/location/model/GpsLocation;", "location", "Lnm0/j;", "invoke", "(ILcom/withings/location/model/GpsLocation;)Lnm0/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class ComputeElevation$computeElevation$1 extends w implements p<Integer, GpsLocation, j<? extends GpsLocation, ? extends GpsLocation>> {
    final /* synthetic */ List<GpsLocation> $locations;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComputeElevation$computeElevation$1(List<GpsLocation> list) {
        super(2);
        this.$locations = list;
    }

    public final j<GpsLocation, GpsLocation> invoke(int i11, GpsLocation location) {
        u.j(location, "location");
        if (i11 > 0) {
            return new j<>(this.$locations.get(i11 - 1), location);
        }
        return null;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ j<? extends GpsLocation, ? extends GpsLocation> invoke(Integer num, GpsLocation gpsLocation) {
        return invoke(num.intValue(), gpsLocation);
    }
}
