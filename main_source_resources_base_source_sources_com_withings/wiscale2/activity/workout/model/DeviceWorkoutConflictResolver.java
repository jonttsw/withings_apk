package com.withings.wiscale2.activity.workout.model;

import androidx.activity.b0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.MessageType;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.DeviceWorkoutData;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
/* compiled from: DeviceWorkoutConflictResolver.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0014\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/DeviceWorkoutConflictResolver;", "", "Lcom/withings/wiscale2/track/data/Track;", "newWorkoutFromDevice", "Lnm0/j;", "", "resolveConflicts", "(Lcom/withings/wiscale2/track/data/Track;)Lnm0/j;", MessageType.TRACK, "", "shouldKeepTrackFromDevice", "(Lcom/withings/wiscale2/track/data/Track;)Z", "Lorg/joda/time/DateTime;", "startDate", "endDate", "workouts", "", "getMostRelevantCategory", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)I", "mergeWorkoutsDuration", "isOverlapping", "(Lcom/withings/wiscale2/track/data/Track;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Z", "newWorkoutsFromDevice", "(Ljava/util/List;)Lnm0/j;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "workoutDataBuilder", "Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "<init>", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeviceWorkoutConflictResolver {
    public static final int $stable = 8;
    private final WorkoutDataBuilder workoutDataBuilder;
    private final WorkoutManager workoutManager;

    public DeviceWorkoutConflictResolver(WorkoutManager workoutManager, WorkoutDataBuilder workoutDataBuilder) {
        u.j(workoutManager, "workoutManager");
        u.j(workoutDataBuilder, "workoutDataBuilder");
        this.workoutManager = workoutManager;
        this.workoutDataBuilder = workoutDataBuilder;
    }

    private final int getMostRelevantCategory(DateTime dateTime, DateTime dateTime2, List<Track> list) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Integer valueOf = Integer.valueOf(((Track) obj2).getCategory());
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
                int mergeWorkoutsDuration = mergeWorkoutsDuration(dateTime, dateTime2, (List) ((Map.Entry) next).getValue());
                do {
                    Object next2 = it.next();
                    int mergeWorkoutsDuration2 = mergeWorkoutsDuration(dateTime, dateTime2, (List) ((Map.Entry) next2).getValue());
                    if (mergeWorkoutsDuration < mergeWorkoutsDuration2) {
                        next = next2;
                        mergeWorkoutsDuration = mergeWorkoutsDuration2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getKey()).intValue();
        }
        return 36;
    }

    private final boolean isOverlapping(Track track, DateTime dateTime, DateTime dateTime2) {
        if (b0.p(track.getStartDate(), dateTime2) && b0.o(track.getEndDate(), dateTime)) {
            return true;
        }
        return false;
    }

    private final int mergeWorkoutsDuration(DateTime dateTime, DateTime dateTime2, List<Track> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Track track : list) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                j jVar = (j) next2;
                if (isOverlapping(track, (DateTime) jVar.a(), (DateTime) jVar.b())) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((DateTime) ((j) it2.next()).c());
            }
            Comparable Y = x.Y(x.W(track.getStartDate(), dateTime));
            u.g(Y);
            Iterator it3 = x.m0(Y, arrayList3).iterator();
            Object obj = null;
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                if (it3.hasNext()) {
                    long millis = ((DateTime) next).getMillis();
                    while (true) {
                        Object next3 = it3.next();
                        long millis2 = ((DateTime) next3).getMillis();
                        if (millis > millis2) {
                            next = next3;
                            millis = millis2;
                        }
                        if (!it3.hasNext()) {
                            break;
                        }
                    }
                }
            }
            u.g(next);
            DateTime dateTime3 = (DateTime) next;
            ArrayList arrayList4 = new ArrayList(x.y(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList4.add((DateTime) ((j) it4.next()).d());
            }
            Comparable d02 = x.d0(x.W(track.getEndDate(), dateTime2));
            u.g(d02);
            Iterator it5 = x.m0(d02, arrayList4).iterator();
            if (it5.hasNext()) {
                obj = it5.next();
                if (it5.hasNext()) {
                    long millis3 = ((DateTime) obj).getMillis();
                    do {
                        Object next4 = it5.next();
                        long millis4 = ((DateTime) next4).getMillis();
                        if (millis3 < millis4) {
                            obj = next4;
                            millis3 = millis4;
                        }
                    } while (it5.hasNext());
                }
            }
            u.g(obj);
            arrayList.removeAll(arrayList2);
            arrayList.add(new j(dateTime3, (DateTime) obj));
        }
        Iterator it6 = arrayList.iterator();
        int i11 = 0;
        while (it6.hasNext()) {
            j jVar2 = (j) it6.next();
            i11 += (int) (((DateTime) jVar2.b()).getMillis() - ((DateTime) jVar2.a()).getMillis());
        }
        return i11;
    }

    private final j<List<Track>, List<Track>> resolveConflicts(Track track) {
        Track copy;
        ArrayList arrayList;
        boolean z5;
        Track track2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.workoutManager.getWorkoutsForUserContainedBetween(track.getUserId(), track.getStartDate(), track.getEndDate())) {
            if (!l.m(new Integer[]{7, 3, 2}, Integer.valueOf(((Track) obj).getAttrib()))) {
                arrayList2.add(obj);
            }
        }
        boolean z11 = l.l(new int[]{0, 36, 272}, track.getCategory()) && track.getDeviceModel() != 1053;
        copy = track.copy((r52 & 1) != 0 ? track.f61734id : null, (r52 & 2) != 0 ? track.wsId : null, (r52 & 4) != 0 ? track.userId : 0L, (r52 & 8) != 0 ? track.startDate : null, (r52 & 16) != 0 ? track.endDate : null, (r52 & 32) != 0 ? track.timeZone : null, (r52 & 64) != 0 ? track.day : null, (r52 & 128) != 0 ? track.modifiedDate : null, (r52 & 256) != 0 ? track.deviceId : null, (r52 & 512) != 0 ? track.deviceModel : 0, (r52 & 1024) != 0 ? track.deviceType : 0, (r52 & ModuleCopy.f28574b) != 0 ? track.attrib : (track.getDeviceModel() != 1053 && z11) ? 3 : 7, (r52 & 4096) != 0 ? track.category : 0, (r52 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? track.data : new WorkoutData(), (r52 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? track.dataJson : null, (r52 & Utils.MAX_EVENT_SIZE) != 0 ? track.activityRecognitionVersion : null, (r52 & 65536) != 0 ? track.isSyncedToWs : false, (r52 & 131072) != 0 ? track.deleted : 0, (r52 & 262144) != 0 ? track.deletionReason : null, (r52 & 524288) != 0 ? track.note : null, (r52 & 1048576) != 0 ? track.sleepScore : null, (r52 & 2097152) != 0 ? track.snoringEnabled : false, (r52 & 4194304) != 0 ? track.inProgress : 0, (r52 & 8388608) != 0 ? track.manualStartDate : null, (r52 & 16777216) != 0 ? track.manualEndDate : null, (r52 & 33554432) != 0 ? track.blankVasistasFilled : false, (r52 & 67108864) != 0 ? track.gpsSummary : null, (r52 & 134217728) != 0 ? track.pathlists : null, (r52 & 268435456) != 0 ? track.cryptpart : null, (r52 & ConstantsWs.DEBUG_BITMASK_EXTENDED_HWA10_RAWDATA_CBTA) != 0 ? track.coverPictureUrl : null, (r52 & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0 ? track.uris : null, (r52 & Integer.MIN_VALUE) != 0 ? track.coverPictureUri : null, (r53 & 1) != 0 ? track.brand : 0);
        if (z11) {
            arrayList = arrayList2;
            int mostRelevantCategory = getMostRelevantCategory(track.getStartDate(), track.getEndDate(), arrayList);
            copy.setCategory(mostRelevantCategory);
            z5 = true;
            if (mostRelevantCategory == 1 || mostRelevantCategory == 2 || mostRelevantCategory == 6) {
                copy.setAttrib(7);
            }
        } else {
            arrayList = arrayList2;
            z5 = true;
        }
        copy.setData(this.workoutDataBuilder.buildWorkoutData(copy, z5));
        if (track.getData() instanceof DeviceWorkoutData) {
            track2 = track;
            track2.setCategory(272);
        } else {
            track2 = track;
        }
        ArrayList i02 = x.i0(copy);
        if (shouldKeepTrackFromDevice(track)) {
            i02.add(track2);
        }
        return new j<>(i02, arrayList);
    }

    private final boolean shouldKeepTrackFromDevice(Track track) {
        if (track.getDeviceModel() == 1053 && track.getAttrib() == 20000) {
            return false;
        }
        return true;
    }

    public final j<List<Track>, List<Track>> resolveConflicts(List<Track> newWorkoutsFromDevice) {
        u.j(newWorkoutsFromDevice, "newWorkoutsFromDevice");
        List<Track> list = newWorkoutsFromDevice;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (Track track : list) {
            arrayList.add(resolveConflicts(track));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x.n((List) ((j) it.next()).c(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            x.n((List) ((j) it2.next()).d(), arrayList3);
        }
        return new j<>(arrayList2, x.B(arrayList3));
    }
}
