package com.withings.wiscale2.activity.workout.model;

import com.withings.vasistas.model.SwimVasistas;
import com.withings.vasistas.model.SwimVasistasKt;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.model.VasistasKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: WorkoutVasistasFilter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutVasistasFilter;", "", "()V", "filterSwimVasistasOverlappingPauses", "", "Lcom/withings/vasistas/model/SwimVasistas;", "swimVasistas", "pauses", "Lcom/withings/vasistas/model/Vasistas;", "filterVasistasOverlappingPauses", "vasistasList", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WorkoutVasistasFilter {
    public static final int $stable = 0;
    public static final WorkoutVasistasFilter INSTANCE = new WorkoutVasistasFilter();

    private WorkoutVasistasFilter() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List filterVasistasOverlappingPauses$default(WorkoutVasistasFilter workoutVasistasFilter, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = i0.f76187a;
        }
        return workoutVasistasFilter.filterVasistasOverlappingPauses(list, list2);
    }

    public final List<SwimVasistas> filterSwimVasistasOverlappingPauses(List<SwimVasistas> swimVasistas, List<Vasistas> pauses) {
        u.j(swimVasistas, "swimVasistas");
        u.j(pauses, "pauses");
        List<SwimVasistas> list = swimVasistas;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (SwimVasistas swimVasistas2 : list) {
            arrayList.add(SwimVasistasKt.toVasistas(swimVasistas2));
        }
        List<Vasistas> filterVasistasOverlappingPauses = filterVasistasOverlappingPauses(arrayList, pauses);
        ArrayList arrayList2 = new ArrayList(x.y(filterVasistasOverlappingPauses, 10));
        for (Vasistas vasistas : filterVasistasOverlappingPauses) {
            arrayList2.add(androidx.compose.foundation.lazy.layout.d.m(vasistas));
        }
        return arrayList2;
    }

    public final List<Vasistas> filterVasistasOverlappingPauses(List<Vasistas> list, List<Vasistas> pauses) {
        Object obj;
        u.j(pauses, "pauses");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Vasistas vasistas = (Vasistas) obj2;
                Iterator<T> it = pauses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (VasistasKt.isOverlapping(vasistas, (Vasistas) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return i0.f76187a;
    }
}
