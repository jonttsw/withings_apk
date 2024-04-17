package com.withings.wiscale2.activity.workout.model;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.List;
import k1.w0;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import lj0.h0;
import org.joda.time.DateTime;
/* compiled from: WorkoutVasistasRangeCalculator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutVasistasRangeCalculator;", "", "", "Lcom/withings/vasistas/model/Vasistas;", "vasistasList", "removeEmptyVasistas", "(Ljava/util/List;)Ljava/util/List;", "Lorg/joda/time/DateTime;", "toDate", "", NavigationArguments.USER_ID, "Lcom/withings/vasistas/model/Vasistas$Category;", "vasistasCategory", "getFirstHoleAfterEndDate", "(Lorg/joda/time/DateTime;JLcom/withings/vasistas/model/Vasistas$Category;)Lorg/joda/time/DateTime;", "fromDate", "getFirstHoleBeforeStartDate", "Llj0/h0;", "vasistasManager", "Llj0/h0;", "getVasistasManager", "()Llj0/h0;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "getWorkoutManager", "()Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "<init>", "(Llj0/h0;Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;)V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutVasistasRangeCalculator {
    private static final long MIN_HOLE_DURATION_MILLIS = 300000;
    private final h0 vasistasManager;
    private final WorkoutManager workoutManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WorkoutVasistasRangeCalculator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutVasistasRangeCalculator$Companion;", "", "()V", "MIN_HOLE_DURATION_MILLIS", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public WorkoutVasistasRangeCalculator(h0 vasistasManager, WorkoutManager workoutManager) {
        u.j(vasistasManager, "vasistasManager");
        u.j(workoutManager, "workoutManager");
        this.vasistasManager = vasistasManager;
        this.workoutManager = workoutManager;
    }

    private final List<Vasistas> removeEmptyVasistas(List<Vasistas> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Vasistas vasistas = (Vasistas) obj;
            if (vasistas.getType() != Vasistas.VasistasType.EMPTY || vasistas.getCategory() == Vasistas.Category.PAUSE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final DateTime getFirstHoleAfterEndDate(DateTime toDate, long j5, Vasistas.Category vasistasCategory) {
        u.j(toDate, "toDate");
        u.j(vasistasCategory, "vasistasCategory");
        List<Vasistas> o11 = this.vasistasManager.o(j5, vasistasCategory, toDate, toDate.plusHours(24));
        if (o11.isEmpty()) {
            return toDate;
        }
        List<Vasistas> removeEmptyVasistas = removeEmptyVasistas(o11);
        DateTime end = ((Vasistas) w0.a(removeEmptyVasistas, 1)).getEnd();
        int size = removeEmptyVasistas.size() - 1;
        int i11 = 0;
        while (i11 < size) {
            Vasistas vasistas = removeEmptyVasistas.get(i11);
            i11++;
            if (removeEmptyVasistas.get(i11).getStartDate().getMillis() - vasistas.getEnd().getMillis() >= MIN_HOLE_DURATION_MILLIS) {
                return vasistas.getEnd();
            }
        }
        return end;
    }

    public final DateTime getFirstHoleBeforeStartDate(DateTime fromDate, long j5, Vasistas.Category vasistasCategory) {
        u.j(fromDate, "fromDate");
        u.j(vasistasCategory, "vasistasCategory");
        List<Vasistas> o11 = this.vasistasManager.o(j5, vasistasCategory, fromDate.minusHours(24), fromDate);
        if (o11.isEmpty()) {
            return fromDate;
        }
        List<Vasistas> removeEmptyVasistas = removeEmptyVasistas(o11);
        int i11 = 0;
        DateTime startDate = removeEmptyVasistas.get(0).getStartDate();
        List u02 = x.u0(removeEmptyVasistas);
        int size = u02.size() - 1;
        while (i11 < size) {
            Vasistas vasistas = (Vasistas) u02.get(i11);
            i11++;
            if (vasistas.getStartDate().getMillis() - ((Vasistas) u02.get(i11)).getEnd().getMillis() >= MIN_HOLE_DURATION_MILLIS) {
                return vasistas.getStartDate();
            }
        }
        return startDate;
    }

    public final h0 getVasistasManager() {
        return this.vasistasManager;
    }

    public final WorkoutManager getWorkoutManager() {
        return this.workoutManager;
    }
}
