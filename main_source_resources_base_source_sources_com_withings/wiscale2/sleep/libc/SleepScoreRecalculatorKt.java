package com.withings.wiscale2.sleep.libc;

import android.os.Parcelable;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import org.joda.time.Duration;
/* compiled from: SleepScoreRecalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"checkSleepDurations", "", "Lcom/withings/wiscale2/track/data/Track;", "HealthMate_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SleepScoreRecalculatorKt {
    public static final boolean checkSleepDurations(Track track) {
        u.j(track, "<this>");
        long millis = new Duration(TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track)).getMillis();
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        SleepTrackData sleepTrackData = (SleepTrackData) data;
        Iterator it = l.z(new Duration[]{sleepTrackData.getManualAwakeDuration(), sleepTrackData.getManualSleepDuration(), sleepTrackData.getDeepSleepDuration(), sleepTrackData.getLightSleepDuration(), sleepTrackData.getRemSleepDuration(), sleepTrackData.getWakeUpDuration()}).iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 += ((Duration) it.next()).getMillis();
        }
        if (((float) j5) / ((float) millis) > 0.5f) {
            return true;
        }
        return false;
    }
}
