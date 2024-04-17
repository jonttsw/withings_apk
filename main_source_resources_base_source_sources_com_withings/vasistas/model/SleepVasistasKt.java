package com.withings.vasistas.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: SleepVasistas.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0006"}, d2 = {"getAwakeCount", "", "", "Lcom/withings/vasistas/model/Vasistas;", "getOutOfBedCount", "getWakeUpCount", "core-data-vasistas_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SleepVasistasKt {
    private static final int getAwakeCount(List<Vasistas> list) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                Vasistas vasistas = (Vasistas) obj;
                if (i11 > 0 && i11 < list.size() - 1 && VasistasKt.isAwakeVasistas(vasistas) && !VasistasKt.isAwakeVasistas(list.get(i11 - 1))) {
                    arrayList.add(obj);
                }
                i11 = i12;
            } else {
                x.K0();
                throw null;
            }
        }
        return arrayList.size();
    }

    private static final int getOutOfBedCount(List<Vasistas> list) {
        long j5;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                Vasistas vasistas = (Vasistas) obj;
                Vasistas vasistas2 = (Vasistas) x.N(i11 - 1, list);
                if (vasistas2 != null) {
                    j5 = vasistas.getStartDate().getMillis() - vasistas2.getEnd().getMillis();
                } else {
                    j5 = 0;
                }
                if (j5 > 0 && !VasistasKt.isAwakeVasistas(vasistas) && vasistas2 != null && !VasistasKt.isAwakeVasistas(vasistas2)) {
                    arrayList.add(obj);
                }
                i11 = i12;
            } else {
                x.K0();
                throw null;
            }
        }
        return arrayList.size();
    }

    public static final int getWakeUpCount(List<Vasistas> list) {
        u.j(list, "<this>");
        return getAwakeCount(list) + getOutOfBedCount(list);
    }
}
