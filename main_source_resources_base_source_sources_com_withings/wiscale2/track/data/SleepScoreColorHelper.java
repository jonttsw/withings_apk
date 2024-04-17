package com.withings.wiscale2.track.data;

import com.withings.common.compose.component.Status;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScore;
import kotlin.Metadata;
/* compiled from: SleepScoreHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0004¨\u0006\u0014"}, d2 = {"Lcom/withings/wiscale2/track/data/SleepScoreColorHelper;", "", "()V", "getInfoColorResSpecialUnknown", "", "info", "Lcom/withings/wiscale2/track/data/SleepScore$Info;", "getSleepInfoColorRes", "status", "getSleepInfoStatusIcon", "Lcom/withings/common/compose/component/Status$Icon;", "getSleepScoreColorRes", "sleepScore", "Lcom/withings/wiscale2/track/data/SleepScore;", "getSleepScoreStatusIcon", "getStatusTextGlyphColor", "isRegularity", "", "getStatusTextGlyphColorForNonRelevantInfo", "isAlertingSleepScore", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SleepScoreColorHelper {
    public static final int $stable = 0;
    public static final SleepScoreColorHelper INSTANCE = new SleepScoreColorHelper();

    private SleepScoreColorHelper() {
    }

    private final Status.Icon getSleepInfoStatusIcon(int i11) {
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
            return Status.Icon.f33327a;
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
            return Status.Icon.f33328b;
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
            return Status.Icon.f33329c;
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown() || i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
            return Status.Icon.f33330d;
        }
        Fail.j("Unknown status " + i11);
        return Status.Icon.f33330d;
    }

    public static /* synthetic */ int getStatusTextGlyphColor$default(SleepScoreColorHelper sleepScoreColorHelper, SleepScore.Info info, boolean z5, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z5 = false;
        }
        return sleepScoreColorHelper.getStatusTextGlyphColor(info, z5);
    }

    public final int getInfoColorResSpecialUnknown(SleepScore.Info info) {
        int statusUnknown;
        Integer num;
        if (info != null) {
            statusUnknown = info.getStatus();
        } else {
            statusUnknown = SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown();
        }
        if (statusUnknown == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
            return C1987R.color.statusGood;
        }
        if (statusUnknown != SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown() && statusUnknown != SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage() && statusUnknown != SleepScoreHelperKt.getSleepScoreConstants().getStatusBad() && statusUnknown != SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
            if (info != null) {
                num = Integer.valueOf(info.getStatus());
            } else {
                num = null;
            }
            Fail.j("Unknown status " + num);
        }
        return C1987R.color.statusUndefined;
    }

    public final int getSleepInfoColorRes(SleepScore.Info info) {
        return getSleepInfoColorRes(info != null ? info.getStatus() : SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown());
    }

    public final int getSleepScoreColorRes(int i11) {
        return i11 >= SleepScoreHelperKt.getSleepScoreConstants().getGoodThreshold() ? C1987R.color.statusGood : i11 > SleepScoreHelperKt.getSleepScoreConstants().getAverageThreshold() ? C1987R.color.statusModerate : C1987R.color.statusBad;
    }

    public final Status.Icon getSleepScoreStatusIcon(SleepScore sleepScore) {
        int statusUnknown;
        if (sleepScore != null) {
            statusUnknown = sleepScore.getSleepScoreStatus();
        } else {
            statusUnknown = SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown();
        }
        return getSleepInfoStatusIcon(statusUnknown);
    }

    public final int getStatusTextGlyphColor(SleepScore.Info info, boolean z5) {
        Integer num;
        Integer num2 = null;
        if (info != null) {
            num = Integer.valueOf(info.getStatus());
        } else {
            num = null;
        }
        int statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusGood();
        if (num == null || num.intValue() != statusGood) {
            int statusAverage = SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage();
            if (num == null || num.intValue() != statusAverage) {
                int statusBad = SleepScoreHelperKt.getSleepScoreConstants().getStatusBad();
                if (num == null || num.intValue() != statusBad) {
                    int statusUnknown = SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown();
                    if (num != null && num.intValue() == statusUnknown) {
                        return C1987R.color.textPrimary;
                    }
                    int statusError = SleepScoreHelperKt.getSleepScoreConstants().getStatusError();
                    if (num != null && num.intValue() == statusError) {
                        if (z5) {
                            return C1987R.color.textPrimary;
                        }
                        Fail.h(info, null);
                        if (info != null) {
                            num2 = Integer.valueOf(info.getStatus());
                        }
                        Fail.j("Unknown status " + num2);
                        return 17170443;
                    }
                    Fail.h(info, null);
                    if (info != null) {
                        num2 = Integer.valueOf(info.getStatus());
                    }
                    Fail.j("Unknown status " + num2);
                    return 17170443;
                }
            }
        }
        return C1987R.color.textPrimaryInverse;
    }

    public final int getStatusTextGlyphColorForNonRelevantInfo(SleepScore.Info info) {
        Integer num;
        Integer num2 = null;
        if (info != null) {
            num = Integer.valueOf(info.getStatus());
        } else {
            num = null;
        }
        int statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusGood();
        if (num != null && num.intValue() == statusGood) {
            return C1987R.color.textPrimaryInverse;
        }
        int statusAverage = SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage();
        if (num == null || num.intValue() != statusAverage) {
            int statusBad = SleepScoreHelperKt.getSleepScoreConstants().getStatusBad();
            if (num == null || num.intValue() != statusBad) {
                int statusUnknown = SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown();
                if (num == null || num.intValue() != statusUnknown) {
                    Fail.h(info, null);
                    if (info != null) {
                        num2 = Integer.valueOf(info.getStatus());
                    }
                    Fail.j("Unknown status " + num2);
                    return 17170443;
                }
            }
        }
        return C1987R.color.textPrimary;
    }

    public final boolean isAlertingSleepScore(int i11) {
        if (i11 < SleepScoreHelperKt.getSleepScoreConstants().getGoodThreshold()) {
            return true;
        }
        return false;
    }

    private final int getSleepInfoColorRes(int i11) {
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
            return C1987R.color.statusGood;
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
            return C1987R.color.statusModerate;
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
            return C1987R.color.statusBad;
        }
        if (i11 != SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown() && i11 != SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
            Fail.j("Unknown status " + i11);
        }
        return C1987R.color.statusUndefined;
    }

    public final int getSleepScoreColorRes(SleepScore sleepScore) {
        return getSleepInfoColorRes(sleepScore != null ? sleepScore.getSleepScoreStatus() : SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown());
    }
}
