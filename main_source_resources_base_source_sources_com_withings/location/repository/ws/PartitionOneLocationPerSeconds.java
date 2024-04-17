package com.withings.location.repository.ws;

import com.google.android.gms.internal.mlkit_common.a;
import com.withings.location.model.GpsLocation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: PartitionOneLocationPerSeconds.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withings/location/repository/ws/PartitionOneLocationPerSeconds;", "", "", "Lcom/withings/location/model/GpsLocation;", "gpsLocations", "Lnm0/j;", "invoke", "(Ljava/util/List;)Lnm0/j;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PartitionOneLocationPerSeconds {
    public final j<List<GpsLocation>, List<GpsLocation>> invoke(List<GpsLocation> gpsLocations) {
        u.j(gpsLocations, "gpsLocations");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : gpsLocations) {
            Integer valueOf = Integer.valueOf((int) (((GpsLocation) obj).getDate().getMillis() / 1000));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = a.d(linkedHashMap, valueOf);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add((GpsLocation) x.I((List) entry.getValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            x.n(x.C((Iterable) entry2.getValue()), arrayList2);
        }
        return new j<>(arrayList, arrayList2);
    }
}
