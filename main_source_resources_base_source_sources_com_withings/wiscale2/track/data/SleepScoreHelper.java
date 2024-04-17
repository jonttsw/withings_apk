package com.withings.wiscale2.track.data;

import android.content.Context;
import android.support.v4.media.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScore;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import x70.b;
/* compiled from: SleepScoreHelper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/track/data/SleepScoreHelper;", "", "()V", "NO_DATA_PLACE_HOLDER", "", "getSleepScoreGlyph", "", "info", "Lcom/withings/wiscale2/track/data/SleepScore$Info;", "getSleepScoreGlyphSpecialUnknown", "getSleepScoreStatus", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "sleepScore", "Lcom/withings/wiscale2/track/data/SleepScore;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SleepScoreHelper {
    public static final int $stable = 0;
    public static final SleepScoreHelper INSTANCE = new SleepScoreHelper();
    public static final String NO_DATA_PLACE_HOLDER = " - ";

    private SleepScoreHelper() {
    }

    public final int getSleepScoreGlyph(SleepScore.Info info) {
        Integer num;
        Integer num2 = null;
        if (info != null) {
            num = Integer.valueOf(info.getStatus());
        } else {
            num = null;
        }
        int statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusGood();
        if (num != null && num.intValue() == statusGood) {
            return C1987R.drawable.ic_check_white;
        }
        int statusAverage = SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage();
        if (num == null || num.intValue() != statusAverage) {
            int statusBad = SleepScoreHelperKt.getSleepScoreConstants().getStatusBad();
            if (num == null || num.intValue() != statusBad) {
                int statusUnknown = SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown();
                if (num == null || num.intValue() != statusUnknown) {
                    int statusError = SleepScoreHelperKt.getSleepScoreConstants().getStatusError();
                    if (num == null || num.intValue() != statusError) {
                        Fail.h(info, null);
                        if (info != null) {
                            num2 = Integer.valueOf(info.getStatus());
                        }
                        Fail.j("Unknown status " + num2);
                        return 2131231706;
                    }
                }
                return 2131231706;
            }
        }
        return C1987R.drawable.icon_medium_status_moderate;
    }

    public final int getSleepScoreGlyphSpecialUnknown(SleepScore.Info info) {
        Integer num;
        Integer num2 = null;
        if (info != null) {
            num = Integer.valueOf(info.getStatus());
        } else {
            num = null;
        }
        int statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusGood();
        if (num != null && num.intValue() == statusGood) {
            return C1987R.drawable.ic_check_white;
        }
        int statusUnknown = SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown();
        if (num == null || num.intValue() != statusUnknown) {
            int statusAverage = SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage();
            if (num == null || num.intValue() != statusAverage) {
                int statusBad = SleepScoreHelperKt.getSleepScoreConstants().getStatusBad();
                if (num == null || num.intValue() != statusBad) {
                    int statusError = SleepScoreHelperKt.getSleepScoreConstants().getStatusError();
                    if (num != null && num.intValue() == statusError) {
                        return 2131231706;
                    }
                    Fail.h(info, null);
                    if (info != null) {
                        num2 = Integer.valueOf(info.getStatus());
                    }
                    Fail.j("Unknown status " + num2);
                    return 2131231706;
                }
            }
        }
        return C1987R.drawable.icon_medium_status_moderate;
    }

    public final String getSleepScoreStatus(Context context, SleepScore sleepScore) {
        u.j(context, "context");
        u.j(sleepScore, "sleepScore");
        int sleepScoreStatus = sleepScore.getSleepScoreStatus();
        if (sleepScoreStatus == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
            String string = context.getString(C1987R.string.sleepScore_goodSleepScore);
            u.i(string, "getString(...)");
            return string;
        } else if (sleepScoreStatus == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
            String string2 = context.getString(C1987R.string.sleepScore_averageSleepScore);
            u.i(string2, "getString(...)");
            return string2;
        } else if (sleepScoreStatus == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
            String string3 = context.getString(C1987R.string.sleepScore_badSleepScore);
            u.i(string3, "getString(...)");
            return string3;
        } else {
            b.n(new IllegalArgumentException(a.a("Unknown status ", sleepScore.getSleepScoreStatus())));
            return " - ";
        }
    }
}
