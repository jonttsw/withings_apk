package com.withings.vasistas.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import pm0.a;
/* compiled from: SpO2Vasistas.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0005"}, d2 = {"sortByQualityAndDateDesc", "", "Lcom/withings/vasistas/model/Vasistas;", "Lcom/withings/vasistas/model/SpO2Vasistas;", "toVasistas", "core-data-vasistas_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpO2VasistasKt {
    public static final List<Vasistas> sortByQualityAndDateDesc(List<SpO2Vasistas> list) {
        u.j(list, "<this>");
        List<SpO2Vasistas> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (SpO2Vasistas spO2Vasistas : list2) {
            arrayList.add(toVasistas(spO2Vasistas));
        }
        final Comparator comparator = new Comparator() { // from class: com.withings.vasistas.model.SpO2VasistasKt$sortByQualityAndDateDesc$$inlined$compareByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                Integer spo2Quality = ((Vasistas) t12).getSpo2Quality();
                Integer num = Integer.MIN_VALUE;
                if (spo2Quality == null) {
                    spo2Quality = num;
                }
                Integer spo2Quality2 = ((Vasistas) t11).getSpo2Quality();
                if (spo2Quality2 != null) {
                    num = spo2Quality2;
                }
                return a.b(spo2Quality, num);
            }
        };
        return x.D0(arrayList, new Comparator() { // from class: com.withings.vasistas.model.SpO2VasistasKt$sortByQualityAndDateDesc$$inlined$thenByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int compare = comparator.compare(t11, t12);
                if (compare == 0) {
                    return a.b(Long.valueOf(((Vasistas) t12).getStartDate().getMillis()), Long.valueOf(((Vasistas) t11).getStartDate().getMillis()));
                }
                return compare;
            }
        });
    }

    public static final Vasistas toVasistas(SpO2Vasistas spO2Vasistas) {
        u.j(spO2Vasistas, "<this>");
        Vasistas vasistas = new Vasistas(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
        vasistas.setStartDate(spO2Vasistas.getStartDate());
        vasistas.setDurationMillis((int) spO2Vasistas.getDurationMillis());
        vasistas.setId(Long.valueOf(spO2Vasistas.getId()));
        vasistas.setUserId(Long.valueOf(spO2Vasistas.getUserId()));
        vasistas.setSpo2(Integer.valueOf(spO2Vasistas.getSpo2()));
        vasistas.setDeviceId(spO2Vasistas.getDeviceId());
        vasistas.setSpo2Quality(Integer.valueOf(spO2Vasistas.getSpo2Quality()));
        vasistas.setDeviceModel(spO2Vasistas.getDeviceModel());
        vasistas.setSyncedToWs(spO2Vasistas.getSyncedToWs());
        return vasistas;
    }
}
