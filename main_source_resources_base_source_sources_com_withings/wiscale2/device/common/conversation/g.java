package com.withings.wiscale2.device.common.conversation;

import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.DeviceWorkoutData;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* compiled from: SportVasistasSyncConversation.kt */
/* loaded from: classes5.dex */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private final long f50818a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50819b;

    /* renamed from: c  reason: collision with root package name */
    private final ua0.a f50820c;

    public g(long j5, int i11, ua0.a computeTrackGpsSummary) {
        kotlin.jvm.internal.u.j(computeTrackGpsSummary, "computeTrackGpsSummary");
        this.f50818a = j5;
        this.f50819b = i11;
        this.f50820c = computeTrackGpsSummary;
    }

    public final Track a(qj.e sportVasistas) {
        int i11;
        kotlin.jvm.internal.u.j(sportVasistas, "sportVasistas");
        Track track = new Track(null, null, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, false, 0, null, null, null, false, 0, null, null, false, null, null, null, null, null, null, 0, -1, null);
        track.setUserId(this.f50818a);
        track.setStartDate(sportVasistas.c());
        DateTime plus = track.getStartDate().plus(sportVasistas.b());
        kotlin.jvm.internal.u.i(plus, "plus(...)");
        track.setEndDate(plus);
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        track.setModifiedDate(now);
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        kotlin.jvm.internal.u.i(dateTimeZone, "getDefault(...)");
        track.setTimeZone(dateTimeZone);
        String abstractDateTime = track.getStartDate().withZone(track.getDateTimeZone()).toString("yyyy-MM-dd");
        kotlin.jvm.internal.u.i(abstractDateTime, "toString(...)");
        track.setDay(abstractDateTime);
        track.setSyncedToWs(false);
        track.setAttrib(20000);
        Integer valueOf = Integer.valueOf(sportVasistas.a());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i11 = valueOf.intValue();
        } else {
            i11 = 272;
        }
        track.setCategory(i11);
        track.setDeviceType(16);
        track.setDeviceModel(this.f50819b);
        DeviceWorkoutData deviceWorkoutData = new DeviceWorkoutData();
        deviceWorkoutData.setStartDateAuto(false);
        deviceWorkoutData.setEndDateAuto(false);
        track.setData(deviceWorkoutData);
        track.setGpsSummary(this.f50820c.c(track));
        return track;
    }
}
