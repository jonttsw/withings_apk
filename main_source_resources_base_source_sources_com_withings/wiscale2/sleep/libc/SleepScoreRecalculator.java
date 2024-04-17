package com.withings.wiscale2.sleep.libc;

import android.os.Parcelable;
import android.support.v4.media.a;
import androidx.activity.b0;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.sleep.SleepLib;
import com.withings.util.log.Fail;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import ei0.q;
import en0.i;
import en0.j;
import fl.o;
import fl.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import x70.b;
/* compiled from: SleepScoreRecalculator.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/withings/wiscale2/sleep/libc/SleepScoreRecalculator;", "", "Lcom/withings/wiscale2/track/data/Track;", "sleepTrack", "", "isOutdatedSleepScore", "(Lcom/withings/wiscale2/track/data/Track;)Z", "Lcom/withings/wiscale2/track/data/SleepScore;", "recalculateSleepScore", "(Lcom/withings/wiscale2/track/data/Track;)Lcom/withings/wiscale2/track/data/SleepScore;", MessageType.TRACK, "recalculateSleepScoreIfNecessary", "(Lcom/withings/wiscale2/track/data/Track;)Lcom/withings/wiscale2/track/data/Track;", "shouldRecalculateSleepScore", "Lnm0/y;", "recalculateThenUpdateSleepScore", "(Lcom/withings/wiscale2/track/data/Track;)V", "forceRecalculateSleepScore", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "Lei0/q;", "sleepTrackManager", "Lei0/q;", "<init>", "(JLei0/q;)V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreRecalculator {
    public static final float ACCEPTED_SLEEP_DURATIONS_RATIO = 0.5f;
    private final q sleepTrackManager;
    private final long userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SleepScoreRecalculator.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/sleep/libc/SleepScoreRecalculator$Companion;", "", "", NavigationArguments.USER_ID, "Lei0/q;", "sleepTrackManager", "Lcom/withings/wiscale2/sleep/libc/SleepScoreRecalculator;", "get", "(JLei0/q;)Lcom/withings/wiscale2/sleep/libc/SleepScoreRecalculator;", "", "ACCEPTED_SLEEP_DURATIONS_RATIO", "F", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static SleepScoreRecalculator get$default(Companion companion, long j5, q qVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                if (q.f65441d != null) {
                    qVar = q.f65441d;
                    if (qVar == null) {
                        u.s("instance");
                        throw null;
                    }
                } else {
                    u.s("instance");
                    throw null;
                }
            }
            return companion.get(j5, qVar);
        }

        public final SleepScoreRecalculator get(long j5, q sleepTrackManager) {
            u.j(sleepTrackManager, "sleepTrackManager");
            return new SleepScoreRecalculator(j5, sleepTrackManager);
        }

        private Companion() {
        }
    }

    public SleepScoreRecalculator(long j5, q sleepTrackManager) {
        u.j(sleepTrackManager, "sleepTrackManager");
        this.userId = j5;
        this.sleepTrackManager = sleepTrackManager;
    }

    public static final SleepScoreRecalculator get(long j5, q qVar) {
        return Companion.get(j5, qVar);
    }

    private final boolean isOutdatedSleepScore(Track track) {
        SleepScore sleepScore = track.getSleepScore();
        boolean z5 = false;
        if (sleepScore != null && sleepScore.getSleepScoreAlgoVersion() == SleepScoreHelperKt.getSleepScoreConstants().getVersion()) {
            z5 = true;
        }
        return !z5;
    }

    private final SleepScore recalculateSleepScore(Track track) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num;
        DateTime effectiveEndDate;
        Integer num2;
        DateTime effectiveStartDate;
        boolean z5 = true;
        int i17 = -1;
        i iVar = new i(6, 1, -1);
        ArrayList arrayList = new ArrayList(x.y(iVar, 10));
        j it = iVar.iterator();
        while (it.hasNext()) {
            int a11 = it.a();
            q qVar = this.sleepTrackManager;
            long userId = track.getUserId();
            DateTime minusDays = TrackKt.getEffectiveEndDate(track).minusDays(a11);
            u.i(minusDays, "minusDays(...)");
            qVar.getClass();
            arrayList.add(qVar.C(userId, minusDays, null));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Track track2 = (Track) it2.next();
            if (track2 != null && (effectiveStartDate = TrackKt.getEffectiveStartDate(track2)) != null) {
                num2 = Integer.valueOf((int) b0.w(effectiveStartDate));
            } else {
                num2 = null;
            }
            if (num2 != null) {
                arrayList2.add(num2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Track track3 = (Track) it3.next();
            if (track3 != null && (effectiveEndDate = TrackKt.getEffectiveEndDate(track3)) != null) {
                num = Integer.valueOf((int) b0.w(effectiveEndDate));
            } else {
                num = null;
            }
            if (num != null) {
                arrayList3.add(num);
            }
        }
        boolean l5 = l.l(new int[]{61, 63}, track.getDeviceModel());
        List<o> c11 = p.f67672b.a().c();
        if (!(c11 instanceof Collection) || !c11.isEmpty()) {
            for (o oVar : c11) {
                if (oVar.a() == track.getDeviceModel()) {
                    break;
                }
            }
        }
        z5 = false;
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        SleepTrackData sleepTrackData = (SleepTrackData) data;
        Duration lightSleepDuration = sleepTrackData.getLightSleepDuration();
        if (lightSleepDuration == null) {
            lightSleepDuration = sleepTrackData.getUnspecifiedSleepDuration();
        }
        if (lightSleepDuration != null) {
            i11 = (int) lightSleepDuration.getStandardSeconds();
        } else {
            i11 = 0;
        }
        SleepLib sleepLib = new SleepLib();
        Duration deepSleepDuration = sleepTrackData.getDeepSleepDuration();
        if (deepSleepDuration != null) {
            i12 = (int) deepSleepDuration.getStandardSeconds();
        } else {
            i12 = -1;
        }
        Duration remSleepDuration = sleepTrackData.getRemSleepDuration();
        if (remSleepDuration != null) {
            i13 = (int) remSleepDuration.getStandardSeconds();
        } else {
            i13 = -1;
        }
        Duration manualSleepDuration = sleepTrackData.getManualSleepDuration();
        if (manualSleepDuration != null) {
            i14 = (int) manualSleepDuration.getStandardSeconds();
        } else {
            i14 = -1;
        }
        Integer wakeUpCount = sleepTrackData.getWakeUpCount();
        u.i(wakeUpCount, "getWakeUpCount(...)");
        int intValue = wakeUpCount.intValue();
        Duration durationToGetUp = sleepTrackData.getDurationToGetUp();
        if (durationToGetUp != null) {
            i15 = (int) durationToGetUp.getStandardSeconds();
        } else {
            i15 = -1;
        }
        Duration durationToSleep = sleepTrackData.getDurationToSleep();
        if (durationToSleep != null) {
            i16 = (int) durationToSleep.getStandardSeconds();
        } else {
            i16 = -1;
        }
        int w11 = (int) b0.w(TrackKt.getEffectiveStartDate(track));
        int w12 = (int) b0.w(TrackKt.getEffectiveEndDate(track));
        int[] P0 = x.P0(arrayList2);
        int[] P02 = x.P0(arrayList3);
        int size = arrayList2.size();
        Integer valueOf = Integer.valueOf(track.getDeviceModel());
        if (!z5) {
            valueOf = null;
        }
        if (valueOf != null) {
            i17 = valueOf.intValue();
        }
        SleepScore sleepScore = new SleepScore(sleepLib.compute(i11, i12, i13, i14, intValue, i15, l5, i16, l5, w11, w12, P0, P02, size, i17));
        sleepScore.setSleepScoreAlgoVersion(SleepScoreHelperKt.getSleepScoreConstants().getVersion());
        return sleepScore;
    }

    public final void forceRecalculateSleepScore(Track track) {
        u.j(track, "track");
        if (track.getData() instanceof SleepTrackData) {
            recalculateThenUpdateSleepScore(track);
        } else {
            Fail.j("Why are we re-calculating sleep score for a not-sleeping track ?");
        }
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Track recalculateSleepScoreIfNecessary(Track track) {
        u.j(track, "track");
        if (track.getData() instanceof SleepTrackData) {
            if (shouldRecalculateSleepScore(track)) {
                recalculateThenUpdateSleepScore(track);
            } else {
                b.b(this, a.a("Sleep score has not been recalculated. Track attrib is ", track.getAttrib()), new Object[0]);
            }
        } else {
            Fail.j("Why are we re-calculating sleep score for a not-sleeping track ?");
        }
        return track;
    }

    public final void recalculateThenUpdateSleepScore(Track track) {
        u.j(track, "track");
        if (SleepScoreRecalculatorKt.checkSleepDurations(track)) {
            SleepScore recalculateSleepScore = recalculateSleepScore(track);
            if (!u.e(recalculateSleepScore, track.getSleepScore())) {
                track.setSleepScore(recalculateSleepScore);
                track.setSyncedToWs(false);
                this.sleepTrackManager.H(track, null);
            }
        }
    }

    public final boolean shouldRecalculateSleepScore(Track sleepTrack) {
        u.j(sleepTrack, "sleepTrack");
        if (sleepTrack.getAttrib() != 2 && (sleepTrack.getSleepScore() == null || isOutdatedSleepScore(sleepTrack))) {
            return true;
        }
        return false;
    }
}
