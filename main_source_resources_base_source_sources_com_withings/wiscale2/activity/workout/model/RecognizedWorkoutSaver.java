package com.withings.wiscale2.activity.workout.model;

import androidx.activity.b0;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.j;
/* compiled from: RecognizedWorkoutSaver.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/RecognizedWorkoutSaver;", "", "Lcom/withings/wiscale2/track/data/Track;", MessageType.TRACK, "", "getWorkoutNoteIfNecessary", "(Lcom/withings/wiscale2/track/data/Track;)Ljava/lang/String;", "", "otherTracks", "", "hasOverlappingTrack", "(Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;)Z", "track1", "track2", "areOverlapping", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/wiscale2/track/data/Track;)Z", "existingTracks", "newTracks", "Lnm0/j;", "replaceExistingTracksByNewTracks", "(Ljava/util/List;Ljava/util/List;)Lnm0/j;", "newTrack", "replacedTrack", "getReplacingTrack", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/wiscale2/track/data/Track;)Lcom/withings/wiscale2/track/data/Track;", "swimTracks", "recognitionAlgoTracks", "Lnm0/y;", "save", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "workoutDataBuilder", "Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;", "Lvf/c;", "accountManager", "Lvf/c;", "Lpi/f;", "getNewPatientSessionWorkoutNote", "Lpi/f;", "", NavigationArguments.USER_ID, "J", "<init>", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;Lcom/withings/wiscale2/activity/workout/model/WorkoutDataBuilder;Lvf/c;Lpi/f;J)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RecognizedWorkoutSaver {
    public static final int $stable = 8;
    private final vf.c accountManager;
    private final pi.f getNewPatientSessionWorkoutNote;
    private final long userId;
    private final WorkoutDataBuilder workoutDataBuilder;
    private final WorkoutManager workoutManager;

    public RecognizedWorkoutSaver(WorkoutManager workoutManager, WorkoutDataBuilder workoutDataBuilder, vf.c accountManager, pi.f getNewPatientSessionWorkoutNote, long j5) {
        u.j(workoutManager, "workoutManager");
        u.j(workoutDataBuilder, "workoutDataBuilder");
        u.j(accountManager, "accountManager");
        u.j(getNewPatientSessionWorkoutNote, "getNewPatientSessionWorkoutNote");
        this.workoutManager = workoutManager;
        this.workoutDataBuilder = workoutDataBuilder;
        this.accountManager = accountManager;
        this.getNewPatientSessionWorkoutNote = getNewPatientSessionWorkoutNote;
        this.userId = j5;
    }

    private final boolean areOverlapping(Track track, Track track2) {
        if (b0.o(track.getEndDate(), track2.getStartDate()) && b0.p(track.getStartDate(), track2.getEndDate())) {
            return true;
        }
        return false;
    }

    private final Track getReplacingTrack(Track track, Track track2) {
        if (track2.getAttrib() == 3) {
            if (track2.getCategory() != track.getCategory()) {
                if (l.l(new int[]{1, 2, 6}, track.getCategory())) {
                    track2.setAttrib(7);
                }
                track2.setCategory(track.getCategory());
                track2.setSyncedToWs(false);
                track2.setData(WorkoutDataBuilder.buildWorkoutData$default(this.workoutDataBuilder, track2, false, 2, null));
            }
            return track2;
        }
        track.setId(track2.getId());
        track.setWsId(track2.getWsId());
        return track;
    }

    private final String getWorkoutNoteIfNecessary(Track track) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new RecognizedWorkoutSaver$getWorkoutNoteIfNecessary$1(this, track, null), 1, null);
        return (String) runBlocking$default;
    }

    private final boolean hasOverlappingTrack(Track track, List<Track> list) {
        List<Track> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Track track2 : list2) {
            if (areOverlapping(track, track2)) {
                return true;
            }
        }
        return false;
    }

    private final j<List<Track>, List<Track>> replaceExistingTracksByNewTracks(List<Track> list, List<Track> list2) {
        Track track;
        Object obj;
        Track replacingTrack;
        List<Track> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (((Track) obj2).getAttrib() != 3) {
                arrayList.add(obj2);
            }
        }
        ArrayList S0 = x.S0(arrayList);
        List<Track> list4 = list2;
        ArrayList arrayList2 = new ArrayList(x.y(list4, 10));
        for (Track track2 : list4) {
            Iterator<T> it = list3.iterator();
            while (true) {
                track = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (areOverlapping(track2, (Track) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Track track3 = (Track) obj;
            if (track3 != null && (replacingTrack = getReplacingTrack(track2, track3)) != null) {
                S0.remove(track3);
                track = replacingTrack;
            }
            if (track != null) {
                track2 = track;
            }
            arrayList2.add(track2);
        }
        return new j<>(arrayList2, S0);
    }

    public final void save(List<Track> swimTracks, List<Track> recognitionAlgoTracks, List<Track> existingTracks) {
        u.j(swimTracks, "swimTracks");
        u.j(recognitionAlgoTracks, "recognitionAlgoTracks");
        u.j(existingTracks, "existingTracks");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : existingTracks) {
            if (l.m(new Integer[]{2, 7}, Integer.valueOf(((Track) obj).getAttrib()))) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        j jVar = new j(arrayList, arrayList2);
        List<Track> list = (List) jVar.a();
        List<Track> list2 = (List) jVar.b();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : swimTracks) {
            if (!hasOverlappingTrack((Track) obj2, list)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : recognitionAlgoTracks) {
            if (!hasOverlappingTrack((Track) obj3, x.l0(arrayList3, list))) {
                arrayList4.add(obj3);
            }
        }
        j<List<Track>, List<Track>> replaceExistingTracksByNewTracks = replaceExistingTracksByNewTracks(list2, x.l0(arrayList4, arrayList3));
        List<Track> a11 = replaceExistingTracksByNewTracks.a();
        for (Track track : replaceExistingTracksByNewTracks.b()) {
            this.workoutManager.delete(this.userId, track);
        }
        for (Track track2 : a11) {
            String workoutNoteIfNecessary = getWorkoutNoteIfNecessary(track2);
            if (workoutNoteIfNecessary != null) {
                track2.setNote(workoutNoteIfNecessary);
            }
        }
        this.workoutManager.saveAll(a11);
    }
}
