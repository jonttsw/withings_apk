package com.withings.wiscale2.activity.workout.model;

import android.os.Parcelable;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.SwimWorkoutData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: PoolSizeSelector.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/PoolSizeSelector;", "", "workoutManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;)V", "getWorkoutManager", "()Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "select", "", NavigationArguments.USER_ID, "", "endDate", "Lorg/joda/time/DateTime;", "(JLorg/joda/time/DateTime;)Ljava/lang/Integer;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PoolSizeSelector {
    public static final int $stable = 8;
    private final WorkoutManager workoutManager;

    public PoolSizeSelector(WorkoutManager workoutManager) {
        u.j(workoutManager, "workoutManager");
        this.workoutManager = workoutManager;
    }

    public final WorkoutManager getWorkoutManager() {
        return this.workoutManager;
    }

    public final Integer select(long j5, DateTime endDate) {
        u.j(endDate, "endDate");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.workoutManager.getAllForCategoryBefore(j5, 7L, endDate).iterator();
        while (true) {
            SwimWorkoutData swimWorkoutData = null;
            if (!it.hasNext()) {
                break;
            }
            Parcelable data = ((Track) it.next()).getData();
            if (data instanceof SwimWorkoutData) {
                swimWorkoutData = (SwimWorkoutData) data;
            }
            if (swimWorkoutData != null) {
                arrayList.add(swimWorkoutData);
            }
        }
        SwimWorkoutData swimWorkoutData2 = (SwimWorkoutData) x.U(arrayList);
        if (swimWorkoutData2 == null) {
            return null;
        }
        return swimWorkoutData2.getPoolLength();
    }
}
