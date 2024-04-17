package com.withings.location.domain.uc;

import com.withings.location.ktx.GpsLocationKt;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import om0.b;
import org.joda.time.ReadableInstant;
/* compiled from: FilterGpsLocationWithPause.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJA\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "", "", "Lcom/withings/location/model/GpsLocation;", "locations", "Lcom/withings/location/model/Pause;", "pauses", "Lnm0/j;", "partition", "(Ljava/util/List;Ljava/util/List;)Lnm0/j;", "filterByWindow", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FilterGpsLocationWithPause {
    public final List<List<GpsLocation>> filterByWindow(List<GpsLocation> locations, List<Pause> pauses) {
        u.j(locations, "locations");
        u.j(pauses, "pauses");
        if (!pauses.isEmpty()) {
            b bVar = new b();
            List<GpsLocation> list = locations;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((GpsLocation) obj).getDate().compareTo((ReadableInstant) ((Pause) x.I(pauses)).getStart()) < 0) {
                    arrayList.add(obj);
                }
            }
            bVar.add(arrayList);
            for (j jVar : x.Y0(pauses)) {
                Pause pause = (Pause) jVar.a();
                Pause pause2 = (Pause) jVar.b();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (GpsLocationKt.isBetweenPauses((GpsLocation) obj2, pause, pause2)) {
                        arrayList2.add(obj2);
                    }
                }
                bVar.add(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (((GpsLocation) obj3).getDate().compareTo((ReadableInstant) ((Pause) x.T(pauses)).getEnd()) > 0) {
                    arrayList3.add(obj3);
                }
            }
            bVar.add(arrayList3);
            return bVar.t();
        }
        return x.V(locations);
    }

    public final j<List<GpsLocation>, List<GpsLocation>> partition(List<GpsLocation> locations, List<Pause> pauses) {
        u.j(locations, "locations");
        u.j(pauses, "pauses");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : locations) {
            GpsLocation gpsLocation = (GpsLocation) obj;
            List<Pause> list = pauses;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Pause pause : list) {
                    if (GpsLocationKt.isInPause(gpsLocation, pause)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        return new j<>(arrayList, arrayList2);
    }
}
