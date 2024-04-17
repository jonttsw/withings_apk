package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import android.util.SparseArray;
import com.withings.library.sleep.SleepScoreGenericConstants;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import java.text.NumberFormat;
import java.util.List;
import org.joda.time.Duration;
/* compiled from: SleepScoreWordings.kt */
/* loaded from: classes5.dex */
public final class p extends q4 {

    /* renamed from: c  reason: collision with root package name */
    private final NumberFormat f61183c;

    /* renamed from: d  reason: collision with root package name */
    private SleepTrackData f61184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SleepScoreRecoveryActivity context, SleepScoreGenericConstants sleepScoreGenerics) {
        super(context, sleepScoreGenerics);
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(sleepScoreGenerics, "sleepScoreGenerics");
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(0);
        this.f61183c = percentInstance;
    }

    private final int d(long j5) {
        double d11 = 100.0f * j5;
        SleepTrackData sleepTrackData = this.f61184d;
        if (sleepTrackData != null) {
            return (int) Math.floor(d11 / sleepTrackData.getTotalSleep().getMillis());
        }
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }

    private final String e(int i11) {
        String format = this.f61183c.format(Float.valueOf(i11 / 100.0f));
        kotlin.jvm.internal.u.i(format, "format(...)");
        return format;
    }

    public final SparseArray<List<CharSequence>> f(Track track) {
        long j5;
        Parcelable data = track.getData();
        kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        SleepTrackData sleepTrackData = (SleepTrackData) data;
        this.f61184d = sleepTrackData;
        Duration deepSleepDuration = sleepTrackData.getDeepSleepDuration();
        long j11 = 0;
        if (deepSleepDuration != null) {
            j5 = deepSleepDuration.getMillis();
        } else {
            j5 = 0;
        }
        int d11 = d(j5);
        SleepTrackData sleepTrackData2 = this.f61184d;
        if (sleepTrackData2 != null) {
            Duration remSleepDuration = sleepTrackData2.getRemSleepDuration();
            if (remSleepDuration != null) {
                j11 = remSleepDuration.getMillis();
            }
            int d12 = d(j11);
            int deviceModel = track.getDeviceModel();
            SparseArray<List<CharSequence>> sparseArray = new SparseArray<>();
            if (kotlin.collections.l.l(new int[]{61, 63}, deviceModel)) {
                int statusGood = b().getStatusGood();
                String string = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfGoodPart1Alt1_formatted);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                int i11 = d11 + d12;
                String string2 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfGoodPart1Alt2_formatted, e(i11));
                kotlin.jvm.internal.u.i(string2, "getString(...)");
                String string3 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfGoodPart1Alt3_formatted, e(i11));
                kotlin.jvm.internal.u.i(string3, "getString(...)");
                sparseArray.put(statusGood, kotlin.collections.x.W(string, string2, string3));
                int statusAverage = b().getStatusAverage();
                String string4 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfAveragePart1Alt1_formatted, e(i11));
                kotlin.jvm.internal.u.i(string4, "getString(...)");
                String string5 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfAveragePart1Alt2_formatted, e(i11));
                kotlin.jvm.internal.u.i(string5, "getString(...)");
                String string6 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfAveragePart1Alt3_formatted, e(i11));
                kotlin.jvm.internal.u.i(string6, "getString(...)");
                sparseArray.put(statusAverage, kotlin.collections.x.W(string4, string5, string6));
                int statusBad = b().getStatusBad();
                String string7 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfBadPart1Alt1_formatted, e(i11));
                kotlin.jvm.internal.u.i(string7, "getString(...)");
                String string8 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfBadPart1Alt2_formatted, e(i11));
                kotlin.jvm.internal.u.i(string8, "getString(...)");
                String string9 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfRemIfBadPart1Alt3);
                kotlin.jvm.internal.u.i(string9, "getString(...)");
                sparseArray.put(statusBad, kotlin.collections.x.W(string7, string8, string9));
            } else {
                int statusGood2 = b().getStatusGood();
                String string10 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfGoodPart1Alt1_formatted);
                kotlin.jvm.internal.u.i(string10, "getString(...)");
                int i12 = d11 + d12;
                String string11 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfGoodPart1Alt2_formatted, e(i12));
                kotlin.jvm.internal.u.i(string11, "getString(...)");
                String string12 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfGoodPart1Alt3_formatted, e(i12));
                kotlin.jvm.internal.u.i(string12, "getString(...)");
                sparseArray.put(statusGood2, kotlin.collections.x.W(string10, string11, string12));
                int statusAverage2 = b().getStatusAverage();
                String string13 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfAveragePart1Alt1_formatted, e(i12));
                kotlin.jvm.internal.u.i(string13, "getString(...)");
                String string14 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfAveragePart1Alt2_formatted, e(i12));
                kotlin.jvm.internal.u.i(string14, "getString(...)");
                String string15 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfAveragePart1Alt3_formatted, e(i12));
                kotlin.jvm.internal.u.i(string15, "getString(...)");
                sparseArray.put(statusAverage2, kotlin.collections.x.W(string13, string14, string15));
                int statusBad2 = b().getStatusBad();
                String string16 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfBadPart1Alt1_formatted, e(i12));
                kotlin.jvm.internal.u.i(string16, "getString(...)");
                String string17 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfBadPart1Alt2_formatted, e(i12));
                kotlin.jvm.internal.u.i(string17, "getString(...)");
                String string18 = c().getString(C1987R.string.sleepScoreDetail_recoveryIfNoRemIfBadPart1Alt3);
                kotlin.jvm.internal.u.i(string18, "getString(...)");
                sparseArray.put(statusBad2, kotlin.collections.x.W(string16, string17, string18));
            }
            return sparseArray;
        }
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }
}
