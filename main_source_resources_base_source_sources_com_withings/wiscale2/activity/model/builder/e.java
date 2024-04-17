package com.withings.wiscale2.activity.model.builder;

import androidx.activity.b0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.user.User;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import ei0.h;
import ei0.l;
import ei0.q;
import ei0.z;
import fl.p;
import gl.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.u;
import lj0.h0;
import m0.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import u70.i;
/* compiled from: SleepTrackBuilder.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a */
    private HashMap f48525a = new HashMap();

    /* renamed from: b */
    private b f48526b;

    /* renamed from: c */
    private User f48527c;

    /* compiled from: SleepTrackBuilder.java */
    /* loaded from: classes4.dex */
    public final class a implements Comparator<Track> {

        /* renamed from: a */
        final /* synthetic */ Vasistas f48528a;

        a(Vasistas vasistas) {
            this.f48528a = vasistas;
        }

        private static double a(Vasistas vasistas, Track track) {
            if (vasistas.getStartDate().getMillis() >= track.getStartDate().getMillis() && vasistas.getStartDate().getMillis() <= track.getEndDate().getMillis()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            if (vasistas.getEnd().getMillis() >= track.getStartDate().getMillis() && vasistas.getEnd().getMillis() <= track.getEndDate().getMillis()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return Math.min(Math.abs(track.getStartDate().getMillis() - vasistas.getEnd().getMillis()), Math.abs(vasistas.getStartDate().getMillis() - track.getEndDate().getMillis()));
        }

        @Override // java.util.Comparator
        public final int compare(Track track, Track track2) {
            Vasistas vasistas = this.f48528a;
            return Double.compare(a(vasistas, track), a(vasistas, track2));
        }
    }

    /* compiled from: SleepTrackBuilder.java */
    /* loaded from: classes4.dex */
    public interface b {
        DateTimeZone y1(e eVar, long j5, DateTime dateTime);
    }

    public e(b bVar, User user) {
        this.f48526b = bVar;
        this.f48527c = user;
    }

    public static /* synthetic */ void a(e eVar, Track track) {
        User user = eVar.f48527c;
        track.setUserId(user.q());
        track.setTimeZone(eVar.f48526b.y1(eVar, user.q(), TrackKt.getEffectiveEndDate(track)));
        track.setDay(TrackKt.getEffectiveEndDate(track).withZone(track.getDateTimeZone()).toString("yyyy-MM-dd"));
    }

    private static Track c(Vasistas vasistas, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return null;
        }
        return (Track) Collections.min(hashSet, new a(vasistas));
    }

    public final ArrayList b(List list, List list2, i iVar) {
        HashMap hashMap;
        p.a aVar;
        Iterator it;
        final DateTime now = DateTime.now();
        int i11 = 0;
        x70.b.c(this, iVar, "Sleep vasistas within this period : " + list.size(), new Object[0]);
        Iterator it2 = list2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            hashMap = this.f48525a;
            if (!hasNext) {
                break;
            }
            Track track = (Track) it2.next();
            lj0.e eVar = new lj0.e();
            eVar.a(track.getDeviceModel(), (int) (track.getDuration() / 60000));
            hashMap.put(track, eVar);
        }
        HashSet hashSet = new HashSet(list2);
        Vasistas.VasistasType vasistasType = Vasistas.VasistasType.SLEEP;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Vasistas) obj).getType() == vasistasType) {
                arrayList.add(obj);
            }
        }
        Iterator it3 = arrayList.iterator();
        Duration duration = null;
        Vasistas vasistas = null;
        while (it3.hasNext()) {
            Vasistas vasistas2 = (Vasistas) it3.next();
            Track c11 = c(vasistas2, hashSet);
            if (c11 != null && vasistas2.getStartDate().getMillis() >= c11.getStartDate().getMillis() && vasistas2.getEnd().getMillis() <= c11.getEndDate().getMillis()) {
                it = it3;
            } else {
                if (c11 == null || ((vasistas2.getStartDate().getMillis() < c11.getStartDate().getMillis() || vasistas2.getStartDate().getMillis() > c11.getEndDate().plus(7200000L).getMillis()) && (vasistas2.getEnd().getMillis() > c11.getEndDate().getMillis() || vasistas2.getEnd().getMillis() < c11.getStartDate().minus(7200000L).getMillis()))) {
                    x70.b.c(this, iVar, "Creating a new track from the vasistas " + vasistas2.toString() + " (because it does not correspond to any existing sleeptrack)", new Object[i11]);
                    SleepTrackData sleepTrackData = new SleepTrackData();
                    sleepTrackData.setDeepSleepDuration(duration);
                    sleepTrackData.setLightSleepDuration(duration);
                    sleepTrackData.setRemSleepDuration(duration);
                    sleepTrackData.setUnspecifiedSleepDuration(duration);
                    sleepTrackData.setDurationToSleep(new Duration(0L));
                    sleepTrackData.setDurationToGetUp(new Duration(0L));
                    sleepTrackData.setWakeUpDuration(new Duration(0L));
                    sleepTrackData.setWakeUpCount(Integer.valueOf(i11));
                    Track track2 = new Track();
                    track2.setCategory(37);
                    track2.setData(sleepTrackData);
                    track2.setStartDate(vasistas2.getStartDate());
                    track2.setEndDate(vasistas2.getEnd());
                    track2.setTimeZone(DateTimeZone.getDefault());
                    track2.setDay(track2.getEndDate().withZone(track2.getDateTimeZone()).toString("yyyy-MM-dd"));
                    track2.setDeviceType(vasistas2.getCategory().getValue());
                    if (vasistas2.getDeviceId() != 0) {
                        track2.setDeviceId(Integer.valueOf((int) vasistas2.getDeviceId()));
                    }
                    hashMap.put(track2, new lj0.e());
                    hashSet.add(track2);
                    c11 = track2;
                }
                SleepTrackData sleepTrackData2 = (SleepTrackData) c11.getData();
                long durationMillis = vasistas2.getDurationMillis();
                if (vasistas2.getEnd().isAfter(c11.getEndDate())) {
                    it = it3;
                    durationMillis = Math.min(durationMillis, vasistas2.getEnd().getMillis() - c11.getEndDate().getMillis());
                } else {
                    it = it3;
                    if (vasistas2.getStartDate().isBefore(c11.getStartDate())) {
                        durationMillis = Math.min(durationMillis, c11.getStartDate().getMillis() - vasistas2.getStartDate().getMillis());
                    }
                }
                int sleepLevel = vasistas2.getSleepLevel();
                if (sleepTrackData2.getTotalSleep().getMillis() > 0 && SleepLevel.Companion.getSleepingStages().contains(Integer.valueOf(vasistas2.getSleepLevel())) && vasistas != null && (vasistas.getSleepLevel() == SleepLevel.Awake.getVasistasType() || vasistas2.getStartDate().getMillis() - vasistas.getEnd().getMillis() > 0)) {
                    sleepTrackData2.setWakeUpCount(Integer.valueOf(sleepTrackData2.getWakeUpCount().intValue() + 1));
                }
                if (SleepLevel.Companion.getSleepingStages().contains(Integer.valueOf(vasistas2.getSleepLevel()))) {
                    sleepTrackData2.setDurationToGetUp(new Duration(0L));
                }
                if (sleepLevel == SleepLevel.Unspecified.getVasistasType()) {
                    sleepTrackData2.setUnspecifiedSleepDuration(sleepTrackData2.getDurationOrZero(sleepTrackData2.getUnspecifiedSleepDuration()).plus(durationMillis));
                } else if (sleepLevel == SleepLevel.Deep.getVasistasType()) {
                    sleepTrackData2.setDeepSleepDuration(sleepTrackData2.getDurationOrZero(sleepTrackData2.getDeepSleepDuration()).plus(durationMillis));
                } else if (sleepLevel == SleepLevel.Light.getVasistasType()) {
                    sleepTrackData2.setLightSleepDuration(sleepTrackData2.getDurationOrZero(sleepTrackData2.getLightSleepDuration()).plus(durationMillis));
                } else if (sleepLevel == SleepLevel.Rem.getVasistasType()) {
                    sleepTrackData2.setRemSleepDuration(sleepTrackData2.getDurationOrZero(sleepTrackData2.getRemSleepDuration()).plus(durationMillis));
                } else if (sleepLevel == SleepLevel.Awake.getVasistasType()) {
                    if (sleepTrackData2.getTotalSleep().getMillis() <= 0) {
                        sleepTrackData2.setDurationToSleep(sleepTrackData2.getDurationToSleep().plus(durationMillis));
                    }
                    sleepTrackData2.setDurationToGetUp(sleepTrackData2.getDurationToGetUp().plus(durationMillis));
                    sleepTrackData2.setWakeUpDuration(sleepTrackData2.getWakeUpDuration().plus(durationMillis));
                }
                lj0.e eVar2 = (lj0.e) hashMap.get(c11);
                eVar2.getClass();
                eVar2.a(vasistas2.getDeviceModel(), 1);
                c11.setDeviceModel(eVar2.b());
                c11.setSyncedToWs(false);
                c11.setModifiedDate(DateTime.now());
                if (vasistas2.getEnd().isAfter(c11.getEndDate())) {
                    c11.setEndDate(vasistas2.getEnd());
                } else if (vasistas2.getStartDate().isBefore(c11.getStartDate())) {
                    c11.setStartDate(vasistas2.getStartDate());
                }
                if (c11.getSleepScore() != null) {
                    c11.setSleepScore(null);
                }
            }
            vasistas = vasistas2;
            it3 = it;
            i11 = 0;
            duration = null;
        }
        HashMap hashMap2 = new HashMap();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Vasistas vasistas3 = (Vasistas) it4.next();
            Track c12 = c(vasistas3, hashSet);
            if (c12 != null) {
                List list3 = (List) hashMap2.get(c12);
                if (list3 == null) {
                    list3 = new ArrayList();
                }
                if (b0.q(vasistas3.getStartDate(), TrackKt.getAsleepStartDate(c12), TrackKt.getAwakeStartDate(c12)) && b0.q(vasistas3.getEnd(), TrackKt.getAsleepStartDate(c12), TrackKt.getAwakeStartDate(c12))) {
                    list3.add(vasistas3);
                    hashMap2.put(c12, list3);
                }
            }
        }
        Iterator it5 = hashMap2.entrySet().iterator();
        while (true) {
            boolean hasNext2 = it5.hasNext();
            aVar = p.f67672b;
            if (!hasNext2) {
                break;
            }
            Map.Entry entry = (Map.Entry) it5.next();
            if (aVar.a().d(((Track) entry.getKey()).getDeviceModel()) instanceof n) {
                Track track3 = (Track) entry.getKey();
                List list4 = (List) entry.getValue();
                x70.b.b(this, "======== Recompute sleep disorder " + track3.getWsId() + " with " + list4.size() + " sleepVasistas ", new Object[0]);
                h hVar = new h(track3, list4, aVar.a());
                Track clone = track3.clone();
                Integer e11 = hVar.e();
                x70.b.b(this, "Ahi => Modified track " + clone.getWsId() + " with value " + e11, new Object[0]);
                ((SleepTrackData) clone.getData()).setApneaHypopneaIndex(e11);
                Integer f11 = hVar.f();
                x70.b.b(this, "BreathingProba => Modified track " + clone.getWsId() + " with value " + f11, new Object[0]);
                ((SleepTrackData) clone.getData()).setBreathingEventProbability(f11);
                SleepTrackData sleepTrackData3 = (SleepTrackData) track3.getData();
                SleepTrackData sleepTrackData4 = (SleepTrackData) clone.getData();
                if (Objects.equals(sleepTrackData3.getApneaHypopneaIndex(), sleepTrackData4.getApneaHypopneaIndex()) && Objects.equals(sleepTrackData3.getBreathingEventProbability(), sleepTrackData4.getBreathingEventProbability())) {
                    clone = null;
                } else {
                    clone.setSyncedToWs(false);
                    clone.setModifiedDate(DateTime.now());
                }
                if (clone != null) {
                    hashSet.add(clone);
                }
            }
        }
        x70.b.b(this, "computeAverageApnea modified " + hashSet.size() + " tracks", new Object[0]);
        HashMap hashMap3 = new HashMap();
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Vasistas vasistas4 = (Vasistas) it6.next();
            Track c13 = c(vasistas4, hashSet);
            if (c13 != null) {
                List list5 = (List) hashMap3.get(c13);
                if (list5 == null) {
                    list5 = new ArrayList();
                }
                if (b0.q(vasistas4.getStartDate(), TrackKt.getAsleepStartDate(c13), TrackKt.getAwakeStartDate(c13)) && b0.q(vasistas4.getEnd(), TrackKt.getAsleepStartDate(c13), TrackKt.getAwakeStartDate(c13))) {
                    list5.add(vasistas4);
                    hashMap3.put(c13, list5);
                }
            }
        }
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            if (aVar.a().d(((Track) entry2.getKey()).getDeviceModel()) instanceof n) {
                Track track4 = (Track) entry2.getKey();
                new z().a(track4);
                hashSet.add(track4);
            }
        }
        ArrayList h11 = t.h(new ArrayList(hashSet), new com.withings.webservices.legacy.sync.d(this, 1));
        x70.b.c(this, iVar, "Database + new sleep tracks generated with those vasistas : " + h11.size() + " (before filtering those that are not really new)", new Object[0]);
        Iterator it7 = h11.iterator();
        while (it7.hasNext()) {
            x70.b.c(this, iVar, "-> " + ((Track) it7.next()).toString(), new Object[0]);
        }
        Iterator it8 = h11.iterator();
        while (it8.hasNext()) {
            Track track5 = (Track) it8.next();
            if (track5.getManualStartDate() != null || track5.getManualEndDate() != null) {
                m70.i b10 = m70.i.b();
                h0 e12 = h0.e();
                q qVar = q.f65441d;
                if (qVar != null) {
                    p a11 = aVar.a();
                    long userId = track5.getUserId();
                    q qVar2 = q.f65441d;
                    if (qVar2 != null) {
                        l.c(track5, b10, e12, qVar, a11, SleepScoreRecalculator.get(userId, qVar2));
                        track5.setModifiedDate(DateTime.now());
                        track5.setSyncedToWs(false);
                    } else {
                        u.s("instance");
                        throw null;
                    }
                } else {
                    u.s("instance");
                    throw null;
                }
            }
        }
        return t.i(h11, new u70.b() { // from class: da0.j
            @Override // u70.b
            public final boolean isMatching(Object obj2) {
                Track track6 = (Track) obj2;
                if (!track6.isSyncedToWs() && b0.o(track6.getModifiedDate(), DateTime.this)) {
                    return true;
                }
                return false;
            }
        }, new z.e(this, 4));
    }
}
