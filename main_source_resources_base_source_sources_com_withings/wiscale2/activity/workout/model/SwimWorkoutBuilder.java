package com.withings.wiscale2.activity.workout.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.model.Vasistas;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.SwimWorkoutData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import ym0.p;
/* compiled from: SwimWorkoutBuilder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\nJE\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/SwimWorkoutBuilder;", "", "", "Lcom/withings/vasistas/model/Vasistas;", "vasistasList", "Lcom/withings/wiscale2/track/data/Track;", "buildWorkout", "(Ljava/util/List;)Lcom/withings/wiscale2/track/data/Track;", "", "getDeviceModel", "(Ljava/util/List;)I", "Lcom/withings/workout/workoutdata/SwimWorkoutData;", "buildData", "(Ljava/util/List;)Lcom/withings/workout/workoutdata/SwimWorkoutData;", "getSwimType", "E", "", "Lkotlin/Function2;", "", "predicate", "groupWithPreviousBy", "(Ljava/util/Collection;Lym0/p;)Ljava/util/List;", "build", "(Ljava/util/List;)Ljava/util/List;", "", NavigationArguments.USER_ID, "J", "Lcom/withings/wiscale2/activity/workout/model/SwimWorkoutBuilder$TimeZoneProvider;", "timeZoneProvider", "Lcom/withings/wiscale2/activity/workout/model/SwimWorkoutBuilder$TimeZoneProvider;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "<init>", "(JLcom/withings/wiscale2/activity/workout/model/SwimWorkoutBuilder$TimeZoneProvider;Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;)V", "TimeZoneProvider", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SwimWorkoutBuilder {
    public static final int $stable = 8;
    private final TimeZoneProvider timeZoneProvider;
    private final long userId;
    private final WorkoutManager workoutManager;

    /* compiled from: SwimWorkoutBuilder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/SwimWorkoutBuilder$TimeZoneProvider;", "", "getTimezoneForUserAtDate", "Lorg/joda/time/DateTimeZone;", "builder", "Lcom/withings/wiscale2/activity/workout/model/SwimWorkoutBuilder;", NavigationArguments.USER_ID, "", "dateTime", "Lorg/joda/time/DateTime;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface TimeZoneProvider {
        DateTimeZone getTimezoneForUserAtDate(SwimWorkoutBuilder swimWorkoutBuilder, long j5, DateTime dateTime);
    }

    public SwimWorkoutBuilder(long j5, TimeZoneProvider timeZoneProvider, WorkoutManager workoutManager) {
        u.j(timeZoneProvider, "timeZoneProvider");
        u.j(workoutManager, "workoutManager");
        this.userId = j5;
        this.timeZoneProvider = timeZoneProvider;
        this.workoutManager = workoutManager;
    }

    private final SwimWorkoutData buildData(List<Vasistas> list) {
        Integer num;
        float calories;
        SwimWorkoutData swimWorkoutData = new SwimWorkoutData();
        List<Vasistas> list2 = list;
        int i11 = 0;
        int i12 = 0;
        for (Vasistas vasistas : list2) {
            i12 += vasistas.getSwimLaps();
        }
        swimWorkoutData.setLaps(i12);
        for (Vasistas vasistas2 : list2) {
            i11 += vasistas2.getSwimMovements();
        }
        swimWorkoutData.setMovements(i11);
        Iterator<T> it = list2.iterator();
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        while (true) {
            num = null;
            Float f11 = null;
            if (!it.hasNext()) {
                break;
            }
            Vasistas vasistas3 = (Vasistas) it.next();
            Float valueOf = Float.valueOf(vasistas3.getEarnedCalories());
            if (valueOf.floatValue() > 0.0f) {
                f11 = valueOf;
            }
            if (f11 != null) {
                calories = f11.floatValue();
            } else {
                calories = vasistas3.getCalories();
            }
            d11 += calories;
        }
        swimWorkoutData.setCalories((int) d11);
        swimWorkoutData.setSwimType(getSwimType(list));
        swimWorkoutData.setPoolLength(new PoolSizeSelector(this.workoutManager).select(this.userId, ((Vasistas) x.T(list)).getEnd()));
        Vasistas vasistas4 = (Vasistas) x.K(list);
        if (vasistas4 != null) {
            num = Integer.valueOf(vasistas4.getVersion());
        }
        swimWorkoutData.setAlgoVersion(num);
        return swimWorkoutData;
    }

    private final Track buildWorkout(List<Vasistas> list) {
        Track track = new Track(null, null, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, false, 0, null, null, null, false, 0, null, null, false, null, null, null, null, null, null, 0, -1, null);
        track.setUserId(this.userId);
        track.setStartDate(((Vasistas) x.I(list)).getStartDate());
        track.setEndDate(((Vasistas) x.T(list)).getEnd());
        track.setTimeZone(this.timeZoneProvider.getTimezoneForUserAtDate(this, track.getUserId(), track.getStartDate()));
        String abstractDateTime = track.getStartDate().withZone(track.getDateTimeZone()).toString("yyyy-MM-dd");
        u.i(abstractDateTime, "toString(...)");
        track.setDay(abstractDateTime);
        track.setDeviceType(16);
        track.setDeviceModel(getDeviceModel(list));
        track.setCategory(7);
        track.setData(buildData(list));
        return track;
    }

    private final int getDeviceModel(List<Vasistas> list) {
        lj0.e eVar = new lj0.e();
        for (Vasistas vasistas : list) {
            eVar.a(vasistas.getDeviceModel(), 1);
        }
        return eVar.b();
    }

    private final int getSwimType(List<Vasistas> list) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Integer valueOf = Integer.valueOf(((Vasistas) obj2).getSwimType());
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = com.google.android.gms.internal.mlkit_common.a.d(linkedHashMap, valueOf);
            }
            ((List) obj3).add(obj2);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                int i11 = 0;
                for (Vasistas vasistas : (Iterable) ((Map.Entry) next).getValue()) {
                    i11 += vasistas.getDurationMillis();
                }
                do {
                    Object next2 = it.next();
                    int i12 = 0;
                    for (Vasistas vasistas2 : (Iterable) ((Map.Entry) next2).getValue()) {
                        i12 += vasistas2.getDurationMillis();
                    }
                    if (i11 < i12) {
                        next = next2;
                        i11 = i12;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getKey()).intValue();
        }
        return 9;
    }

    private final <E> List<List<E>> groupWithPreviousBy(Collection<? extends E> collection, p<? super E, ? super E, Boolean> pVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            List list = (List) x.U(arrayList);
            if (list != null && pVar.invoke((Object) x.T(list), obj).booleanValue()) {
                list.add(obj);
            } else {
                arrayList.add(x.i0(obj));
            }
        }
        return arrayList;
    }

    public final List<Track> build(List<Vasistas> vasistasList) {
        u.j(vasistasList, "vasistasList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : vasistasList) {
            if (((Vasistas) obj).getActivityType() == Vasistas.ActivityType.SWIM) {
                arrayList.add(obj);
            }
        }
        ArrayList<List<Vasistas>> arrayList2 = new ArrayList();
        for (Object obj2 : groupWithPreviousBy(arrayList, SwimWorkoutBuilder$build$2.INSTANCE)) {
            List list = (List) obj2;
            if (new Duration(((Vasistas) x.I(list)).getStartDate(), ((Vasistas) x.T(list)).getEnd()).getMillis() >= DeviceSession.DEVICE_SESSION_TTL) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
        for (List<Vasistas> list2 : arrayList2) {
            arrayList3.add(buildWorkout(list2));
        }
        return arrayList3;
    }
}
